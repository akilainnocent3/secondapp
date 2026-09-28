package com.sportygames.campaign.remote;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.campaign.data.model.TournamentHistoryResponse;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.common.framework.network.HTTPResponse;
import defpackage.db30;
import defpackage.dxz;
import defpackage.sbj;
import defpackage.v1b;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\u0007¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/sportygames/campaign/remote/TournamentInterface;", "", "", AnalyticsParam.EVENT_PARAM_ID, "Lcom/sportygames/common/framework/network/HTTPResponse;", "", "joinTournament", "(JLv1b;)Ljava/lang/Object;", "Lcom/sportygames/campaign/data/model/TournamentRankListResponse;", "fetchTournamentRankList", "", "Lcom/sportygames/campaign/data/model/TournamentHistoryResponse;", "fetchTournamentHistory", "campaign_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TournamentInterface {
    @sbj("games-campaign/v1/tournament/user/history")
    Object fetchTournamentHistory(@db30("ids") long j, v1b<? super HTTPResponse<List<TournamentHistoryResponse>>> v1bVar);

    @sbj("games-campaign/v1/tournament/{TournamentId}/fetch-leaderboard-data")
    Object fetchTournamentRankList(@dxz("TournamentId") long j, v1b<? super HTTPResponse<TournamentRankListResponse>> v1bVar);

    @sbj("games-campaign/v1/tournament/{TournamentId}/join")
    Object joinTournament(@dxz("TournamentId") long j, v1b<? super HTTPResponse<String>> v1bVar);
}
