package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.payment.impl.deposit.presentation.model.event.InsufficientFundsCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class d8e implements Function1<InsufficientFundsCallbackType, Unit> {
    public final /* synthetic */ bc6 a;

    public d8e(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InsufficientFundsCallbackType insufficientFundsCallbackType) {
        InsufficientFundsCallbackType insufficientFundsCallbackType2 = insufficientFundsCallbackType;
        insufficientFundsCallbackType2.getClass();
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(insufficientFundsCallbackType2);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        }
        return Unit.a;
    }
}
