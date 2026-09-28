package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.sportypin.WithdrawalPinActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class qtj0 implements en8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseResponse b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WithdrawalPinActivity d;

    public qtj0(WithdrawalPinActivity withdrawalPinActivity, int i, BaseResponse baseResponse, String str) {
        this.d = withdrawalPinActivity;
        this.a = i;
        this.b = baseResponse;
        this.c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.en8
    public final void a() {
        int i = this.a;
        String str = this.c;
        WithdrawalPinActivity withdrawalPinActivity = this.d;
        if (i != 10000) {
            int i2 = WithdrawalPinActivity.g0;
            withdrawalPinActivity.P1(str);
            return;
        }
        T t = this.b.data;
        if (t == 0) {
            int i3 = WithdrawalPinActivity.g0;
            withdrawalPinActivity.P1(str);
        } else {
            String strB = lal.b((xdp) t, "pinToken");
            withdrawalPinActivity.R = strB;
            withdrawalPinActivity.S = strB;
            withdrawalPinActivity.D1();
        }
    }
}
