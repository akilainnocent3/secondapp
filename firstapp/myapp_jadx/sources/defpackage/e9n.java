package defpackage;

import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e9n implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e9n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                lb80.c(pb80Var, (String) obj2);
                lb80.h(pb80Var, 5);
                break;
            case 1:
                UiText uiText = (UiText) obj;
                int i2 = MultiMakerActivity.E;
                uiText.getClass();
                b.i(((MultiMakerActivity) obj2).z1().e0, uiText, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                break;
            case 2:
                bz00 bz00Var = (bz00) obj2;
                if (((bbs) obj).a == bbs.a.c) {
                    bz00Var.b.b(null);
                }
                break;
            default:
                uf00 uf00Var = (uf00) obj;
                uf00Var.getClass();
                ((Function1) obj2).invoke(new q5z.s(uf00Var));
                break;
        }
        return Unit.a;
    }
}
