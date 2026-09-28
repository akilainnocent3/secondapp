package defpackage;

import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.roulette.data.AssetsInfo;
import com.sportygames.roulette.data.BetDetail;
import com.sportygames.roulette.data.BetResult;
import com.sportygames.roulette.data.HistoryResponse;
import com.sportygames.roulette.data.LastBet;
import com.sportygames.roulette.data.Market;
import com.sportygames.roulette.data.RoundInfo;
import com.sportygames.roulette.data.UserInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface no0 {
    @sbj("games/lobby/v1/exit-recommendations")
    su5<BaseResponse<List<GameDetails>>> a(@db30("game") String str);

    @sbj("highfreq/roulette/userInfo")
    su5<BaseResponse<UserInfo>> b();

    @flz("highfreq/roulette/bet")
    @gil({"Content-Type: application/json"})
    su5<BaseResponse<BetResult>> c(@jh4 String str);

    @sbj("highfreq/roulette/bethistory")
    su5<BaseResponse<HistoryResponse>> d(@db30("lastBetId") String str, @db30("limit") int i);

    @sbj("highfreq/roulette/lastBet")
    su5<BaseResponse<LastBet>> e();

    @sbj("highfreq/roulette/tokens")
    su5<BaseResponse<List<Long>>> f();

    @sbj("highfreq/roulette/betdetail")
    su5<BaseResponse<BetDetail>> g(@db30("betId") String str);

    @sbj("highfreq/roulette/markets")
    su5<BaseResponse<List<Market>>> h();

    @sbj("highfreq/roulette/bonusplan")
    su5<BaseResponse<List<RoundInfo>>> i();

    @sbj("pocket/v1/wallet/assetsInfo")
    su5<BaseResponse<AssetsInfo>> j();

    @sbj("pocket/v1/wallet/assetsInfo")
    su5<BaseResponse<AssetsInfo>> k(@db30("currency") String str);
}
