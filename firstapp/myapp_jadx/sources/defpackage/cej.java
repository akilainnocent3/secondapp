package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cej implements Function1 {
    public final /* synthetic */ eej a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        awz awzVarA;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        eej eejVar = this.a;
        uf00<Integer> uf00VarA = eejVar.b.a();
        if (zBooleanValue) {
            awzVarA = awz.a(eejVar.x1(), null, null, wh80.b.a, uf00VarA, 3);
        } else {
            awz awzVarX1 = eejVar.x1();
            StringUiText stringUiText = vch0.a;
            awzVarA = awz.a(awzVarX1, null, null, new wh80.a(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip)), uf00VarA, 3);
        }
        eejVar.z1(awzVarA);
        return Unit.a;
    }
}
