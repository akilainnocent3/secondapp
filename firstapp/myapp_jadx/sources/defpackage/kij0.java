package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.compose.bank.screen.WithdrawBankEntryKt$WithdrawBankEntry$2$1", f = "WithdrawBankEntry.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kij0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mjj0 a;
    public final /* synthetic */ ytw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kij0(mjj0 mjj0Var, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = mjj0Var;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kij0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kij0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zIsEmpty = ((su60) this.b.getValue()).a.isEmpty();
        wwd0 wwd0Var = this.a.v0;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.valueOf(zIsEmpty)));
        return Unit.a;
    }
}
