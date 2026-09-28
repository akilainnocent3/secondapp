package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrgu;", "Lxkj0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rgu extends xkj0 {
    public final uqm T;
    public final v340 U;
    public final qxd0<UiText> V;
    public final qxd0<List<String>> W;
    public final qxd0<Integer> X;
    public final qxd0<UiText> Y;
    public final qxd0<UiText> Z;
    public final qxd0<z900> a0;
    public final qxd0<UiText> b0;
    public final qxd0<UiText> c0;
    public final qxd0<UiText> d0;
    public final qxd0<UiText> e0;
    public final qxd0<gtp> f0;
    public final qxd0<wg8> g0;
    public final qxd0<il8> h0;
    public final qxd0<rrj0> i0;
    public final qxd0<uxs> j0;
    public final mpe0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgu(vu60 vu60Var, w9e w9eVar, psm psmVar, mmj0.a aVar, ha00 ha00Var, bmj0 bmj0Var, qgu.a aVar2, v800 v800Var, dhj0.a aVar3, uqm uqmVar) {
        super(vu60Var, uqmVar, psmVar, v800Var, aVar, w9eVar, ha00Var, bmj0Var, aVar3);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        bmj0Var.getClass();
        v800Var.getClass();
        uqmVar.getClass();
        this.T = uqmVar;
        char cA = this.a.a();
        m2g m2gVar = m2g.a;
        z900 z900Var = new z900(3, (StringUiText) null);
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new pfu(cA, null, null, m2gVar, null, null, z900Var, stringUiText, stringUiText, null, null, new gtp(0), new wg8(0), uxs.DISABLE, null, new il8(null)));
        this.U = e1i.b(wwd0VarA);
        qgu qguVar = new qgu(wwd0VarA);
        this.V = qguVar.b;
        this.W = qguVar.c;
        this.X = qguVar.d;
        this.Y = qguVar.e;
        this.Z = qguVar.f;
        this.a0 = qguVar.g;
        this.b0 = qguVar.h;
        this.c0 = qguVar.i;
        this.d0 = qguVar.j;
        this.e0 = qguVar.k;
        this.f0 = qguVar.l;
        this.g0 = qguVar.m;
        this.h0 = qguVar.n;
        this.i0 = qguVar.o;
        this.j0 = qguVar.p;
        this.k0 = hwr.b(new d5g(vu60Var, 2));
        O1().k = 2;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> A1() {
        return this.Z;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> B1() {
        return this.Y;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> C1() {
        return this.b0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> D1() {
        return this.c0;
    }

    @Override // defpackage.n000
    public final qxd0<wg8> G1() {
        return this.g0;
    }

    @Override // defpackage.n000
    public final n000.a H1() {
        c100 c100Var = c100.w;
        ga00 ga00Var = ga00.DEPOSIT;
        return new n000.a(c100Var, h400.PAWAPAY, "2022", "2022");
    }

    @Override // defpackage.n000
    public final qxd0<List<String>> I1() {
        return this.W;
    }

    @Override // defpackage.n000
    public final qxd0<gtp> J1() {
        return this.f0;
    }

    @Override // defpackage.n000
    public final qxd0<Integer> K1() {
        return this.X;
    }

    @Override // defpackage.n000
    public final Integer L1() {
        return Integer.valueOf(N1().c);
    }

    @Override // defpackage.n000
    public final qxd0<UiText> Q1() {
        return this.d0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> R1() {
        return this.e0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> S1() {
        return this.V;
    }

    @Override // defpackage.n000
    public final UiText b2(BankTradeData bankTradeData) {
        String str = ((String) this.k0.getValue()) + " (" + this.b.M() + M1() + ")";
        StringUiText stringUiText = vch0.a;
        return new StringUiText(str);
    }

    @Override // defpackage.xkj0
    public final qxd0<il8> i2() {
        return this.h0;
    }

    @Override // defpackage.xkj0
    public final qxd0<uxs> l2() {
        return this.j0;
    }

    @Override // defpackage.xkj0
    public final msj0 m2() {
        return new msj0.a(z1().a.b, N1(), this.T.getPhoneNumber());
    }

    @Override // defpackage.xkj0
    public final qxd0<rrj0> n2() {
        return this.i0;
    }

    @Override // defpackage.n000
    public final qxd0<z900> y1() {
        return this.a0;
    }
}
