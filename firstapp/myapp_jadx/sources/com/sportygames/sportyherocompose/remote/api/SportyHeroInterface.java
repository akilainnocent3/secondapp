package com.sportygames.sportyherocompose.remote.api;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.BetHistoryItem;
import com.sportygames.crash.remote.models.BiggestResponse;
import com.sportygames.crash.remote.models.ChatRoomResponse;
import com.sportygames.crash.remote.models.DetailResponseData;
import com.sportygames.crash.remote.models.FairnessResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.ProvablySettingRequest;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.TopWinResponseV2;
import com.sportygames.crash.remote.models.WalletInfo;
import com.sportygames.lobby.remote.models.GameDetails;
import defpackage.db30;
import defpackage.dpb;
import defpackage.dxz;
import defpackage.gmz;
import defpackage.jh4;
import defpackage.sbj;
import defpackage.v1b;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H§@¢\u0006\u0004\b\t\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0005J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0002H§@¢\u0006\u0004\b \u0010\u0005J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0002H§@¢\u0006\u0004\b\"\u0010\u0005J0\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0004\b$\u0010%J0\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0004\b&\u0010%J&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\f0\u00022\b\b\u0001\u0010'\u001a\u00020\u0011H§@¢\u0006\u0004\b)\u0010\u001eJ \u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\b\b\u0001\u0010+\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J0\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0004\b.\u0010%J0\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0004\b/\u0010%JD\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\f0\u00022\b\b\u0001\u00100\u001a\u00020\u00112\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u00142\b\b\u0001\u0010\u0017\u001a\u00020\u0011H§@¢\u0006\u0004\b2\u00103J0\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0004\b4\u0010%J0\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\f0\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0016\u001a\u00020\u0014H§@¢\u0006\u0004\b5\u0010%¨\u00066À\u0006\u0003"}, d2 = {"Lcom/sportygames/sportyherocompose/remote/api/SportyHeroInterface;", "Ldpb;", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "Lcom/sportygames/crash/remote/models/DetailResponseData;", "gameDetails", "(Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/crash/remote/models/WalletInfo;", "walletInfo", "Lcom/sportygames/crash/remote/models/RoundResponse;", "round", "Lcom/sportygames/crash/remote/models/PreviousMultiplierResponse;", "previousMultiplier", "", "Lcom/sportygames/crash/remote/models/TopBets;", "activeUserBets", "Lcom/sportygames/crash/remote/models/ProvablySettingRequest;", "provablySettingRequest", "", "userSetting", "(Lcom/sportygames/crash/remote/models/ProvablySettingRequest;Lv1b;)Ljava/lang/Object;", "", "offset", "limit", "timeRange", "Lcom/sportygames/crash/remote/models/BiggestResponse;", "biggestCoeff", "(IILjava/lang/String;Lv1b;)Ljava/lang/Object;", "roundId", "Lcom/sportygames/crash/remote/models/FairnessResponse;", "fairness", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Lcom/sportygames/commons/models/PromotionGiftsResponse;", "getPromotionalGifts", "Lcom/sportygames/crash/remote/models/ChatRoomResponse;", "getChatRoom", "Lcom/sportygames/crash/remote/models/BetHistoryItem;", "getBetHistory", "(IILv1b;)Ljava/lang/Object;", "getArchiveBetHistory", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Lcom/sportygames/lobby/remote/models/GameDetails;", "exitRecommendation", "", AnalyticsParam.EVENT_PARAM_ID, "joinTournament", "(JLv1b;)Ljava/lang/Object;", "getBetOverUnderHistory", "getBetRangeHistory", "sortBy", "Lcom/sportygames/crash/remote/models/TopWinResponseV2;", "topWinsV2", "(Ljava/lang/String;IILjava/lang/String;Lv1b;)Ljava/lang/Object;", "getRangeArchiveBetHistory", "getOverUnderArchiveBetHistory", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SportyHeroInterface extends dpb {
    @sbj("sporty-hero/v1/user/active_room")
    /* synthetic */ Object activeRoom(v1b v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/bet/active-user-bets")
    Object activeUserBets(v1b<? super HTTPResponse<List<TopBets>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1//bet/round-big-coefficient")
    Object biggestCoeff(@db30("offset") int i, @db30("limit") int i2, @db30("timeRange") String str, v1b<? super HTTPResponse<List<BiggestResponse>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("lobby/v1/exit-recommendations")
    Object exitRecommendation(@db30("game") String str, v1b<? super HTTPResponse<List<GameDetails>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/round/{roundId}/seeds")
    Object fairness(@dxz("roundId") String str, v1b<? super HTTPResponse<FairnessResponse>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v3/game/details")
    Object gameDetails(v1b<? super HTTPResponse<DetailResponseData>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/bet/history/archived")
    Object getArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/bet/history")
    Object getBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/bet/over-under/history")
    Object getBetOverUnderHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/bet/range/history")
    Object getBetRangeHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/user/active_room")
    Object getChatRoom(v1b<? super HTTPResponse<ChatRoomResponse>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1//bet/over-under/history/archived")
    Object getOverUnderArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/promotion/gifts")
    Object getPromotionalGifts(v1b<? super HTTPResponse<PromotionGiftsResponse>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1//bet/history/archived")
    Object getRangeArchiveBetHistory(@db30("offset") int i, @db30("limit") int i2, v1b<? super HTTPResponse<List<BetHistoryItem>>> v1bVar);

    @sbj("games-campaign/v1/tournament/{TournamentId}/join")
    Object joinTournament(@dxz("TournamentId") long j, v1b<? super HTTPResponse<String>> v1bVar);

    @sbj
    /* synthetic */ Object joinTournament(v1b v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/round/previous-multipliers")
    Object previousMultiplier(v1b<? super HTTPResponse<PreviousMultiplierResponse>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/round")
    Object round(v1b<? super HTTPResponse<RoundResponse>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/bet/top-wins")
    Object topWinsV2(@db30("sortBy") String str, @db30("offset") int i, @db30("limit") int i2, @db30("timeRange") String str2, v1b<? super HTTPResponse<List<TopWinResponseV2>>> v1bVar);

    @Override // defpackage.dpb
    @gmz("sporty-hero/v1/user/settings")
    Object userSetting(@jh4 ProvablySettingRequest provablySettingRequest, v1b<? super HTTPResponse<String>> v1bVar);

    @Override // defpackage.dpb
    @sbj("sporty-hero/v1/user/wallet_info")
    Object walletInfo(v1b<? super HTTPResponse<WalletInfo>> v1bVar);
}
