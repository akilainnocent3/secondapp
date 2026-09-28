package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.globalpay.mobileMoney.b;
import com.sportybet.android.globalpay.mobileMoney.c;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class byv extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object value;
        c cVar = (c) this.receiver;
        psm psmVar = cVar.w;
        wwd0 wwd0Var = cVar.N;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, c.a.a((c.a) value, null, null, false, 0, null, false, false, false, false, 447)));
        ys00 ys00VarB = ((c.a) wwd0Var.getValue()).b();
        String phone = ys00VarB != null ? ys00VarB.a.getPhone() : null;
        boolean z = cVar.T;
        if (z && phone != null) {
            String strP = psmVar.P();
            Object[] objArr = {oxc.a(psmVar.M(), " ", phone)};
            StringUiText stringUiText = vch0.a;
            cVar.A1(new b.c(new ResourceUiText(R.string.page_payment__add_new_mobile_number_verify_register_otp_tip_vphone, ay0.S(objArr)), strP, phone));
        } else if (z) {
            cVar.A1(new b.f(vch0.b));
        } else {
            cVar.A1(new b.C0228b(null));
        }
        return Unit.a;
    }
}
