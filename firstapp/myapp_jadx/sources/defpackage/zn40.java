package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.redblack.remote.models.BetHistoryItem;
import com.sportygames.redblack.remote.models.ChatRoomResponse;
import com.sportygames.redblack.remote.models.FetchBetAmountResponse;
import com.sportygames.redblack.remote.models.GameAvailableResponse;
import com.sportygames.redblack.remote.models.PlaceBetRequest;
import com.sportygames.redblack.remote.models.PlaceBetResponse;
import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import com.sportygames.redblack.remote.models.UserValidateResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0016\u0010\u0013J0\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00022\b\b\u0001\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0019\u001a\u00020\u0017H§@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H§@¢\u0006\u0004\b \u0010\u0005J&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u001a0\u00022\b\b\u0001\u0010!\u001a\u00020\u0015H§@¢\u0006\u0004\b#\u0010$J&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u001a0\u00022\b\b\u0001\u0010!\u001a\u00020\u0015H§@¢\u0006\u0004\b&\u0010$¨\u0006'À\u0006\u0003"}, d2 = {"Lzn40;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/redblack/remote/models/GameAvailableResponse;", "isGameAvailable", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/redblack/remote/models/UserValidateResponse;", "userValidate", "Lcom/sportygames/redblack/remote/models/RoundInitializeResponse;", "d", "Lcom/sportygames/redblack/remote/models/PlaceBetRequest;", "betRequest", "Lcom/sportygames/redblack/remote/models/PlaceBetResponse;", "b", "(Lcom/sportygames/redblack/remote/models/PlaceBetRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/redblack/remote/models/RoundRequest;", "roundRequest", "Lcom/sportygames/redblack/remote/models/FetchBetAmountResponse;", "c", "(Lcom/sportygames/redblack/remote/models/RoundRequest;Lv1b;)Ljava/lang/Object;", "", "", "a", "", "offset", "limit", "", "Lcom/sportygames/redblack/remote/models/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/redblack/remote/models/ChatRoomResponse;", "getChatRoom", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface zn40 {
    @flz("red-black/v1/round/end")
    Object a(@jh4 RoundRequest roundRequest, v1b<? super HTTPResponse<Map<String, String>>> v1bVar);

    @flz("red-black/v2/bet/placeBet")
    Object b(@jh4 PlaceBetRequest placeBetRequest, v1b<? super HTTPResponse<PlaceBetResponse>> v1bVar);

    @flz("red-black/v1/round/fetchBetAmount")
    Object c(@jh4 RoundRequest roundRequest, v1b<? super HTTPResponse<FetchBetAmountResponse>> v1bVar);

    @sbj("red-black/v1/round/initialize")
    Object d(v1b<? super HTTPResponse<RoundInitializeResponse>> v1bVar);

    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @sbj("red-black/v1/bet/bet_history/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("red-black/v1/bet/bet_history")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("games-common/v1/chat-room/get")
    Object getChatRoom(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<List<ChatRoomResponse>>> v1bVar);

    @sbj("red-black/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @sbj("red-black/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<GameAvailableResponse>> v1bVar);

    @flz("red-black/v1/user/validate")
    Object userValidate(v1b<? super HTTPResponse<UserValidateResponse>> v1bVar);
}
