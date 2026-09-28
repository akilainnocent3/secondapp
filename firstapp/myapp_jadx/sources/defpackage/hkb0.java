package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhkb0;", "Lwrd;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hkb0 extends wrd {
    public static final ResourceUiText i0;
    public final wwd0 Y;
    public final qxd0<UiText> Z;
    public final qxd0<List<String>> a0;
    public final qxd0<Integer> b0;
    public final qxd0<UiText> c0;
    public final qxd0<UiText> d0;
    public final qxd0<uxs> e0;
    public final qxd0<wg8> f0;
    public final qxd0<vc8> g0;
    public final ytw h0;

    static {
        StringUiText stringUiText = vch0.a;
        i0 = new ResourceUiText(R.string.page_payment__invalid_sportybet_voucher_pin_length);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkb0(vu60 vu60Var, w9e w9eVar, iod.a aVar, mod modVar, psm psmVar, v800 v800Var, uqm uqmVar, l0e.a aVar2, i9e i9eVar, x0l x0lVar, hg30.a aVar3, gkb0.a aVar4, u290 u290Var) {
        super(vu60Var, uqmVar, psmVar, v800Var, aVar2, w9eVar, aVar, modVar, i9eVar, x0lVar, aVar3, u290Var);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        w9eVar.getClass();
        psmVar.getClass();
        v800Var.getClass();
        uqmVar.getClass();
        u290Var.getClass();
        wwd0 wwd0VarA = xwd0.a(new vjb0(0));
        this.Y = wwd0VarA;
        gkb0 gkb0Var = new gkb0(wwd0VarA);
        this.Z = gkb0Var.b;
        this.a0 = gkb0Var.c;
        this.b0 = gkb0Var.d;
        this.c0 = gkb0Var.e;
        this.d0 = gkb0Var.f;
        this.e0 = gkb0Var.g;
        this.f0 = gkb0Var.h;
        this.g0 = gkb0Var.i;
        this.h0 = m.b(new ijf0((String) null, 0L, 7));
    }

    @Override // defpackage.n000
    public final qxd0<UiText> C1() {
        return this.c0;
    }

    @Override // defpackage.n000
    public final qxd0<UiText> D1() {
        return this.d0;
    }

    @Override // defpackage.n000
    public final qxd0<wg8> G1() {
        return this.f0;
    }

    @Override // defpackage.n000
    public final n000.a H1() {
        return new n000.a(c100.i, h400.FLASH, String.valueOf(33003), String.valueOf(33003));
    }

    @Override // defpackage.n000
    public final qxd0<List<String>> I1() {
        return this.a0;
    }

    @Override // defpackage.n000
    public final qxd0<Integer> K1() {
        return this.b0;
    }

    @Override // defpackage.n000
    public final Integer L1() {
        return Integer.valueOf(N1().c);
    }

    @Override // defpackage.n000
    public final qxd0<UiText> S1() {
        return this.Z;
    }

    @Override // defpackage.n000
    public final UiText b2(BankTradeData bankTradeData) {
        ResourceUiText resourceUiText = new ResourceUiText(R.string.int_provider_sporty_bet_voucher);
        return resourceUiText.h(new StringUiText(" ")).h(new ResourceUiText(R.string.app_common__star_number, a.c(wae0.L(4, ((ijf0) ((x5a0) this.h0).getValue()).a.b))));
    }

    @Override // defpackage.wrd
    public final qxd0<vc8> i2() {
        return this.g0;
    }

    @Override // defpackage.wrd
    public final qxd0<uxs> k2() {
        return this.e0;
    }

    @Override // defpackage.wrd
    public final wvd l2(String str) {
        str.getClass();
        c100 c100Var = c100.e;
        return new wvd.b(((ijf0) ((x5a0) this.h0).getValue()).a.b);
    }

    @Override // defpackage.wrd
    public final boolean x2(x7e x7eVar) {
        Object value;
        Object value2;
        x7eVar.getClass();
        boolean z = x7eVar instanceof x7e.d.o;
        wwd0 wwd0Var = this.Y;
        if (z) {
            this.J.d.a(new snd(0), k00.c, k00.d);
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, vjb0.a((vjb0) value2, null, null, null, null, null, null, null, null, null, true, 511)));
            return true;
        }
        String message = x7eVar.getMessage();
        if (message != null) {
            s9e0.a.getClass();
            String strA = s9e0.a(message);
            if (strA != null) {
                StringUiText stringUiText = vch0.a;
                StringUiText stringUiText2 = new StringUiText(strA);
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, vjb0.a((vjb0) value, null, null, null, null, null, null, null, null, new z900(2, stringUiText2), false, 767)));
                return true;
            }
        }
        return false;
    }
}
