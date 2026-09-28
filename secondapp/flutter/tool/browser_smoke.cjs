// Local-only end-to-end check. Run after building with the localhost API define.
// Requires Playwright via NODE_PATH; test account is deleted at the end.
const {chromium} = require('playwright');
const assert = require('node:assert/strict');
const path = require('node:path');
const crypto = require('node:crypto');
const {execFileSync}=require('node:child_process');
const root = path.resolve(__dirname, '../..');
const screenshots = process.env.ARENA_SCREENSHOTS_DIR || path.join(root, 'docs/screenshots');
require('node:fs').mkdirSync(screenshots, {recursive: true});
function control(action,username) { execFileSync(process.env.ARENA_TEST_PYTHON || '/tmp/soccerarena-venv/bin/python', [path.join(root,'backend/accounts/tests/browser_control.py'),action,username], {env:{...process.env,DEBUG:'1',ARENA_BROWSER_TEST:'1'},stdio:'pipe'}); }
control('cleanup','browser_cleanup');
(async()=>{
 const browser=await chromium.launch({headless:true,args:['--no-sandbox']});
 const context=await browser.newContext({viewport:{width:1440,height:1080}});
 const page=await context.newPage();
 async function fill(label,value){ const field=page.getByLabel(label,{exact:true}); await field.click(); await page.waitForTimeout(200); await page.keyboard.press('ControlOrMeta+A'); await page.waitForTimeout(100); await page.keyboard.type(value,{delay:15}); await page.keyboard.press('Tab'); await page.waitForTimeout(200); }
 const errors=[]; page.on('pageerror',e=>errors.push(e.message));
 async function semantics(p){
   const placeholder=p.locator('flt-semantics-placeholder');
   await p.waitForFunction(()=>document.querySelector('flt-semantics-placeholder') || document.querySelector('flt-semantics'));
   await p.waitForTimeout(500);
   if(await placeholder.count()) await placeholder.evaluate(e=>e.click());
 }
 await page.goto('http://127.0.0.1:8080');
 await page.waitForTimeout(3000); await semantics(page);
 await page.getByText('Welcome back',{exact:true}).waitFor();
 for(const width of [360,768,1440]) {
   await page.setViewportSize({width,height:1100}); await page.waitForTimeout(500);
   await page.screenshot({path:path.join(screenshots,`login-${width}.png`)});
 }
 await page.getByRole('button',{name:'New here? Create an account',exact:true}).click();
 await page.getByLabel('Username',{exact:true}).waitFor();
 await page.setViewportSize({width:360,height:1400});
 await page.screenshot({path:path.join(screenshots,'signup-360.png')});
 const username='browser_'+crypto.randomBytes(5).toString('hex');
 const password=crypto.randomBytes(20).toString('base64url')+'!Aa9';
 page.on('request',r=>{ if(r.method()==='POST' && /auth\/(register|web\/login)\//.test(r.url())) { const d=JSON.parse(r.postData()); console.log('Input fidelity:', r.url().includes('register')?'registration':'login',d.username===username,d.password===password); } });
 await fill('Username',username);
 await fill('Full name','Browser Test Member');
 await fill('Email address',username+'@example.test');
 await fill('International phone number','+255629645879');
 await fill('Password',password);
 await fill('Confirm password',password);
 await page.getByRole('button',{name:'Create account',exact:true}).click();
 try { await page.getByText('Account created. Sign in to begin your seven-day trial.',{exact:true}).last().waitFor(); } catch(e) { console.log((await page.locator('body').innerText()).slice(-2200)); throw e; }
 await fill('Username',username);
 await fill('Password',password);
 await page.getByRole('button',{name:'Sign in',exact:true}).click();
 try { await page.getByText('Your trial is active',{exact:true}).waitFor(); } catch(e) { console.log((await page.locator('body').innerText()).slice(-2000)); throw e; }
 await page.setViewportSize({width:1440,height:1300});
 await page.screenshot({path:path.join(screenshots,'account-trial-1440.png')});
 assert((await context.cookies()).find(c=>c.name==='sessionid').httpOnly);
 const keys=await page.evaluate(()=>Object.keys(localStorage));
 assert(!keys.some(k=>/token|password|refresh|session/i.test(k)));
 await page.getByRole('button',{name:'Payment history',exact:true}).click();
 await page.getByText('No payments yet. Payments recorded by your administrator will appear here.',{exact:true}).waitFor();
 await page.screenshot({path:path.join(screenshots,'payment-history-empty.png')});
 await page.getByRole('button',{name:'Close',exact:true}).click();
 control('expire',username);
 await page.getByRole('button',{name:'Check access again',exact:true}).click();
 await page.getByText('Time to renew',{exact:true}).waitFor();
 await page.setViewportSize({width:768,height:1300});
 await page.screenshot({path:path.join(screenshots,'renewal-768.png')});
 console.log('PASS: expired renewal');
 control('payment',username);
 await page.getByRole('button',{name:'Check access again',exact:true}).click();
 await page.getByText('You’re in the arena',{exact:true}).waitFor();
 await page.getByRole('button',{name:'Payment history',exact:true}).click();
 await page.getByText('TZS 123.45',{exact:true}).waitFor();
 await page.screenshot({path:path.join(screenshots,'payment-history-confirmed.png')});
 await page.getByRole('button',{name:'Close',exact:true}).click();
 console.log('PASS: admin receipt and paid access');
 control('suspend',username);
 await page.getByRole('button',{name:'Check access again',exact:true}).click();
 await page.getByText('Access suspended',{exact:true}).waitFor();
 await page.screenshot({path:path.join(screenshots,'suspended-768.png')});
 console.log('PASS: suspended account');
 control('unsuspend',username);
 await page.getByRole('button',{name:'Check access again',exact:true}).click();
 await page.getByText('You’re in the arena',{exact:true}).waitFor();
 console.log('PASS: unsuspended paid account');
 await page.getByRole('button',{name:'Open content',exact:true}).click();
 await page.getByText('Content provider integration is not yet available.',{exact:true}).last().waitFor();
 await page.route('**/api/v1/me/',r=>r.abort('internetdisconnected'));
 await page.getByRole('button',{name:'Check access again',exact:true}).click();
 await page.getByText('Unable to verify access',{exact:true}).waitFor();
 await page.screenshot({path:path.join(screenshots,'offline-verification.png')});
 await page.unroute('**/api/v1/me/');
 await page.getByRole('button',{name:'Retry connection',exact:true}).click();
 await page.getByText('You’re in the arena',{exact:true}).waitFor();
 await page.getByRole('button',{name:'Sign out on all devices',exact:true}).click();
 await page.getByText('Welcome back',{exact:true}).waitFor();
 await fill('Username',username); await fill('Password',password);
 await page.getByRole('button',{name:'Sign in',exact:true}).click();
 await page.getByText('You’re in the arena',{exact:true}).waitFor();
 console.log('PASS: unavailable content message, offline recovery, logout and paid relogin');
 const secondContext=await browser.newContext({storageState:await context.storageState()});
 const second=await secondContext.newPage(); await second.goto('http://127.0.0.1:8080');
 await second.waitForTimeout(2500); await semantics(second);
 try { await second.getByText('You’re in the arena',{exact:true}).waitFor(); } catch(e) { console.log('Second-session page:',(await second.locator('body').innerText()).slice(-1800)); throw e; }
 await page.bringToFront();
 await page.getByRole('button',{name:'Delete account',exact:true}).click();
 await fill('Current password','incorrect');
 await page.getByRole('button',{name:'Delete permanently',exact:true}).click();
 try { await page.getByText(/Incorrect password/).last().waitFor(); } catch(e) { console.log('Delete response page:',(await page.locator('body').innerText()).slice(-2000)); throw e; }
 await fill('Current password',password);
 await page.screenshot({path:path.join(screenshots,'delete-confirmation.png')});
 await page.getByRole('button',{name:'Delete permanently',exact:true}).click();
 await page.getByText('Welcome back',{exact:true}).waitFor();
 await page.reload(); await page.waitForTimeout(1500); await semantics(page);
 await page.getByText('Welcome back',{exact:true}).waitFor();
 await second.reload(); await second.waitForTimeout(1500); await semantics(second);
 await second.getByText('Welcome back',{exact:true}).waitFor();
 assert.equal(errors.length,0,errors.join('\n'));
 console.log('PASS: browser signup, login, trial, cookie/storage policy, empty/confirmed history, expiry, admin payment, suspension, second-session restoration/revocation, failed/correct deletion and reload. Screenshots saved.');
 await browser.close();
})().catch(e=>{ console.error(e.message); process.exit(1); });
