package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsMatchRecord;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qgl {
    public static final i7v a(NetworkInstantVirtualTeamStatsMatchRecord networkInstantVirtualTeamStatsMatchRecord, String str) {
        i7v.a aVar;
        String homeTeamName;
        if (str == null) {
            return null;
        }
        boolean zG = Intrinsics.g(networkInstantVirtualTeamStatsMatchRecord.getHomeTeamId(), str);
        int homeScore = networkInstantVirtualTeamStatsMatchRecord.getHomeScore();
        int awayScore = networkInstantVirtualTeamStatsMatchRecord.getAwayScore();
        if (zG) {
            if (homeScore > awayScore) {
                aVar = i7v.a.WIN;
            } else {
                aVar = homeScore < awayScore ? i7v.a.LOSE : i7v.a.DRAW;
            }
        } else if (awayScore > homeScore) {
            aVar = i7v.a.WIN;
        } else {
            aVar = awayScore < homeScore ? i7v.a.LOSE : i7v.a.DRAW;
        }
        return new i7v(zG, aVar, (!zG ? (homeTeamName = networkInstantVirtualTeamStatsMatchRecord.getHomeTeamName()) == null : (homeTeamName = networkInstantVirtualTeamStatsMatchRecord.getAwayTeamName()) == null) ? homeTeamName : "", networkInstantVirtualTeamStatsMatchRecord.getHomeScore(), networkInstantVirtualTeamStatsMatchRecord.getAwayScore());
    }
}
