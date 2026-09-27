package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f67405a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f67406b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f67407c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f67408d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f67409e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f67410f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f67411g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f67412h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f67413i = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f67414a;

        public a(Context context) {
            this.f67414a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f67414a);
                    g.a(advertisingIdInfo.getId());
                    g.f67408d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    g.b(this.f67414a, advertisingIdInfo.getId(), g.f67408d);
                } catch (Exception unused) {
                    q0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        c.b bVarA = new c().a(this.f67414a);
                        g.a(bVarA.a());
                        g.f67408d = bVarA.b() ? 1 : 0;
                        g.b(this.f67414a, bVarA.a(), g.f67408d);
                    } catch (Exception unused2) {
                        q0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th2) {
                    q0.b("DomainSameDiTool", th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i10) {
        try {
            if (a1.b(str)) {
                y0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            y0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i10));
        } catch (Exception e10) {
            q0.b("DomainSameDiTool", e10.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f67406b) ? "" : f67406b;
        }
        if (!TextUtils.isEmpty(f67406b)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f67406b;
            }
            return f67408d == 0 ? f67406b : "";
        }
        if (!f67407c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f67407c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f67405a) ? "" : f67405a;
        }
        if (!TextUtils.isEmpty(f67405a)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f67405a;
            }
            return f67408d == 0 ? f67405a : "";
        }
        m0.k();
        if (!f67407c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            f67407c = true;
        }
        return TextUtils.isEmpty(f67405a) ? "" : f67405a;
    }

    public static String e() {
        if (TextUtils.isEmpty(f67411g) && !f67410f) {
            b();
        }
        return f67411g;
    }

    public static int a() {
        return f67408d;
    }

    public static void a(int i10) {
        f67408d = i10;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f67410f) {
            return f67409e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i10 = Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING);
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put("status", i10);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    f67411g = string2;
                    f67409e = k0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e10) {
                q0.b("DomainSameDiTool", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("DomainSameDiTool", th2.getMessage());
        }
        f67410f = true;
        return f67409e;
    }

    public static void a(String str) {
        f67406b = k0.b(str);
        f67405a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
            if (f67413i) {
                return f67412h;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                f67412h = context.getPackageManager().checkPermission(k0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                f67412h = true;
            }
            f67413i = true;
            return f67412h;
        } catch (Exception unused) {
            f67412h = false;
        }
    }
}
