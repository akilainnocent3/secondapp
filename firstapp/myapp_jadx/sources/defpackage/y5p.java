package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class y5p implements gv5<BaseResponse<JackpotData>> {
    public final /* synthetic */ x5p a;

    public y5p(x5p x5pVar) {
        this.a = x5pVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<JackpotData>> su5Var, Throwable th) {
        x5p x5pVar;
        e activity;
        if (su5Var.isCanceled() || (activity = (x5pVar = this.a).getActivity()) == null || activity.isFinishing() || x5pVar.isDetached()) {
            return;
        }
        x5pVar.v.setVisibility(4);
        x5pVar.f.I();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<JackpotData>> su5Var, bi50<BaseResponse<JackpotData>> bi50Var) {
        e activity;
        BaseResponse<JackpotData> baseResponse;
        JackpotData jackpotData;
        x5p x5pVar = this.a;
        ArrayList arrayList = x5pVar.z;
        if (su5Var.isCanceled() || (activity = x5pVar.getActivity()) == null || activity.isFinishing() || x5pVar.isDetached()) {
            return;
        }
        if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null && (jackpotData = baseResponse.data) != null) {
            JackpotData jackpotData2 = jackpotData;
            if (jackpotData2.elements != null) {
                x5pVar.A = jackpotData2.periodNumber;
                arrayList.clear();
                arrayList.addAll(baseResponse.data.elements);
                if (baseResponse.data.status != 1) {
                    x5pVar.u0(2);
                }
                x5pVar.v.setVisibility(0);
                irj irjVar = x5pVar.w;
                if (irjVar == null) {
                    irj irjVar2 = new irj();
                    irjVar2.a = arrayList;
                    x5pVar.w = irjVar2;
                    irjVar2.b = x5pVar;
                    x5pVar.v.setAdapter(irjVar2);
                } else {
                    irjVar.a = arrayList;
                    irjVar.notifyDataSetChanged();
                }
                x5pVar.G.setVisibility(arrayList.size() == 0 ? 0 : 8);
                x5pVar.B.setText(sn5.d(x5pVar, R.string.common_functions__round_no, baseResponse.data.periodNumber));
                x5pVar.C0();
                x5pVar.f.E();
                return;
            }
        }
        x5pVar.v.setVisibility(8);
        x5pVar.f.I();
    }
}
