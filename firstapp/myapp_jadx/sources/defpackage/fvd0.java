package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes7.dex */
public final class fvd0 {
    public static UiText a(cvd0 cvd0Var, boolean z, String str) {
        cvd0Var.getClass();
        str.getClass();
        if (cvd0Var instanceof cvd0.d) {
            Object[] objArr = {n4d.a(((cvd0.d) cvd0Var).a)};
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.component_betslip__please_enter_a_value_no_less_than_vmount, ay0.S(objArr));
        }
        if (cvd0Var instanceof cvd0.b) {
            Object[] objArr2 = {n4d.a(((cvd0.b) cvd0Var).a)};
            StringUiText stringUiText2 = vch0.a;
            return new ResourceUiText(R.string.component_betslip__greater_than_max, ay0.S(objArr2));
        }
        if (!(cvd0Var instanceof cvd0.c)) {
            return vch0.a;
        }
        if (!z) {
            return vch0.a;
        }
        cvd0.c cVar = (cvd0.c) cvd0Var;
        BigDecimal bigDecimal = cVar.a;
        String strA = tug.a(str, " ", n4d.a(bigDecimal));
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(cVar.b);
        bigDecimalSubtract.getClass();
        Object[] objArr3 = {strA, tug.a(str, " ", n4d.a(bigDecimalSubtract))};
        StringUiText stringUiText3 = vch0.a;
        return new ResourceUiText(R.string.component_betslip__excise_tax_dialog_msg, ay0.S(objArr3));
    }
}
