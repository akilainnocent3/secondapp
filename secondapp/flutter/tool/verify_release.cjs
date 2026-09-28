// Exercises the existing web build at its intended HTTPS origin without deploying it.
// Only frontend static files are intercepted; API requests reach production.
// Credentials arrive as JSON on stdin and are never saved in the report.
const { chromium, request } = require('playwright');
const fs = require('node:fs/promises');
const path = require('node:path');
const assert = require('node:assert/strict');

async function main() {
  let input = '';
  for await (const chunk of process.stdin) input += chunk;
  const credentials = JSON.parse(input);
  input = '';
  const root = path.resolve(__dirname, '..');
  const build = path.join(root, 'build/web');
  const api = 'https://api.soccerarena.org/api/v1/';
  const origin = 'https://soccerarena.org';
  const report = {
    testedAt: new Date().toISOString(),
    scope: 'Local web release served at simulated production origin; real production API. No Android runtime test.',
    checks: [],
  };
  const record = (name, passed, detail) => {
    report.checks.push({ name, passed, detail });
    console.log(`${passed ? 'PASS' : 'FAIL'} ${name}: ${detail}`);
  };
  const browser = await chromium.launch({ headless: true, args: ['--no-sandbox'] });
  const native = await request.newContext();
  try {
    for (const route of ['me/', 'content/']) {
      const response = await native.get(api + route);
      record(`Anonymous ${route}`, response.status() === 401, `HTTP ${response.status()}`);
    }
    const login = await native.post(api + 'auth/login/', { data: credentials });
    record('Native API login', login.status() === 200, `HTTP ${login.status()}`);
    assert.equal(login.status(), 200);
    const tokens = await login.json();
    const rotated = await native.post(api + 'auth/refresh/', { data: { refresh: tokens.refresh } });
    record('Native refresh', rotated.status() === 200, `HTTP ${rotated.status()}`);
    assert.equal(rotated.status(), 200);
    const refreshed = await rotated.json();
    const replay = await native.post(api + 'auth/refresh/', { data: { refresh: tokens.refresh } });
    record('Refresh replay rejected', replay.status() === 401, `HTTP ${replay.status()}`);
    const nativeHeaders = { Authorization: `Bearer ${refreshed.access}` };
    const me = await native.get(api + 'me/', { headers: nativeHeaders });
    record('Native authenticated account', me.status() === 200, `HTTP ${me.status()}`);
    const content = await native.get(api + 'content/', { headers: nativeHeaders });
    record('Native content available', content.status() === 200, `HTTP ${content.status()}`);

    const context = await browser.newContext({ viewport: { width: 1280, height: 1100 } });
    await context.route(`${origin}/**`, async route => {
      const pathname = decodeURIComponent(new URL(route.request().url()).pathname);
      const filename = path.resolve(build, '.' + (pathname === '/' ? '/index.html' : pathname));
      if (!filename.startsWith(build + path.sep)) return route.abort();
      try { await route.fulfill({ path: filename }); }
      catch { await route.fulfill({ status: 404, body: 'Not found' }); }
    });
    const page = await context.newPage();
    page.setDefaultTimeout(25000);
    const pageErrors = [];
    const adHosts = new Set();
    page.on('pageerror', () => pageErrors.push('Browser JavaScript exception'));
    page.on('request', req => {
      const host = new URL(req.url()).hostname;
      if (/(^|\.)(doubleclick\.net|googlesyndication\.com|applovin\.com|unityads\.unity3d\.com)$/.test(host)) adHosts.add(host);
    });
    async function semantics() {
      await page.waitForFunction(() => document.querySelector('flt-semantics-placeholder') || document.querySelector('flt-semantics'));
      const placeholder = page.locator('flt-semantics-placeholder');
      if (await placeholder.count()) await placeholder.evaluate(e => e.click());
    }
    await page.goto(origin);
    await semantics();
    await page.getByText('Welcome back', { exact: true }).waitFor();
    record('Web signed-out login screen', true, 'Rendered Flutter release in Chromium');
    for (const [label, value] of [['Username', credentials.username], ['Password', credentials.password]]) {
      await page.getByLabel(label, { exact: true }).click();
      await page.keyboard.type(value, { delay: 25 });
      await page.keyboard.press('Tab');
    }
    const responsePromise = page.waitForResponse(r => r.url() === api + 'auth/web/login/' && r.request().method() === 'POST');
    await page.getByRole('button', { name: 'Sign in', exact: true }).click();
    const webLogin = await responsePromise;
    record('Web UI login', webLogin.status() === 200, `HTTP ${webLogin.status()}`);
    await page.getByText('YOUR ACCOUNT', { exact: true }).waitFor();
    const cookies = await context.cookies(api);
    const session = cookies.find(c => c.name === 'sessionid');
    record('Web secure HttpOnly session', !!session?.secure && !!session?.httpOnly, 'Cookie attributes inspected; values omitted');
    const localKeys = await page.evaluate(() => Object.keys(localStorage));
    record('No browser token persistence', !localKeys.some(k => /token|refresh|password/i.test(k)), 'Checked localStorage key names');
    await page.reload();
    await semantics();
    await page.getByText('YOUR ACCOUNT', { exact: true }).waitFor();
    record('Web session survives reload', true, 'Account screen restored through live API');
    const contentPromise = page.waitForResponse(r => r.url() === api + 'content/' && r.request().method() === 'GET');
    await page.getByRole('button', { name: 'Open content', exact: true }).click();
    const webContent = await contentPromise;
    record('Web content available', webContent.status() === 200, `HTTP ${webContent.status()}`);
    if (webContent.status() === 503) {
      await page.getByText('Content provider integration is not yet available.', { exact: true }).last().waitFor();
      record('Content error visible', true, 'UI displays the actual API failure');
    }
    await page.getByRole('button', { name: 'Sign out on all devices', exact: true }).click();
    await page.getByText('Welcome back', { exact: true }).waitFor();
    record('Web UI logout', true, 'Returned to login screen');
    const revoked = await native.get(api + 'me/', { headers: nativeHeaders });
    record('Logout revokes mobile token', revoked.status() === 401, `HTTP ${revoked.status()}`);
    await page.reload();
    await semantics();
    await page.getByText('Welcome back', { exact: true }).waitFor();
    record('Logout survives reload', true, 'Protected account stays inaccessible');
    record('No detected ad requests in account flow', adHosts.size === 0, 'Known ad hosts only; does not certify Android or playback');
    record('No browser JavaScript exceptions', pageErrors.length === 0, `${pageErrors.length} exceptions`);
    for (const width of [360, 768, 1280]) {
      await page.setViewportSize({ width, height: 1100 });
      await page.getByText('Welcome back', { exact: true }).waitFor();
      await fs.mkdir(path.join(root, 'verification'), { recursive: true });
      await page.screenshot({ path: path.join(root, `verification/login-${width}.png`) });
    }
  } catch (error) {
    // Avoid serializing network headers, account data, or credentials in exceptions.
    record('Browser verification completed', false, error.name || 'Error');
  } finally {
    credentials.password = '';
    await native.dispose();
    await browser.close();
    report.ready = report.checks.length > 0 && report.checks.every(c => c.passed);
    await fs.mkdir(path.join(root, 'verification'), { recursive: true });
    await fs.writeFile(path.join(root, 'verification/release-checks.json'), JSON.stringify(report, null, 2) + '\n');
    if (!report.ready) process.exitCode = 1;
  }
}
main().catch(() => { console.error('Verification could not start.'); process.exitCode = 1; });
