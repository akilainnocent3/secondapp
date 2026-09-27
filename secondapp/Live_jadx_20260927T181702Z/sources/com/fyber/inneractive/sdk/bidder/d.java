package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.z0;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public String A;
    public Boolean B;
    public String C;
    public int D;
    public InneractiveUserConfig.Gender E;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public String J;
    public final boolean K;
    public Boolean L;
    public ArrayList M = new ArrayList();
    public ArrayList N = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.serverapi.c f44177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f44178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f44180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f44181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f44182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f44183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f44184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f44185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f44186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f44187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Long f44188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f44189m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44190n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q f44191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f44192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f44193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f44194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f44195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Boolean f44196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Boolean f44197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f44199w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f44200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f44201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f44202z;

    public d(com.fyber.inneractive.sdk.serverapi.c cVar) {
        String str;
        this.f44177a = cVar;
        if (TextUtils.isEmpty(this.f44178b)) {
            com.fyber.inneractive.sdk.util.r.f47891a.execute(new c(this));
        }
        StringBuilder sb2 = new StringBuilder("2.2.0-Android-8.4.1");
        if (!TextUtils.isEmpty(InneractiveAdManager.getDevPlatform())) {
            sb2.append('-');
            sb2.append(InneractiveAdManager.getDevPlatform());
        }
        this.f44179c = sb2.toString();
        this.f44180d = com.fyber.inneractive.sdk.util.o.f47884a.getPackageName();
        this.f44181e = com.fyber.inneractive.sdk.util.k.j();
        this.f44182f = com.fyber.inneractive.sdk.util.k.l();
        this.f44189m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f44190n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        com.fyber.inneractive.sdk.serverapi.a aVar = com.fyber.inneractive.sdk.serverapi.b.f47769a;
        try {
            Class.forName(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME);
            str = "unity3d";
        } catch (Throwable unused) {
            str = "native";
        }
        this.f44191o = !str.equals("native") ? !str.equals("unity3d") ? q.UNRECOGNIZED : q.UNITY3D : q.NATIVE;
        this.f44194r = (!com.fyber.inneractive.sdk.util.s.a() || IAConfigManager.O.f44307q) ? d0.SECURE : d0.UNSECURE;
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (TextUtils.isEmpty(iAConfigManager.f44304n)) {
            this.H = iAConfigManager.f44302l;
        } else {
            this.H = iAConfigManager.f44302l + lk.e.f104695m + iAConfigManager.f44304n;
        }
        this.K = InneractiveAdManager.isCurrentUserAChild();
        a();
        this.f44196t = com.fyber.inneractive.sdk.serverapi.b.g();
        this.B = com.fyber.inneractive.sdk.serverapi.b.i();
        this.f44199w = com.fyber.inneractive.sdk.serverapi.b.f();
        this.f44200x = com.fyber.inneractive.sdk.serverapi.b.l();
        this.f44201y = com.fyber.inneractive.sdk.serverapi.b.k();
    }

    public final void a() {
        this.f44177a.getClass();
        IAConfigManager iAConfigManager = IAConfigManager.O;
        this.f44183g = iAConfigManager.f44305o;
        if (!InneractiveAdManager.isCurrentUserAChild()) {
            this.f44177a.getClass();
            this.f44184h = com.fyber.inneractive.sdk.util.k.i();
            this.f44185i = this.f44177a.a();
            String str = this.f44177a.f47774b;
            this.f44186j = str == null ? "" : str.substring(0, Math.min(3, str.length()));
            String str2 = this.f44177a.f47774b;
            this.f44187k = str2 != null ? str2.substring(Math.min(3, str2.length())) : "";
            this.f44177a.getClass();
            z0 z0VarA = z0.a();
            IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", z0VarA, z0VarA.b());
            this.f44193q = z0VarA.b();
            int i10 = com.fyber.inneractive.sdk.config.k.f44406a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.device");
            if (TextUtils.isEmpty(property)) {
                com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f44496a.f44504b;
                property = vVar != null ? vVar.f44500a : null;
            }
            this.A = property;
            this.G = iAConfigManager.f44300j.getZipCode();
        }
        this.E = iAConfigManager.f44300j.getGender();
        this.D = iAConfigManager.f44300j.getAge();
        this.f44188l = com.fyber.inneractive.sdk.serverapi.b.e();
        this.f44177a.getClass();
        ArrayList arrayList = iAConfigManager.f44306p;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.f44192p = com.fyber.inneractive.sdk.util.o.a(arrayList);
        }
        this.C = com.fyber.inneractive.sdk.serverapi.b.b();
        this.f44198v = com.fyber.inneractive.sdk.serverapi.b.h().booleanValue();
        this.f44202z = com.fyber.inneractive.sdk.serverapi.b.c().intValue();
        this.F = iAConfigManager.f44301k;
        this.f44195s = com.fyber.inneractive.sdk.serverapi.b.m();
        if (TextUtils.isEmpty(iAConfigManager.f44304n)) {
            this.H = iAConfigManager.f44302l;
        } else {
            this.H = iAConfigManager.f44302l + lk.e.f104695m + iAConfigManager.f44304n;
        }
        this.f44197u = com.fyber.inneractive.sdk.serverapi.b.n();
        iAConfigManager.E.n();
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.E.f45080p;
        this.I = lVar != null ? lVar.f159153a.i() : null;
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.E.f45080p;
        this.J = lVar2 != null ? lVar2.f159153a.d() : null;
        this.f44177a.getClass();
        this.f44189m = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        this.f44177a.getClass();
        this.f44190n = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        this.L = com.fyber.inneractive.sdk.serverapi.b.j();
        com.fyber.inneractive.sdk.topics.b bVar = iAConfigManager.F;
        if (bVar != null && IAConfigManager.f()) {
            this.N = bVar.f47781f;
            this.M = bVar.f47780e;
        }
    }
}
