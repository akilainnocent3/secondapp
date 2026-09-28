package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pingpong.remote.models.BetHistoryItem;
import com.sportygames.pingpong.remote.models.BiggestResponse;
import com.sportygames.pingpong.remote.models.ChatRoomResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.FairnessResponse;
import com.sportygames.pingpong.remote.models.PreviousMultiplierResponse;
import com.sportygames.pingpong.remote.models.ProvablySettingRequest;
import com.sportygames.pingpong.remote.models.RoundResponse;
import com.sportygames.pingpong.remote.models.TopBets;
import com.sportygames.pingpong.remote.models.TopWinResponse;
import com.sportygames.pingpong.remote.models.WalletInfo;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005JD\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\n0\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001b\u0010\u001cJ:\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\n0\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u00132\b\b\u0001\u0010\u0016\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00022\b\b\u0001\u0010 \u001a\u00020\u0011H§@¢\u0006\u0004\b\"\u0010\u001cJ \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010$\u001a\u00020#H§@¢\u0006\u0004\b%\u0010&J0\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\n0\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H§@¢\u0006\u0004\b(\u0010)J0\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\n0\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H§@¢\u0006\u0004\b*\u0010)J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0002H§@¢\u0006\u0004\b,\u0010\u0005J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0002H§@¢\u0006\u0004\b.\u0010\u0005J&\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\n0\u00022\b\b\u0001\u0010/\u001a\u00020\u0011H§@¢\u0006\u0004\b1\u0010\u001c¨\u00062À\u0006\u0003"}, d2 = {"Lq510;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/pingpong/remote/models/DetailResponseData;", "gameDetails", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/pingpong/remote/models/RoundResponse;", "round", "Lcom/sportygames/pingpong/remote/models/PreviousMultiplierResponse;", "previousMultiplier", "", "Lcom/sportygames/pingpong/remote/models/TopBets;", "activeUserBets", "b", "c", "Lcom/sportygames/pingpong/remote/models/WalletInfo;", "walletInfo", "", "sortBy", "", "offset", "limit", "timeRange", "Lcom/sportygames/pingpong/remote/models/TopWinResponse;", "a", "(Ljava/lang/String;IILjava/lang/String;Lv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_ID, "d", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/pingpong/remote/models/BiggestResponse;", "biggestCoeff", "(IILjava/lang/String;Lv1b;)Ljava/lang/Object;", "roundId", "Lcom/sportygames/pingpong/remote/models/FairnessResponse;", "fairness", "Lcom/sportygames/pingpong/remote/models/ProvablySettingRequest;", "provablySettingRequest", "e", "(Lcom/sportygames/pingpong/remote/models/ProvablySettingRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/pingpong/remote/models/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", "Lcom/sportygames/pingpong/remote/models/ChatRoomResponse;", "getChatRoom", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface q510 {
    @sbj("ping-pong/v1/bet/top-wins")
    Object a(@db30("sortBy") String str, @db30("offset") int i, @db30("limit") int i2, @db30("timeRange") String str2, v1b<? super HTTPResponse<List<TopWinResponse>>> v1bVar);

    @sbj("ping-pong/v1/bet/active-user-bets")
    Object activeUserBets(v1b<? super HTTPResponse<List<TopBets>>> v1bVar);

    @sbj("ping-pong/v2/bet/active-round-bets")
    Object b(v1b<? super HTTPResponse<List<TopBets>>> v1bVar);

    @sbj("ping-pong/v1//bet/round-big-coefficient")
    Object biggestCoeff(@db30("offset") int i, @db30("limit") int i2, @db30("timeRange") String str, v1b<? super HTTPResponse<List<BiggestResponse>>> v1bVar);

    @sbj("ping-pong/v2/bet/waiting-round-bets")
    Object c(v1b<? super HTTPResponse<List<TopBets>>> v1bVar);

    @sbj("ping-pong/v1/bet/top-wins/{id}/details")
    Object d(@dxz(AnalyticsParam.EVENT_PARAM_ID) String str, v1b<? super HTTPResponse<TopWinResponse>> v1bVar);

    @gmz("ping-pong/v1/user/settings")
    Object e(@jh4 ProvablySettingRequest provablySettingRequest, v1b<? super HTTPResponse<String>> v1bVar);

    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @sbj("ping-pong/v1/round/{roundId}/seeds")
    Object fairness(@dxz("roundId") String str, v1b<? super HTTPResponse<FairnessResponse>> v1bVar);

    @sbj("ping-pong/v2/game/details")
    Object gameDetails(v1b<? super HTTPResponse<DetailResponseData>> v1bVar);

    @sbj("ping-pong/v1//bet/history/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("ping-pong/v1/bet/history")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("ping-pong/v1/user/active_room")
    Object getChatRoom(v1b<? super HTTPResponse<ChatRoomResponse>> v1bVar);

    @sbj("ping-pong/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @sbj("ping-pong/v1/round/previous-multipliers")
    Object previousMultiplier(v1b<? super HTTPResponse<PreviousMultiplierResponse>> v1bVar);

    @sbj("ping-pong/v1/round")
    Object round(v1b<? super HTTPResponse<RoundResponse>> v1bVar);

    @sbj("ping-pong/v1/user/wallet_info")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfo>> v1bVar);
}
