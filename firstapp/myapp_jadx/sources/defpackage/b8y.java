package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.nuvei.deposit.NuveiDepositViewModel$emitSideEffect$1", f = "NuveiDepositViewModel.kt", l = {254}, m = "invokeSuspend", v = 2)
public final class b8y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c8y b;
    public final /* synthetic */ a7y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8y(c8y c8yVar, a7y a7yVar, v1b<? super b8y> v1bVar) {
        super(2, v1bVar);
        this.b = c8yVar;
        this.c = a7yVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b8y(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b8y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<a7y> ku90Var = this.b.i0;
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
