package defpackage;

import android.content.Intent;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity$initViewModel$1$2", f = "TxFixStatusActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l5h0 extends tje0 implements Function2<v5h0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxFixStatusActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5h0(TxFixStatusActivity txFixStatusActivity, v1b<? super l5h0> v1bVar) {
        super(2, v1bVar);
        this.b = txFixStatusActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l5h0 l5h0Var = new l5h0(this.b, v1bVar);
        l5h0Var.a = obj;
        return l5h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5h0 v5h0Var, v1b<? super Unit> v1bVar) {
        return ((l5h0) create(v5h0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5h0 v5h0Var = (v5h0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = v5h0Var instanceof v5h0.b;
        TxFixStatusActivity txFixStatusActivity = this.b;
        if (z) {
            Intent intent = new Intent();
            v5h0.b bVar = (v5h0.b) v5h0Var;
            intent.putExtra("EXTRA_TRADE_ID", bVar.a);
            intent.putExtra("EXTRA_FINAL_STATUS", bVar.b);
            txFixStatusActivity.setResult(1, intent);
            txFixStatusActivity.finish();
        } else {
            if (!(v5h0Var instanceof v5h0.a)) {
                uhc.a();
                return null;
            }
            if (txFixStatusActivity.c == null) {
                Intrinsics.n("paymentRouter");
                throw null;
            }
            txFixStatusActivity.startActivity(c1h0.a(0, txFixStatusActivity, ((v5h0.a) v5h0Var).a));
        }
        return Unit.a;
    }
}
