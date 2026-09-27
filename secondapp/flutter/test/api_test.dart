import 'dart:convert';

import 'package:flutter_test/flutter_test.dart';
import 'package:flutter_secure_storage/flutter_secure_storage.dart';
import 'package:http/http.dart' as http;
import 'package:http/testing.dart';
import 'package:soccerarena/api.dart';

void main() {
  TestWidgetsFlutterBinding.ensureInitialized();
  setUp(() => FlutterSecureStorage.setMockInitialValues({}));
  test(
    'simultaneous native 401s rotate once, without looping on subscription 403',
    () async {
      int rotations = 0;
      final client = MockClient((request) async {
        if (request.url.path.endsWith('/login/')) {
          return http.Response(
            jsonEncode({
              'access': 'old',
              'refresh': 'refresh-fixture',
              'account': {},
            }),
            200,
          );
        }
        if (request.url.path.endsWith('/refresh/')) {
          rotations++;
          await Future<void>.delayed(const Duration(milliseconds: 20));
          return http.Response(
            jsonEncode({'access': 'new', 'refresh': 'rotated-fixture'}),
            200,
          );
        }
        if (request.url.path.endsWith('/content/')) {
          return http.Response(
            '{"error":{"code":"subscription_expired","message":"Expired"}}',
            403,
          );
        }
        if (request.headers['Authorization'] == 'Bearer old') {
          return http.Response(
            '{"error":{"code":"authentication_expired","message":"Expired"}}',
            401,
          );
        }
        return http.Response('{}', 200);
      });
      final api = ArenaApi(client: client, web: false);
      await api.login('fixture', 'not-a-real-password');
      await Future.wait([api.request('me/'), api.request('access/')]);
      expect(rotations, 1);
      await expectLater(
        api.request('content/'),
        throwsA(
          isA<ApiFailure>().having(
            (e) => e.code,
            'code',
            'subscription_expired',
          ),
        ),
      );
      expect(rotations, 1);
      await api.clear();
      expect(
        await const FlutterSecureStorage().read(key: 'arena_refresh'),
        isNull,
      );
    },
  );
  test('web login uses CSRF and never secure-storage tokens', () async {
    final seen = <http.Request>[];
    final api = ArenaApi(
      web: true,
      client: MockClient((r) async {
        seen.add(r);
        if (r.url.path.endsWith('/csrf/')) {
          return http.Response('{"csrf_token":"initial"}', 200);
        }
        if (r.url.path.endsWith('/login/')) {
          return http.Response('{"csrf_token":"rotated","account":{}}', 200);
        }
        return http.Response('{}', 200);
      }),
    );
    await api.login('fixture', 'not-a-real-password');
    await api.request('auth/logout/', method: 'POST');
    expect(seen[1].headers['X-CSRFToken'], 'initial');
    expect(seen[2].headers['X-CSRFToken'], 'rotated');
    expect(seen.every((r) => !r.headers.containsKey('Authorization')), isTrue);
    expect(
      await const FlutterSecureStorage().read(key: 'arena_refresh'),
      isNull,
    );
  });
}
