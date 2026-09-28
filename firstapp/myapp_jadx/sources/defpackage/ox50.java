package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.roulette.activities.RouletteActivity;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class ox50 implements gv5<BaseResponse<List<GameDetails>>> {
    public final /* synthetic */ RouletteActivity a;

    public ox50(RouletteActivity rouletteActivity) {
        this.a = rouletteActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<List<GameDetails>>> su5Var, Throwable th) {
        RouletteActivity rouletteActivity = this.a;
        rouletteActivity.o0 = true;
        rouletteActivity.n0.O(100);
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<List<GameDetails>>> su5Var, bi50<BaseResponse<List<GameDetails>>> bi50Var) {
        RouletteActivity rouletteActivity = this.a;
        rouletteActivity.o0 = true;
        rouletteActivity.W1();
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
        BaseResponse<List<GameDetails>> baseResponse = bi50Var.b;
        if (baseResponse.bizCode != 10000) {
            onFailure(su5Var, null);
            return;
        }
        List<GameDetails> list = baseResponse.data;
        if (list == null || list.size() <= 0) {
            return;
        }
        rouletteActivity.h0 = (ArrayList) baseResponse.data;
    }
}
