package defpackage;

import android.util.SparseArray;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.roulette.activities.RouletteActivity;
import com.sportygames.roulette.data.Market;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class tx50 implements gv5<BaseResponse<List<Market>>> {
    public final /* synthetic */ RouletteActivity a;

    public tx50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<Market>>> su5Var, Throwable th) {
        RouletteActivity rouletteActivity = this.a;
        rouletteActivity.n0.O(100);
        rouletteActivity.E1();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<Market>>> su5Var, bi50<BaseResponse<List<Market>>> bi50Var) {
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
        BaseResponse<List<Market>> baseResponse = bi50Var.b;
        if (baseResponse.bizCode != 10000) {
            onFailure(su5Var, null);
            return;
        }
        int[] iArr = RouletteActivity.A0;
        rouletteActivity.W1();
        List<Market> list = baseResponse.data;
        if (list == null || list.size() <= 0) {
            return;
        }
        List<Market> list2 = baseResponse.data;
        rouletteActivity.C = list2;
        rouletteActivity.r0 = Market.getMinBetStake(list2);
        rouletteActivity.D = new SparseArray<>();
        for (Market market : rouletteActivity.C) {
            rouletteActivity.D.put(market.id, market);
        }
        if (rouletteActivity.B == null || rouletteActivity.C == null) {
            return;
        }
        rouletteActivity.v1();
    }
}
