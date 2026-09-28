package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.deposit.PaymentNetworkItem;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositFragment$initViewModel$1$11", f = "CommonMobileMoneyDepositFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class se8 extends tje0 implements Function2<PaymentNetworkItem, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ re8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se8(re8 re8Var, v1b<? super se8> v1bVar) {
        super(2, v1bVar);
        this.b = re8Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        se8 se8Var = new se8(this.b, v1bVar);
        se8Var.a = obj;
        return se8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PaymentNetworkItem paymentNetworkItem, v1b<? super Unit> v1bVar) {
        return ((se8) create(paymentNetworkItem, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        PaymentNetworkItem paymentNetworkItem = (PaymentNetworkItem) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        re8.a aVar = re8.P;
        re8 re8Var = this.b;
        PayHintData payHintData = (PayHintData) re8Var.K.getValue();
        String str = payHintData != null ? payHintData.alert : null;
        if (str != null && !StringsKt.U(str)) {
            return Unit.a;
        }
        if (paymentNetworkItem != null ? Intrinsics.g(paymentNetworkItem.getDisplayAlert(), Boolean.TRUE) : false) {
            re8Var.n0().F.setText(sn5.d(re8Var, R.string.page_payment__channel_unstable_text__NG, new Object[0]));
            re8Var.n0().J.setVisibility(0);
        } else {
            re8Var.n0().J.setVisibility(8);
        }
        return Unit.a;
    }
}
