package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotData;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class w6p implements gv5<BaseResponse<JackpotData>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ r6p b;

    public w6p(r6p r6pVar, boolean z) {
        this.b = r6pVar;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<JackpotData>> su5Var, Throwable th) {
        if (su5Var.isCanceled()) {
            return;
        }
        r6p r6pVar = this.b;
        e activity = r6pVar.getActivity();
        if (activity == null || activity.isFinishing() || r6pVar.isDetached()) {
            r6pVar.a.E();
            r6pVar.j0(false);
        } else {
            r6pVar.a.I();
            r6pVar.j0(true);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<JackpotData>> su5Var, bi50<BaseResponse<JackpotData>> bi50Var) {
        BaseResponse<JackpotData> baseResponse;
        if (su5Var.isCanceled()) {
            return;
        }
        r6p r6pVar = this.b;
        e activity = r6pVar.getActivity();
        if (activity == null || activity.isFinishing() || r6pVar.isDetached()) {
            r6pVar.a.E();
            r6pVar.j0(false);
            return;
        }
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || baseResponse.data == null) {
            r6pVar.a.I();
            r6pVar.j0(true);
            return;
        }
        if (TextUtils.isEmpty(r6pVar.F) && !TextUtils.isEmpty(baseResponse.data.periodNumber)) {
            String str = baseResponse.data.periodNumber;
            r6pVar.F = str;
            r6pVar.E.setText(sn5.d(r6pVar, R.string.jackpot__round_index, str));
        }
        JackpotData jackpotData = baseResponse.data;
        r6pVar.w = jackpotData.status;
        r6pVar.z = jackpotData.winnings;
        r6pVar.y = jackpotData.elements;
        if (!this.a) {
            r6pVar.n0();
            r6pVar.a.E();
            r6pVar.j0(false);
        } else {
            su5<BaseResponse<List<String>>> su5Var2 = r6pVar.H;
            if (su5Var2 != null) {
                su5Var2.cancel();
            }
            su5<BaseResponse<List<String>>> su5VarE = r6pVar.b.e();
            r6pVar.H = su5VarE;
            su5VarE.G(new u6p(r6pVar));
        }
    }
}
