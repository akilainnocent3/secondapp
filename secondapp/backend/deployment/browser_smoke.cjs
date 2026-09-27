// Run with PLAYWRIGHT_MODULE pointing to an installed Playwright package.
const { chromium } = require(process.env.PLAYWRIGHT_MODULE || 'playwright');
const crypto = require('node:crypto');
const assert = require('node:assert/strict');
const base = 'https://api.soccerarena.org';
const username = 'browsercheck_' + crypto.randomBytes(6).toString('hex');
const password = crypto.randomBytes(24).toString('base64url');
let created = false;
let browser;

async function api(path, data, token, method = 'POST') {
  const response = await fetch(base + '/api/v1/' + path + '/', {
    method,
    headers: { 'Content-Type': 'application/json', ...(token ? { Authorization: 'Bearer ' + token } : {}) },
    body: data === undefined ? undefined : JSON.stringify(data),
  });
  const body = response.status === 204 ? null : await response.json();
  return { status: response.status, body };
}

(async () => {
  try {
    const registered = await api('auth/register', {
      username, password, password_confirmation: password,
      email: username + '@example.test', full_name: 'Browser Deployment Test',
      phone: '+120255501' + crypto.randomInt(100).toString().padStart(2, '0'),
    });
    assert.equal(registered.status, 201, 'Temporary browser account registration');
    created = true;
    browser = await chromium.launch({ executablePath: '/usr/bin/chromium', headless: true,
      args: ['--no-sandbox', '--disable-dev-shm-usage'] });
    for (const origin of ['http://localhost:5173', 'https://unrelated-browser.example']) {
      const context = await browser.newContext();
      const page = await context.newPage();
      await page.route(origin + '/', route => route.fulfill({
        contentType: 'text/html', body: '<!doctype html><title>SoccerArena CORS verification</title>',
      }));
      await page.goto(origin + '/');
      const results = await page.evaluate(async ({ base, username, password }) => {
        const results = [];
        async function call(path, expected, { method = 'GET', data, csrf, token } = {}) {
          const response = await fetch(base + '/api/v1/' + path + '/', {
            method, credentials: 'include',
            headers: { ...(data !== undefined ? { 'Content-Type': 'application/json' } : {}),
              ...(csrf ? { 'X-CSRFToken': csrf } : {}), ...(token ? { Authorization: 'Bearer ' + token } : {}) },
            body: data !== undefined ? JSON.stringify(data) : undefined,
          });
          if (response.status !== expected) throw new Error(`${path}: expected ${expected}, received ${response.status}`);
          results.push(`${method} ${path}: ${response.status}`);
          return response.status === 204 ? null : response.json();
        }
        await call('settings', 200);
        await call('me', 401);
        const bootstrap = await call('auth/csrf', 200);
        await call('auth/web/login', 403, { method: 'POST', data: { username, password } });
        const session = await call('auth/web/login', 200, {
          method: 'POST', data: { username, password }, csrf: bootstrap.csrf_token,
        });
        const me = await call('me', 200);
        if (me.username !== username) throw new Error('Session belongs to the wrong user');
        await call('access', 200);
        await call('payments', 200);
        await call('auth/logout', 403, { method: 'POST', data: {} });
        await call('auth/logout', 204, { method: 'POST', data: {}, csrf: session.csrf_token });
        await call('me', 401);
        const jwt = await call('auth/login', 200, { method: 'POST', data: { username, password } });
        await call('me', 200, { token: jwt.access });
        return results;
      }, { base, username, password });
      console.log(`PASS: Chromium ${origin}: ${results.length} cross-origin checks (cookies, CSRF, JWT, preflights).`);
      await context.close();
    }
  } finally {
    if (browser) await browser.close();
    if (created) {
      const login = await api('auth/login', { username, password });
      assert.equal(login.status, 200, 'Cleanup login');
      const deleted = await api('me', { password }, login.body.access, 'DELETE');
      assert.equal(deleted.status, 204, 'Temporary browser account cleanup');
      console.log('Temporary browser account removed.');
    }
  }
})().catch(error => { console.error(error.message); process.exitCode = 1; });
