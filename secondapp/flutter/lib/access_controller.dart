import 'dart:async';
import 'dart:convert';

import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

import 'api.dart';

enum AccessState {
  checking,
  signedOut,
  trial,
  paid,
  expired,
  suspended,
  unavailable,
}

class AccessController extends ChangeNotifier with WidgetsBindingObserver {
  final AccountApi api;
  final Duration interval;
  AccessState state = AccessState.checking;
  Map<String, dynamic>? account;
  Map<String, dynamic> contacts = {
    'support_email': 'akilainnocent@pm.me',
    'payment_phone': '255629645877',
    'instructions':
        'Payment confirmation is manual. Contact support for assistance.',
  };
  String? message;
  bool busy = false;
  Timer? _poll;
  Timer? _deadline;
  final Stopwatch _elapsed = Stopwatch();
  Duration _remaining = Duration.zero;
  Future<void>? _verification;
  int _generation = 0;
  bool _disposed = false;
  // A real native host must independently verify access. This controller never
  // authorizes the legacy APK by an intent extra or local preference.
  AccessController(this.api, {this.interval = const Duration(seconds: 45)}) {
    WidgetsBinding.instance.addObserver(this);
  }
  bool get allowed => state == AccessState.trial || state == AccessState.paid;
  Duration get remaining => _remaining - _elapsed.elapsed;
  void _emit() {
    if (!_disposed) notifyListeners();
  }

  void _stopLease() {
    _deadline?.cancel();
    _poll?.cancel();
    _elapsed.stop();
  }

  Future<void> loadContacts() async {
    try {
      final prefs = await SharedPreferences.getInstance();
      final cached = prefs.getString('arena_public_contacts');
      if (cached != null) {
        contacts = Map<String, dynamic>.from(jsonDecode(cached));
      }
      _emit();
      final fresh = await api.request('settings/');
      if (fresh['support_email'] is String &&
          fresh['payment_phone'] is String) {
        contacts = fresh;
        await prefs.setString('arena_public_contacts', jsonEncode(fresh));
        _emit();
      }
    } catch (_) {
      /* Keep last valid public settings; never grants access. */
    }
  }

  Future<void> start() async {
    unawaited(loadContacts());
    try {
      await api.restore();
      await verify();
    } on ApiFailure catch (e) {
      await _failure(e);
    } catch (_) {
      state = AccessState.unavailable;
      message = 'Unable to restore your session. Please retry.';
      _emit();
    }
  }

  void _accept(Map<String, dynamic> value, {Duration latency = Duration.zero}) {
    _stopLease();
    account = value;
    final entitlement = Map<String, dynamic>.from(value['entitlement']);
    state = AccessState.checking;
    final verifiedState = switch (entitlement['status']) {
      'active_trial' => AccessState.trial,
      'active_paid' => AccessState.paid,
      'suspended' => AccessState.suspended,
      _ => AccessState.expired,
    };
    message = null;
    final active =
        verifiedState == AccessState.trial || verifiedState == AccessState.paid;
    if (active && entitlement['allowed'] == true) {
      final server = DateTime.parse(entitlement['server_time']);
      final expiry = DateTime.parse(entitlement['expires_at']);
      state = verifiedState;
      _remaining = expiry.difference(server) - latency;
      _elapsed
        ..reset()
        ..start();
      if (_remaining <= Duration.zero) {
        state = AccessState.expired;
      } else {
        final lease = interval < const Duration(seconds: 60)
            ? interval
            : const Duration(seconds: 60);
        if (latency >= lease) {
          state = AccessState.unavailable;
          message = 'Verification took too long. Please retry.';
          _emit();
          return;
        }
        _poll = Timer(lease - latency, verify);
        // Browser timers overflow for durations above roughly 24.8 days.
        // The short lease rechecks far-future expiries; arm the exact deadline
        // only when it falls within that lease. No timer exceeds 60 seconds.
        if (_remaining <= lease) {
          _deadline = Timer(_remaining, () {
            _stopLease();
            state = AccessState.expired;
            _emit();
          });
        }
      }
    } else {
      state = active ? AccessState.unavailable : verifiedState;
    }
    _emit();
  }

  Future<void> _failure(ApiFailure e) async {
    _stopLease();
    if (e.status == 401) {
      account = null;
      state = AccessState.signedOut;
      await api.clear();
    } else {
      state = AccessState.unavailable;
    }
    message = e.message;
    _emit();
  }

  Future<void> verify() {
    if (_verification != null) return _verification!;
    final generation = _generation;
    _stopLease();
    state = AccessState.checking;
    _emit();
    final future = () async {
      try {
        final roundtrip = Stopwatch()..start();
        final value = await api.request('me/');
        if (generation == _generation) {
          _accept(value, latency: roundtrip.elapsed);
        }
      } on ApiFailure catch (e) {
        if (generation == _generation) await _failure(e);
      } catch (_) {
        if (generation == _generation) {
          state = AccessState.unavailable;
          message = 'Unable to verify access. Please retry.';
          _emit();
        }
      }
    }();
    _verification = future.whenComplete(() => _verification = null);
    return _verification!;
  }

  Future<void> login(String username, String password) async {
    if (busy) return;
    busy = true;
    _emit();
    try {
      _generation++;
      final roundtrip = Stopwatch()..start();
      final value = await api.login(username, password);
      _accept(value, latency: roundtrip.elapsed);
      unawaited(loadContacts());
    } finally {
      busy = false;
      _emit();
    }
  }

  Future<void> logout() async {
    if (busy) return;
    busy = true;
    _generation++;
    _stopLease();
    state = AccessState.checking;
    _emit();
    try {
      await api.request('auth/logout/', method: 'POST');
      await api.clear();
      account = null;
      state = AccessState.signedOut;
      message = null;
    } on ApiFailure catch (e) {
      await _failure(e);
      if (e.status != 401) message = 'Logout could not reach the server. Protected use is stopped. Retry to revoke all sessions.';
    } finally {
      busy = false;
      _emit();
    }
  }

  Future<void> deleteAccount(String password) async {
    await api.request('me/', method: 'DELETE', body: {'password': password});
    _generation++;
    _stopLease();
    await api.clear();
    account = null;
    state = AccessState.signedOut;
    _emit();
  }

  @override
  void didChangeAppLifecycleState(AppLifecycleState state) {
    if (state == AppLifecycleState.resumed) {
      unawaited(loadContacts());
      if (account != null) {
        final pending = _verification;
        if (pending == null) {
          unawaited(verify());
        } else {
          unawaited(
            pending.then((_) {
              if (!_disposed) return verify();
            }),
          );
        }
      }
    } else if (state == AppLifecycleState.paused ||
        state == AppLifecycleState.hidden) {
      _generation++;
      _stopLease();
      if (account != null) this.state = AccessState.checking;
      _emit();
    }
  }

  @override
  void dispose() {
    if (_disposed) return;
    _disposed = true;
    _generation++;
    _stopLease();
    WidgetsBinding.instance.removeObserver(this);
    super.dispose();
  }
}
