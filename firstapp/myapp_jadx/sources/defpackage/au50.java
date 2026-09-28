package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pocketrocket.model.response.ActiveRoomResponse;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.BetHistoryItem;
import com.sportygames.pocketrocket.model.response.CurrentWaitingResponse;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import com.sportygames.pocketrocket.model.response.RecentRoundMultiplier;
import com.sportygames.pocketrocket.model.response.RoundDetailResponse;
import com.sportygames.pocketrocket.model.response.TopWinResponse;
import com.sportygames.pocketrocket.model.response.WalletInfo;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0002H§@¢\u0006\u0004\b\b\u0010\u0005J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H§@¢\u0006\u0004\b\n\u0010\u0005J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0005J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0005J&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00060\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00060\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00060\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H§@¢\u0006\u0004\b \u0010\u0005J \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00022\b\b\u0001\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b$\u0010%JD\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00060\u00022\b\b\u0001\u0010&\u001a\u00020\u00132\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010'\u001a\u00020\u0013H§@¢\u0006\u0004\b)\u0010*J0\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0018H§@¢\u0006\u0004\b+\u0010\u001dJ0\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0018H§@¢\u0006\u0004\b,\u0010\u001d¨\u0006-À\u0006\u0003"}, d2 = {"Lau50;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/pocketrocket/model/response/WalletInfo;", "walletInfo", "(Lv1b;)Ljava/lang/Object;", "", "Lcom/sportygames/pocketrocket/model/response/DetailResponse;", "gameDetails", "Lcom/sportygames/pocketrocket/model/response/ActiveRoomResponse;", "activeRoom", "Lcom/sportygames/pocketrocket/model/response/CurrentWaitingResponse;", "round", "Lcom/sportygames/pocketrocket/model/response/BetDetails;", "activeUserBets", "b", "c", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "", "offset", "limit", "Lcom/sportygames/pocketrocket/model/response/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", "Lcom/sportygames/pocketrocket/model/response/RecentRoundMultiplier;", "f", "", "roundId", "Lcom/sportygames/pocketrocket/model/response/RoundDetailResponse;", "g", "(JLv1b;)Ljava/lang/Object;", "sortBy", "timeRange", "Lcom/sportygames/pocketrocket/model/response/TopWinResponse;", "a", "(Ljava/lang/String;IILjava/lang/String;Lv1b;)Ljava/lang/Object;", "d", "e", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface au50 {
    @sbj("pocket-rockets/v2/bet/top-wins")
    Object a(@db30("sortBy") String str, @db30("offset") int i, @db30("limit") int i2, @db30("timeRange") String str2, v1b<? super HTTPResponse<List<TopWinResponse>>> v1bVar);

    @sbj("pocket-rockets/v1/user/active_room")
    Object activeRoom(v1b<? super HTTPResponse<ActiveRoomResponse>> v1bVar);

    @sbj("pocket-rockets/v2/bet/active-user-bets")
    Object activeUserBets(v1b<? super HTTPResponse<List<BetDetails>>> v1bVar);

    @sbj("pocket-rockets/v2/bet/active-round-bets")
    Object b(v1b<? super HTTPResponse<List<BetDetails>>> v1bVar);

    @sbj("pocket-rockets/v2/bet/waiting-round-bets")
    Object c(v1b<? super HTTPResponse<List<BetDetails>>> v1bVar);

    @sbj("pocket-rockets/v2/bet/user-bets")
    Object d(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetDetails>>> v1bVar);

    @sbj("pocket-rockets/v2/bet/archived-user-bets")
    Object e(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetDetails>>> v1bVar);

    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @sbj("pocket-rockets/v2/round/recent-round-multipliers")
    Object f(v1b<? super HTTPResponse<RecentRoundMultiplier>> v1bVar);

    @sbj("pocket-rockets/v2/round/{roundId}/bets-info")
    Object g(@dxz("roundId") long j, v1b<? super HTTPResponse<RoundDetailResponse>> v1bVar);

    @sbj("pocket-rockets/v2/game/details")
    Object gameDetails(v1b<? super HTTPResponse<List<DetailResponse>>> v1bVar);

    @sbj("pocket-rockets/v2/bet/history/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("pocket-rockets/v2/bet/history")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("pocket-rockets/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @sbj("pocket-rockets/v1/round/current-and-waiting")
    Object round(v1b<? super HTTPResponse<CurrentWaitingResponse>> v1bVar);

    @sbj("pocket-rockets/v1/user/wallet_info")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfo>> v1bVar);
}
