package defpackage;

import com.sportybet.feature.payment.impl.deposit.presentation.model.event.InsufficientFundsCallbackType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g7e0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7e0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(i04.e.a);
                break;
            case 1:
                ((Function1) obj).invoke(bri0.t.a);
                break;
            default:
                yto ytoVar = (yto) obj;
                ytoVar.getParentFragmentManager().m0("REQUEST_KEY_INSUFFICIENT_FUNDS_BOTTOM_SHEET", vj5.a(new Pair("RESULT_KEY_INSUFFICIENT_FUNDS_BOTTOM_SHEET", InsufficientFundsCallbackType.Negative.a)));
                ytoVar.dismissAllowingStateLoss();
                break;
        }
        return Unit.a;
    }
}
