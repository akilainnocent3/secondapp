package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballActiveEvents;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballLeague;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchday;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
public final class vz60 {

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"vz60$a", "Lcom/google/gson/reflect/TypeToken;", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballLeague;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends NetworkScheduledFootballLeague>> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v4, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    public static final uz60 a(NetworkScheduledFootballActiveEvents networkScheduledFootballActiveEvents) {
        ?? arrayList;
        networkScheduledFootballActiveEvents.getClass();
        tcp value = networkScheduledFootballActiveEvents.getWrapLeagueMatchdayList().getValue();
        List list = null;
        bcp bcpVar = value instanceof bcp ? (bcp) value : null;
        List<NetworkScheduledFootballLeague> list2 = bcpVar != null ? (List) new eal().c(new yep(p5p.a(networkScheduledFootballActiveEvents.getWrapLeagueMatchdayList().getKeys(), bcpVar)), TypeToken.get(new a().getType())) : null;
        long receiveTime = networkScheduledFootballActiveEvents.getReceiveTime();
        long currentTime = networkScheduledFootballActiveEvents.getCurrentTime();
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
            for (NetworkScheduledFootballLeague networkScheduledFootballLeague : list2) {
                String leagueId = networkScheduledFootballLeague.getLeagueId();
                if (leagueId == null) {
                    leagueId = "";
                }
                String leagueName = networkScheduledFootballLeague.getLeagueName();
                if (leagueName == null) {
                    leagueName = "";
                }
                String leagueLogo = networkScheduledFootballLeague.getLeagueLogo();
                String str = leagueLogo != null ? leagueLogo : "";
                List<NetworkScheduledFootballMatchday> matchdays = networkScheduledFootballLeague.getMatchdays();
                if (matchdays != null) {
                    arrayList = new ArrayList(l48.r(matchdays, 10));
                    Iterator it = matchdays.iterator();
                    while (it.hasNext()) {
                        arrayList.add(g970.a((NetworkScheduledFootballMatchday) it.next(), leagueId));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = m2g.a;
                }
                arrayList2.add(new l770(leagueId, leagueName, str, arrayList));
            }
            list = arrayList2;
        }
        if (list == null) {
            list = m2g.a;
        }
        return new uz60(receiveTime, currentTime, list);
    }
}
