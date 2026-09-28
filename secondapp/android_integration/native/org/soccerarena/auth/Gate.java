package org.soccerarena.auth;

import android.app.*;
import android.content.*;
import android.os.*;
import android.security.keystore.*;
import android.util.Base64;
import android.view.*;
import android.widget.*;
import org.json.*;
import javax.net.ssl.HttpsURLConnection;
import javax.crypto.*;
import javax.crypto.spec.GCMParameterSpec;
import java.io.*;
import java.net.URL;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

/** Native entitlement owner. No credentials or requests are sent to media hosts. */
public final class Gate implements Application.ActivityLifecycleCallbacks {
    static final String API = "https://api.soccerarena.org/api/v1/";
    static final ExecutorService IO = Executors.newSingleThreadExecutor();
    static final Handler MAIN = new Handler(Looper.getMainLooper());
    static Application app;
    static volatile long deadline;
    static String access = "", refresh = "";
    static volatile JSONObject account;
    static volatile String notice = "";
    static final Set<Activity> activities = Collections.newSetFromMap(new WeakHashMap<Activity, Boolean>());
    static int started;
    static boolean checking;
    static long nextCheck;
    static volatile long generation;
    static boolean installed;
    static final String HOME = "com.sports.live.football.tv.ui.app.activities.HomeScreen";
    static final String TVHOME = "com.sports.live.football.tv.ui.tv.activities.TvHomeActivity";

