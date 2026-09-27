package sg.bigo.ads.common.aa;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ironsource.Y1;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import k.i1;
import sg.bigo.ads.common.d.e;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f132867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<a> f132868b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f132869c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f132870d = Y1.f60333f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f132871e = Y1.f60333f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f132872f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicBoolean f132873g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f132874h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static sg.bigo.ads.common.b f132875i = new sg.bigo.ads.common.b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f132876j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static BroadcastReceiver f132877k = new BroadcastReceiver() { // from class: sg.bigo.ads.common.aa.b.3
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (b.f132874h <= 0 || System.currentTimeMillis() - b.f132874h >= r.f133428a.a(10)) {
                long unused = b.f132874h = System.currentTimeMillis();
                if (intent != null) {
                    try {
                        b.f132875i.f132887a = intent.getIntExtra("level", -1);
                        b.f132875i.f132888b = intent.getIntExtra("scale", -1);
                        b.f132875i.f132889c = intent.getIntExtra("status", -1);
                    } catch (Throwable unused2) {
                        b.f132875i.f132887a = -1;
                        b.f132875i.f132888b = -1;
                        b.f132875i.f132889c = -1;
                    }
                }
            }
        }
    };

    public interface a {
        void a(int i10);
    }

    public static String c(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        if (Y1.f60333f.equals(f132870d)) {
            f132870d = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f132870d;
            }
            try {
                f132870d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return f132870d;
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    public static void j(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context == null || (broadcastReceiver = f132877k) == null || !f132876j) {
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Throwable unused) {
        }
        f132877k = null;
        f132876j = false;
    }

    private static boolean k() {
        for (String str : System.getenv(AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(":")) {
            File file = new File(str);
            if (file.isDirectory() && new File(file, "su").exists()) {
                return true;
            }
        }
        return false;
    }

    public static int l(Context context) {
        int i10 = 4;
        if (context == null) {
            return 4;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 24 && connectivityManager.isActiveNetworkMetered()) {
            int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            i10 = 3;
            if (restrictBackgroundStatus != 1) {
                if (restrictBackgroundStatus != 2) {
                    return restrictBackgroundStatus != 3 ? 0 : 1;
                }
                return 2;
            }
        }
        return i10;
    }

    public static float m(Context context) {
        if (context == null) {
            return 0.0f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getVolume exception: " + e10.getMessage());
        }
        return 0.0f;
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            return accessibilityManager != null && accessibilityManager.isEnabled();
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isAccessibilityServiceEnabled exception: " + e10.getMessage());
            return false;
        }
    }

    public static int o(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                return audioManager.getRingerMode();
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getNotificationMode exception: " + e10.getMessage());
        }
        return 0;
    }

    public static float p(Context context) {
        if (context == null) {
            return 1.0f;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                return configuration.fontScale;
            }
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getFontScale exception: " + e10.getMessage());
        }
        return 1.0f;
    }

    public static int q(Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 24) {
            try {
                int i10 = context.getResources().getDisplayMetrics().densityDpi;
                int i11 = DisplayMetrics.DENSITY_DEVICE_STABLE;
                if (i10 > i11) {
                    return 1;
                }
                return i10 == i11 ? 0 : 2;
            } catch (Exception e10) {
                sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getDisplayScale exception: " + e10.getMessage());
            }
        }
        return -1;
    }

    public static int r(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            int i10 = context.getResources().getConfiguration().uiMode & 48;
            if (i10 != 16) {
                return i10 != 32 ? 0 : 2;
            }
            return 1;
        } catch (Exception e10) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getThemeMode exception: " + e10.getMessage());
            return 0;
        }
    }

    public static int s(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getTargetSdkVersion exception: " + th2.getMessage());
            return 0;
        }
    }

    public static int t(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return context.getApplicationInfo().minSdkVersion;
            }
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getMinSdkVersion exception: " + th2.getMessage());
        }
        return 0;
    }

    public static boolean u(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            sg.bigo.ads.common.t.a.b("DeviceUtil", "Unexpected exception from Play services lib.");
            return false;
        }
    }

    public static long v(Context context) {
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir).length();
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "getApkSize exception: " + th2.getMessage());
            return 0L;
        }
    }

    public static boolean w(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            return true;
        } catch (Throwable th2) {
            sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "isUnityEnvironment exception: " + th2.getMessage());
            return false;
        }
    }

    public static int a(@NonNull Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i10 = activity.getResources().getConfiguration().orientation;
        if (1 == i10) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i10) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }

    public static String b(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        if (language.equals("iw")) {
            return "he";
        }
        if (language.equals(ScarConstants.IN_SIGNAL_KEY)) {
            return "id";
        }
        return language.equals("ji") ? "yi" : language;
    }

    public static boolean c() {
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su"};
            for (int i10 = 0; i10 < 6; i10++) {
                if (!new File(strArr[i10]).exists()) {
                }
            }
            String str = Build.TAGS;
            return (str != null && str.contains("test-keys")) || k();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean d() {
        return true;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if (Y1.f60333f.equals(f132871e)) {
            f132871e = "";
            if (!sg.bigo.ads.common.utils.c.a(context, "android.permission.READ_PHONE_STATE")) {
                return f132871e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                f132871e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    f132871e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return f132871e;
    }

    @i1
    public static void g(Context context) {
        if (f132873g.getAndSet(true) || context == null || !j()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "Register display listener");
        final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.common.aa.b.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i10) {
                if (i10 == 0) {
                    try {
                        int unused = b.f132872f = displayManager.getDisplay(i10).getState();
                    } catch (Throwable unused2) {
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "onDisplayChanged: " + i10 + ", sDefaultDisplayState: " + b.f132872f);
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i10) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i10) {
            }
        }, null);
    }

    public static sg.bigo.ads.common.b h(Context context) {
        if (!f132876j) {
            i(context);
        }
        return f132875i;
    }

    public static void i(Context context) {
        if (context == null || f132876j) {
            return;
        }
        context.registerReceiver(f132877k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        f132876j = true;
    }

    private static boolean j() {
        return true;
    }

    public static boolean k(Context context) {
        PowerManager powerManager;
        return (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null || !powerManager.isPowerSaveMode()) ? false : true;
    }

    public static boolean b() {
        return j() && f132872f == 1;
    }

    public static void a() {
        f132870d = Y1.f60333f;
        f132871e = Y1.f60333f;
    }

    public static synchronized void a(Context context, @NonNull a aVar) {
        if (context != null) {
            try {
                List<a> list = f132868b;
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
                if (!f132869c) {
                    f132869c = true;
                    sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "registerScreenListener");
                    sg.bigo.ads.common.d.a.a().a(context, new e() { // from class: sg.bigo.ads.common.aa.b.1
                        /* JADX WARN: Code duplicated, block: B:15:0x0041  */
                        /* JADX WARN: Code duplicated, block: B:18:0x004f A[LOOP:0: B:16:0x0049->B:18:0x004f, LOOP_END] */
                        /* JADX WARN: Code duplicated, block: B:19:0x005d A[ORIG_RETURN, RETURN] */
                        @Override // sg.bigo.ads.common.d.b
                        public final void a(Context context2, Intent intent) {
                            Iterator it;
                            int i10;
                            String action = intent.getAction();
                            if (q.a((CharSequence) action)) {
                                return;
                            }
                            int i11 = b.f132867a;
                            sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "action = ".concat(String.valueOf(action)));
                            action.getClass();
                            if (!action.equals("android.intent.action.SCREEN_OFF")) {
                                i10 = action.equals("android.intent.action.USER_PRESENT") ? 1 : 2;
                                if (i11 != b.f132867a) {
                                    it = b.f132868b.iterator();
                                    while (it.hasNext()) {
                                        ((a) it.next()).a(b.f132867a);
                                    }
                                }
                            }
                            int unused = b.f132867a = i10;
                            if (i11 != b.f132867a) {
                                it = b.f132868b.iterator();
                                while (it.hasNext()) {
                                    ((a) it.next()).a(b.f132867a);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (f132867a == 0) {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            f132867a = (powerManager == null || powerManager.isScreenOn()) ? 1 : 2;
        }
        return f132867a == 1;
    }
}
