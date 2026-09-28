package defpackage;

import com.sportybet.plugin.realsports.data.ROrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PrevBetHistoryViewModel$getHistoryBetList$2", f = "PrevBetHistoryViewModel.kt", l = {94}, m = "invokeSuspend", v = 2)
public final class up20 extends tje0 implements Function2<lk50<? extends ROrder>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sp20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up20(sp20 sp20Var, v1b<? super up20> v1bVar) {
        super(2, v1bVar);
        this.c = sp20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        up20 up20Var = new up20(this.c, v1bVar);
        up20Var.b = obj;
        return up20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends ROrder> lk50Var, v1b<? super Unit> v1bVar) {
        return ((up20) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.i;
            this.b = null;
            this.a = 1;
            wwd0Var.setValue(lk50Var);
            if (Unit.a == y5bVar) {
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
