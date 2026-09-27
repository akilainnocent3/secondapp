package com.fyber.inneractive.sdk.network;

import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f45370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f45371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f45372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f45373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f45374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile i1 f45375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f45376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f45377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f45379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f45382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f45383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f45384o;

    public t0(f0 f0Var, h hVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f45370a = false;
        this.f45375f = i1.INITIAL;
        this.f45378i = 0L;
        this.f45379j = 0L;
        this.f45380k = 0;
        this.f45381l = false;
        this.f45382m = false;
        this.f45383n = new Object();
        this.f45384o = false;
        this.f45371b = f0Var;
        this.f45372c = hVar;
        this.f45376g = UUID.randomUUID().toString();
        this.f45377h = rVar;
    }

    public abstract o0 a(l lVar, Map map, int i10);

    public void a(o0 o0Var, String str, String str2) {
    }

    public void b(long j10) {
        synchronized (this.f45383n) {
            try {
                if (this.f45382m) {
                    this.f45380k = (int) ((j10 - this.f45378i) + ((long) this.f45380k));
                    this.f45382m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c() {
        this.f45370a = true;
    }

    public void d() {
        boolean z10;
        synchronized (this.f45383n) {
            z10 = this.f45381l;
        }
        if (z10) {
            a(System.currentTimeMillis());
        } else if (t()) {
            b(System.currentTimeMillis());
        }
    }

    public void e() {
        try {
            l lVar = this.f45374e;
            if (lVar != null) {
                lVar.a();
            }
            this.f45372c.getClass();
        } catch (Exception unused) {
        }
    }

    public byte[] f() {
        return null;
    }

    public abstract int g();

    public String h() {
        return null;
    }

    public a i() {
        return null;
    }

    public int j() {
        return this.f45380k;
    }

    public com.fyber.inneractive.sdk.config.global.r k() {
        return this.f45377h;
    }

    public Map l() {
        return null;
    }

    public abstract m0 m();

    public String n() {
        return "application/json; charset=utf-8";
    }

    public abstract g1 o();

    public l1 p() {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        return new l1(iAConfigManager.f44311u.f44480b.a("connect_timeout", 5000, 1), iAConfigManager.f44311u.f44480b.a("read_timeout", 5000, 1));
    }

    public int q() {
        int i10;
        synchronized (this.f45383n) {
            i10 = this.f45380k;
        }
        return i10;
    }

    public abstract String r();

    public int s() {
        Integer numA;
        com.fyber.inneractive.sdk.config.global.r rVar = this.f45377h;
        if (rVar == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class)).a("watchdog_buffer_time_ms")) == null) {
            return 500;
        }
        return numA.intValue();
    }

    public final boolean t() {
        boolean z10;
        synchronized (this.f45383n) {
            z10 = this.f45382m;
        }
        return z10;
    }

    public abstract boolean u();

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public final boolean v() {
        boolean z10;
        if (this.f45384o) {
            com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) IAConfigManager.O.M.a(com.fyber.inneractive.sdk.config.global.features.k.class);
            Boolean boolC = kVar.c("should_add_request_watchdog");
            if (boolC != null ? boolC.booleanValue() : false) {
                z10 = true;
            } else {
                Boolean boolC2 = kVar.c("should_report_request_watchdog");
                if (boolC2 != null ? boolC2.booleanValue() : false) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public l a(String str) throws Exception {
        try {
            p0 p0Var = this.f45373d;
            if (p0Var != null) {
                p0Var.a("sdkInitNetworkRequest");
            }
            this.f45374e = this.f45372c.a(this, com.fyber.inneractive.sdk.util.o.h(), str);
            p0 p0Var2 = this.f45373d;
            if (p0Var2 != null) {
                p0Var2.a("sdkGotServerResponse");
            }
            return this.f45374e;
        } catch (b e10) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e10.getMessage());
            throw e10;
        } catch (q1 e11) {
            IAlog.a("failed read network response for url: %s msg: %s", r(), e11.getMessage());
            throw e11;
        } catch (Exception e12) {
            IAlog.a("failed start network request for url: %s msg: %s", r(), e12.getMessage());
            throw e12;
        }
    }

    public void c(long j10) {
        synchronized (this.f45383n) {
            try {
                if (!this.f45381l) {
                    this.f45381l = true;
                    this.f45379j = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d(long j10) {
        synchronized (this.f45383n) {
            try {
                if (!this.f45382m) {
                    this.f45382m = true;
                    this.f45378i = j10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t0(t0 t0Var) {
        this.f45370a = false;
        this.f45375f = i1.INITIAL;
        this.f45378i = 0L;
        this.f45379j = 0L;
        this.f45380k = 0;
        this.f45381l = false;
        this.f45382m = false;
        this.f45383n = new Object();
        this.f45384o = false;
        this.f45371b = t0Var.f45371b;
        this.f45372c = t0Var.f45372c;
        this.f45376g = UUID.randomUUID().toString();
        this.f45377h = t0Var.f45377h;
        this.f45380k = t0Var.f45380k;
        this.f45378i = t0Var.f45378i;
        this.f45379j = t0Var.f45379j;
    }

    public final void a(Object obj, Exception exc, boolean z10) {
        p0 p0Var;
        if (!z10) {
            i1 i1Var = i1.RESOLVED;
            this.f45375f = i1Var;
            if (i1Var == i1.QUEUED_FOR_RETRY && (p0Var = this.f45373d) != null) {
                p0Var.a("sdkRequestEndedButWillBeRetried");
            }
        }
        com.fyber.inneractive.sdk.util.r.f47892b.post(new s0(this, obj, exc, z10));
    }

    public final com.fyber.inneractive.sdk.response.e a(int i10, o oVar, com.fyber.inneractive.sdk.response.j jVar, com.fyber.inneractive.sdk.dv.j jVar2) throws n0 {
        try {
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(i10);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.f fVar = com.fyber.inneractive.sdk.factories.d.f44609a;
            com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) fVar.f44610a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar != null ? eVar.b() : null;
            if (bVarB == null) {
                IAlog.f("Received ad type %s does not have an appropriate parser!", Integer.valueOf(i10));
                if (fVar.f44610a.size() == 0) {
                    Log.e("Inneractive_error", "Critical error raised while fetching an ad - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
                }
                throw new n0("Could not find parser for ad type " + i10);
            }
            IAlog.a("Received ad type %s - Got parser! %s", Integer.valueOf(i10), bVarB);
            if (jVar != null) {
                bVarB.f47708c = jVar;
            }
            bVarB.f47706a = bVarB.a();
            if (oVar != null) {
                bVarB.f47708c = new com.fyber.inneractive.sdk.response.k(oVar);
            }
            com.fyber.inneractive.sdk.response.e eVarA = bVarB.a(null);
            eVarA.K = j();
            if (jVar2 != null) {
                eVarA.f47737u = jVar2;
            }
            p0 p0Var = this.f45373d;
            if (p0Var != null) {
                p0Var.a("sdkParsedResponse");
            }
            return eVarA;
        } catch (Exception e10) {
            IAlog.a("failed parse ad network request url: %s msg: %s", r(), e10.getMessage());
            throw new n0(e10);
        }
    }

    public static int a(Map map) {
        List list = map != null ? (List) map.get("Content-Length") : null;
        if (list != null) {
            return com.fyber.inneractive.sdk.util.v.a((String) list.get(0), -1);
        }
        return -1;
    }

    public void a(long j10) {
        synchronized (this.f45383n) {
            try {
                if (this.f45381l) {
                    this.f45380k = (int) ((j10 - this.f45379j) + ((long) this.f45380k));
                    this.f45381l = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
