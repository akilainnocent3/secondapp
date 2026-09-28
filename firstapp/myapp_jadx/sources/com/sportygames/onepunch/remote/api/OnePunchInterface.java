package com.sportygames.onepunch.remote.api;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crashInitiated.model.request.PlaceBetPayload;
import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import com.sportygames.crashInitiated.model.response.GameAvailableResponse;
import com.sportygames.crashInitiated.model.response.UserValidateResponse;
import com.sportygames.crashInitiated.model.response.WalletInfoResponse;
import com.sportygames.crashInitiated.remote.models.ChatRoomResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.twilio.voice.EventKeys;
import defpackage.db30;
import defpackage.flz;
import defpackage.jh4;
import defpackage.sbj;
import defpackage.v1b;
import defpackage.znb;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH§@¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001a\u0010\u0018J \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0002H§@¢\u0006\u0004\b!\u0010\u0005J&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b#\u0010\u0018¨\u0006$À\u0006\u0003"}, d2 = {"Lcom/sportygames/onepunch/remote/api/OnePunchInterface;", "Lznb;", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/crashInitiated/model/response/WalletInfoResponse;", "walletInfo", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/crashInitiated/model/response/GameAvailableResponse;", "isGameAvailable", "Lcom/sportygames/crashInitiated/model/response/UserValidateResponse;", "userValidate", "Lcom/sportygames/crashInitiated/model/response/DetailResponse;", "gameDetails", "", "offset", "limit", "", "Lcom/sportygames/crashInitiated/model/response/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/crashInitiated/remote/models/ChatRoomResponse;", "getChatRoom", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/crashInitiated/model/response/CrashInitiatedCoeffListResponse;", "getCoeffList", "Lcom/sportygames/crashInitiated/model/request/PlaceBetPayload;", EventKeys.PAYLOAD, "Lcom/sportygames/crashInitiated/model/response/CrashInitiatedPlaceBetResponse;", "placeBet", "(Lcom/sportygames/crashInitiated/model/request/PlaceBetPayload;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OnePunchInterface extends znb {
    @Override // defpackage.znb
    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/game/details")
    Object gameDetails(v1b<? super HTTPResponse<DetailResponse>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/bet/userHistory/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/bet/userHistory")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.znb
    @sbj("games-common/v1/chat-room/get")
    Object getChatRoom(@db30(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT) String str, v1b<? super HTTPResponse<List<ChatRoomResponse>>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/bet/coefficient/latest")
    Object getCoeffList(@db30("limit") String str, v1b<? super HTTPResponse<List<CrashInitiatedCoeffListResponse>>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/game/isAvailable")
    Object isGameAvailable(v1b<? super HTTPResponse<GameAvailableResponse>> v1bVar);

    @Override // defpackage.znb
    @flz("one-punch/v1/bet/placeBet")
    Object placeBet(@jh4 PlaceBetPayload placeBetPayload, v1b<? super HTTPResponse<CrashInitiatedPlaceBetResponse>> v1bVar);

    @Override // defpackage.znb
    @flz("one-punch/v1/user/validate")
    Object userValidate(v1b<? super HTTPResponse<UserValidateResponse>> v1bVar);

    @Override // defpackage.znb
    @sbj("one-punch/v1/user/walletInfo")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfoResponse>> v1bVar);
}
