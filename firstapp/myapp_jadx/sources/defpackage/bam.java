package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.roulette.activities.HistoryActivity;
import com.sportygames.roulette.data.History;
import com.sportygames.roulette.data.HistoryResponse;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class bam implements gv5<BaseResponse<HistoryResponse>> {
    public final /* synthetic */ cam a;

    public bam(cam camVar) {
        this.a = camVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<HistoryResponse>> su5Var, Throwable th) {
        cam camVar = this.a;
        camVar.e = 3;
        camVar.a.setErrorViewData(3);
        camVar.notifyDataSetChanged();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<HistoryResponse>> su5Var, bi50<BaseResponse<HistoryResponse>> bi50Var) {
        HistoryResponse historyResponse;
        List<History> list;
        cam camVar = this.a;
        HistoryActivity historyActivity = camVar.a;
        Response response = bi50Var.a;
        if (!response.getIsSuccessful()) {
            int iCode = response.code();
            if (iCode == 401 || iCode == 403) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            } else {
                onFailure(su5Var, null);
                return;
            }
        }
        BaseResponse<HistoryResponse> baseResponse = bi50Var.b;
        if ((!(baseResponse != null) || !(baseResponse.bizCode == 10000)) || (historyResponse = baseResponse.data) == null || (list = historyResponse.list) == null) {
            return;
        }
        if (list.isEmpty()) {
            camVar.e = 2;
            historyActivity.setErrorViewData(1);
            camVar.notifyDataSetChanged();
        } else {
            camVar.e = 0;
            historyActivity.setErrorViewData(2);
            camVar.b.addAll(baseResponse.data.list);
            if (baseResponse.data.restNum == 0) {
                camVar.e = 2;
            }
            camVar.notifyDataSetChanged();
        }
    }
}
