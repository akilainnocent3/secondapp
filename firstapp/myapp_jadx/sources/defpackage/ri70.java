package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ri70 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ri70(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                q470 q470Var = (q470) obj;
                q470Var.getClass();
                return q470Var.h;
            default:
                ((String) obj).getClass();
                StringUiText stringUiText = vch0.a;
                return new ResourceUiText(R.string.common_feedback__something_went_wrong);
        }
    }
}
