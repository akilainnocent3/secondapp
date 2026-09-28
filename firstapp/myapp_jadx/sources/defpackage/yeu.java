package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyeu;", "Lwrd;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yeu extends wrd {
    public final wwd0 Y;
    public final v340 Z;
    public final qxd0<UiText> a0;
    public final qxd0<List<String>> b0;
    public final qxd0<Integer> c0;
    public final qxd0<UiText> d0;
    public final qxd0<UiText> e0;
    public final qxd0<z900> f0;
    public final qxd0<UiText> g0;
    public final qxd0<UiText> h0;
    public final qxd0<UiText> i0;
    public final qxd0<UiText> j0;
    public final qxd0<uxs> k0;
    public final qxd0<gtp> l0;
    public final qxd0<dh30> m0;
    public final qxd0<wg8> n0;
    public final qxd0<vc8> o0;
    public final mpe0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yeu(final vu60 vu60Var, w9e w9eVar, psm psmVar, v800 v800Var, uqm uqmVar, l0e.a aVar, mod modVar, iod.a aVar2, i9e i9eVar, x0l x0lVar, hg30.a aVar3, weu.a aVar4, u290 u290Var) {
        super(vu60Var, uqmVar, psmVar, v800Var, aVar, w9eVar, aVar2, modVar, i9eVar, x0lVar, aVar3, u290Var);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        v800Var.getClass();
        uqmVar.getClass();
        u290Var.getClass();
        char cA = this.a.a();
        m2g m2gVar = m2g.a;
        z900 z900Var = new z900(3, (StringUiText) null);
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new sdu(cA, null, null, m2gVar, null, null, z900Var, stringUiText, stringUiText, null, null, uxs.DISABLE, new gtp(0), new wg8(0), new vc8(0), dh30.b.a, false));
        this.Y = wwd0VarA;
        this.Z = e1i.b(wwd0VarA);
        weu weuVar = new weu(wwd0VarA);
        this.a0 = weuVar.b;
        this.b0 = weuVar.c;
        this.c0 = weuVar.d;
        this.d0 = weuVar.e;
        this.e0 = weuVar.f;
        this.f0 = weuVar.g;
        this.g0 = weuVar.h;
        this.h0 = weuVar.i;
        this.i0 = weuVar.j;
        this.j0 = weuVar.k;
        this.k0 = weuVar.l;
        this.l0 = weuVar.m;
        this.m0 = weuVar.n;
        this.n0 = weuVar.o;
        this.o0 = weuVar.p;
        this.p0 = hwr.b(new Function0() { // from class: xeu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object objB = vu60Var.b("CHANNEL_NAME");
                objB.getClass();
                return (String) objB;
            }
        });
    }

    @Override // defpackage.n000
    public final qxd0<UiText> A1() {
        return this.e0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> B1() {
        return this.d0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> C1() {
        return this.g0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> D1() {
        return this.h0;
    }

    @Override // defpackage.n000
    public final qxd0<wg8> G1() {
        return this.n0;
    }

    @Override // defpackage.n000
    public final n000.a H1() {
        c100 c100Var = c100.w;
        ga00 ga00Var = ga00.DEPOSIT;
        return new n000.a(c100Var, h400.PAWAPAY, "2021", "2021");
    }

    @Override // defpackage.n000
    public final qxd0<List<String>> I1() {
        return this.b0;
    }

    @Override // defpackage.n000
    public final qxd0<gtp> J1() {
        return this.l0;
    }

    @Override // defpackage.n000
    public final qxd0<Integer> K1() {
        return this.c0;
    }

    @Override // defpackage.n000
    public final Integer L1() {
        return Integer.valueOf(N1().c);
    }

    @Override // defpackage.n000
    public final qxd0<UiText> Q1() {
        return this.i0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> R1() {
        return this.j0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> S1() {
        return this.a0;
    }

    @Override // defpackage.n000
    public final UiText b2(BankTradeData bankTradeData) {
        String str = ((String) this.p0.getValue()) + " (" + this.b.M() + M1() + ")";
        StringUiText stringUiText = vch0.a;
        return new StringUiText(str);
    }

    @Override // defpackage.wrd
    public final qxd0<vc8> i2() {
        return this.o0;
    }

    @Override // defpackage.wrd
    public final qxd0<uxs> k2() {
        return this.k0;
    }

    @Override // defpackage.wrd
    public final qxd0<dh30> n2() {
        return this.m0;
    }

    @Override // defpackage.wrd
    public final boolean x2(x7e x7eVar) {
        wwd0 wwd0Var;
        Object value;
        sdu sduVar;
        x7eVar.getClass();
        if (!(x7eVar instanceof x7e.d.o)) {
            return false;
        }
        this.P = ((x7e.d.o) x7eVar).b;
        do {
            wwd0Var = this.Y;
            value = wwd0Var.getValue();
            sduVar = (sdu) value;
            sduVar.getClass();
        } while (!wwd0Var.g(value, sdu.a(sduVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, Settings.DEFAULT_INITIAL_WINDOW_SIZE)));
        return true;
    }

    @Override // defpackage.n000
    public final qxd0<z900> y1() {
        return this.f0;
    }
}
