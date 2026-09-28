package defpackage;

import com.sportybet.android.cashoutphase3.b;
import com.sportybet.model.cashOut.STVPlayerDataSource;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$observePlayerDataSourceEventFlow$1", f = "CashOutFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zk6 extends tje0 implements Function2<qp10, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk6(b bVar, v1b<? super zk6> v1bVar) {
        super(2, v1bVar);
        this.b = bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zk6 zk6Var = new zk6(this.b, v1bVar);
        zk6Var.a = obj;
        return zk6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qp10 qp10Var, v1b<? super Unit> v1bVar) {
        return ((zk6) create(qp10Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qp10 qp10Var = (qp10) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        xh6 xh6Var = this.b.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        STVPlayerDataSource sTVPlayerDataSource = qp10Var.a;
        int i = qp10Var.b;
        sTVPlayerDataSource.getClass();
        ArrayList arrayList = xh6Var.A;
        pl6 pl6Var = (pl6) CollectionsKt.V(i, arrayList);
        if (pl6Var != null) {
            pl6Var.A = sTVPlayerDataSource;
            ((pl6) arrayList.get(i)).z = true;
            xh6Var.p();
        }
        return Unit.a;
    }
}
