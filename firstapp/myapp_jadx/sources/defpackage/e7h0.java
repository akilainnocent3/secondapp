package defpackage;

import android.content.Intent;
import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$3", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e7h0 extends tje0 implements Function2<h7l, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7h0(TxListActivity txListActivity, v1b<? super e7h0> v1bVar) {
        super(2, v1bVar);
        this.b = txListActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e7h0 e7h0Var = new e7h0(this.b, v1bVar);
        e7h0Var.a = obj;
        return e7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h7l h7lVar, v1b<? super Unit> v1bVar) {
        return ((e7h0) create(h7lVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        h7l h7lVar = (h7l) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final TxListActivity txListActivity = this.b;
        k7l k7lVar = txListActivity.c;
        if (k7lVar != null) {
            k7lVar.a(txListActivity, h7lVar, new Function1() { // from class: d7h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    String str = (String) obj2;
                    TxListActivity txListActivity2 = txListActivity;
                    ee<Intent> eeVar = txListActivity2.A;
                    q900 q900Var = txListActivity2.F;
                    if (q900Var != null) {
                        eeVar.b(q900Var.a(txListActivity2, str));
                        return Unit.a;
                    }
                    Intrinsics.n("paymentSecurityUtil");
                    throw null;
                }
            }, new ufg(1));
            return Unit.a;
        }
        Intrinsics.n(siPCzPFw.ovZLQYO);
        throw null;
    }
}
