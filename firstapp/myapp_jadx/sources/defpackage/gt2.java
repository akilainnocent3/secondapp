package defpackage;

import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.data.repository.BetHistoryRepositoryImpl$undoLastDeletedRealBetHistoryOrders$4$1", f = "BetHistoryRepositoryImpl.kt", l = {135}, m = "invokeSuspend", v = 2)
public final class gt2 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ht2 b;
    public final /* synthetic */ List<RealBetHistoryOrderEntity> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt2(ht2 ht2Var, List<RealBetHistoryOrderEntity> list, v1b<? super gt2> v1bVar) {
        super(1, v1bVar);
        this.b = ht2Var;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new gt2(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((gt2) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            x540 x540VarX = this.b.b.x();
            List<RealBetHistoryOrderEntity> list = this.c;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealBetHistoryOrderEntity) it.next()).getOrderId());
            }
            this.a = 1;
            if (x540VarX.l(arrayList, this) == y5bVar) {
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
