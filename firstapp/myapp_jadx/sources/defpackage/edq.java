package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftdialog.LNGiftDialogViewModel$errorMessage$1", f = "LNGiftDialogViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class edq extends tje0 implements gaj<ijf0, ocq, v1b<? super ResourceUiText>, Object> {
    public /* synthetic */ ijf0 a;
    public /* synthetic */ ocq b;

    @Override // defpackage.gaj
    public final Object invoke(ijf0 ijf0Var, ocq ocqVar, v1b<? super ResourceUiText> v1bVar) {
        edq edqVar = new edq(3, v1bVar);
        edqVar.a = ijf0Var;
        edqVar.b = ocqVar;
        return edqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ijf0 ijf0Var = this.a;
        ocq ocqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimalB = ukd0.b(ijf0Var.a.b);
        if (qag.b(ijf0Var)) {
            return null;
        }
        if (bigDecimalB.compareTo(ocqVar.e) > 0) {
            Object[] objArr = {ukd0.a(2, ocqVar.e, true, true)};
            StringUiText stringUiText = vch0.a;
            return new ResourceUiText(R.string.page_lucky_numbers__gift_max_value_error, ay0.S(objArr));
        }
        rkd0.Companion.getClass();
        if (bigDecimalB.compareTo(rkd0.b) > 0) {
            return null;
        }
        StringUiText stringUiText2 = vch0.a;
        return new ResourceUiText(R.string.page_lucky_numbers__gift_min_value_error, ay0.S(new Object[]{"0.00"}));
    }
}
