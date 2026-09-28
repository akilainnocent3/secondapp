package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ke8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ke8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                re8.a aVar = re8.P;
                Bundle arguments = ((re8) obj).getArguments();
                PaymentChannel paymentChannel = arguments != null ? (PaymentChannel) arguments.getParcelable("payChannel") : null;
                paymentChannel.getClass();
                return paymentChannel;
            case 1:
                ((Function1) obj).invoke(jmq.d.a);
                return Unit.a;
            default:
                u480 u480Var = (u480) obj;
                dtg0<S> dtg0Var = u480Var.e;
                u480Var.f = dtg0Var != 0 ? ((Number) dtg0Var.l.getValue()).longValue() : 0L;
                return Unit.a;
        }
    }
}
