package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.tournament.model.TournamentHistoryResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.TopWinResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\u0006JD\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00030\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\b\b\u0001\u0010\u0012\u001a\u00020\tH§@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00030\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lfjl;", "", "Lcom/sportygames/commons/remote/model/HTTPResponse;", "", "Lcom/sportygames/crash/remote/models/TopBets;", "b", "(Lv1b;)Ljava/lang/Object;", "c", "e", "", "sortBy", "", "offset", "limit", "timeRange", "Lcom/sportygames/crash/remote/models/TopWinResponse;", "a", "(Ljava/lang/String;IILjava/lang/String;Lv1b;)Ljava/lang/Object;", AnalyticsParam.EVENT_PARAM_ID, "d", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "", "Lcom/sportygames/commons/tournament/model/TournamentHistoryResponse;", "fetchTournamentHistory", "(JLv1b;)Ljava/lang/Object;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface fjl {
    @sbj("sporty-hero/v1/bet/top-wins")
    Object a(@db30("sortBy") String str, @db30("offset") int i, @db30("limit") int i2, @db30("timeRange") String str2, v1b<? super HTTPResponse<List<TopWinResponse>>> v1bVar);

    @sbj("sporty-hero/v2/bet/active-round-bets")
    Object b(v1b<? super HTTPResponse<List<TopBets>>> v1bVar);

    @sbj("sporty-hero/v2/bet/waiting-round-bets")
    Object c(v1b<? super HTTPResponse<List<TopBets>>> v1bVar);

    @sbj("sporty-hero/v1/bet/top-wins/{id}/details")
    Object d(@dxz(AnalyticsParam.EVENT_PARAM_ID) String str, v1b<? super HTTPResponse<TopWinResponse>> v1bVar);

    @sbj("sporty-hero/v1/odds/payout/under/fetchAll")
    Object e(v1b<? super HTTPResponse<Object>> v1bVar);

    @sbj("games-campaign/v1/tournament/user/history")
    Object fetchTournamentHistory(@db30("ids") long j, v1b<? super HTTPResponse<List<TournamentHistoryResponse>>> v1bVar);
}
