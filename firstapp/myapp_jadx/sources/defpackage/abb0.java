package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.model.request.PlaceBetPayload;
import com.sportygames.spinmatch.model.response.BetHistoryItem;
import com.sportygames.spinmatch.model.response.ChatRoomResponse;
import com.sportygames.spinmatch.model.response.DetailResponse;
import com.sportygames.spinmatch.model.response.GameAvailableResponse;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import com.sportygames.spinmatch.model.response.UserValidateResponse;
import com.sportygames.spinmatch.model.response.WalletInfoResponse;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H§@¢\u0006\u0004\b \u0010\u0005J&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\"\u0010\u0018¨\u0006#À\u0006\u0003"}, d2 = {"Labb0;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/spinmatch/model/response/WalletInfoResponse;", "walletInfo", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/spinmatch/model/response/GameAvailableResponse;", "isGameAvailable", "Lcom/sportygames/spinmatch/model/response/UserValidateResponse;", "userValidate", "Lcom/sportygames/spinmatch/model/response/DetailResponse;", "gameDetails", "", "offset", "limit", "", "Lcom/sportygames/spinmatch/model/response/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/spinmatch/model/response/ChatRoomResponse;", "getChatRoom", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/spinmatch/model/request/PlaceBetPayload;", EventKeys.PAYLOAD, "Lcom/sportygames/spinmatch/model/response/MatchPlaceBetResponse;", "a", "(Lcom/sportygames/spinmatch/model/request/PlaceBetPayload;Lv1b;)Ljava/lang/Object;", "b", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface abb0 {
    @flz("spin-match/v1/bet/placeBet")
    Object a(@jh4 PlaceBetPayload placeBetPayload, v1b<? super HTTPResponse<MatchPlaceBetResponse>> v1bVar);

    @flz("spin-match/v1/bet/rebet")
    Object b(@jh4 PlaceBetPayload placeBetPayload, v1b<? super HTTPResponse<MatchPlaceBetResponse>> v1bVar);

    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @sbj("spin-match/v1/game/details")
    Object gameDetails(v1b<? super HTTPResponse<DetailResponse>> v1bVar);

    @sbj("spin-match/v1/bet/userHistory/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("spin-match/v1/bet/userHistory")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("games-common/v1/chat-room/get")
    Object getChatRoom(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<List<ChatRoomResponse>>> v1bVar);

    @sbj("spin-match/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @sbj("spin-match/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<GameAvailableResponse>> v1bVar);

    @flz("spin-match/v1/user/validate")
    Object userValidate(v1b<? super HTTPResponse<UserValidateResponse>> v1bVar);

    @sbj("spin-match/v1/user/walletInfo")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfoResponse>> v1bVar);
}
