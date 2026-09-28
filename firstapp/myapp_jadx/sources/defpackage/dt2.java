package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.data.repository.BetHistoryRepositoryImpl$deleteRealBetHistoryOrders$2", f = "BetHistoryRepositoryImpl.kt", l = {93}, m = "invokeSuspend", v = 2)
public final class dt2 extends tje0 implements Function1<v1b<? super Integer>, Object> {
    public int a;
    public final /* synthetic */ ht2 b;
    public final /* synthetic */ Iterable<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt2(ht2 ht2Var, Iterable<String> iterable, v1b<? super dt2> v1bVar) {
        super(1, v1bVar);
        this.b = ht2Var;
        this.c = iterable;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new dt2(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Integer> v1bVar) {
        return ((dt2) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        x540 x540VarX = this.b.b.x();
        List listA0 = CollectionsKt.A0(this.c);
        this.a = 1;
        Object objL = x540VarX.l(listA0, this);
        return objL == y5bVar ? y5bVar : objL;
    }
}
