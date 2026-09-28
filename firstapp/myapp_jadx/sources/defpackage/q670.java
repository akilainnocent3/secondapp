package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballHeadToHeadStats;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballHeadToHeadStatsMatchRecord;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballHeadToHeadStatsPreviousMeeting;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballHeadToHeadStatsTeamInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class q670 {
    public static volatile on50 a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public static final a670 a(NetworkScheduledFootballHeadToHeadStats networkScheduledFootballHeadToHeadStats) {
        networkScheduledFootballHeadToHeadStats.getClass();
        NetworkScheduledFootballHeadToHeadStatsTeamInfo homeTeam = networkScheduledFootballHeadToHeadStats.getHomeTeam();
        ?? arrayList = 0;
        if (homeTeam == null) {
            return null;
        }
        v670 v670VarC = c(homeTeam);
        NetworkScheduledFootballHeadToHeadStatsTeamInfo awayTeam = networkScheduledFootballHeadToHeadStats.getAwayTeam();
        if (awayTeam == null) {
            return null;
        }
        v670 v670VarC2 = c(awayTeam);
        NetworkScheduledFootballHeadToHeadStatsPreviousMeeting headToHead = networkScheduledFootballHeadToHeadStats.getHeadToHead();
        if (headToHead == null) {
            return null;
        }
        int homeTeamWins = headToHead.getHomeTeamWins();
        int awayTeamWins = headToHead.getAwayTeamWins();
        int draws = headToHead.getDraws();
        List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> matches = headToHead.getMatches();
        if (matches != null) {
            arrayList = new ArrayList(l48.r(matches, 10));
            Iterator it = matches.iterator();
            while (it.hasNext()) {
                arrayList.add(b((NetworkScheduledFootballHeadToHeadStatsMatchRecord) it.next()));
            }
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new a670(v670VarC, v670VarC2, new s670(homeTeamWins, awayTeamWins, draws, arrayList));
    }

    public static final r670 b(NetworkScheduledFootballHeadToHeadStatsMatchRecord networkScheduledFootballHeadToHeadStatsMatchRecord) {
        String homeTeamId = networkScheduledFootballHeadToHeadStatsMatchRecord.getHomeTeamId();
        if (homeTeamId == null) {
            homeTeamId = "";
        }
        String homeTeamName = networkScheduledFootballHeadToHeadStatsMatchRecord.getHomeTeamName();
        if (homeTeamName == null) {
            homeTeamName = "";
        }
        String homeTeamLogoUrl = networkScheduledFootballHeadToHeadStatsMatchRecord.getHomeTeamLogoUrl();
        if (homeTeamLogoUrl == null) {
            homeTeamLogoUrl = "";
        }
        int homeScore = networkScheduledFootballHeadToHeadStatsMatchRecord.getHomeScore();
        String awayTeamId = networkScheduledFootballHeadToHeadStatsMatchRecord.getAwayTeamId();
        if (awayTeamId == null) {
            awayTeamId = "";
        }
        String awayTeamName = networkScheduledFootballHeadToHeadStatsMatchRecord.getAwayTeamName();
        if (awayTeamName == null) {
            awayTeamName = "";
        }
        String awayTeamLogoUrl = networkScheduledFootballHeadToHeadStatsMatchRecord.getAwayTeamLogoUrl();
        return new r670(homeTeamId, homeTeamName, homeTeamLogoUrl, homeScore, awayTeamId, awayTeamName, awayTeamLogoUrl != null ? awayTeamLogoUrl : "", networkScheduledFootballHeadToHeadStatsMatchRecord.getAwayScore());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [m2g] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    public static final v670 c(NetworkScheduledFootballHeadToHeadStatsTeamInfo networkScheduledFootballHeadToHeadStatsTeamInfo) {
        ?? arrayList;
        String teamId = networkScheduledFootballHeadToHeadStatsTeamInfo.getTeamId();
        String str = teamId == null ? "" : teamId;
        String teamName = networkScheduledFootballHeadToHeadStatsTeamInfo.getTeamName();
        String str2 = teamName == null ? "" : teamName;
        String teamLogoUrl = networkScheduledFootballHeadToHeadStatsTeamInfo.getTeamLogoUrl();
        String str3 = teamLogoUrl == null ? "" : teamLogoUrl;
        int probability = networkScheduledFootballHeadToHeadStatsTeamInfo.getProbability();
        float homeAvgScore = networkScheduledFootballHeadToHeadStatsTeamInfo.getHomeAvgScore();
        float awayAvgScore = networkScheduledFootballHeadToHeadStatsTeamInfo.getAwayAvgScore();
        float overallAvgScore = networkScheduledFootballHeadToHeadStatsTeamInfo.getOverallAvgScore();
        List<NetworkScheduledFootballHeadToHeadStatsMatchRecord> recentMatches = networkScheduledFootballHeadToHeadStatsTeamInfo.getRecentMatches();
        if (recentMatches != null) {
            arrayList = new ArrayList(l48.r(recentMatches, 10));
            Iterator it = recentMatches.iterator();
            while (it.hasNext()) {
                arrayList.add(b((NetworkScheduledFootballHeadToHeadStatsMatchRecord) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new v670(str, str2, str3, probability, homeAvgScore, awayAvgScore, overallAvgScore, arrayList);
    }
}
