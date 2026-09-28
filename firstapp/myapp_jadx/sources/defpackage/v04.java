package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v04 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v04(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringUiText stringUiText = vch0.a;
                ((Function1) obj).invoke(new u04.a(new ResourceUiText(R.string.page_loyalty__streak_history), new ResourceUiText(R.string.page_loyalty__streak_history_notice_description)));
                break;
            default:
                ((hjx) obj).k();
                break;
        }
        return Unit.a;
    }
}
