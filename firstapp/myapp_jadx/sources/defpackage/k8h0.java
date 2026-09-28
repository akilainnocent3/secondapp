package defpackage;

import android.widget.TextView;
import com.sporty.android.core.model.pocket.common.WhTaxData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.model.TxSuccessParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.activity.TxSuccessActivity$initViewModel$1$1", f = "TxSuccessActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k8h0 extends tje0 implements Function2<WhTaxData, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxSuccessActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8h0(TxSuccessActivity txSuccessActivity, v1b<? super k8h0> v1bVar) {
        super(2, v1bVar);
        this.b = txSuccessActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        k8h0 k8h0Var = new k8h0(this.b, v1bVar);
        k8h0Var.a = obj;
        return k8h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WhTaxData whTaxData, v1b<? super Unit> v1bVar) {
        return ((k8h0) create(whTaxData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WhTaxData whTaxData = (WhTaxData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxSuccessActivity txSuccessActivity = this.b;
        TxSuccessParams txSuccessParams = txSuccessActivity.v;
        if (txSuccessParams == null) {
            Intrinsics.n("params");
            throw null;
        }
        if (txSuccessParams.getA() == log0.a && whTaxData.isActive) {
            bf bfVar = txSuccessActivity.i;
            if (bfVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView textView = bfVar.L;
            textView.setText(sn5.c(textView, R.string.page_payment__deposit_gh_tax_info, String.valueOf(whTaxData.effectiveDays)));
            textView.setVisibility(0);
        }
        return Unit.a;
    }
}
