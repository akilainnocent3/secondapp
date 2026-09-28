package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.fragment.BaseWithdrawFragment$initConfirmViewModel$1$1", f = "BaseWithdrawFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h82 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ j82 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h82(j82 j82Var, v1b<? super h82> v1bVar) {
        super(2, v1bVar);
        this.a = j82Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h82(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((h82) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.P0().J1();
        return Unit.a;
    }
}
