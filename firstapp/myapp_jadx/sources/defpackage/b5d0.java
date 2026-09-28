package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyStatsMatchRecord;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyStatsTeamInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class b5d0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public static final g5d0 a(NetworkSportyPenaltyStatsTeamInfo networkSportyPenaltyStatsTeamInfo) {
        ?? arrayList;
        String teamName = networkSportyPenaltyStatsTeamInfo.getTeamName();
        if (teamName == null) {
            teamName = "";
        }
        String teamLogoUrl = networkSportyPenaltyStatsTeamInfo.getTeamLogoUrl();
        if (teamLogoUrl == null) {
            teamLogoUrl = "";
        }
        h5d0 h5d0Var = new h5d0(teamName, teamLogoUrl);
        float overallAvgScore = networkSportyPenaltyStatsTeamInfo.getOverallAvgScore();
        List<NetworkSportyPenaltyStatsMatchRecord> recentMatches = networkSportyPenaltyStatsTeamInfo.getRecentMatches();
        if (recentMatches != null) {
            arrayList = new ArrayList(l48.r(recentMatches, 10));
            for (NetworkSportyPenaltyStatsMatchRecord networkSportyPenaltyStatsMatchRecord : recentMatches) {
                networkSportyPenaltyStatsMatchRecord.getClass();
                int homeScore = networkSportyPenaltyStatsMatchRecord.getHomeScore();
                int awayScore = networkSportyPenaltyStatsMatchRecord.getAwayScore();
                String awayTeamLogoUrl = networkSportyPenaltyStatsMatchRecord.getAwayTeamLogoUrl();
                if (awayTeamLogoUrl == null) {
                    awayTeamLogoUrl = "";
                }
                arrayList.add(new c5d0(homeScore, awayScore, awayTeamLogoUrl));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new g5d0(h5d0Var, overallAvgScore, arrayList);
    }
}
