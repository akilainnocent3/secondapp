package defpackage;

import android.content.Intent;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.kepay.TransactionSuccessfulActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ijp implements gv5<BaseResponse<BankTradeData>> {
    public final /* synthetic */ int a;
    public final /* synthetic */ gjp b;

    public ijp(gjp gjpVar, int i) {
        this.b = gjpVar;
        this.a = i;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BankTradeData>> su5Var, Throwable th) {
        gjp gjpVar = this.b;
        e activity = gjpVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || gjpVar.isDetached() || this.a < 3 || gjpVar.R.isCanceled()) {
            return;
        }
        gjpVar.L.dismiss();
        gjpVar.p0(0, null);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BankTradeData>> su5Var, bi50<BaseResponse<BankTradeData>> bi50Var) {
        gjp gjpVar = this.b;
        AtomicBoolean atomicBoolean = gjpVar.S;
        e activity = gjpVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || atomicBoolean.get() || gjpVar.isDetached()) {
            return;
        }
        BaseResponse<BankTradeData> baseResponse = bi50Var.b;
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        int i = this.a;
        if (!isSuccessful || baseResponse == null || !baseResponse.hasData() || gjpVar.R.isCanceled()) {
            if (i >= 2) {
                gjpVar.L.dismiss();
                gjpVar.p0(1, baseResponse != null ? baseResponse.message : null);
                return;
            }
            return;
        }
        int i2 = baseResponse.data.status;
        if (i2 != 20) {
            if (i2 == 10) {
                if (i >= 3) {
                    gjpVar.L.dismiss();
                    gjpVar.p0(0, baseResponse.message);
                    return;
                }
                return;
            }
            gjpVar.L.dismiss();
            gjpVar.K.removeMessages(1);
            atomicBoolean.set(true);
            gjpVar.p0(1, baseResponse.message);
            return;
        }
        gjpVar.L.dismiss();
        gjpVar.K.removeMessages(1);
        atomicBoolean.set(true);
        e activity2 = gjpVar.getActivity();
        if (activity2 == null || activity2.isFinishing()) {
            return;
        }
        Intent intent = new Intent(activity2, (Class<?>) TransactionSuccessfulActivity.class);
        intent.putExtra("trade_id", gjpVar.I);
        intent.putExtra("phone_number", gjpVar.G);
        intent.putExtra("trade_amount", gjpVar.F.toString());
        intent.putExtra("transaction_type", 1);
        intent.putExtra("channel_icon_url", gjpVar.d0);
        activity2.startActivity(intent);
        activity2.finish();
    }
}
