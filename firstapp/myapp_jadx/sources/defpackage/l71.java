package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l71 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        fb1 fb1Var = (fb1) this.receiver;
        twb twbVar = (twb) fb1Var.V.getValue();
        if (twbVar instanceof twb.f) {
            wrn wrnVar = fb1Var.z;
            twb.f fVar = (twb.f) twbVar;
            String str = fVar.b;
            wrnVar.getClass();
            str.getClass();
            rld rldVar = (rld) wrnVar.a;
            lyh lyhVarC = ozh.c(new or60(new qld(rldVar, str, null)), rldVar.a);
            StringUiText stringUiText = vch0.a;
            kzh.d(ozh.c(new ob1(bm50.c(lyhVarC, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), fb1Var, fVar), fb1Var.a), o8i0.d(fb1Var));
        }
        return Unit.a;
    }
}
