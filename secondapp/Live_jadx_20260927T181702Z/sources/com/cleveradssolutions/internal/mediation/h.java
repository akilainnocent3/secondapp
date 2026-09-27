package com.cleveradssolutions.internal.mediation;

import android.util.Log;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.cleveradssolutions.internal.content.s;
import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f43648j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f43654p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.cleveradssolutions.mediation.core.l f43660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f43645g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ArrayList f43646h = new ArrayList(72);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h[] f43647i = new h[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f43649k = new h(0, 2, "GoogleAds", wc.d.f142717b, "24.9.0.0");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f43650l = new h(5, 13, wc.d.f142721f, null, "13.5.1.1");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f43651m = new h(13, 17, "CrossPromo", wc.d.f142724i, "4.0.2");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f43652n = new h(14, 18, "IronSource", null, "9.2.0.0");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final h f43653o = new h(31, 23, wc.d.B, null, null);

    static {
        int i10 = 33;
        int i11 = 0;
        f43648j = new h(i10, i11, "Unknown");
        f43654p = new h(30, i10, wc.d.f142733r);
        while (true) {
            ArrayList arrayList = f43646h;
            if (arrayList.size() > 72) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        h hVar = f43648j;
        hVar.f43660f = k.f43674c;
        h hVar2 = f43653o;
        hVar2.f43660f = new com.cleveradssolutions.internal.lastpagead.b();
        h[] hVarArr = {hVar, f43649k, f43654p, f43650l, f43651m, f43652n, hVar2, new h(1, 9, "LiftoffMonetize", "Vungle", "7.6.2.0"), new h(2, 11, wc.d.f142719d, null, "10.1.5.0"), new h(6, 16, wc.d.C, null, "9.4.0.2"), new h(3, 7, wc.d.f142730o, null, "9.10.2.0"), new h(4, 8, Q6.H1, "Unity", "4.16.5.0"), new h(7, 45, wc.d.f142736u, null, "5.2.5.0"), new h(8, 49, wc.d.f142737v, null, "4.5.2"), new h(9, 10, "AudienceNetwork", wc.d.f142722g, "6.21.0.0"), new h(10, 4, wc.d.f142723h, null, "11.1.0.0"), new h(11, 32, wc.d.f142731p, null, "8.4.1.1"), new h(15, 19, "YangoAds", wc.d.f142726k, "7.18.1.0"), new h(16, 47, wc.d.f142734s, null, "6.4.3.0"), new h(18, 6, wc.d.f142735t, null, "22.7.2.1"), new h(19, 38, wc.d.f142732q, null, "5.6.2.0"), new h(20, 50, wc.d.f142740y, null, "6.2.0.0"), new h(21, 44, wc.d.f142738w, null, "1.7.7.0"), new h(23, 28, wc.d.f142727l, null, "17.0.51.0"), new h(24, 30, wc.d.f142728m, null, BuildConfig.VERSION_NAME), new h(25, 52, wc.d.A, null, "1.3.1.0"), new h(26, 57, wc.d.f142729n, null, "10.1.5.0"), new h(27, 62, wc.d.f142739x, null, "1.8.6.3"), new h(29, 65, wc.d.f142741z, null, "3.7.1.0"), new h(28, 70, "PubMatic", null, "4.10.0.0"), new h(22, 71, "Monetrix", null, "1.2.0.0")};
        while (i11 < 31) {
            h hVar3 = hVarArr[i11];
            int i12 = hVar3.f43656b;
            if (i12 >= 0) {
                f43646h.set(i12, hVar3);
            }
            int i13 = hVar3.f43655a;
            if (i13 < 32) {
                f43647i[i13] = hVar3;
            }
            i11++;
        }
    }

    public /* synthetic */ h(int i10, int i11, String str) {
        this(i10, i11, str, null, null);
    }

    public final s a() {
        return d(true).getConfig$com_cleveradssolutions_sdk_android_release();
    }

    public final String b() {
        String strE = e();
        char cCharAt = strE.charAt(0);
        if (Character.isLowerCase(cCharAt)) {
            StringBuilder sb2 = new StringBuilder();
            Locale ENGLISH = Locale.ENGLISH;
            m0.o(ENGLISH, "ENGLISH");
            sb2.append(cv.e.v(cCharAt, ENGLISH));
            String strSubstring = strE.substring(1);
            m0.o(strSubstring, "substring(...)");
            sb2.append(strSubstring);
            strE = sb2.toString();
        }
        return "com.cleveradssolutions.adapters." + strE + "Adapter";
    }

    public final boolean c() {
        com.cleveradssolutions.mediation.core.l lVar = this.f43660f;
        if (lVar != null) {
            return lVar != k.f43674c;
        }
        return (this.f43655a == 30 || com.cleveradssolutions.internal.a.b(b()) == null) ? false : true;
    }

    public final com.cleveradssolutions.mediation.core.l d(boolean z10) {
        k kVar;
        com.cleveradssolutions.mediation.core.l lVar;
        com.cleveradssolutions.mediation.core.l lVar2 = this.f43660f;
        if (lVar2 != null) {
            return lVar2;
        }
        if (this.f43655a == 30) {
            return f43649k.d(z10);
        }
        synchronized (f43645g) {
            try {
                com.cleveradssolutions.mediation.core.l lVar3 = this.f43660f;
                if (lVar3 != null) {
                    return lVar3;
                }
                try {
                    Object objNewInstance = Class.forName(b()).getDeclaredConstructor(null).newInstance(null);
                    m0.n(objNewInstance, "null cannot be cast to non-null type com.cleveradssolutions.mediation.core.MediationAdapterBase");
                    lVar = (com.cleveradssolutions.mediation.core.l) objNewInstance;
                    lVar.getConfig$com_cleveradssolutions_sdk_android_release().l1(this.f43655a, lVar);
                } catch (ClassNotFoundException e10) {
                    if (z10) {
                        com.cleveradssolutions.internal.services.q qVar = com.cleveradssolutions.internal.services.q.f43760b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(qVar.getLogTag());
                        sb2.append(": ");
                        sb2.append(this.f43657c + " Adapter not found: " + e10.getLocalizedMessage());
                        sb2.append(' ');
                        sb2.append(Log.getStackTraceString(null));
                        Log.println(5, "CAS.AI", sb2.toString());
                    }
                    kVar = k.f43674c;
                    lVar = kVar;
                } catch (NoClassDefFoundError e11) {
                    if (z10) {
                        com.cleveradssolutions.internal.services.q qVar2 = com.cleveradssolutions.internal.services.q.f43760b;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(qVar2.getLogTag());
                        sb3.append(": ");
                        sb3.append(this.f43657c + " SDK not found: " + e11.getLocalizedMessage());
                        sb3.append(' ');
                        sb3.append(Log.getStackTraceString(null));
                        Log.println(5, "CAS.AI", sb3.toString());
                    }
                    kVar = k.f43674c;
                    lVar = kVar;
                } catch (Throwable th2) {
                    com.cleveradssolutions.internal.services.q qVar3 = com.cleveradssolutions.internal.services.q.f43760b;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(qVar3.getLogTag());
                    sb4.append(": ");
                    sb4.append(this.f43657c + " Adapter exception");
                    sb4.append(' ');
                    sb4.append(Log.getStackTraceString(th2));
                    Log.println(5, "CAS.AI", sb4.toString());
                    kVar = k.f43674c;
                    lVar = kVar;
                }
                this.f43660f = lVar;
                return lVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String e() {
        String str = this.f43658d;
        return str == null ? this.f43657c : str;
    }

    public final void f(com.cleveradssolutions.internal.main.c remoteConfig, String casId, boolean z10) {
        s sVarK1;
        m0.p(remoteConfig, "remoteConfig");
        m0.p(casId, "casId");
        com.cleveradssolutions.mediation.core.l lVarD = d(false);
        if (lVarD == k.f43674c) {
            return;
        }
        if (!z10) {
            s config$com_cleveradssolutions_sdk_android_release = lVarD.getConfig$com_cleveradssolutions_sdk_android_release();
            if (config$com_cleveradssolutions_sdk_android_release.r0("early_init", config$com_cleveradssolutions_sdk_android_release.f43661h == 3 ? 1 : 0) != 1) {
                return;
            }
        }
        lVarD.getConfig$com_cleveradssolutions_sdk_android_release().b1(remoteConfig, null);
        if (lVarD.getConfig$com_cleveradssolutions_sdk_android_release().f43349e == null || (sVarK1 = lVarD.getConfig$com_cleveradssolutions_sdk_android_release().k1(casId, null)) == null) {
            return;
        }
        sVarK1.initialize();
    }

    public h(int i10, int i11, String str, String str2, String str3) {
        this.f43655a = i10;
        this.f43656b = i11;
        this.f43657c = str;
        this.f43658d = str2;
        this.f43659e = str3;
    }
}
