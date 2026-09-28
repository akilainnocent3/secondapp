package defpackage;

import android.view.View;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.ugpay.withdraw.momo.CommonMobileMoneyWithdrawActivity;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uc3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uc3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xc3 xc3Var = (xc3) obj;
                xc3Var.b.invoke(new y43.b.a(xc3Var.getBindingAdapterPosition()));
                return;
            default:
                CommonMobileMoneyWithdrawActivity commonMobileMoneyWithdrawActivity = (CommonMobileMoneyWithdrawActivity) obj;
                int i2 = CommonMobileMoneyWithdrawActivity.z;
                int id = view.getId();
                if (id != R.id.next) {
                    if (id == R.id.back) {
                        qc qcVar = commonMobileMoneyWithdrawActivity.d;
                        if (qcVar == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        lop.b(qcVar.b, Boolean.FALSE);
                        commonMobileMoneyWithdrawActivity.onBackPressed();
                        return;
                    }
                    if (id == R.id.help_btn) {
                        sh8.c().e(bjb0.S("/m/help#/how-to-play/others/how-to-withdraw"));
                        return;
                    } else {
                        if (id == R.id.home) {
                            sh8.c().e(o7d.a(wae.HOME));
                            return;
                        }
                        return;
                    }
                }
                qg8 qg8VarZ1 = commonMobileMoneyWithdrawActivity.z1();
                wwd0 wwd0Var = qg8VarZ1.Z;
                ssw<Boolean> sswVar = qg8VarZ1.H;
                v340 v340Var = qg8VarZ1.g0;
                ssw<vhg<emj0>> sswVar2 = qg8VarZ1.B;
                ssw<cx> sswVar3 = qg8VarZ1.D;
                if (!Intrinsics.g(qg8VarZ1.f0, i41.d.a)) {
                    sswVar2.m(new vhg<>(new emj0.b(qg8VarZ1.f0)));
                    return;
                }
                if (qg8VarZ1.e0.compareTo((BigDecimal) ((vw) v340Var.a.getValue()).a) < 0) {
                    cx cxVarD = sswVar3.d();
                    if (cxVarD != null) {
                        sswVar3.m(cx.a(cxVarD, new kcg.g(s5y.c((BigDecimal) ((vw) v340Var.a.getValue()).a))));
                        return;
                    }
                    return;
                }
                xu1 xu1VarD = qg8VarZ1.P.d();
                if (xu1VarD == null || xu1VarD.equals(xu1.c)) {
                    cx cxVarD2 = sswVar3.d();
                    if (cxVarD2 != null) {
                        sswVar3.m(cx.a(cxVarD2, kcg.h.b));
                        return;
                    }
                    return;
                }
                PaymentChannel paymentChannel = (PaymentChannel) wwd0Var.getValue();
                String channelShowName = paymentChannel != null ? paymentChannel.getChannelShowName() : null;
                if (channelShowName == null || channelShowName.length() == 0) {
                    sswVar2.m(new vhg<>(new emj0.b(i41.b.a)));
                    return;
                }
                sswVar.m(Boolean.TRUE);
                String string = xu1VarD.b.subtract(qg8VarZ1.e0).toString();
                string.getClass();
                String string2 = qg8VarZ1.e0.toString();
                string2.getClass();
                String str = qg8VarZ1.w;
                if (str == null) {
                    Intrinsics.n("phone");
                    throw null;
                }
                PaymentChannel paymentChannel2 = (PaymentChannel) wwd0Var.getValue();
                paymentChannel2.getClass();
                String channelShowName2 = paymentChannel2.getChannelShowName();
                PaymentChannel paymentChannel3 = (PaymentChannel) wwd0Var.getValue();
                paymentChannel3.getClass();
                sswVar2.m(new vhg<>(new emj0.a(string2, string, str, channelShowName2, paymentChannel3.getPayChId())));
                sswVar.m(Boolean.FALSE);
                return;
        }
    }
}