    public static void init(Application application) {
        if (installed) return;
        installed = true; app = application;
        app.registerActivityLifecycleCallbacks(new Gate());
        MAIN.postDelayed(new Runnable() { public void run() {
            if (deadline != 0 && !valid()) revoke("Please verify your access to continue.");
            if (valid() && !checking && SystemClock.elapsedRealtime() >= nextCheck) {
                checking = true;
                IO.execute(() -> {
                    try { verify(); } catch (Exception e) { deadline = 0; notice = message(e); }
                    MAIN.post(() -> { checking = false; if (!valid()) revoke(notice); });
                });
            }
            MAIN.postDelayed(this, 250);
        }}, 250);
    }
    public static boolean valid() { return Lease.valid(deadline, SystemClock.elapsedRealtime()); }
    public static boolean enter(Activity activity) {
        if (valid()) return true;
        openAccount(activity, true);
        return false;
    }
    public static void openAccount(Activity activity, boolean resume) {
        Intent i = new Intent(activity, AccountActivity.class);
        i.putExtra("continue", resume);
        i.putExtra("tv", activity.getClass().getName().contains(".ui.tv."));
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        activity.startActivity(i);
    }
    static boolean protectedActivity(Activity a) {
        return a.getClass().getName().startsWith("com.sports.live.football.tv.ui.");
    }
    static void revoke(String reason) {
        deadline = 0; notice = reason; generation++;
        stopCast();
        Activity visible = null;
        for (Activity a : new ArrayList<>(activities)) {
            if (a != null && protectedActivity(a) && !a.isFinishing()) {
                if (a.hasWindowFocus()) visible = a;
                stopPlayers(a);
            }
        }
        if (visible != null) openAccount(visible, false);
        for (Activity a : new ArrayList<>(activities))
            if (a != null && protectedActivity(a)) a.finish();
    }
    static void stopPlayers(Activity a) {
        stopWebPlayback(a.getWindow().getDecorView());
        // Original players are activity-owned. Stop immediately before original onDestroy releases them.
        for (Class<?> c = a.getClass(); c != null && c.getName().startsWith("com.sports."); c = c.getSuperclass()) {
            for (java.lang.reflect.Field f : c.getDeclaredFields()) {
                String type = f.getType().getName();
                if (!(type.startsWith("androidx.media3.") || type.startsWith("com.google.android.exoplayer2.") || type.equals("re.u"))) continue;
                try { f.setAccessible(true); Object player = f.get(a);
                    if (player != null) {
                        try { f.getType().getMethod("setPlayWhenReady", boolean.class).invoke(player, false); } catch (Exception ignored) {}
                        try { f.getType().getMethod("stop").invoke(player); } catch (Exception ignored) {}
                    }
                } catch (Exception ignored) {}
            }
        }
    }
    static void stopWebPlayback(View view) {
        if (view instanceof android.webkit.WebView) {
            android.webkit.WebView web = (android.webkit.WebView) view;
            web.stopLoading(); web.onPause(); web.loadUrl("about:blank");
        } else if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            for (int i=0; i<group.getChildCount(); i++) stopWebPlayback(group.getChildAt(i));
        }
    }
    static void stopCast() {
        try {
            Class<?> c = Class.forName("com.google.android.gms.cast.framework.CastContext");
            Object context = c.getMethod("getSharedInstance", Context.class).invoke(null, app);
            Object manager = c.getMethod("getSessionManager").invoke(context);
            manager.getClass().getMethod("endCurrentSession", boolean.class).invoke(manager, true);
        } catch (Exception ignored) { /* Remote receivers cannot guarantee revocation when disconnected. */ }
    }
    static long time(String value) throws Exception {
        return Lease.serverTime(value);
    }
    static void accept(JSONObject ent, long start, long version) throws Exception {
        if (version != generation) return;
        long now = SystemClock.elapsedRealtime();
        long end = 0;
        if (ent.optBoolean("allowed", false))
            end = Lease.deadline(true, time(ent.getString("server_time")), time(ent.getString("expires_at")), start, now, ent.getInt("max_staleness_seconds"));
        deadline = end;
        nextCheck = now + Math.min(30000, Math.max(1000, (end - now) / 2));
        notice = ent.optString("reason", "");
        if (end == 0 && notice.isEmpty()) notice = "Your access is " + ent.optString("status", "unavailable") + ". Contact support to renew.";
    }
    static JSONObject request(String method, String path, JSONObject body, boolean authenticated) throws Exception {
        if (!path.matches("[a-z0-9/]+(?:\\?page=[0-9]+)?")) throw new IOException("Invalid API path");
        HttpsURLConnection c = (HttpsURLConnection) new URL(API + path).openConnection();
        c.setInstanceFollowRedirects(false); c.setConnectTimeout(12000); c.setReadTimeout(12000);
        c.setRequestMethod(method); c.setRequestProperty("Accept", "application/json");
        if (authenticated) c.setRequestProperty("Authorization", "Bearer " + access);
        try {
            if (body != null) {
                c.setDoOutput(true); c.setRequestProperty("Content-Type", "application/json");
                try (OutputStream out = c.getOutputStream()) { out.write(body.toString().getBytes("UTF-8")); }
            }
            int status = c.getResponseCode();
            InputStream in = status < 400 ? c.getInputStream() : c.getErrorStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            if (in != null) try (InputStream stream = in) {
                byte[] b = new byte[4096]; int n;
                while ((n = stream.read(b)) != -1) { if (out.size() + n > 1048576) throw new IOException("Response too large"); out.write(b, 0, n); }
            }
            JSONObject result = out.size() == 0 ? new JSONObject() : new JSONObject(out.toString("UTF-8"));
            if (status >= 300) {
                JSONObject error = result.optJSONObject("error");
                String msg = error == null ? "Service error (" + status + ")" : error.optString("message", "Request failed");
                if (error != null && error.optJSONObject("fields") != null && error.getJSONObject("fields").length() > 0)
                    msg += "\n" + error.getJSONObject("fields").toString();
                throw new ApiError(status, msg);
            }
            return result;
        } finally { c.disconnect(); }
    }
    static class ApiError extends IOException { final int status; ApiError(int s, String m) { super(m); status=s; } }
    static JSONObject authRequest(String method, String path, JSONObject data) throws Exception {
        if (access.isEmpty()) restore();
        try { return request(method, path, data, true); }
        catch (ApiError e) { if (e.status != 401) throw e; rotate(); return request(method, path, data, true); }
    }
    static void tokens(JSONObject result) throws Exception {
        access = result.getString("access"); refresh = result.getString("refresh");
        try { saveRefresh(refresh); } catch (Exception e) { access=""; refresh=""; deadline=0; throw new IOException("Cannot securely save your session. Please sign in again."); }
        account = result.getJSONObject("account");
    }
    static void login(String user, String password) throws Exception {
        long start = SystemClock.elapsedRealtime(), version = generation;
        JSONObject result = request("POST", "auth/login/", new JSONObject().put("username", user).put("password", password), false);
        tokens(result); accept(account.getJSONObject("entitlement"), start, version);
    }
    static void rotate() throws Exception {
        if (refresh.isEmpty()) refresh = loadRefresh();
        if (refresh.isEmpty()) throw new IOException("Sign in to continue.");
        try { tokens(request("POST", "auth/refresh/", new JSONObject().put("refresh", refresh), false)); }
        catch (ApiError e) { if (e.status == 401) clear(); throw e; }
    }
    static void restore() throws Exception { rotate(); }
    static void verify() throws Exception {
        long start = SystemClock.elapsedRealtime(), version = generation;
        JSONObject ent = authRequest("GET", "access/", null);
        accept(ent, start, version);
        if (account != null) account.put("entitlement", ent);
    }
    static void clear() {
        access=""; refresh=""; account=null; deadline=0; generation++;
        app.getSharedPreferences("arena_session", 0).edit().clear().commit();
    }
    static javax.crypto.SecretKey key() throws Exception {
        KeyStore ks = KeyStore.getInstance("AndroidKeyStore"); ks.load(null);
        if (!ks.containsAlias("arena_refresh")) {
            KeyGenerator gen = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            gen.init(new KeyGenParameterSpec.Builder("arena_refresh", KeyProperties.PURPOSE_ENCRYPT | KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM).setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE).build());
            gen.generateKey();
        }
        return (javax.crypto.SecretKey) ks.getKey("arena_refresh", null);
    }
    static void saveRefresh(String token) throws Exception {
        Cipher c = Cipher.getInstance("AES/GCM/NoPadding"); c.init(Cipher.ENCRYPT_MODE, key());
        String val = Base64.encodeToString(c.getIV(), Base64.NO_WRAP) + ":" + Base64.encodeToString(c.doFinal(token.getBytes("UTF-8")), Base64.NO_WRAP);
        if (!app.getSharedPreferences("arena_session",0).edit().putString("token",val).commit()) throw new IOException("Session storage failed");
    }
    static String loadRefresh() throws Exception {
        String val = app.getSharedPreferences("arena_session",0).getString("token", "");
        if (val.isEmpty()) return "";
        try {
            String[] parts = val.split(":"); Cipher c = Cipher.getInstance("AES/GCM/NoPadding");
            c.init(Cipher.DECRYPT_MODE, key(), new GCMParameterSpec(128, Base64.decode(parts[0], Base64.NO_WRAP)));
            return new String(c.doFinal(Base64.decode(parts[1], Base64.NO_WRAP)), "UTF-8");
        } catch (Exception e) { clear(); throw new IOException("Please sign in again."); }
    }
    static String message(Exception e) { return e instanceof ApiError ? e.getMessage() : e instanceof IOException && e.getMessage() != null && e.getMessage().startsWith("Sign in") ? e.getMessage() : "Unable to verify your account. Check your internet connection and try again."; }
    public void onActivityCreated(Activity a, Bundle b) { activities.add(a); }
    public void onActivityStarted(Activity a) { started++; }
    public void onActivityResumed(Activity a) {
        if (protectedActivity(a) && valid()) {
            // Permanent account entry, excluding player surfaces.
            String n = a.getClass().getSimpleName();
            if (n.equals("MainActivity") || n.equals("TvMainActivity")) {
                android.view.ViewGroup root = a.findViewById(android.R.id.content);
                if (root instanceof FrameLayout && root.findViewWithTag("arena_account") == null) {
                    Button button = new Button(a); button.setText("Account"); button.setTag("arena_account");
                    button.setOnClickListener(v -> openAccount(a, false));
                    FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(-2,-2,Gravity.TOP | Gravity.END);
                    lp.topMargin = (int)(28 * a.getResources().getDisplayMetrics().density); root.addView(button,lp);
                }
            }
            hideAds(a.getWindow().getDecorView());
        }
    }
    static void hideAds(View view) {
        if (view.getId() != View.NO_ID) try {
            String id = view.getResources().getResourceEntryName(view.getId()).toLowerCase(Locale.ROOT);
            if (id.matches("(?:ad_view.*|adview.*|fb_ad_view.*|start_app_banner.*|unity_banner_view.*|app_lovin_.*|adblock_layout|top_ad_lay|bottom_ad_lay|count_down_timer_ad)")) { view.setVisibility(View.GONE); return; }
        } catch (Exception ignored) {}
        if (view instanceof ViewGroup) { ViewGroup g=(ViewGroup)view; for(int i=0;i<g.getChildCount();i++) hideAds(g.getChildAt(i)); }
    }
    public void onActivityPaused(Activity a) {}
    public void onActivityStopped(Activity a) {
        started=Math.max(0,started-1);
        if (started==0 && !a.isChangingConfigurations()) {
            deadline=0; generation++; stopCast();
            for(Activity p:new ArrayList<>(activities)) if(p!=null&&protectedActivity(p)) {
                stopPlayers(p);
                // TV playback lives in a fragment; finishing also runs its teardown.
                p.finish();
            }
        }
    }
    public void onActivitySaveInstanceState(Activity a, Bundle b) {}
    public void onActivityDestroyed(Activity a) { activities.remove(a); }
}
