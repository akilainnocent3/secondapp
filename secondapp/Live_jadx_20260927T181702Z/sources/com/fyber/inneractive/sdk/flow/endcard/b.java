package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44642a = IAlog.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f44643b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f44644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f44645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44647f;

    public b(int i10, x0 x0Var) {
        this.f44644c = x0Var;
        this.f44647f = i10;
    }

    public abstract void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return f().b();
    }

    public abstract n c();

    public com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.u uVar = this.f44644c.f45043g;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.f47341a = l();
        cVar.f47346f = i();
        boolean zB = b(uVar);
        Integer numValueOf = Integer.valueOf(a(uVar));
        if (zB) {
            cVar.f47344d = numValueOf;
        }
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        e();
        n nVar = this.f44645d;
        if (nVar != null) {
            nVar.destroy();
            this.f44645d = null;
        }
    }

    public void e() {
        a();
    }

    public final n f() {
        if (this.f44645d == null) {
            this.f44645d = c();
        }
        return this.f44645d;
    }

    public abstract com.fyber.inneractive.sdk.util.g g();

    public abstract l h();

    public abstract com.fyber.inneractive.sdk.model.vast.i i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public void m() {
        IAlog.a("%s loading success for %s", i(), this.f44642a);
    }

    public static boolean b(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar != null) {
            Boolean boolC = uVar.c("shouldEnableEndCardAutoClick");
            if (boolC != null ? boolC.booleanValue() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        n nVar = this.f44645d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f44642a);
    }

    public static int a(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar != null) {
            Integer numA = uVar.a("autoClickDelay");
            int iIntValue = numA != null ? numA.intValue() : 3;
            if (iIntValue >= 0 && iIntValue <= 10) {
                return iIntValue;
            }
        }
        return 3;
    }
}
