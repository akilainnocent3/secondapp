package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhjz;", "Lwrd;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hjz extends wrd {
    public final vu60 Y;
    public final uqm Z;
    public final xsm a0;
    public final wwd0 b0;
    public final v340 c0;
    public final ku90<diz> d0;
    public final ku90 e0;
    public final qxd0<UiText> f0;
    public final qxd0<List<String>> g0;
    public final qxd0<Integer> h0;
    public final qxd0<UiText> i0;
    public final qxd0<UiText> j0;
    public final qxd0<z900> k0;
    public final qxd0<UiText> l0;
    public final qxd0<UiText> m0;
    public final qxd0<uxs> n0;
    public final qxd0<gtp> o0;
    public final qxd0<dh30> p0;
    public final qxd0<String> q0;
    public final qxd0<wg8> r0;
    public final qxd0<vc8> s0;
    public final mpe0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjz(vu60 vu60Var, uqm uqmVar, w9e w9eVar, mod modVar, iod.a aVar, psm psmVar, v800 v800Var, l0e.a aVar2, i9e i9eVar, x0l x0lVar, hg30.a aVar3, fjz.a aVar4, u290 u290Var) {
        super(vu60Var, uqmVar, psmVar, v800Var, aVar2, w9eVar, aVar, modVar, i9eVar, x0lVar, aVar3, u290Var);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        uqmVar.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        v800Var.getClass();
        u290Var.getClass();
        this.Y = vu60Var;
        this.Z = uqmVar;
        this.a0 = v4cVar;
        char cA = this.a.a();
        m2g m2gVar = m2g.a;
        z900 z900Var = new z900(3, (StringUiText) null);
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new eiz(cA, null, null, m2gVar, null, null, z900Var, stringUiText, stringUiText, new gtp(0), new wg8(0), dh30.b.a, uxs.DISABLE, "", new vc8(0), null, false, false));
        this.b0 = wwd0VarA;
        this.c0 = e1i.b(wwd0VarA);
        ku90<diz> ku90Var = new ku90<>();
        this.d0 = ku90Var;
        this.e0 = ku90Var;
        fjz fjzVar = new fjz(wwd0VarA);
        this.f0 = fjzVar.b;
        this.g0 = fjzVar.c;
        this.h0 = fjzVar.d;
        this.i0 = fjzVar.e;
        this.j0 = fjzVar.f;
        this.k0 = fjzVar.g;
        this.l0 = fjzVar.h;
        this.m0 = fjzVar.i;
        this.n0 = fjzVar.j;
        this.o0 = fjzVar.k;
        this.p0 = fjzVar.l;
        this.q0 = fjzVar.m;
        this.r0 = fjzVar.n;
        this.s0 = fjzVar.o;
        this.t0 = hwr.b(new uy2(this, 1));
    }

    @Override // defpackage.n000
    public final qxd0<UiText> A1() {
        return this.j0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> B1() {
        return this.i0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> C1() {
        return this.l0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> D1() {
        return this.m0;
    }

    @Override // defpackage.n000
    public final qxd0<wg8> G1() {
        return this.r0;
    }

    @Override // defpackage.n000
    public final n000.a H1() {
        return (n000.a) this.t0.getValue();
    }

    @Override // defpackage.n000
    public final qxd0<List<String>> I1() {
        return this.g0;
    }

    @Override // defpackage.n000
    public final qxd0<gtp> J1() {
        return this.o0;
    }

    @Override // defpackage.n000
    public final qxd0<Integer> K1() {
        return this.h0;
    }

    @Override // defpackage.n000
    public final Integer L1() {
        switch (N1().ordinal()) {
            case 18:
            case 19:
            case 20:
                return Integer.valueOf(N1().c);
            default:
                return null;
        }
    }

    @Override // defpackage.n000
    public final qxd0<UiText> S1() {
        return this.f0;
    }

    @Override // defpackage.wrd, defpackage.n000
    public final void U1() {
        wwd0 wwd0Var;
        Object value;
        eiz eizVar;
        mhz mhzVar;
        super.U1();
        do {
            wwd0Var = this.b0;
            value = wwd0Var.getValue();
            eizVar = (eiz) value;
            switch (N1().ordinal()) {
                case 18:
                    mhzVar = mhz.c;
                    break;
                case 19:
                    mhzVar = mhz.d;
                    break;
                case 20:
                    mhzVar = mhz.b;
                    break;
                default:
                    mhzVar = null;
                    break;
            }
        } while (!wwd0Var.g(value, eiz.a(eizVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, mhzVar, false, false, 229375)));
    }

    @Override // defpackage.n000
    public final UiText b2(BankTradeData bankTradeData) {
        String str;
        switch (N1().ordinal()) {
            case 18:
                str = "Ozow EFT";
                break;
            case 19:
                str = "Capitec Pay";
                break;
            case 20:
                str = "Ozow Payshap";
                break;
            default:
                str = "";
                break;
        }
        StringUiText stringUiText = vch0.a;
        return new StringUiText(str);
    }

    @Override // defpackage.wrd
    public final qxd0<vc8> i2() {
        return this.s0;
    }

    @Override // defpackage.wrd
    public final qxd0<String> j2() {
        return this.q0;
    }

    @Override // defpackage.wrd
    public final qxd0<uxs> k2() {
        return this.n0;
    }

    @Override // defpackage.wrd
    public final qxd0<dh30> n2() {
        return this.p0;
    }

    @Override // defpackage.wrd
    public final void o2(x7e.b.d dVar) {
        ej5.c(o8i0.d(this), null, null, new gjz(this, new diz.a(dVar.c), null), 3);
    }

    @Override // defpackage.n000
    public final qxd0<z900> y1() {
        return this.k0;
    }
}
