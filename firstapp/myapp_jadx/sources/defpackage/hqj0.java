package defpackage;

import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhqj0;", "Lo82;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hqj0 extends o82 {
    public static final /* synthetic */ int E0 = 0;
    public final v340 A0;
    public final v340 B0;
    public final or60 C0;
    public final i8f0 D0;
    public final sr10 h0;
    public final lyz i0;
    public final psm j0;
    public final y300.d k0;
    public final wwd0 l0;
    public final wwd0 m0;
    public final wwd0 n0;
    public final wwd0 o0;
    public final wwd0 p0;
    public final wwd0 q0;
    public final wwd0 r0;
    public final wwd0 s0;
    public final wwd0 t0;
    public final wwd0 u0;
    public final wwd0 v0;
    public final v340 w0;
    public final ku90<rpj0> x0;
    public final ku90 y0;
    public final List<lyh<lk50<Object>>> z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqj0(uyx uyxVar, juh0 juh0Var, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, psm psmVar, q900 q900Var, mgb0 mgb0Var, shj0 shj0Var) {
        super(uyxVar, juh0Var, uy0Var, sr10Var, d100Var, lyzVar, wlVar, psmVar, mgb0Var, shj0Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        this.h0 = sr10Var;
        this.i0 = lyzVar;
        this.j0 = psmVar;
        this.k0 = new y300.d(psmVar.getCountryCode());
        wwd0 wwd0VarA = zjj0.a(null, false);
        this.l0 = wwd0VarA;
        this.m0 = wwd0VarA;
        wwd0 wwd0VarA2 = zjj0.a(null, false);
        this.n0 = wwd0VarA2;
        this.o0 = wwd0VarA2;
        this.p0 = xwd0.a(-1);
        wwd0 wwd0VarA3 = xwd0.a("");
        this.q0 = wwd0VarA3;
        this.r0 = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.s0 = wwd0VarA4;
        this.t0 = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(null);
        this.u0 = wwd0VarA5;
        this.v0 = wwd0VarA5;
        g1i g1iVar = new g1i(r1i.a(wwd0VarA3, wwd0VarA4, H1(), new fqj0(4, null)), new gqj0(this, null));
        et7 et7VarD = o8i0.d(this);
        Boolean bool = Boolean.FALSE;
        kwd0 kwd0Var = q490.a.a;
        this.w0 = e1i.e(g1iVar, et7VarD, kwd0Var, bool);
        ku90<rpj0> ku90Var = new ku90<>();
        this.x0 = ku90Var;
        this.y0 = ku90Var;
        v340 v340Var = this.P;
        pu0.b bVar = pu0.b.a;
        this.z0 = b.k(v340Var, sr10Var.j0(bVar), sr10Var.l0(bVar), sr10Var.u(bVar));
        this.A0 = e1i.e(new g1i(bm50.f(new g1i(sr10Var.l0(bVar), new dqj0(this, null))), new eqj0(this, null)), o8i0.d(this), kwd0Var, TransferStatus.INSTANCE.getDefault());
        this.B0 = e1i.e(bm50.f(sr10Var.u(bVar)), o8i0.d(this), kwd0Var, m2g.a);
        this.C0 = new or60(new vpj0(this, null));
        this.D0 = new i8f0(this, 1);
    }

    @Override // defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.z0;
    }

    @Override // defpackage.k72
    public final y200 B1() {
        return this.k0;
    }

    @Override // defpackage.k72
    public final List<c9p> E1() {
        return b.k(ej5.c(o8i0.d(this), null, null, new aqj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new zpj0(this, null), 3));
    }

    @Override // defpackage.o82
    public final uwd0 G1() {
        return this.p0;
    }

    @Override // defpackage.o82
    public final jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new cqj0(2, null), 3);
    }
}
