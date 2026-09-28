package defpackage;

import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$9", f = "TxListActivity.kt", l = {697}, m = "invokeSuspend", v = 2)
public final class k7h0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ TxListActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7h0(TxListActivity txListActivity, v1b<? super k7h0> v1bVar) {
        super(2, v1bVar);
        this.c = txListActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k7h0 k7h0Var = new k7h0(this.c, v1bVar);
        k7h0Var.b = obj;
        return k7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        return ((k7h0) create(bool, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Boolean bool = (Boolean) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (Intrinsics.g(bool, Boolean.TRUE)) {
                TxListActivity txListActivity = this.c;
                tta confirmNameDialogLauncher = txListActivity.getConfirmNameDialogLauncher();
                vtp vtpVar = vtp.TRANSACTIONS_PAGE;
                this.b = null;
                this.a = 1;
                if (confirmNameDialogLauncher.c(txListActivity, vtpVar, this) == y5bVar) {
                    return y5bVar;
                }
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
