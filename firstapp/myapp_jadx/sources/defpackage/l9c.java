package defpackage;

import android.os.Looper;
import com.sportybet.feature.worldcup.tournament.data.model.GroupDto;
import com.sportybet.feature.worldcup.tournament.data.model.KnockoutMatchDto;
import com.sportybet.feature.worldcup.tournament.data.model.SlotDto;
import com.sportybet.feature.worldcup.tournament.data.model.StageDto;
import com.sportybet.feature.worldcup.tournament.data.model.StandingDto;
import com.sportybet.feature.worldcup.tournament.data.model.TeamDto;
import com.sportybet.feature.worldcup.tournament.data.model.TournamentGroupsResponseDto;
import com.sportybet.feature.worldcup.tournament.data.model.TournamentKnockoutsResponseDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class l9c {
    public static final m6g0 a(TournamentGroupsResponseDto tournamentGroupsResponseDto) {
        tournamentGroupsResponseDto.getClass();
        String tournamentId = tournamentGroupsResponseDto.getTournamentId();
        long lastUpdated = tournamentGroupsResponseDto.getLastUpdated();
        List listR0 = CollectionsKt.r0(tournamentGroupsResponseDto.getGroups(), new yag0());
        int i = 10;
        ArrayList arrayList = new ArrayList(l48.r(listR0, 10));
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            GroupDto groupDto = (GroupDto) it.next();
            groupDto.getClass();
            String groupId = groupDto.getGroupId();
            String name = groupDto.getName();
            int displayOrder = groupDto.getDisplayOrder();
            List listR1 = CollectionsKt.r0(groupDto.getStandings(), new zag0());
            ArrayList arrayList2 = new ArrayList(l48.r(listR1, i));
            for (Iterator it2 = listR1.iterator(); it2.hasNext(); it2 = it2) {
                StandingDto standingDto = (StandingDto) it2.next();
                standingDto.getClass();
                int position = standingDto.getPosition();
                TeamDto team = standingDto.getTeam();
                team.getClass();
                arrayList2.add(new g9f0(position, new bgg0(team.getId(), team.getName(), team.getCountryCode(), team.getAbbreviation()), standingDto.getMp(), standingDto.getW(), standingDto.getD(), standingDto.getL(), standingDto.getGf(), standingDto.getGa(), standingDto.getGd(), standingDto.getPts(), standingDto.getStillInTournament()));
                it = it;
            }
            arrayList.add(new l6g0(displayOrder, groupId, name, arrayList2));
            it = it;
            i = 10;
        }
        return new m6g0(lastUpdated, tournamentId, arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0118  */
    public static final n8g0 b(TournamentKnockoutsResponseDto tournamentKnockoutsResponseDto) {
        String upperCase;
        zqp zqpVar;
        String upperCase2;
        xqp xqpVar;
        tournamentKnockoutsResponseDto.getClass();
        String tournamentId = tournamentKnockoutsResponseDto.getTournamentId();
        long lastUpdated = tournamentKnockoutsResponseDto.getLastUpdated();
        List listR0 = CollectionsKt.r0(tournamentKnockoutsResponseDto.getStages(), new abg0());
        int i = 10;
        ArrayList arrayList = new ArrayList(l48.r(listR0, 10));
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            StageDto stageDto = (StageDto) it.next();
            stageDto.getClass();
            String stageId = stageDto.getStageId();
            String name = stageDto.getName();
            int order = stageDto.getOrder();
            String status = stageDto.getStatus();
            if (status != null) {
                upperCase = status.toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (upperCase == null) {
                zqpVar = zqp.d;
            } else {
                int iHashCode = upperCase.hashCode();
                if (iHashCode != -600583333) {
                    if (iHashCode != 1383663147) {
                        if (iHashCode == 2089318684 && upperCase.equals("UPCOMING")) {
                            zqpVar = zqp.a;
                        } else {
                            zqpVar = zqp.d;
                        }
                    } else if (upperCase.equals("COMPLETED")) {
                        zqpVar = zqp.c;
                    } else {
                        zqpVar = zqp.d;
                    }
                } else if (upperCase.equals("ONGOING")) {
                    zqpVar = zqp.b;
                } else {
                    zqpVar = zqp.d;
                }
            }
            List<KnockoutMatchDto> matches = stageDto.getMatches();
            ArrayList arrayList2 = new ArrayList(l48.r(matches, i));
            Iterator it2 = matches.iterator();
            while (it2.hasNext()) {
                KnockoutMatchDto knockoutMatchDto = (KnockoutMatchDto) it2.next();
                knockoutMatchDto.getClass();
                String matchSlotId = knockoutMatchDto.getMatchSlotId();
                String eventId = knockoutMatchDto.getEventId();
                int matchNumber = knockoutMatchDto.getMatchNumber();
                Long startTime = knockoutMatchDto.getStartTime();
                String status2 = knockoutMatchDto.getStatus();
                if (status2 != null) {
                    upperCase2 = status2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                } else {
                    upperCase2 = null;
                }
                if (upperCase2 != null) {
                    switch (upperCase2) {
                        case "PREMATCH":
                            xqpVar = xqp.c;
                            break;
                        case "TBD":
                            xqpVar = xqp.a;
                            break;
                        case "LIVE":
                            xqpVar = xqp.d;
                            break;
                        case "FINISHED":
                            xqpVar = xqp.e;
                            break;
                        case "UPCOMING":
                            xqpVar = xqp.b;
                            break;
                        default:
                            xqpVar = xqp.f;
                            break;
                    }
                } else {
                    xqpVar = xqp.f;
                }
                xqp xqpVar2 = xqpVar;
                SlotDto home = knockoutMatchDto.getHome();
                home.getClass();
                Iterator it3 = it;
                String placeholder = home.getPlaceholder();
                TeamDto team = home.getTeam();
                n7v n7vVar = new n7v(placeholder, team != null ? new bgg0(team.getId(), team.getName(), team.getCountryCode(), team.getAbbreviation()) : null);
                SlotDto away = knockoutMatchDto.getAway();
                away.getClass();
                String placeholder2 = away.getPlaceholder();
                TeamDto team2 = away.getTeam();
                arrayList2.add(new wqp(matchSlotId, eventId, matchNumber, startTime, xqpVar2, n7vVar, new n7v(placeholder2, team2 != null ? new bgg0(team2.getId(), team2.getName(), team2.getCountryCode(), team2.getAbbreviation()) : null), knockoutMatchDto.getHomeScore(), knockoutMatchDto.getAwayScore(), knockoutMatchDto.getPenaltyHomeScore(), knockoutMatchDto.getPenaltyAwayScore(), knockoutMatchDto.getNextSlotId()));
                it = it3;
                it2 = it2;
                zqpVar = zqpVar;
                stageId = stageId;
                name = name;
                order = order;
            }
            arrayList.add(new yqp(stageId, name, order, zqpVar, arrayList2));
            i = 10;
        }
        return new n8g0(lastUpdated, tournamentId, arrayList);
    }

    public static final boolean c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
