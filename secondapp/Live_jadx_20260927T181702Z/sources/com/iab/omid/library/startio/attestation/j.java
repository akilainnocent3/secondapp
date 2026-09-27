package com.iab.omid.library.startio.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class j implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile j f53842d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Boolean f53843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Boolean f53844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f53845c;

    private j(Context context) {
        this.f53845c = context;
        c();
    }

    public static j a(Context context) {
        if (f53842d == null) {
            synchronized (j.class) {
                try {
                    if (f53842d == null) {
                        f53842d = new j(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f53842d;
    }

    public boolean b() {
        if (this.f53844b != null) {
            return this.f53844b.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f53844b != null) {
                    return this.f53844b.booleanValue();
                }
                if (!c()) {
                    this.f53844b = Boolean.FALSE;
                    return false;
                }
                try {
                    PackageManager packageManager = this.f53845c.getPackageManager();
                    if (packageManager == null) {
                        com.iab.omid.library.startio.utils.d.b("PackageManager is null when checking attestation capability");
                        this.f53844b = Boolean.FALSE;
                        return false;
                    }
                    boolean zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                    this.f53844b = Boolean.valueOf(zHasSystemFeature);
                    return zHasSystemFeature;
                } catch (SecurityException e10) {
                    com.iab.omid.library.startio.utils.d.a("Security exception when checking attestation capability", e10);
                    this.f53844b = Boolean.FALSE;
                    return false;
                } catch (Exception e11) {
                    com.iab.omid.library.startio.utils.d.a("Unexpected error when checking attestation capability", e11);
                    this.f53844b = Boolean.FALSE;
                    return false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean c() {
        boolean zBooleanValue;
        int i10;
        if (this.f53843a != null) {
            return this.f53843a.booleanValue();
        }
        synchronized (this) {
            try {
                if (this.f53843a != null) {
                    zBooleanValue = this.f53843a.booleanValue();
                } else {
                    zBooleanValue = this.f53845c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i10 = Build.VERSION.SDK_INT) >= 25 && i10 <= 30;
                    this.f53843a = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    @Override // com.iab.omid.library.startio.attestation.k
    public boolean a() {
        return c();
    }
}
