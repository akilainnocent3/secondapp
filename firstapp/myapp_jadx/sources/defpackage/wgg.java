package defpackage;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.evenodd.remote.models.BetHistoryItem;
import com.sportygames.evenodd.remote.models.ChatRoomResponse;
import com.sportygames.evenodd.remote.models.DetailResponse;
import com.sportygames.evenodd.remote.models.GameAvailableResponse;
import com.sportygames.evenodd.remote.models.PlaceBetRequest;
import com.sportygames.evenodd.remote.models.PlaceBetResponse;
import com.sportygames.evenodd.remote.models.UserValidateResponse;
import com.sportygames.evenodd.remote.models.WalletInfo;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0005J0\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H§@¢\u0006\u0004\b\u001a\u0010\u0019J&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00160\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b!\u0010\u001f¨\u0006\"À\u0006\u0003"}, d2 = {"Lwgg;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/evenodd/remote/models/GameAvailableResponse;", "isGameAvailable", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/evenodd/remote/models/UserValidateResponse;", "userValidate", "Lcom/sportygames/evenodd/remote/models/DetailResponse;", "gameDetails", "Lcom/sportygames/evenodd/remote/models/PlaceBetRequest;", "betRequest", "Lcom/sportygames/evenodd/remote/models/PlaceBetResponse;", "a", "(Lcom/sportygames/evenodd/remote/models/PlaceBetRequest;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/evenodd/remote/models/WalletInfo;", "walletInfo", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", "", "offset", "limit", "", "Lcom/sportygames/evenodd/remote/models/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/evenodd/remote/models/ChatRoomResponse;", "getChatRoom", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface wgg {
    @flz("even-odd/v1/bet/placeBet")
    Object a(@jh4 PlaceBetRequest placeBetRequest, v1b<? super HTTPResponse<PlaceBetResponse>> v1bVar);

    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @sbj("even-odd/v1/game/details")
    Object gameDetails(v1b<? super HTTPResponse<DetailResponse>> v1bVar);

    @sbj("even-odd/v1/bet/userHistory/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("even-odd/v1/bet/userHistory")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("games-common/v1/chat-room/get")
    Object getChatRoom(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<List<ChatRoomResponse>>> v1bVar);

    @sbj("even-odd/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @sbj("even-odd/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<GameAvailableResponse>> v1bVar);

    @flz("even-odd/v1/user/validate")
    Object userValidate(v1b<? super HTTPResponse<UserValidateResponse>> v1bVar);

    @sbj("even-odd/v1/user/walletInfo")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfo>> v1bVar);
}
