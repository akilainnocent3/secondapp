package defpackage;

import com.sportybet.feature.payment.impl.deposit.presentation.model.event.InsufficientFundsCallbackType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i8e implements Function1 {
    public final /* synthetic */ z7e.g a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InsufficientFundsCallbackType insufficientFundsCallbackType = (InsufficientFundsCallbackType) obj;
        insufficientFundsCallbackType.getClass();
        this.a.f.invoke(insufficientFundsCallbackType);
        return Unit.a;
    }
}
