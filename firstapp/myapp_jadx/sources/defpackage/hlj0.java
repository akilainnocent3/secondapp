package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.pocket.common.BankTradeResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import com.sportybet.android.kepay.withdraw.a;

/* JADX INFO: loaded from: classes.dex */
public final class hlj0 implements gv5<BaseResponse<BankTradeResponse>> {
    public final /* synthetic */ a a;

    public hlj0(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BankTradeResponse>> su5Var, Throwable th) {
        a aVar = this.a;
        e activity = aVar.getActivity();
        if (activity == null || activity.isFinishing() || aVar.w.isCanceled() || aVar.isDetached()) {
            return;
        }
        aVar.j0(0, sn5.d(aVar, R.string.page_withdraw__your_withdrawal_request_has_been_submitted_tip, new Object[0]));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BankTradeResponse>> su5Var, bi50<BaseResponse<BankTradeResponse>> bi50Var) {
        a aVar = this.a;
        e activity = aVar.getActivity();
        if (activity == null || activity.isFinishing() || aVar.w.isCanceled()) {
            return;
        }
        BaseResponse<BankTradeResponse> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null) {
            aVar.j0(ErrorCode.FAIL, null);
            return;
        }
        int i = baseResponse.bizCode;
        if (i != 10000) {
            aVar.j0(i, baseResponse.message);
            return;
        }
        BankTradeResponse bankTradeResponse = baseResponse.data;
        if (bankTradeResponse != null) {
            final String str = TextUtils.isEmpty(bankTradeResponse.tradeId) ? "" : baseResponse.data.tradeId;
            ((Handler) gpf0.a.getValue()).postDelayed(new Runnable() { // from class: glj0
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar2 = this.a.a;
                    psm psmVar = a.B;
                    e activity2 = aVar2.getActivity();
                    if (activity2 == null || activity2.isFinishing() || aVar2.isDetached()) {
                        return;
                    }
                    su5<BaseResponse<BankTradeData>> su5Var2 = aVar2.y;
                    if (su5Var2 != null) {
                        su5Var2.cancel();
                    }
                    pr10 pr10VarG = ap0.g();
                    String str2 = str;
                    su5<BaseResponse<BankTradeData>> su5VarD = pr10VarG.D(str2);
                    aVar2.y = su5VarD;
                    su5VarD.G(new ilj0(aVar2, str2));
                }
            }, 2000L);
        }
    }
}
