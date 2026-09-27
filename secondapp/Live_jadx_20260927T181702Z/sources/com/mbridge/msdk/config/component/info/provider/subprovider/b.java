package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.Y1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f65309c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f65310d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f65311e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f65312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f65313b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"MissingPermission"})
        public void run() {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b.this.f65312a.getSystemService("connectivity");
                if (connectivityManager != null && b.this.a()) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(17);
                    int i10 = (networkInfo == null || !networkInfo.isConnected()) ? 0 : 1;
                    b.f65311e = i10;
                    if (i10 == 0) {
                        b.f65311e = b.this.f() ? 2 : 0;
                    }
                    if (activeNetworkInfo == null) {
                        b.f65309c = 0;
                        return;
                    }
                    if (activeNetworkInfo.getType() == 1) {
                        b.f65309c = 9;
                        return;
                    }
                    TelephonyManager telephonyManager = (TelephonyManager) b.this.f65312a.getSystemService("phone");
                    if (telephonyManager == null) {
                        b.f65309c = 0;
                        return;
                    }
                    int dataNetworkType = Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
                    b.f65309c = b.this.a(dataNetworkType);
                    b.f65310d = String.valueOf(dataNetworkType);
                }
            } catch (Throwable th2) {
                q0.b("NetworkStatusProvider", th2.getMessage());
                b.f65309c = 0;
                b.f65310d = "";
                b.f65311e = 0;
            }
        }
    }

    public b(Context context) {
        if (context != null) {
            this.f65312a = context;
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
            case 19:
                return 4;
            case 20:
                return 5;
            default:
                return 0;
        }
    }

    public void b() {
        try {
            if (com.mbridge.msdk.foundation.same.threadpool.a.d().getActiveCount() < 1) {
                com.mbridge.msdk.foundation.same.threadpool.a.d().execute(this.f65313b);
            }
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
        }
    }

    public int c() {
        return f65309c;
    }

    public String d() {
        return f65310d;
    }

    public int e() {
        return f65311e;
    }

    public boolean f() {
        try {
            if (com.mbridge.msdk.foundation.controller.c.n().d() == null) {
                return false;
            }
            String property = System.getProperty("http.proxyHost");
            String property2 = System.getProperty("http.proxyPort");
            if (TextUtils.isEmpty(property2)) {
                property2 = Y1.f60333f;
            }
            return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
        } catch (Throwable th2) {
            q0.b("NetworkStatusProvider", th2.getMessage());
            return false;
        }
    }

    public boolean a() {
        try {
            return this.f65312a.getPackageManager().checkPermission(com.bumptech.glide.manager.e.f31484b, this.f65312a.getPackageName()) == 0;
        } catch (Exception e10) {
            q0.b("NetworkStatusProvider", e10.getMessage());
            return false;
        }
    }
}
