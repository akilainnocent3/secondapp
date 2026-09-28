package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositConfirmCompletedDialogFragment$initViewModel$1$2", f = "DepositConfirmCompletedDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dvd extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ gvd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvd(gvd gvdVar, v1b<? super dvd> v1bVar) {
        super(2, v1bVar);
        this.a = gvdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dvd(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((dvd) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.dismissAllowingStateLoss();
        return Unit.a;
    }
}
