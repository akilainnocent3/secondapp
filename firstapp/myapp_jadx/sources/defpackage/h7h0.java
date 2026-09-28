package defpackage;

import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$6", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h7h0 extends tje0 implements Function2<b1h0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7h0(TxListActivity txListActivity, v1b<? super h7h0> v1bVar) {
        super(2, v1bVar);
        this.b = txListActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h7h0 h7h0Var = new h7h0(this.b, v1bVar);
        h7h0Var.a = obj;
        return h7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(b1h0 b1h0Var, v1b<? super Unit> v1bVar) {
        return ((h7h0) create(b1h0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        b1h0 b1h0Var = (b1h0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = b1h0Var.c;
        boolean z = b1h0Var.d;
        TxListActivity txListActivity = this.b;
        ze zeVar = txListActivity.d;
        if (zeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zeVar.b.setText(str);
        ze zeVar2 = txListActivity.d;
        if (zeVar2 != null) {
            zeVar2.b.setHovered(!z);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
