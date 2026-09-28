package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xdu implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                sdu sduVar = (sdu) obj;
                sduVar.getClass();
                return sduVar.m;
            default:
                cp50 cp50Var = (cp50) obj;
                cp50Var.getClass();
                StringUiText stringUiText = vch0.a;
                return new wo50.b(new ResourceUiText(R.string.common_feedback__verification_failed), new ResourceUiText(R.string.common_feedback__please_try_again_later), cp50Var);
        }
    }
}
