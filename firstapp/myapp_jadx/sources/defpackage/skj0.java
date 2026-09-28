package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.withdraw.WithdrawBaseViewModel$emitSideEffect$1", f = "WithdrawBaseViewModel.kt", l = {496}, m = "invokeSuspend", v = 2)
public final class skj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xkj0 b;
    public final /* synthetic */ okj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skj0(xkj0 xkj0Var, okj0 okj0Var, v1b<? super skj0> v1bVar) {
        super(2, v1bVar);
        this.b = xkj0Var;
        this.c = okj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new skj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((skj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<okj0> ku90Var = this.b.L;
            this.a = 1;
            if (ku90Var.a.emit(this.c, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
