package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mqu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mqu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke("");
                break;
            default:
                lq70 lq70Var = (lq70) obj;
                lq70Var.getParentFragmentManager().m0("REQUEST_KEY_SHOW_SCROLLABLE_ALERT_DIALOG", vj5.a(new Pair("RESULT_KEY_SHOW_SCROLLABLE_ALERT_DIALOG", AlertDialogCallbackType.Positive.a)));
                lq70Var.dismissAllowingStateLoss();
                break;
        }
        return Unit.a;
    }
}
