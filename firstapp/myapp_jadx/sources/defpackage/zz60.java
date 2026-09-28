package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballActiveEvents;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballConfig;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballEventResultEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballHeadToHeadStats;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballLeagueStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballMatchdayResult;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBets;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballOpenBetsCountInfo;
import com.sportybet.android.instantwin.newtork.model.response.scheduledfootball.NetworkScheduledFootballTicket;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\tJH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0018\u0010\u0015J4\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001b\u0010\u0015J*\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00062\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"J*\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b$\u0010\tJ*\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b&\u0010\tJn\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\r2\b\b\u0001\u0010(\u001a\u00020\u00022\b\b\u0001\u0010*\u001a\u00020)2\b\b\u0001\u0010,\u001a\u00020+2\b\b\u0001\u0010-\u001a\u00020+2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b1\u00102J*\u00104\u001a\b\u0012\u0004\u0012\u0002000\u00062\b\b\u0001\u00103\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b4\u0010\t¨\u00065À\u0006\u0003"}, d2 = {"Lzz60;", "", "", "sportId", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "bizTypeTag", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballConfig;", "e", "(Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballActiveEvents;", "h", "leagueId", "", "season", "day", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballEventResultEnvelop;", "g", "(Ljava/lang/String;Ljava/lang/String;IILcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballLeagueStatsEnvelop;", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballMatchdayResult;", "d", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballHeadToHeadStats;", "f", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;", "ticketParameter", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;", "tracking", "", "a", "(Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBets;", "b", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballOpenBetsCountInfo;", "j", "pageSize", "filterSettled", "", "filterWinning", "", "startTimestampMillis", "endTimestampMillis", "lastId", "Lcom/sportybet/android/instantwin/newtork/model/PageData;", "Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballTicket;", "i", "(Ljava/lang/String;ILjava/lang/String;ZJJLjava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "ticketId", "k", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface zz60 {
    @flz("scheduledFootball/api/v1/ticket/create")
    Object a(@jh4 TicketParameter ticketParameter, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super BaseResponse<Unit>> v1bVar);

    @sbj("scheduledFootball/api/v1/ticket/openbets")
    Object b(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballOpenBets>> v1bVar);

    @sbj("scheduledFootball/api/v1/stats/league-table")
    Object c(@db30("sportId") String str, @db30("leagueId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballLeagueStatsEnvelop>> v1bVar);

    @sbj("scheduledFootball/api/v1/stats/match-result")
    Object d(@db30("sportId") String str, @db30("leagueId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<List<NetworkScheduledFootballMatchdayResult>>> v1bVar);

    @sbj("scheduledFootball/api/v1/config")
    Object e(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballConfig>> v1bVar);

    @sbj("scheduledFootball/api/v1/stats/team-stats")
    Object f(@db30("sportId") String str, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballHeadToHeadStats>> v1bVar);

    @sbj("scheduledFootball/api/v1/event/result")
    Object g(@db30("sportId") String str, @db30("leagueId") String str2, @db30("season") int i, @db30("matchday") int i2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballEventResultEnvelop>> v1bVar);

    @sbj("scheduledFootball/api/v1/event/active")
    Object h(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballActiveEvents>> v1bVar);

    @sbj("scheduledFootball/api/v1/ticket")
    Object i(@db30("sportId") String str, @db30("pageSize") int i, @db30("filterSettled") String str2, @db30("filterWinning") boolean z, @db30("startTime") long j, @db30("endTime") long j2, @db30("lastId") String str3, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<PageData<NetworkScheduledFootballTicket>>> v1bVar);

    @sbj("scheduledFootball/api/v1/ticket/openbets/count")
    Object j(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballOpenBetsCountInfo>> v1bVar);

    @sbj("scheduledFootball/api/v1/ticket/detail")
    Object k(@db30("ticketId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<NetworkScheduledFootballTicket>> v1bVar);
}
