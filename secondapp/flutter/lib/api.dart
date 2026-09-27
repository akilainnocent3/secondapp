import 'dart:async';
import 'dart:convert';

import 'package:flutter/foundation.dart';
import 'package:flutter_secure_storage/flutter_secure_storage.dart';
import 'package:http/http.dart' as http;

import 'platform/client_native.dart'
    if (dart.library.js_interop) 'platform/client_web.dart';

class ApiFailure implements Exception {
  final String code;
  final String message;
  final int status;
  final Map<String, dynamic> fields;
  ApiFailure(
    this.code,
    this.message, {
    this.status = 0,
    this.fields = const {},
  });
  @override
  String toString() => message;
}

abstract class AccountApi {
  Future<Map<String, dynamic>> request(
    String path, {
    String method = 'GET',
    Map<String, dynamic>? body,
  });
  Future<void> restore();
  Future<Map<String, dynamic>> login(String username, String password);
  Future<void> clear();
}

class ArenaApi implements AccountApi {
  static const baseUrl = String.fromEnvironment(
    'API_BASE_URL',
    defaultValue: 'https://api.soccerarena.org',
  );
  final http.Client client;
  final bool web;
  final FlutterSecureStorage storage;
  String? _access;
  String? _refresh;
  String? _csrf;
  Future<void>? _rotation;
  ArenaApi({
    http.Client? client,
    bool? web,
    this.storage = const FlutterSecureStorage(),
  }) : client = client ?? createClient(),
       web = web ?? kIsWeb;

  @override
  Future<void> restore() async {
    if (web) {
      _csrf = (await _send('auth/csrf/'))['csrf_token'] as String;
    } else {
      _refresh = await storage.read(key: 'arena_refresh');
      if (_refresh == null) {
        throw ApiFailure('signed_out', 'Sign in to your account.', status: 401);
      }
      await _rotate();
    }
  }

  Future<Map<String, dynamic>> _send(
    String path, {
    String method = 'GET',
    Map<String, dynamic>? body,
  }) async {
    if (path.startsWith('/') || path.contains('://') || path.contains('..')) {
      throw ArgumentError('Only relative account API paths are allowed');
    }
    final request = http.Request(method, Uri.parse('$baseUrl/api/v1/$path'));
    request.headers['Content-Type'] = 'application/json';
    if (!web && _access != null) {
      request.headers['Authorization'] = 'Bearer $_access';
    }
    if (web && _csrf != null) request.headers['X-CSRFToken'] = _csrf!;
    if (body != null) request.body = jsonEncode(body);
    try {
      final response = await http.Response.fromStream(
        await client.send(request).timeout(const Duration(seconds: 15)),
      ).timeout(const Duration(seconds: 15));
      Map<String, dynamic> data = {};
      if (response.body.isNotEmpty) {
        try {
          data = jsonDecode(response.body) as Map<String, dynamic>;
        } on FormatException {
          throw ApiFailure(
            'server_error',
            'The server could not complete this request. Please retry.',
            status: response.statusCode,
          );
        }
      }
      if (response.statusCode >= 400) {
        final error = data['error'] as Map<String, dynamic>? ?? {};
        throw ApiFailure(
          error['code'] as String? ?? 'server_error',
          error['message'] as String? ?? 'Please retry in a moment.',
          status: response.statusCode,
          fields: error['fields'] is Map
              ? Map<String, dynamic>.from(error['fields'])
              : {},
        );
      }
      return data;
    } on TimeoutException {
      throw ApiFailure(
        'offline',
        'Verification timed out. Check your connection and retry.',
      );
    } on http.ClientException {
      throw ApiFailure(
        'offline',
        'Unable to connect. Check your connection and retry.',
      );
    }
  }

  Future<void> _saveTokens(Map<String, dynamic> data) async {
    _access = data['access'] as String;
    _refresh = data['refresh'] as String;
    await storage.write(key: 'arena_refresh', value: _refresh);
  }

  Future<void> _rotate() async {
    if (_rotation != null) return _rotation!;
    final completer = Completer<void>();
    _rotation = completer.future;
    // Attach the handler immediately so all concurrent callers share one result.
    unawaited(() async {
      try {
        if (_refresh == null) {
          throw ApiFailure('signed_out', 'Please sign in again.', status: 401);
        }
        await _saveTokens(
          await _send(
            'auth/refresh/',
            method: 'POST',
            body: {'refresh': _refresh},
          ),
        );
        completer.complete();
      } catch (error, stack) {
        completer.completeError(error, stack);
      } finally {
        _rotation = null;
      }
    }());
    return completer.future;
  }

  @override
  Future<Map<String, dynamic>> request(
    String path, {
    String method = 'GET',
    Map<String, dynamic>? body,
  }) async {
    final originalAccess = _access;
    try {
      return await _send(path, method: method, body: body);
    } on ApiFailure catch (error) {
      if (error.status != 401 ||
          web ||
          _refresh == null ||
          path.startsWith('auth/')) {
        rethrow;
      }
      if (_access == originalAccess) await _rotate();
      return _send(path, method: method, body: body);
    }
  }

  @override
  Future<Map<String, dynamic>> login(String username, String password) async {
    if (web) _csrf = (await _send('auth/csrf/'))['csrf_token'] as String;
    final data = await _send(
      web ? 'auth/web/login/' : 'auth/login/',
      method: 'POST',
      body: {'username': username, 'password': password},
    );
    if (web) {
      _csrf = data['csrf_token'] as String;
    } else {
      await _saveTokens(data);
    }
    return Map<String, dynamic>.from(data['account']);
  }

  @override
  Future<void> clear() async {
    _access = _refresh = _csrf = null;
    if (!web) await storage.delete(key: 'arena_refresh');
  }
}
