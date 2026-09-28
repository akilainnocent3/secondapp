package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballLeagueStats;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballLeagueStatsTeamInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s770 {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    public static final r770 a(NetworkScheduledFootballLeagueStats networkScheduledFootballLeagueStats) {
        ?? arrayList;
        networkScheduledFootballLeagueStats.getClass();
        String leagueId = networkScheduledFootballLeagueStats.getLeagueId();
        if (leagueId == null) {
            leagueId = "";
        }
        String leagueName = networkScheduledFootballLeagueStats.getLeagueName();
        if (leagueName == null) {
            leagueName = "";
        }
        int season = networkScheduledFootballLeagueStats.getSeason();
        List<NetworkScheduledFootballLeagueStatsTeamInfo> values = networkScheduledFootballLeagueStats.getValues();
        if (values != null) {
            arrayList = new ArrayList(l48.r(values, 10));
            for (NetworkScheduledFootballLeagueStatsTeamInfo networkScheduledFootballLeagueStatsTeamInfo : values) {
                int pop = networkScheduledFootballLeagueStatsTeamInfo.getPop();
                String teamId = networkScheduledFootballLeagueStatsTeamInfo.getTeamId();
                if (teamId == null) {
                    teamId = "";
                }
                String teamName = networkScheduledFootballLeagueStatsTeamInfo.getTeamName();
                if (teamName == null) {
                    teamName = "";
                }
                String teamLogo = networkScheduledFootballLeagueStatsTeamInfo.getTeamLogo();
                if (teamLogo == null) {
                    teamLogo = "";
                }
                int played = networkScheduledFootballLeagueStatsTeamInfo.getPlayed();
                int won = networkScheduledFootballLeagueStatsTeamInfo.getWon();
                int draw = networkScheduledFootballLeagueStatsTeamInfo.getDraw();
                int lose = networkScheduledFootballLeagueStatsTeamInfo.getLose();
                int pts = networkScheduledFootballLeagueStatsTeamInfo.getPts();
                String trend = networkScheduledFootballLeagueStatsTeamInfo.getTrend();
                arrayList.add(new t770(pop, teamId, teamName, teamLogo, played, won, draw, lose, pts, trend == null ? "" : trend));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new r770(leagueId, leagueName, season, arrayList);
    }
}
