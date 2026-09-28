package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly9y;", "Lxkj0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y9y extends xkj0 {
    public final vu60 T;
    public final m800 U;
    public final to6 V;
    public final wwd0 W;
    public final v340 X;
    public final ku90<w8y> Y;
    public final ku90 Z;
    public final qxd0<UiText> a0;
    public final qxd0<List<String>> b0;
    public final qxd0<Integer> c0;
    public final qxd0<UiText> d0;
    public final qxd0<UiText> e0;
    public final qxd0<z900> f0;
    public final qxd0<UiText> g0;
    public final qxd0<UiText> h0;
    public final qxd0<gtp> i0;
    public final qxd0<wg8> j0;
    public final qxd0<il8> k0;
    public final qxd0<rrj0> l0;
    public final qxd0<uxs> m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9y(vu60 vu60Var, w9e w9eVar, psm psmVar, mmj0.a aVar, ha00 ha00Var, bmj0 bmj0Var, w9y.a aVar2, v800 v800Var, uqm uqmVar, dhj0.a aVar3, m800 m800Var, to6 to6Var) {
        super(vu60Var, uqmVar, psmVar, v800Var, aVar, w9eVar, ha00Var, bmj0Var, aVar3);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        bmj0Var.getClass();
        v800Var.getClass();
        uqmVar.getClass();
        this.T = vu60Var;
        this.U = m800Var;
        this.V = to6Var;
        char cA = this.a.a();
        m2g m2gVar = m2g.a;
        z900 z900Var = new z900(3, (StringUiText) null);
        StringUiText stringUiText = vch0.a;
        wwd0 wwd0VarA = xwd0.a(new x8y(cA, null, null, m2gVar, null, null, z900Var, stringUiText, stringUiText, new gtp(0), new wg8(0), uxs.DISABLE, null, new il8(null), null));
        this.W = wwd0VarA;
        this.X = e1i.b(wwd0VarA);
        ku90<w8y> ku90Var = new ku90<>();
        this.Y = ku90Var;
        this.Z = ku90Var;
        w9y w9yVar = new w9y(wwd0VarA);
        this.a0 = w9yVar.b;
        this.b0 = w9yVar.c;
        this.c0 = w9yVar.d;
        this.d0 = w9yVar.e;
        this.e0 = w9yVar.f;
        this.f0 = w9yVar.g;
        this.g0 = w9yVar.h;
        this.h0 = w9yVar.i;
        this.i0 = w9yVar.k;
        this.j0 = w9yVar.l;
        this.k0 = w9yVar.m;
        this.l0 = w9yVar.n;
        this.m0 = w9yVar.j;
        O1().k = 2;
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
    public final UiText F1() {
        Integer intOrNull = StringsKt.toIntOrNull(E1());
        if (intOrNull != null) {
            int iIntValue = intOrNull.intValue();
            this.U.getClass();
            ResourceUiText resourceUiTextA = m800.a(iIntValue);
            if (resourceUiTextA != null) {
                return resourceUiTextA;
            }
        }
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.int_provider_nuvei_pay);
    }

    @Override // defpackage.n000
    public final qxd0<wg8> G1() {
        return this.j0;
    }

    @Override // defpackage.n000
    public final n000.a H1() {
        Object objB = this.T.b("NUVEI_CHANNEL_ID");
        objB.getClass();
        c100 c100VarA = sg8.a(((Number) objB).intValue());
        c100VarA.getClass();
        return new n000.a(c100VarA, h400.NUVEI, "36", "36");
    }

    @Override // defpackage.n000
    public final qxd0<List<String>> I1() {
        return this.b0;
    }

    @Override // defpackage.n000
    public final qxd0<gtp> J1() {
        return this.i0;
    }

    @Override // defpackage.n000
    public final qxd0<Integer> K1() {
        return this.c0;
    }

    @Override // defpackage.n000
    public final Integer L1() {
        int i;
        c100 c100VarN1 = N1();
        this.V.getClass();
        c100VarN1.getClass();
        switch (c100VarN1.ordinal()) {
            case 40:
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                i = R.drawable.spei_logo;
                break;
            case 41:
                i = R.drawable.nuvei_oxxo_logo;
                break;
            default:
                i = R.drawable.nuvei_credit_card_logo;
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.n000
    public final qxd0<UiText> S1() {
        return this.a0;
    }

    @Override // defpackage.n000
    public final UiText b2(BankTradeData bankTradeData) {
        StringUiText stringUiText = vch0.a;
        return new ResourceUiText(R.string.int_provider_nuvei_pay);
    }

    @Override // defpackage.xkj0
    public final qxd0<il8> i2() {
        return this.k0;
    }

    @Override // defpackage.xkj0
    public final qxd0<uxs> l2() {
        return this.m0;
    }

    @Override // defpackage.xkj0
    public final msj0 m2() {
        return new msj0.b(z1().a.b, N1());
    }

    @Override // defpackage.xkj0
    public final qxd0<rrj0> n2() {
        return this.l0;
    }

    @Override // defpackage.xkj0
    public final void o2(xoj0.b.e eVar) {
        ej5.c(o8i0.d(this), null, null, new x9y(this, new w8y.a(eVar.b), null), 3);
    }

    @Override // defpackage.n000
    public final qxd0<z900> y1() {
        return this.f0;
    }
}
