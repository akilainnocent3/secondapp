package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchdayResult;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchdayResultEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class j970 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static final h970 a(NetworkScheduledFootballMatchdayResult networkScheduledFootballMatchdayResult) {
        ?? arrayList;
        networkScheduledFootballMatchdayResult.getClass();
        int season = networkScheduledFootballMatchdayResult.getSeason();
        int matchday = networkScheduledFootballMatchdayResult.getMatchday();
        String leagueId = networkScheduledFootballMatchdayResult.getLeagueId();
        if (leagueId == null) {
            leagueId = "";
        }
        String leagueName = networkScheduledFootballMatchdayResult.getLeagueName();
        if (leagueName == null) {
            leagueName = "";
        }
        String leagueLogoUrl = networkScheduledFootballMatchdayResult.getLeagueLogoUrl();
        if (leagueLogoUrl == null) {
            leagueLogoUrl = "";
        }
        List<NetworkScheduledFootballMatchdayResultEvent> results = networkScheduledFootballMatchdayResult.getResults();
        if (results != null) {
            arrayList = new ArrayList(l48.r(results, 10));
            for (NetworkScheduledFootballMatchdayResultEvent networkScheduledFootballMatchdayResultEvent : results) {
                String eventId = networkScheduledFootballMatchdayResultEvent.getEventId();
                if (eventId == null) {
                    eventId = "";
                }
                String homeTeamName = networkScheduledFootballMatchdayResultEvent.getHomeTeamName();
                if (homeTeamName == null) {
                    homeTeamName = "";
                }
                String homeTeamLogoUrl = networkScheduledFootballMatchdayResultEvent.getHomeTeamLogoUrl();
                if (homeTeamLogoUrl == null) {
                    homeTeamLogoUrl = "";
                }
                String awayTeamName = networkScheduledFootballMatchdayResultEvent.getAwayTeamName();
                if (awayTeamName == null) {
                    awayTeamName = "";
                }
                String awayTeamLogoUrl = networkScheduledFootballMatchdayResultEvent.getAwayTeamLogoUrl();
                if (awayTeamLogoUrl == null) {
                    awayTeamLogoUrl = "";
                }
                String htScore = networkScheduledFootballMatchdayResultEvent.getHtScore();
                if (htScore == null) {
                    htScore = "";
                }
                String ftScore = networkScheduledFootballMatchdayResultEvent.getFtScore();
                arrayList.add(new i970(eventId, homeTeamName, homeTeamLogoUrl, awayTeamName, awayTeamLogoUrl, htScore, ftScore == null ? "" : ftScore));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        return new h970(season, matchday, leagueId, leagueName, leagueLogoUrl, arrayList);
    }
}
