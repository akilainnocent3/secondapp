package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.ozow.deposit.OzowDepositViewModel$emitSideEffect$1", f = "OzowDepositViewModel.kt", l = {219}, m = "invokeSuspend", v = 2)
public final class gjz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hjz b;
    public final /* synthetic */ diz.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjz(hjz hjzVar, diz.a aVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = hjzVar;
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gjz(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gjz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<diz> ku90Var = this.b.d0;
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
