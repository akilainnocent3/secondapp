package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p0 extends b0 implements com.fyber.inneractive.sdk.interfaces.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.e f44851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f44852l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v1 f44853m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f44854n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v1 f44855o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f44858r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public m0 f44862v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44856p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f44857q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f44859s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f44860t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.a f44861u = new com.fyber.inneractive.sdk.util.a();

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int A() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f44851k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f44851k.getLayout().getHeight();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final int B() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f44851k;
        if (eVar == null || eVar.getLayout() == null) {
            return 1;
        }
        return this.f44851k.getLayout().getWidth();
    }

    public abstract boolean K();

    public final void L() {
        if (this.f44852l == null) {
            long jO = O();
            this.f44858r = jO;
            this.f44852l = new l0(this, jO);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.f44858r));
            x xVar = this.f44618b;
            boolean zB = xVar != null ? b(xVar) : false;
            if (zB && !K()) {
                if (zB) {
                    com.fyber.inneractive.sdk.interfaces.e eVar = this.f44851k;
                    if (eVar != null) {
                        eVar.showCloseCountdown();
                    }
                    m0 m0Var = new m0(this, this.f44858r + 100);
                    this.f44862v = m0Var;
                    m0Var.start();
                    return;
                }
                return;
            }
            if (this.f44857q) {
                return;
            }
            this.f44857q = true;
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, this.f44858r);
            this.f44853m = v1Var;
            v1Var.f47916e = new n0(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f47914c = t1Var;
            v1Var.f47915d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    public abstract int M();

    public abstract int N();

    public abstract long O();

    public abstract boolean P();

    public abstract long a(long j10);

    public void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        if (this.f44617a == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        }
        if (eVar != null) {
            this.f44851k = eVar;
        } else {
            IAlog.f("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void b(boolean z10) {
    }

    public abstract boolean b(x xVar);

    public final void c(boolean z10) {
        com.fyber.inneractive.sdk.network.w wVar;
        if (this.f44618b == null) {
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
            wVar.f45414c = uVar;
            wVar.f45412a = null;
            wVar.f45415d = null;
        } else {
            com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.MRAID_CUSTOM_CLOSE_DETECTED;
            x xVar = this.f44618b;
            InneractiveAdRequest inneractiveAdRequest = xVar.f45031a;
            com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
            JSONArray jSONArrayB = this.f44618b.f45033c.b();
            wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f45414c = uVar2;
            wVar.f45412a = inneractiveAdRequest;
            wVar.f45415d = jSONArrayB;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean boolValueOf = Boolean.valueOf(z10);
        try {
            jSONObject.put("fyber_close_enabled", boolValueOf);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "fyber_close_enabled", boolValueOf);
        }
        wVar.f45417f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void d(boolean z10) {
        com.fyber.inneractive.sdk.network.w wVar;
        this.f44856p = true;
        if (z10) {
            if (this.f44618b == null) {
                com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                wVar = new com.fyber.inneractive.sdk.network.w((com.fyber.inneractive.sdk.response.e) null);
                wVar.f45414c = uVar;
                wVar.f45412a = null;
                wVar.f45415d = null;
            } else {
                com.fyber.inneractive.sdk.network.u uVar2 = com.fyber.inneractive.sdk.network.u.FAIL_SAFE_ACTIVATED;
                x xVar = this.f44618b;
                InneractiveAdRequest inneractiveAdRequest = xVar.f45031a;
                com.fyber.inneractive.sdk.response.e eVarB = xVar.b();
                JSONArray jSONArrayB = this.f44618b.f45033c.b();
                wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
                wVar.f45414c = uVar2;
                wVar.f45412a = inneractiveAdRequest;
                wVar.f45415d = jSONArrayB;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean boolValueOf = Boolean.valueOf(P());
            try {
                jSONObject.put("is_endcard", boolValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "is_endcard", boolValueOf);
            }
            wVar.f45417f.put(jSONObject);
            wVar.a((String) null);
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f44851k;
        if (eVar != null) {
            eVar.showCloseButton(z10, N(), M());
            if (z10) {
                return;
            }
            com.fyber.inneractive.sdk.util.a aVar = this.f44861u;
            aVar.f47842d = 0L;
            aVar.f47843e = 0L;
            aVar.f47844f = 0L;
            aVar.f47840b = false;
            aVar.a(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        Runnable runnable = this.f44852l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f47892b.removeCallbacks(runnable);
            this.f44852l = null;
        }
        Runnable runnable2 = this.f44854n;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.r.f47892b.removeCallbacks(runnable2);
            this.f44854n = null;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f44851k;
        if (eVar != null) {
            eVar.destroy();
        }
        this.f44851k = null;
        m0 m0Var = this.f44862v;
        if (m0Var != null) {
            m0Var.cancel();
            this.f44862v = null;
        }
        v1 v1Var = this.f44855o;
        if (v1Var != null) {
            v1Var.f47916e = null;
            this.f44855o = null;
        }
        v1 v1Var2 = this.f44853m;
        if (v1Var2 != null) {
            v1Var2.f47916e = null;
            this.f44853m = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        this.f44861u.f47839a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void n() {
        v1 v1Var = this.f44853m;
        if (v1Var != null) {
            v1Var.f47915d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        v1 v1Var2 = this.f44855o;
        if (v1Var2 != null) {
            v1Var2.f47915d = false;
            v1Var2.a(SystemClock.uptimeMillis());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void s() {
        v1 v1Var = this.f44853m;
        if (v1Var != null) {
            v1Var.f47915d = true;
            t1 t1Var = v1Var.f47914c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        v1 v1Var2 = this.f44855o;
        if (v1Var2 != null) {
            v1Var2.f47915d = true;
            t1 t1Var2 = v1Var2.f47914c;
            if (t1Var2 != null) {
                t1Var2.removeMessages(1932593528);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f44851k;
        if (eVar != null) {
            return eVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public boolean b(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : registerObserver: %s doesnt support Store Promo", getClass().getName());
        return false;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public void a(com.fyber.inneractive.sdk.flow.storepromo.observer.a aVar) {
        IAlog.f("InneractiveFullscreenAdRendererImpl : unregisterObserver: %s doesnt support Store Promo", getClass().getName());
    }
}
