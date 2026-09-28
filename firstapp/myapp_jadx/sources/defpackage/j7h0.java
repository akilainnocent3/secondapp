package defpackage;

import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$8", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j7h0 extends tje0 implements Function2<gqx, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7h0(TxListActivity txListActivity, v1b<? super j7h0> v1bVar) {
        super(2, v1bVar);
        this.b = txListActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j7h0 j7h0Var = new j7h0(this.b, v1bVar);
        j7h0Var.a = obj;
        return j7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(gqx gqxVar, v1b<? super Unit> v1bVar) {
        return ((j7h0) create(gqxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        gqx gqxVar = (gqx) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxListActivity txListActivity = this.b;
        ze zeVar = txListActivity.d;
        if (gqxVar == null) {
            if (zeVar != null) {
                zeVar.y.setVisibility(8);
                return Unit.a;
            }
            Intrinsics.n("binding");
            throw null;
        }
        if (zeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zeVar.y.setTitle(gqxVar.b.e(txListActivity));
        ze zeVar2 = txListActivity.d;
        if (zeVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zeVar2.y.setDescription(gqxVar.a.e(txListActivity));
        ze zeVar3 = txListActivity.d;
        if (zeVar3 != null) {
            zeVar3.y.setVisibility(0);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
