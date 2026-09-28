package defpackage;

import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$7", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i7h0 extends tje0 implements Function2<w0h0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7h0(TxListActivity txListActivity, v1b<? super i7h0> v1bVar) {
        super(2, v1bVar);
        this.b = txListActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i7h0 i7h0Var = new i7h0(this.b, v1bVar);
        i7h0Var.a = obj;
        return i7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(w0h0 w0h0Var, v1b<? super Unit> v1bVar) {
        return ((i7h0) create(w0h0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        w0h0 w0h0Var = (w0h0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        aqg0 aqg0Var = w0h0Var.a;
        boolean z = w0h0Var.b;
        TxListActivity txListActivity = this.b;
        ze zeVar = txListActivity.d;
        if (zeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zeVar.E.setText(aqg0Var.b.e(txListActivity));
        ze zeVar2 = txListActivity.d;
        if (zeVar2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        zeVar2.E.setSelected(false);
        ze zeVar3 = txListActivity.d;
        if (zeVar3 != null) {
            zeVar3.E.setHovered(!z);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
