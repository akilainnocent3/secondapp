package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeague;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsLeaguesAndTeams;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsRecommendedMatch;
import com.sportybet.android.instantwin.newtork.model.response.legends.NetworkSportyLegendsTeam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class edc0 implements otk0 {
    public static final /* synthetic */ edc0 a = new edc0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public static final kdc0 a(NetworkSportyLegendsLeaguesAndTeams networkSportyLegendsLeaguesAndTeams) {
        ?? arrayList;
        ?? arrayList2;
        networkSportyLegendsLeaguesAndTeams.getClass();
        List<NetworkSportyLegendsLeague> legendLeaguesVOS = networkSportyLegendsLeaguesAndTeams.getLegendLeaguesVOS();
        ?? arrayList3 = 0;
        if (legendLeaguesVOS != null) {
            arrayList = new ArrayList(l48.r(legendLeaguesVOS, 10));
            for (NetworkSportyLegendsLeague networkSportyLegendsLeague : legendLeaguesVOS) {
                networkSportyLegendsLeague.getClass();
                String leagueId = networkSportyLegendsLeague.getLeagueId();
                if (leagueId == null) {
                    leagueId = "";
                }
                String iconUrl = networkSportyLegendsLeague.getIconUrl();
                if (iconUrl == null) {
                    iconUrl = "";
                }
                String leagueName = networkSportyLegendsLeague.getLeagueName();
                String str = leagueName != null ? leagueName : "";
                List<NetworkSportyLegendsTeam> teamVOS = networkSportyLegendsLeague.getTeamVOS();
                if (teamVOS != null) {
                    arrayList2 = new ArrayList(l48.r(teamVOS, 10));
                    Iterator it = teamVOS.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(b((NetworkSportyLegendsTeam) it.next()));
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = m2g.a;
                }
                arrayList.add(new ncc0(leagueId, str, iconUrl, arrayList2));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        List<NetworkSportyLegendsRecommendedMatch> recommendMatches = networkSportyLegendsLeaguesAndTeams.getRecommendMatches();
        if (recommendMatches != null) {
            arrayList3 = new ArrayList(l48.r(recommendMatches, 10));
            for (NetworkSportyLegendsRecommendedMatch networkSportyLegendsRecommendedMatch : recommendMatches) {
                networkSportyLegendsRecommendedMatch.getClass();
                enc0 enc0Var = new enc0("", "", "", "", false, 0, null);
                NetworkSportyLegendsTeam homeTeam = networkSportyLegendsRecommendedMatch.getHomeTeam();
                enc0 enc0VarB = homeTeam != null ? b(homeTeam) : enc0Var;
                NetworkSportyLegendsTeam awayTeam = networkSportyLegendsRecommendedMatch.getAwayTeam();
                if (awayTeam != null) {
                    enc0Var = b(awayTeam);
                }
                arrayList3.add(new lgc0(enc0VarB, enc0Var));
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = m2g.a;
        }
        return new kdc0(arrayList, arrayList3);
    }

    public static final enc0 b(NetworkSportyLegendsTeam networkSportyLegendsTeam) {
        int i;
        int i2;
        networkSportyLegendsTeam.getClass();
        String teamId = networkSportyLegendsTeam.getTeamId();
        String str = teamId == null ? "" : teamId;
        String leagueId = networkSportyLegendsTeam.getLeagueId();
        String str2 = leagueId == null ? "" : leagueId;
        String teamLogo = networkSportyLegendsTeam.getTeamLogo();
        String str3 = teamLogo == null ? "" : teamLogo;
        String teamName = networkSportyLegendsTeam.getTeamName();
        String str4 = teamName == null ? "" : teamName;
        Boolean boolIsLegend = networkSportyLegendsTeam.isLegend();
        boolean zBooleanValue = boolIsLegend != null ? boolIsLegend.booleanValue() : false;
        Integer star = networkSportyLegendsTeam.getStar();
        IntRange intRange = new IntRange(0, 20, 1);
        if (star == null || !intRange.e(star.intValue())) {
            IntRange intRange2 = new IntRange(21, 40, 1);
            if (star == null || !intRange2.e(star.intValue())) {
                IntRange intRange3 = new IntRange(41, 60, 1);
                if (star == null || !intRange3.e(star.intValue())) {
                    IntRange intRange4 = new IntRange(61, 80, 1);
                    if (star == null || !intRange4.e(star.intValue())) {
                        IntRange intRange5 = new IntRange(81, 100, 1);
                        if (star == null || !intRange5.e(star.intValue())) {
                            i = 0;
                        } else {
                            i2 = 5;
                        }
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
            i = i2;
        } else {
            i = 1;
        }
        StringUiText stringUiText = vch0.a;
        return new enc0(str, str4, str2, str3, zBooleanValue, i, b.k(new onc0(new ResourceUiText(R.string.page_instant_virtual__stats_popup_p), String.valueOf(networkSportyLegendsTeam.getPlayed()), false), new onc0(new ResourceUiText(R.string.page_instant_virtual__stats_popup_w), String.valueOf(networkSportyLegendsTeam.getWon()), false), new onc0(new ResourceUiText(R.string.page_instant_virtual__stats_popup_l), String.valueOf(networkSportyLegendsTeam.getLose()), false), new onc0(new ResourceUiText(R.string.page_instant_virtual__stats_popup_pts), String.valueOf(networkSportyLegendsTeam.getPts()), true)));
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Boolean.valueOf(((fpl0) epl0.b.a.a).zzb());
    }
}
