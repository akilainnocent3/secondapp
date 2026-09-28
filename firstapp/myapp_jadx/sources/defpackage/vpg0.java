package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class vpg0 {
    public static final /* synthetic */ int a = 0;

    static {
        new LinkedHashSet();
    }

    public static final void a(vtw<spg0> vtwVar) {
        vtwVar.getClass();
        vtwVar.a(spg0.b.a);
    }

    public static final void b(vtw<spg0> vtwVar, aqg0 aqg0Var) {
        vtwVar.getClass();
        aqg0Var.getClass();
        vtwVar.a(new spg0.f(aqg0Var));
    }

    public static final void c(vtw<spg0> vtwVar, TxSuccessParams txSuccessParams) {
        vtwVar.getClass();
        vtwVar.a(new spg0.g(txSuccessParams));
    }

    public static final void d(vtw<spg0> vtwVar) {
        vtwVar.getClass();
        vtwVar.a(spg0.j.a);
    }

    public static void e(vtw vtwVar, ResourceUiText resourceUiText, UiText uiText, ResourceUiText resourceUiText2, Function1 function1, int i) {
        StringUiText stringUiText = vch0.a;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__ok);
        ResourceUiText resourceUiText4 = (i & 8) != 0 ? null : resourceUiText2;
        int i2 = (i & 16) != 0 ? R.color.brand_quaternary : R.color.text_type1_secondary;
        int i3 = (i & 32) != 0 ? R.color.text_type1_secondary : R.color.brand_quaternary;
        Function1 function2 = (i & 256) != 0 ? null : function1;
        vtwVar.getClass();
        vtwVar.a(new spg0.l(resourceUiText, uiText, resourceUiText3, resourceUiText4, i2, i3, false, function2));
    }
}
