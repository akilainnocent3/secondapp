package defpackage;

import com.sporty.android.core.model.instantwin.BuildAndGoTabConfig;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class se5 implements je5 {
    public final eko a;
    public final lq1 b;
    public final ku90<Unit> c = new ku90<>();
    public final ku90<Unit> d = new ku90<>();
    public final wwd0 e;
    public final wwd0 f;
    public final wwd0 i;

    public se5(eko ekoVar, lq1 lq1Var) {
        this.a = ekoVar;
        this.b = lq1Var;
        lk50.b bVar = lk50.b.a;
        this.e = xwd0.a(bVar);
        this.f = xwd0.a(bVar);
        this.i = xwd0.a(bVar);
    }

    @Override // defpackage.je5
    public final void c0() {
        this.c.a(Unit.a);
    }

    @Override // defpackage.je5
    public final void o0(et7 et7Var) {
        e1i.e(new g1i(new wl50(this.b.a(pu0.b.a), new ke5(0)), new me5(this, null)), et7Var, q490.a.a, lk50.b.a);
        ne5 ne5Var = new ne5(2, null);
        ku90<Unit> ku90Var = this.c;
        kzh.d(new g1i(new xzh(ku90Var, ne5Var), new oe5(this, null)), et7Var);
        kzh.d(new g1i(r0i.f(new n1i(this.e, new xzh(r0i.e(ku90Var, this.d), new pe5(2, null)), new qe5(3, null)), new le5(this, null)), new re5(this, null)), et7Var);
    }

    @Override // defpackage.je5
    public final uwd0<lk50<Sports>> q() {
        return this.e;
    }

    @Override // defpackage.je5
    public final uwd0<lk50<BuildAndGoTabConfig>> s1() {
        return this.i;
    }

    @Override // defpackage.je5
    public final void u0() {
        this.d.a(Unit.a);
    }

    @Override // defpackage.je5
    public final uwd0<lk50<Round>> w() {
        return this.f;
    }
}
