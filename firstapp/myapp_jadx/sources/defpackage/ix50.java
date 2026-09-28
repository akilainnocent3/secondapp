package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.roulette.activities.RouletteActivity;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class ix50 implements gv5<BaseResponse<List<Long>>> {
    public final /* synthetic */ RouletteActivity a;

    public ix50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<Long>>> su5Var, Throwable th) {
        RouletteActivity rouletteActivity = this.a;
        rouletteActivity.n0.O(100);
        rouletteActivity.E1();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<Long>>> su5Var, bi50<BaseResponse<List<Long>>> bi50Var) {
        Response response = bi50Var.a;
        boolean isSuccessful = response.getIsSuccessful();
        RouletteActivity rouletteActivity = this.a;
        if (!isSuccessful) {
            rouletteActivity.n0.O(100);
            int iCode = response.code();
            if (iCode == 401 || iCode == 403) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            } else {
                onFailure(su5Var, null);
                return;
            }
        }
        BaseResponse<List<Long>> baseResponse = bi50Var.b;
        if (baseResponse.bizCode != 10000) {
            onFailure(su5Var, null);
            return;
        }
        int[] iArr = RouletteActivity.A0;
        rouletteActivity.W1();
        List<Long> list = baseResponse.data;
        if (list == null || list.size() != 5) {
            return;
        }
        List<Long> list2 = baseResponse.data;
        rouletteActivity.B = list2;
        if (list2 == null || rouletteActivity.C == null) {
            return;
        }
        rouletteActivity.v1();
    }
}
