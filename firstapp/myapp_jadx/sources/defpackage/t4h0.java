package defpackage;

import com.sporty.android.core.model.pocket.common.PLAOperatorBOConfig;
import com.sporty.android.core.model.pocket.transaction.Transaction;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txdetails.TxDetailsViewModel$_txDetailsUiStateFlow$1", f = "TxDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t4h0 extends tje0 implements kaj<lk50<? extends Transaction>, t8h0, f1h0, PLAOperatorBOConfig, Boolean, v1b<? super lk50<? extends s3h0>>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ t8h0 b;
    public /* synthetic */ f1h0 c;
    public /* synthetic */ PLAOperatorBOConfig d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ e5h0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4h0(e5h0 e5h0Var, v1b<? super t4h0> v1bVar) {
        super(6, v1bVar);
        this.f = e5h0Var;
    }

    @Override // defpackage.kaj
    public final Object f(lk50<? extends Transaction> lk50Var, t8h0 t8h0Var, f1h0 f1h0Var, PLAOperatorBOConfig pLAOperatorBOConfig, Boolean bool, v1b<? super lk50<? extends s3h0>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        t4h0 t4h0Var = new t4h0(this.f, v1bVar);
        t4h0Var.a = lk50Var;
        t4h0Var.b = t8h0Var;
        t4h0Var.c = f1h0Var;
        t4h0Var.d = pLAOperatorBOConfig;
        t4h0Var.e = zBooleanValue;
        return t4h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        final t8h0 t8h0Var = this.b;
        final f1h0 f1h0Var = this.c;
        final PLAOperatorBOConfig pLAOperatorBOConfig = this.d;
        final boolean z = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final e5h0 e5h0Var = this.f;
        return bm50.l(lk50Var, new Function1() { // from class: s4h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Transaction transaction = (Transaction) obj2;
                return new s3h0(transaction, t8h0Var.a(Integer.valueOf(transaction.bizType), transaction.tradeCode, transaction.bizTypeName, transaction.subBizTypeName), f1h0Var, pLAOperatorBOConfig, z, e5h0Var.e.z() && transaction.taxedAmount > 0 && transaction.taxAmount > 0);
            }
        });
    }
}
