package com.bytedance.sdk.openadsdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.Q6;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r7.u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class DeviceUtils {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private static int f37623ed = 0;
    public static String hww = "";
    private static int khx;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private static int f37627ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private static int f37628rs;
    private static int weu;
    private static int wgt;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private static volatile long f37630tq = System.currentTimeMillis();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private static volatile boolean f37629sd = false;
    private static volatile boolean vy = false;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static volatile boolean f37625hv = false;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static volatile boolean f37624hu = true;
    private static long vgm = 0;
    private static String nod = "";
    private static int vhb = 0;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private static final AtomicBoolean f37626ny = new AtomicBoolean(false);

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private static AtomicBoolean f37622bs = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class AudioInfoReceiver extends BroadcastReceiver {
        static final CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.ed.ok> hww = new CopyOnWriteArrayList<>();

        /* JADX INFO: Access modifiers changed from: private */
        public static void tq(Context context) {
            if (DeviceUtils.vy || context == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                context.registerReceiver(new AudioInfoReceiver(), intentFilter, null, com.bytedance.sdk.component.utils.rs.hww());
                boolean unused = DeviceUtils.vy = true;
            } catch (Throwable unused2) {
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            try {
                if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                        int unused = DeviceUtils.weu = intent.getIntExtra("state", 0);
                    }
                } else if (intent.getIntExtra(u2.e.b.f124195c, -1) == 3) {
                    int unused2 = DeviceUtils.f37623ed = intent.getIntExtra(u2.e.b.f124196d, 0);
                    if (!hww.isEmpty()) {
                        syb.hww(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.AudioInfoReceiver.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Iterator<com.bytedance.sdk.openadsdk.ed.ok> it = AudioInfoReceiver.hww.iterator();
                                while (it.hasNext()) {
                                    it.next().tq(DeviceUtils.f37623ed);
                                }
                            }
                        });
                    }
                    if (DeviceUtils.f37628rs != 0) {
                        int unused3 = DeviceUtils.khx = (int) ((((double) DeviceUtils.f37623ed) / ((double) DeviceUtils.f37628rs)) * 100.0d);
                    }
                }
            } catch (Exception unused4) {
            }
        }

        public static void hww(com.bytedance.sdk.openadsdk.ed.ok okVar) {
            if (okVar != null) {
                CopyOnWriteArrayList<com.bytedance.sdk.openadsdk.ed.ok> copyOnWriteArrayList = hww;
                if (copyOnWriteArrayList.contains(okVar)) {
                    return;
                }
                copyOnWriteArrayList.add(okVar);
            }
        }

        public static void tq(com.bytedance.sdk.openadsdk.ed.ok okVar) {
            if (okVar == null) {
                return;
            }
            hww.remove(okVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww extends BroadcastReceiver {
        private hww() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void tq(Context context) {
            int i10 = Build.VERSION.SDK_INT;
            if (context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                if (i10 >= 33) {
                    context.registerReceiver(new hww(), intentFilter, 2);
                } else {
                    context.registerReceiver(new hww(), intentFilter);
                }
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                return;
            }
            if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                DeviceUtils.hnv(context);
            } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                int unused = DeviceUtils.wgt = intent.getIntExtra("state", 0) == 1 ? 1 : 0;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class sd extends com.bytedance.sdk.component.ok.ok {
        public sd() {
            super("gaid_task");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.sdk.openadsdk.core.sd] */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v3 */
        @Override // java.lang.Runnable
        public void run() {
            ?? r10;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(com.bytedance.sdk.openadsdk.core.bs.hww());
                if (advertisingIdInfo != null) {
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    if (zIsLimitAdTrackingEnabled) {
                        com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(1);
                        com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(2, "lmt");
                    }
                    DeviceUtils.tq(advertisingIdInfo, zIsLimitAdTrackingEnabled);
                    r10 = zIsLimitAdTrackingEnabled;
                } else {
                    r10 = -1;
                }
                if (r10 != -1) {
                    com.bytedance.sdk.openadsdk.core.sd.hww().hww("limit_ad_track", r10);
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(2);
                com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(3, th2);
                com.bytedance.sdk.component.utils.omn.sd("TTAD.DeviceUtils", th2.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class tq extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = DeviceUtils.f37624hu = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = DeviceUtils.f37624hu = false;
            } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                long unused3 = DeviceUtils.f37630tq = System.currentTimeMillis();
            }
        }
    }

    private static void aeg(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver(null) { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.3
            @Override // android.database.ContentObserver
            public void onChange(boolean z10) {
                super.onChange(z10);
                DeviceUtils.hnv(applicationContext);
            }
        });
    }

    private static int bs(Context context) {
        return weu;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hnv(Context context) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        syb.tq(new com.bytedance.sdk.component.ok.ok("DeviceUtils_get_low_power_mode") { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.2
            @Override // java.lang.Runnable
            public void run() {
                int unused = DeviceUtils.wgt = DeviceUtils.kv(applicationContext);
            }
        });
    }

    public static int hu(Context context) {
        if (!f37626ny.get()) {
            weu(context);
        }
        return vhb;
    }

    public static String hv(Context context) {
        if (!f37626ny.get()) {
            weu(context);
        }
        return nod;
    }

    private static float jpb(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    private static int kub(Context context) {
        try {
            String str = Build.MANUFACTURER;
            if (str.equalsIgnoreCase("XIAOMI")) {
                return Settings.System.getInt(context.getContentResolver(), "POWER_SAVE_MODE_OPEN") == 1 ? 1 : 0;
            }
            return (str.equalsIgnoreCase("HUAWEI") && Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int kv(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            String str = Build.MANUFACTURER;
            if (!str.equalsIgnoreCase("XIAOMI") && !str.equalsIgnoreCase("HUAWEI")) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
            }
            return kub(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int mrs(Context context) {
        return wgt;
    }

    public static int nod(Context context) {
        return f37627ok;
    }

    public static void ny() {
        try {
            int ringerMode = ((AudioManager) com.bytedance.sdk.openadsdk.core.bs.hww().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f37627ok = 1;
            } else if (ringerMode == 1) {
                f37627ok = 2;
            } else {
                f37627ok = 0;
            }
        } catch (Throwable unused) {
        }
    }

    public static int ok(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("TTAD.DeviceUtils", th2.getMessage());
            return -1;
        }
    }

    private static void omn(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            f37628rs = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f37623ed = streamVolume;
            khx = (int) ((((double) streamVolume) / ((double) f37628rs)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    public static int rs(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static JSONObject vgm(Context context) {
        return hww(context, false);
    }

    public static void vhb() {
        com.bytedance.sdk.openadsdk.core.settings.vhb.hww(new com.bytedance.sdk.openadsdk.core.settings.nod.hww() { // from class: com.bytedance.sdk.openadsdk.utils.DeviceUtils.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.nod.hww
            public void hww() {
                com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(true);
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.nod.hww
            public void tq() {
                com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(true);
            }
        });
        Context contextHww = com.bytedance.sdk.openadsdk.core.bs.hww();
        if (contextHww != null) {
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("cpu_count", nod.hww());
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("cpu_max_frequency", nod.hww(nod.hww()));
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("cpu_min_frequency", nod.tq(nod.hww()));
            String strVhb = qt.vhb();
            if (strVhb != null) {
                com.bytedance.sdk.openadsdk.core.sd.hww().hww("total_memory", strVhb);
            }
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("total_internal_storage", qt.ny());
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("free_internal_storage", com.bytedance.sdk.component.utils.bs.hww());
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("total_sdcard_storage", qt.weu());
            com.bytedance.sdk.openadsdk.core.sd.hww().hww("is_root", qt.bs() ? 1 : 0);
            if (TextUtils.isEmpty(nod())) {
                try {
                    Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
                    hww = "unity";
                } catch (ClassNotFoundException unused) {
                    hww = "native";
                }
                com.bytedance.sdk.openadsdk.core.sd.hww().hww("framework_name", hww);
            }
            ny();
            omn(contextHww);
            wgt = kv(contextHww);
            ok.hww(contextHww);
        }
    }

    private static int wgt(Context context) {
        try {
            int i10 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i10 == 32) {
                return 1;
            }
            return i10 == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    public static String nod() {
        if (TextUtils.isEmpty(hww)) {
            hww = com.bytedance.sdk.openadsdk.core.sd.hww().tq("framework_name", "");
        }
        return hww;
    }

    public static int rs() {
        return f37628rs;
    }

    public static boolean sd(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
        }
    }

    public static int vgm() {
        return f37623ed;
    }

    public static int vy(Context context) {
        if (sd(context)) {
            return 3;
        }
        return tq(context) ? 2 : 1;
    }

    private static void weu(Context context) {
        if (context == null || !f37626ny.compareAndSet(false, true)) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.kv.hww.hww("gp_v_enable", 0) == 1) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
                nod = packageInfo.versionName;
                vhb = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
    }

    public static int ok() {
        return khx;
    }

    public static int sd() {
        return com.bytedance.sdk.openadsdk.core.sd.hww().tq("limit_ad_track", -1);
    }

    public static boolean tq() {
        if (SystemClock.elapsedRealtime() - vgm >= 20000) {
            vgm = SystemClock.elapsedRealtime();
            try {
                PowerManager powerManager = (PowerManager) com.bytedance.sdk.openadsdk.core.bs.hww().getSystemService("power");
                if (powerManager != null) {
                    f37624hu = powerManager.isInteractive();
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.omn.sd("TTAD.DeviceUtils", th2.getMessage());
            }
        }
        return f37624hu;
    }

    public static int hu() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) com.bytedance.sdk.openadsdk.core.bs.hww().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    public static float hv() {
        int i10 = -1;
        try {
            Context contextHww = com.bytedance.sdk.openadsdk.core.bs.hww();
            if (contextHww != null) {
                i10 = Settings.System.getInt(contextHww.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.omn.sd("TTAD.DeviceUtils", th2.getMessage());
        }
        if (i10 < 0) {
            return -1.0f;
        }
        return Math.round((i10 / 255.0f) * 10.0f) / 10.0f;
    }

    public static String vy() {
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    public static void hww(Context context) {
        if (f37629sd) {
            return;
        }
        try {
            tq tqVar = new tq();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            context.getApplicationContext().registerReceiver(tqVar, intentFilter);
            f37629sd = true;
        } catch (Throwable unused) {
        }
    }

    public static void ny(Context context) {
        Context applicationContext;
        if (f37625hv || context == null || (applicationContext = context.getApplicationContext()) == null) {
            return;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                hww.tq(applicationContext);
            } else {
                aeg(applicationContext);
            }
            f37625hv = true;
        } catch (Throwable unused) {
        }
    }

    public static boolean tq(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
        }
    }

    private static void tq(JSONObject jSONObject) throws JSONException {
        jSONObject.put("model", Build.MODEL);
        com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void tq(AdvertisingIdClient.Info info, boolean z10) {
        if (!com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().sd()) {
            com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(1, "not in privacy fields allowed");
            return;
        }
        if (z10) {
            return;
        }
        String id2 = info.getId();
        String strTq = com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().tq();
        if (!TextUtils.isEmpty(id2)) {
            com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(id2);
            com.bytedance.sdk.openadsdk.core.nod.sd.hww(id2);
            com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().tq(true);
        } else {
            com.bytedance.sdk.openadsdk.omn.hww.tq.hww.hww().hww(4, "empty gaid");
        }
        if (strTq.equals(id2)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.ny.hww();
    }

    public static long hww() {
        return f37630tq;
    }

    private static void hww(JSONObject jSONObject) throws JSONException {
        tq(jSONObject);
    }

    public static JSONObject hww(Context context, boolean z10) {
        String strNod;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", ok(context));
            hww(jSONObject);
            jSONObject.put("type", vy(context));
            jSONObject.put(Q6.F, 1);
            jSONObject.put(CommonUrlParts.OS_VERSION, Build.VERSION.RELEASE);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("conn_type", qt.ok(context));
            jSONObject.put(CommonUrlParts.APP_SET_ID, com.bytedance.sdk.openadsdk.core.settings.vy.sd());
            jSONObject.put(CommonUrlParts.APP_SET_ID_SCOPE, com.bytedance.sdk.openadsdk.core.settings.vy.tq());
            jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.vy.vy());
            jSONObject.put("screen_scale", wdz.hu(context));
            jSONObject.put("density", wdz.ok(context));
            jSONObject.put(CommonUrlParts.SCREEN_WIDTH, wdz.sd(context));
            jSONObject.put(CommonUrlParts.SCREEN_HEIGHT, wdz.hv(context));
            jSONObject.put("sec_did", com.bytedance.sdk.openadsdk.core.nod.sd.hu());
            com.bytedance.sdk.openadsdk.core.settings.vhb vhbVarVy = com.bytedance.sdk.openadsdk.core.bs.vy();
            if (vhbVarVy.zvy("boot")) {
                jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                jSONObject.put("power_on_time", String.valueOf(SystemClock.elapsedRealtime()));
            }
            jSONObject.put(CommonUrlParts.UUID, com.bytedance.sdk.openadsdk.core.ny.sd(context));
            jSONObject.put("rom_version", aed.hww());
            jSONObject.put("sys_compiling_time", com.bytedance.sdk.openadsdk.core.ny.tq(context));
            jSONObject.put("timezone", qt.aed());
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.ny.tq());
            jSONObject.put("carrier_name", mw.hww());
            if (z10) {
                strNod = qt.hww(context);
            } else {
                strNod = qt.nod();
            }
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(strNod) * 1024));
            jSONObject.put("locale_language", vy());
            jSONObject.put("screen_bright", Math.ceil(hv() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", 1 ^ (tq() ? 1 : 0));
            jSONObject.put("cpu_num", nod.tq());
            jSONObject.put("cpu_max_freq", nod.sd());
            jSONObject.put("cpu_min_freq", nod.vy());
            vgm.hww hwwVarHww = vgm.hww();
            jSONObject.put("battery_remaining_pct", (int) hwwVarHww.f37697tq);
            jSONObject.put("is_charging", hwwVarHww.hww);
            jSONObject.put("total_space", String.valueOf(qt.tq(context)));
            jSONObject.put("free_space_in", String.valueOf(qt.ed()));
            jSONObject.put("sdcard_size", String.valueOf(qt.khx()));
            jSONObject.put("rooted", qt.wgt());
            jSONObject.put("enable_assisted_clicking", hu());
            jSONObject.put("force_language", com.bytedance.sdk.component.utils.kub.hww(context, "tt_choose_language"));
            jSONObject.put("airplane", rs(context));
            jSONObject.put("darkmode", wgt(context));
            jSONObject.put("headset", bs(context));
            jSONObject.put("ringmute", nod(context));
            jSONObject.put("screenscale", jpb(context));
            jSONObject.put("volume", ok());
            jSONObject.put("low_power_mode", mrs(context));
            jSONObject.put("enable_draw_feed", qt.blh());
            if (z10) {
                ok.hww(jSONObject, context);
                jSONObject.put("gp_v_name", hv(context));
                jSONObject.put("gp_v_code", hu(context));
            }
            if (vhbVarVy.zvy("mnc")) {
                jSONObject.put("mnc", mw.sd());
            }
            if (vhbVarVy.zvy("mcc")) {
                jSONObject.put("mcc", mw.tq());
            }
            jSONObject.put("act", com.bytedance.sdk.openadsdk.core.hww.hww.tq(context));
            jSONObject.put("act_event", com.bytedance.sdk.openadsdk.core.hww.hww.hww());
            String strSd = com.bytedance.sdk.openadsdk.core.nod.sd.sd();
            com.bytedance.sdk.openadsdk.core.nod.sd.vy();
            if (!TextUtils.isEmpty(strSd)) {
                jSONObject.put("sof_chara", strSd);
            }
            String strTq = com.bytedance.sdk.openadsdk.multipro.vy.vy.tq("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            if (!strTq.isEmpty()) {
                jSONObject.put("ipv6", strTq);
            }
            jSONObject.put("is_multi", com.bytedance.sdk.openadsdk.multipro.tq.sd());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void vhb(Context context) {
        AudioInfoReceiver.tq(context);
    }
}
