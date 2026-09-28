package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.historydetail.presentation.LNHistoryDetailViewModel$fetchData$2", f = "LNHistoryDetailViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class hjq extends tje0 implements Function2<lk50<? extends ygq>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kjq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjq(kjq kjqVar, v1b<? super hjq> v1bVar) {
        super(2, v1bVar);
        this.c = kjqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hjq hjqVar = new hjq(this.c, v1bVar);
        hjqVar.b = obj;
        return hjqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends ygq> lk50Var, v1b<? super Unit> v1bVar) {
        return ((hjq) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.w;
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
