package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.manager.InsufficientFundsUiManagerImpl$init$5", f = "InsufficientFundsUiManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fuo extends tje0 implements Function2<xi7, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ guo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuo(guo guoVar, v1b<? super fuo> v1bVar) {
        super(2, v1bVar);
        this.b = guoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fuo fuoVar = new fuo(this.b, v1bVar);
        fuoVar.a = obj;
        return fuoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xi7 xi7Var, v1b<? super Unit> v1bVar) {
        return ((fuo) create(xi7Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        xi7 xi7Var = (xi7) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.v.setValue(xi7Var);
        return Unit.a;
    }
}
