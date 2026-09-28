package defpackage;

import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.SetDefaultStackUseCase$invoke$1", f = "SetDefaultStackUseCase.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class sh80 extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ th80 c;
    public final /* synthetic */ BigDecimal d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh80(th80 th80Var, BigDecimal bigDecimal, v1b<? super sh80> v1bVar) {
        super(2, v1bVar);
        this.c = th80Var;
        this.d = bigDecimal;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        sh80 sh80Var = new sh80(this.c, this.d, v1bVar);
        sh80Var.b = obj;
        return sh80Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((sh80) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.c.a.setCustomDefaultStake(this.d);
            Unit unit = Unit.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(unit, this) == y5bVar) {
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
