import 'dart:async';

import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:soccerarena/api.dart';
import 'package:soccerarena/access_controller.dart';
import 'package:soccerarena/main.dart';

// Explicit test fixture. Never loaded by the application or production backend.
Map<String, dynamic> fixture({
  String status = 'active_trial',
  int seconds = 3600,
}) => {
  'username': 'fixture',
  'full_name': 'Fixture Member',
  'email': 'fixture@example.test',
  'phone': '+255629645878',
  'entitlement': {
    'status': status,
    'allowed': status.startsWith('active'),
    'server_time': '2026-09-27T12:00:00Z',
    'expires_at': DateTime.utc(
      2026,
      9,
      27,
      12,
    ).add(Duration(seconds: seconds)).toIso8601String(),
    'reason': '',
  },
};

class FakeApi implements AccountApi {
  Map<String, dynamic> value = fixture();
  ApiFailure? failure;
  int requests = 0;
  int logins = 0;
  Completer<Map<String, dynamic>>? pending;
  @override
  Future<void> clear() async {}
  @override
  Future<void> restore() async {}
  @override
  Future<Map<String, dynamic>> login(String username, String password) async {
    logins++;
    return value;
  }

  @override
  Future<Map<String, dynamic>> request(
    String path, {
    String method = 'GET',
    Map<String, dynamic>? body,
  }) async {
    requests++;
    if (failure != null) throw failure!;
    if (path == 'settings/') {
      return {
        'support_email': 'changed@example.test',
        'payment_phone': '255629645877',
      };
    }
    if (path == 'me/' && method == 'DELETE') return {};
    if (path == 'me/') return pending?.future ?? value;
    return {};
  }
}

void main() {
  TestWidgetsFlutterBinding.ensureInitialized();
  setUp(() => SharedPreferences.setMockInitialValues({}));
  for (final width in [360.0, 768.0, 1440.0]) {
    testWidgets('login and signup fit ${width.toInt()}px', (tester) async {
      tester.view.physicalSize = Size(width, 1100);
      tester.view.devicePixelRatio = 1;
      addTearDown(tester.view.resetPhysicalSize);
      addTearDown(tester.view.resetDevicePixelRatio);
      final c = AccessController(FakeApi())..state = AccessState.signedOut;
      addTearDown(c.dispose);
      await tester.pumpWidget(SoccerArena(controller: c));
      expect(find.text('Welcome back'), findsOneWidget);
      await tester.tap(find.text('New here? Create an account'));
      await tester.pumpAndSettle();
      expect(find.text('Join the arena'), findsOneWidget);
      expect(tester.takeException(), isNull);
    });
  }
  testWidgets('large text has no overflow', (tester) async {
    tester.view.physicalSize = const Size(360, 1000);
    tester.view.devicePixelRatio = 1;
    addTearDown(tester.view.resetPhysicalSize);
    addTearDown(tester.view.resetDevicePixelRatio);
    final c = AccessController(FakeApi())..state = AccessState.signedOut;
    addTearDown(c.dispose);
    await tester.pumpWidget(
      MaterialApp(
        home: MediaQuery(
          data: const MediaQueryData(textScaler: TextScaler.linear(2)),
          child: ArenaHome(controller: c),
        ),
      ),
    );
    expect(tester.takeException(), isNull);
  });
  testWidgets('exact deadline closes entitlement without device clock', (
    tester,
  ) async {
    final api = FakeApi()..value = fixture(seconds: 2);
    final c = AccessController(api);
    addTearDown(c.dispose);
    await c.verify();
    expect(c.allowed, isTrue);
    await tester.pump(const Duration(seconds: 2));
    expect(c.state, AccessState.expired);
    expect(c.account, isNotNull);
  });
  testWidgets(
    'lease blocks during verification; network failure is not expiry',
    (tester) async {
      final api = FakeApi();
      final c = AccessController(api, interval: const Duration(seconds: 1));
      addTearDown(c.dispose);
      await c.verify();
      api.pending = Completer();
      await tester.pump(const Duration(seconds: 1));
      expect(c.allowed, isFalse);
      expect(c.state, AccessState.checking);
      api.pending!.completeError(ApiFailure('offline', 'Offline'));
      await tester.pump();
      expect(c.state, AccessState.unavailable);
      api.pending = null;
      await c.verify();
      expect(c.allowed, isTrue);
      c.dispose();
    },
  );
  testWidgets(
    'concurrent verification coalesces and suspension remains restricted',
    (tester) async {
      final api = FakeApi()..pending = Completer();
      final c = AccessController(api);
      addTearDown(c.dispose);
      final one = c.verify();
      final two = c.verify();
      expect(api.requests, 1);
      api.pending!.complete(fixture(status: 'suspended'));
      await Future.wait([one, two]);
      expect(c.state, AccessState.suspended);
      expect(c.account, isNotNull);
    },
  );
  testWidgets('stale verification cannot undo logout', (tester) async {
    final api = FakeApi()..pending = Completer();
    final c = AccessController(api);
    addTearDown(c.dispose);
    final pending = c.verify();
    await c.logout();
    api.pending!.complete(fixture());
    await pending;
    expect(c.state, AccessState.signedOut);
    expect(c.allowed, isFalse);
  });
  testWidgets('contact cache survives failure separately from entitlement', (
    tester,
  ) async {
    final api = FakeApi();
    final c = AccessController(api);
    addTearDown(c.dispose);
    await c.loadContacts();
    api.failure = ApiFailure('offline', 'Offline');
    await c.loadContacts();
    expect(c.contacts['support_email'], 'changed@example.test');
    expect(c.allowed, isFalse);
  });
  testWidgets('monthly paid access remains active and uses a short lease', (
    tester,
  ) async {
    final api = FakeApi()
      ..value = fixture(status: 'active_paid', seconds: 31 * 86400);
    final c = AccessController(api);
    await c.verify();
    await tester.pump(const Duration(seconds: 2));
    expect(c.state, AccessState.paid);
    api.pending = Completer();
    await tester.pump(const Duration(seconds: 44));
    expect(c.allowed, isFalse);
    api.pending!.complete(fixture(status: 'active_paid', seconds: 31 * 86400));
    await tester.pump();
    expect(c.state, AccessState.paid);
    c.dispose();
  });
  testWidgets('foreground requires verification before access', (tester) async {
    final api = FakeApi();
    final c = AccessController(api);
    addTearDown(c.dispose);
    await c.verify();
    c.didChangeAppLifecycleState(AppLifecycleState.paused);
    expect(c.allowed, isFalse);
    api.pending = Completer();
    c.didChangeAppLifecycleState(AppLifecycleState.resumed);
    expect(c.allowed, isFalse);
    api.pending!.complete(fixture());
    await tester.pump();
    expect(c.allowed, isTrue);
    c.dispose();
  });
}
