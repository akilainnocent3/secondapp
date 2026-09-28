package defpackage;

import android.app.Dialog;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import com.sportybet.android.kepay.withdraw.a;

/* JADX INFO: loaded from: classes.dex */
public final class ilj0 implements gv5<BaseResponse<BankTradeData>> {
    public final /* synthetic */ String a;
    public final /* synthetic */ a b;

    public ilj0(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BankTradeData>> su5Var, Throwable th) {
        a aVar = this.b;
        e activity = aVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || aVar.isDetached()) {
            return;
        }
        aVar.j0(0, null);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BankTradeData>> su5Var, bi50<BaseResponse<BankTradeData>> bi50Var) {
        a aVar = this.b;
        e activity = aVar.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || aVar.isDetached()) {
            return;
        }
        BaseResponse<BankTradeData> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null || !baseResponse.hasData()) {
            aVar.j0(ErrorCode.FAIL, null);
            return;
        }
        int i = baseResponse.data.status;
        if (i == 10) {
            aVar.j0(0, null);
            return;
        }
        if (i != 20) {
            aVar.j0(ErrorCode.FAIL, baseResponse.message);
            return;
        }
        e activity2 = aVar.getActivity();
        if (activity2 == null || activity2.isFinishing() || aVar.isDetached()) {
            return;
        }
        aVar.b.setLoading(false);
        Dialog dialog = aVar.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
        aVar.a.setEnabled(true);
        a.C0350a c0350a = aVar.A;
        if (c0350a != null) {
            c0350a.f(false);
        }
        a.b bVar = aVar.z;
        if (bVar != null) {
            bVar.m0(this.a);
        }
    }
}
