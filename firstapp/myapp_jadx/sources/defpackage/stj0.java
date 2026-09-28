package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.sportypin.WithdrawalPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class stj0 implements lfy<BaseResponse<xdp>> {
    public final /* synthetic */ WithdrawalPinActivity a;

    public stj0(WithdrawalPinActivity withdrawalPinActivity) {
        this.a = withdrawalPinActivity;
    }

    @Override // defpackage.lfy
    public final void u1(BaseResponse<xdp> baseResponse) {
        final int i;
        final String str;
        final BaseResponse<xdp> baseResponse2 = baseResponse;
        if (baseResponse2 == null) {
            i = 30000;
            str = null;
        } else {
            i = baseResponse2.bizCode;
            str = baseResponse2.message;
        }
        en8 en8Var = new en8() { // from class: rtj0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.en8
            public final void a() {
                WithdrawalPinActivity withdrawalPinActivity = this.a.a;
                int i2 = i;
                String str2 = str;
                if (i2 != 10000) {
                    int i3 = WithdrawalPinActivity.g0;
                    withdrawalPinActivity.P1(str2);
                    return;
                }
                T t = baseResponse2.data;
                if (t != 0) {
                    withdrawalPinActivity.R = lal.b((xdp) t, "pinToken");
                    withdrawalPinActivity.E1();
                } else {
                    int i4 = WithdrawalPinActivity.g0;
                    withdrawalPinActivity.P1(str2);
                }
            }
        };
        int i2 = WithdrawalPinActivity.g0;
        this.a.H1(en8Var);
    }
}
