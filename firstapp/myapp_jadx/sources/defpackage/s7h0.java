package defpackage;

import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$onClickDateRange$1", f = "TxListViewModel.kt", l = {326}, m = "invokeSuspend", v = 2)
public final class s7h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o7h0 b;
    public final /* synthetic */ b1h0 c;
    public final /* synthetic */ LastDayRangeSetting d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7h0(o7h0 o7h0Var, b1h0 b1h0Var, LastDayRangeSetting lastDayRangeSetting, v1b<? super s7h0> v1bVar) {
        super(2, v1bVar);
        this.b = o7h0Var;
        this.c = b1h0Var;
        this.d = lastDayRangeSetting;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s7h0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s7h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.E;
            b1h0 b1h0Var = this.c;
            g5h0.a aVar = new g5h0.a(new Pair(new Long(b1h0Var.a.getTime()), new Long(b1h0Var.b.getTime())), this.d);
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
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
