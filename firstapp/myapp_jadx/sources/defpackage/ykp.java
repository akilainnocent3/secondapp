package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import com.sportybet.android.kepay.withdraw.KeWithdrawActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ykp implements gv5<BaseResponse<BankTradeResponse>> {
    public final /* synthetic */ KeWithdrawActivity a;

    public ykp(KeWithdrawActivity keWithdrawActivity) {
        this.a = keWithdrawActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BankTradeResponse>> su5Var, Throwable th) {
        KeWithdrawActivity keWithdrawActivity = this.a;
        if (keWithdrawActivity.isFinishing() || keWithdrawActivity.D.isCanceled()) {
            return;
        }
        keWithdrawActivity.z1(0, keWithdrawActivity.getCMSString(R.string.page_withdraw__your_withdrawal_request_has_been_submitted_tip, new Object[0]));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BankTradeResponse>> su5Var, bi50<BaseResponse<BankTradeResponse>> bi50Var) {
        KeWithdrawActivity keWithdrawActivity = this.a;
        if (keWithdrawActivity.isFinishing() || keWithdrawActivity.D.isCanceled()) {
            return;
        }
        BaseResponse<BankTradeResponse> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            keWithdrawActivity.z1(ErrorCode.FAIL, null);
            return;
        }
        int i = baseResponse.bizCode;
        if (i != 10000) {
            keWithdrawActivity.z1(i, baseResponse.message);
            return;
        }
        BankTradeResponse bankTradeResponse = baseResponse.data;
        if (bankTradeResponse != null) {
            final String str = TextUtils.isEmpty(bankTradeResponse.tradeId) ? "" : baseResponse.data.tradeId;
            ((Handler) gpf0.a.getValue()).postDelayed(new Runnable() { // from class: xkp
                @Override // java.lang.Runnable
                public final void run() {
                    KeWithdrawActivity keWithdrawActivity2 = this.a.a;
                    int i2 = KeWithdrawActivity.Z;
                    if (keWithdrawActivity2.isFinishing()) {
                        return;
                    }
                    su5<BaseResponse<BankTradeData>> su5Var2 = keWithdrawActivity2.F;
                    if (su5Var2 != null) {
                        su5Var2.cancel();
                    }
                    pr10 pr10VarG = ap0.g();
                    String str2 = str;
                    su5<BaseResponse<BankTradeData>> su5VarD = pr10VarG.D(str2);
                    keWithdrawActivity2.F = su5VarD;
                    su5VarD.G(new b3k(keWithdrawActivity2, str2));
                }
            }, 2000L);
        }
    }
}
