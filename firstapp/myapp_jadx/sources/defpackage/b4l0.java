package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.measurement.internal.zzr;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class b4l0 extends j3l0 {
    public String c;
    public String d;
    public int e;
    public String f;
    public String g;
    public long h;
    public final long i;
    public final long j;
    public List k;
    public String l;
    public int m;
    public String n;
    public String o;
    public long p;
    public String q;

    public b4l0(k8l0 k8l0Var, long j, long j2) {
        super(k8l0Var);
        this.p = 0L;
        this.q = null;
        this.i = j;
        this.j = j2;
    }

    @Override // defpackage.j3l0
    public final boolean j() {
        return true;
    }

    public final void l() {
        String str;
        g();
        k8l0 k8l0Var = this.a;
        j6l0 j6l0Var = k8l0Var.e;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.k(j6l0Var);
        if (j6l0Var.n().i(hbl0.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            yol0 yol0Var = k8l0Var.i;
            k8l0.k(yol0Var);
            yol0Var.e0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            k8l0.m(y4l0Var);
            y4l0Var.m.a("Analytics Storage consent is not granted");
            str = null;
        }
        k8l0.m(y4l0Var);
        y4l0Var.m.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.o = str;
        k8l0Var.k.getClass();
        this.p = System.currentTimeMillis();
    }

    public final String m() {
        h();
        hm20.h(this.c);
        return this.c;
    }

    public final String n() {
        g();
        h();
        hm20.h(this.n);
        return this.n;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0265 A[Catch: NameNotFoundException -> 0x026d, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x026d, blocks: (B:98:0x025f, B:100:0x0265), top: B:133:0x025f }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0268 A[PHI: r5 r37
      0x0268: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x026d, B:99:0x0263] A[DONT_GENERATE, DONT_INLINE]
      0x0268: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x026d, B:99:0x0263] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:112:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:118:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x012f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x0185  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x0201  */
    /* JADX WARN: Code duplicated, block: B:87:0x0228  */
    /* JADX WARN: Code duplicated, block: B:91:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x0237  */
    /* JADX WARN: Code duplicated, block: B:95:0x0250  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final zzr k(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zF;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jA;
        long jMin;
        Boolean boolS;
        boolean z4;
        boolean z5;
        String strZ;
        boolean z6;
        String str4;
        Boolean boolS2;
        boolean zBooleanValue;
        k8l0 k8l0Var;
        String strM;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoA;
        t2l0 t2l0Var;
        int iB;
        g();
        String strM2 = m();
        String strN = n();
        h();
        String str5 = this.d;
        h();
        long j4 = this.e;
        h();
        hm20.h(this.f);
        String str6 = this.f;
        k8l0 k8l0Var2 = this.a;
        wok0 wok0Var = k8l0Var2.d;
        y4l0 y4l0Var = k8l0Var2.f;
        wok0 wok0Var2 = k8l0Var2.d;
        Context context = k8l0Var2.a;
        yol0 yol0Var = k8l0Var2.i;
        j6l0 j6l0Var = k8l0Var2.e;
        wok0Var.l();
        h();
        g();
        long j5 = this.h;
        long jC = 0;
        if (j5 == 0) {
            k8l0.k(yol0Var);
            k8l0 k8l0Var3 = yol0Var.a;
            String packageName = context.getPackageName();
            yol0Var.g();
            hm20.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestX = yol0.x();
            long jY = -1;
            if (messageDigestX == null) {
                y4l0 y4l0Var2 = k8l0Var3.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.f.a("Could not get MD5 instance");
                str2 = str5;
                j = j4;
            } else {
                if (packageManager != null) {
                    try {
                        if (yol0Var.K(context, packageName)) {
                            str2 = str5;
                            j = j4;
                            jY = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j4;
                                try {
                                    Signature[] signatureArr = r7k0.a(context).b(64, k8l0Var3.a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        y4l0 y4l0Var3 = k8l0Var3.f;
                                        k8l0.m(y4l0Var3);
                                        y4l0Var3.i.a("Could not get signatures");
                                    } else {
                                        jY = yol0.y(messageDigestX.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    y4l0 y4l0Var4 = k8l0Var3.f;
                                    k8l0.m(y4l0Var4);
                                    y4l0Var4.f.b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j4;
                                y4l0 y4l0Var5 = k8l0Var3.f;
                                k8l0.m(y4l0Var5);
                                y4l0Var5.f.b(e, "Package name not found");
                                j2 = 0;
                                this.h = j2;
                                zF = k8l0Var2.f();
                                k8l0.k(j6l0Var);
                                z2 = !j6l0Var.r;
                                g();
                                if (k8l0Var2.f()) {
                                    if (wok0Var2.q(null, v2l0.H0)) {
                                        k8l0.m(y4l0Var);
                                        y4l0Var.n.a(QQWMbKFOuTf.BXuHDZeAygy);
                                        z3 = zF;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zF;
                                            } else {
                                                z3 = zF;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            k8l0.m(y4l0Var);
                                                            y4l0Var.k.a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    k8l0.m(y4l0Var);
                                                    y4l0Var.j.a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zF;
                                    str3 = null;
                                }
                                k8l0.k(j6l0Var);
                                jA = j6l0Var.f.a();
                                long j6 = j2;
                                jMin = k8l0Var2.D;
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                h();
                                int i3 = this.m;
                                boolS = wok0Var2.s("google_analytics_adid_collection_enabled");
                                if (boolS != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                k8l0.k(j6l0Var);
                                j6l0Var.g();
                                long j7 = jMin;
                                boolean z8 = j6l0Var.k().getBoolean("deferred_analytics_collection", z);
                                if (wok0Var2.v("google_analytics_default_allow_ad_personalization_signals", true) != dbl0.GRANTED) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.k;
                                String strG = j6l0Var.n().g();
                                strZ = this.l;
                                if (strZ == null) {
                                    k8l0.k(yol0Var);
                                    strZ = yol0Var.Z();
                                    this.l = strZ;
                                }
                                String str7 = strZ;
                                if (j6l0Var.n().i(hbl0.ANALYTICS_STORAGE)) {
                                    g();
                                    if (this.p == 0) {
                                        z6 = z2;
                                    } else {
                                        k8l0Var2.k.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.p;
                                        z6 = z2;
                                        if (this.o != null) {
                                            l();
                                        }
                                    }
                                    if (this.o == null) {
                                        l();
                                    }
                                    str4 = this.o;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolS2 = wok0Var2.s("google_analytics_sgtm_upload_enabled");
                                if (boolS2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolS2.booleanValue();
                                }
                                k8l0.k(yol0Var);
                                k8l0Var = yol0Var.a;
                                String str8 = str4;
                                strM = m();
                                boolean z9 = zBooleanValue;
                                if (k8l0Var.a.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfoA = r7k0.a(k8l0Var.a).a(0, strM);
                                            if (applicationInfoA != null) {
                                                i2 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            y4l0 y4l0Var6 = k8l0Var.f;
                                            k8l0.m(y4l0Var6);
                                            y4l0Var6.l.b(strM, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                k8l0.k(j6l0Var);
                                int i4 = j6l0Var.n().b;
                                k8l0.k(j6l0Var);
                                j6l0Var.g();
                                String str9 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).b;
                                kql0.a();
                                t2l0Var = v2l0.Q0;
                                if (wok0Var2.q(null, t2l0Var)) {
                                    k8l0.k(yol0Var);
                                    iB = yol0.B();
                                } else {
                                    iB = 0;
                                }
                                kql0.a();
                                if (wok0Var2.q(null, t2l0Var)) {
                                    k8l0.k(yol0Var);
                                    jC = yol0Var.C();
                                }
                                String str10 = wok0Var2.c;
                                String strValueOf = String.valueOf(jbl0.h(wok0Var2.v("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j8 = k8l0Var2.D;
                                k8l0.j(k8l0Var2.u);
                                return new zzr(strM2, strN, str2, j, str6, 133005L, j6, str, z3, z6, str3, j7, i3, z7, z8, boolValueOf, this.i, list, strG, str7, str8, z9, j3, i4, str9, iB, jC, str10, strValueOf, j8, fl40.b(k8l0Var2.u.l()));
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j4;
                }
                j2 = 0;
                this.h = j2;
            }
            j2 = jY;
            this.h = j2;
        } else {
            str2 = str5;
            j = j4;
            z = false;
            j2 = j5;
        }
        zF = k8l0Var2.f();
        k8l0.k(j6l0Var);
        z2 = !j6l0Var.r;
        g();
        if (k8l0Var2.f()) {
            z3 = zF;
            str3 = null;
        } else {
            if (wok0Var2.q(null, v2l0.H0)) {
                k8l0.m(y4l0Var);
                y4l0Var.n.a(QQWMbKFOuTf.BXuHDZeAygy);
                z3 = zF;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zF;
                } else {
                    z3 = zF;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        k8l0.k(j6l0Var);
        jA = j6l0Var.f.a();
        long j9 = j2;
        jMin = k8l0Var2.D;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        h();
        int i5 = this.m;
        boolS = wok0Var2.s("google_analytics_adid_collection_enabled");
        if (boolS != null || boolS.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        k8l0.k(j6l0Var);
        j6l0Var.g();
        long j10 = jMin;
        boolean z10 = j6l0Var.k().getBoolean("deferred_analytics_collection", z);
        if (wok0Var2.v("google_analytics_default_allow_ad_personalization_signals", true) != dbl0.GRANTED) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.k;
        String strG2 = j6l0Var.n().g();
        strZ = this.l;
        if (strZ == null) {
            k8l0.k(yol0Var);
            strZ = yol0Var.Z();
            this.l = strZ;
        }
        String str11 = strZ;
        if (j6l0Var.n().i(hbl0.ANALYTICS_STORAGE)) {
            z6 = z2;
            str4 = null;
        } else {
            g();
            if (this.p == 0) {
                z6 = z2;
            } else {
                k8l0Var2.k.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.p;
                z6 = z2;
                if (this.o != null && jCurrentTimeMillis2 > 86400000 && this.q == null) {
                    l();
                }
            }
            if (this.o == null) {
                l();
            }
            str4 = this.o;
        }
        boolS2 = wok0Var2.s("google_analytics_sgtm_upload_enabled");
        if (boolS2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolS2.booleanValue();
        }
        k8l0.k(yol0Var);
        k8l0Var = yol0Var.a;
        String str12 = str4;
        strM = m();
        boolean z11 = zBooleanValue;
        if (k8l0Var.a.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfoA = r7k0.a(k8l0Var.a).a(0, strM);
            if (applicationInfoA != null) {
                i2 = applicationInfoA.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        k8l0.k(j6l0Var);
        int i6 = j6l0Var.n().b;
        k8l0.k(j6l0Var);
        j6l0Var.g();
        String str13 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).b;
        kql0.a();
        t2l0Var = v2l0.Q0;
        if (wok0Var2.q(null, t2l0Var)) {
            k8l0.k(yol0Var);
            iB = yol0.B();
        } else {
            iB = 0;
        }
        kql0.a();
        if (wok0Var2.q(null, t2l0Var)) {
            k8l0.k(yol0Var);
            jC = yol0Var.C();
        }
        String str14 = wok0Var2.c;
        String strValueOf2 = String.valueOf(jbl0.h(wok0Var2.v("google_analytics_default_allow_ad_personalization_signals", true)));
        long j11 = k8l0Var2.D;
        k8l0.j(k8l0Var2.u);
        return new zzr(strM2, strN, str2, j, str6, 133005L, j9, str, z3, z6, str3, j10, i5, z7, z10, boolValueOf2, this.i, list2, strG2, str11, str12, z11, j3, i6, str13, iB, jC, str14, strValueOf2, j11, fl40.b(k8l0Var2.u.l()));
    }
}
