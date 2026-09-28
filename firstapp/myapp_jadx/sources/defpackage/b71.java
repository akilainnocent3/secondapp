package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b71 extends saj implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        str2.getClass();
        fb1 fb1Var = (fb1) this.receiver;
        fb1Var.getClass();
        wrn wrnVar = fb1Var.z;
        wrnVar.getClass();
        rld rldVar = (rld) wrnVar.a;
        lyh lyhVarC = ozh.c(new or60(new qld(rldVar, str2, null)), rldVar.a);
        StringUiText stringUiText = vch0.a;
        kzh.d(ozh.c(new qb1(bm50.c(lyhVarC, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), fb1Var, str2, str2, str2), fb1Var.a), o8i0.d(fb1Var));
        return Unit.a;
    }
}
