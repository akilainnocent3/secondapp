package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.sportypin.WithdrawalPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class ttj0 implements lfy<bi50<BaseResponse<xdp>>> {
    public final /* synthetic */ WithdrawalPinActivity a;

    public ttj0(WithdrawalPinActivity withdrawalPinActivity) {
        this.a = withdrawalPinActivity;
    }

    @Override // defpackage.lfy
    public final void u1(bi50<BaseResponse<xdp>> bi50Var) {
        bi50<BaseResponse<xdp>> bi50Var2 = bi50Var;
        WithdrawalPinActivity withdrawalPinActivity = this.a;
        if (withdrawalPinActivity.isFinishing()) {
            int i = WithdrawalPinActivity.g0;
            withdrawalPinActivity.B1();
            return;
        }
        if (bi50Var2 == null) {
            int i2 = WithdrawalPinActivity.g0;
            withdrawalPinActivity.B1();
            withdrawalPinActivity.z1(null);
            return;
        }
        BaseResponse<xdp> baseResponse = bi50Var2.b;
        if (!bi50Var2.a.getIsSuccessful() || baseResponse == null) {
            int i3 = WithdrawalPinActivity.g0;
            withdrawalPinActivity.B1();
            withdrawalPinActivity.z1(null);
            return;
        }
        int i4 = baseResponse.bizCode;
        if (i4 == 10000) {
            xtj0 xtj0Var = withdrawalPinActivity.c0;
            ema emaVarY1 = xtj0Var.y1();
            ct90 ct90VarB = xtj0Var.d.c(j6c.RESET_PIN, null, new k3g(xtj0Var, 3)).d(wm70.c).b(va0.a());
            vtj0 vtj0Var = new vtj0(xtj0Var);
            ct90VarB.a(vtj0Var);
            emaVarY1.b(vtj0Var);
            return;
        }
        if (i4 == 11708 || i4 == 11709) {
            int i5 = WithdrawalPinActivity.g0;
            withdrawalPinActivity.B1();
            withdrawalPinActivity.A1(baseResponse.message);
        } else {
            int i6 = WithdrawalPinActivity.g0;
            withdrawalPinActivity.B1();
            withdrawalPinActivity.z1(baseResponse.message);
        }
    }
}
