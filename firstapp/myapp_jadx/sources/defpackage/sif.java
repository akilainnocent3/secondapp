package defpackage;

import com.sportybet.model.KYCReminderState;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsif;", "Lakj0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sif extends akj0 {
    public static final /* synthetic */ int k1 = 0;
    public final xqj0 P0;
    public final uy0 Q0;
    public final lyz R0;
    public final psm S0;
    public final uqm T0;
    public final mgb0 U0;
    public final u1l V0;
    public final ha00 W0;
    public final cup X0;
    public final wwd0 Y0;
    public final wwd0 Z0;
    public final wwd0 a1;
    public final wwd0 b1;
    public final wwd0 c1;
    public final v340 d1;
    public final wwd0 e1;
    public final wwd0 f1;
    public final mpe0 g1;
    public int h1;
    public h400 i1;
    public final l9k0 j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sif(uyx uyxVar, juh0 juh0Var, pi80 pi80Var, vh7 vh7Var, xqj0 xqj0Var, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, psm psmVar, uqm uqmVar, mgb0 mgb0Var, u1l u1lVar, ha00 ha00Var, cup cupVar, cj7 cj7Var, shj0 shj0Var) {
        super(uyxVar, juh0Var, pi80Var, vh7Var, xqj0Var, d100Var, wlVar, uy0Var, sr10Var, lyzVar, psmVar, mgb0Var, uqmVar, cj7Var, shj0Var, null);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        mgb0Var.getClass();
        u1lVar.getClass();
        this.P0 = xqj0Var;
        this.Q0 = uy0Var;
        this.R0 = lyzVar;
        this.S0 = psmVar;
        this.T0 = uqmVar;
        this.U0 = mgb0Var;
        this.V0 = u1lVar;
        this.W0 = ha00Var;
        this.X0 = cupVar;
        wwd0 wwd0VarA = xwd0.a(Boolean.TRUE);
        this.Y0 = wwd0VarA;
        this.Z0 = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(new jo50());
        this.a1 = wwd0VarA2;
        this.b1 = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(KYCReminderState.Loading.INSTANCE);
        this.c1 = wwd0VarA3;
        this.d1 = e1i.b(wwd0VarA3);
        wwd0 wwd0VarA4 = xwd0.a(null);
        this.e1 = wwd0VarA4;
        this.f1 = wwd0VarA4;
        int i = 0;
        this.g1 = hwr.b(new fif(this, i));
        this.i1 = h400.OZOW;
        this.j1 = new l9k0(psmVar.f(), new gif(i), false);
    }

    @Override // defpackage.k72
    public final void D1() {
        super.D1();
        kzh.d(new g1i(O1(), new nif(this, null)), o8i0.d(this));
    }

    @Override // defpackage.akj0, defpackage.k72
    public final List<c9p> E1() {
        return b.k(ej5.c(o8i0.d(this), null, null, new ekj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new fkj0(this, null), 3), ej5.c(o8i0.d(this), null, null, new ikj0(this, null), 3), R1(), ej5.c(o8i0.d(this), null, null, new mif(this, null), 3), kzh.d(new g1i(bm50.b(this.R0.D0(), vch0.b), new kif(this, null)), o8i0.d(this)), ej5.c(o8i0.d(this), null, null, new oif(this, null), 3));
    }

    @Override // defpackage.akj0, defpackage.o82
    public final jvd0 J1() {
        return ej5.c(o8i0.d(this), null, null, new rif(this, null), 3);
    }

    @Override // defpackage.o82
    public final Object K1(BigDecimal bigDecimal, int i, y300 y300Var, o82.c cVar) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return xhj0.d.a;
        }
        if (i == 0) {
            return xhj0.i.a;
        }
        String string = bigDecimal.toString();
        string.getClass();
        g0l g0lVarF = this.j1.f(string);
        if (Intrinsics.g(g0lVarF, g0l.a.a)) {
            return xhj0.d.a;
        }
        if (g0lVarF instanceof g0l.b) {
            g0l.b bVar = (g0l.b) g0lVarF;
            return new xhj0.b(bVar.a, bVar.b, new jif(0));
        }
        if (Intrinsics.g(g0lVarF, g0l.c.a)) {
            return xhj0.i.a;
        }
        uhc.a();
        return null;
    }

    @Override // defpackage.akj0
    public final void L1() {
        super.L1();
        Boolean bool = Boolean.TRUE;
        wwd0 wwd0Var = this.Y0;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        jo50 jo50Var = new jo50();
        wwd0 wwd0Var2 = this.a1;
        wwd0Var2.getClass();
        wwd0Var2.k(null, jo50Var);
    }

    @Override // defpackage.akj0
    public final int M1() {
        if (this.v0.getValue() != null) {
            return 1;
        }
        return this.h1;
    }

    @Override // defpackage.akj0
    public final String N1() {
        return String.valueOf(this.h1);
    }

    @Override // defpackage.akj0
    public final wl50 S1(lyh lyhVar) {
        lyhVar.getClass();
        return new wl50(new wl50(lyhVar, new hif(0)), new iif());
    }
}
