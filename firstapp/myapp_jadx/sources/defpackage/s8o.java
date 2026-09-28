package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.BetBuilderParameter;
import com.sportybet.android.instantwin.newtork.model.request.BuildAndGoTicketCreate;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.CreateEvent;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.InstantVirtualResponse;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.instantwin.newtork.model.response.Overall;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import com.sportybet.android.instantwin.newtork.model.response.TicketResult;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.NetworkBetslipRecommendation;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\bJ0\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0017\u0010\bJL\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001c\u0010\u001dJL\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001e\u0010\u001dJ,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b \u0010\bJ,\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b!\u0010\bJ?\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b%\u0010&J?\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b'\u0010&J)\u0010+\u001a\b\u0012\u0004\u0012\u00020*0#2\b\b\u0001\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b+\u0010,J*\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00142\b\b\u0001\u0010.\u001a\u00020-2\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b2\u00103J6\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b6\u00107J@\u00108\u001a\b\u0012\u0004\u0012\u0002050\u00142\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b8\u00109J8\u0010:\u001a\u0002052\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\b:\u00109J:\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u00150\u00142\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b=\u00107J4\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u00152\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b>\u00107Jt\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010?\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010@\u001a\u0004\u0018\u00010\u000f2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010B\u001a\u0004\u0018\u00010\u00182\n\b\u0001\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0001\u0010E\u001a\u0004\u0018\u00010C2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bH\u0010IJ$\u0010K\u001a\u00020G2\b\b\u0001\u0010J\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bK\u0010\bJ*\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020M2\b\b\u0001\u0010L\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bN\u0010\bJ$\u0010P\u001a\u00020O2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bP\u0010\bJ.\u0010R\u001a\u00020Q2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bR\u00107J&\u0010S\u001a\u0002052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bS\u0010\bJ&\u0010T\u001a\u0002052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bT\u0010\bJ$\u0010V\u001a\u0002052\b\b\u0001\u0010.\u001a\u00020U2\b\b\u0001\u00100\u001a\u00020/H§@¢\u0006\u0004\bV\u0010WJ.\u0010Y\u001a\u00020X2\b\b\u0001\u00104\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\bY\u00107¨\u0006ZÀ\u0006\u0003"}, d2 = {"Ls8o;", "", "", "sportyBetAccessToken", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "bizTypeTag", "", "b", "(Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/Overall;", "w", "(Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "sportId", "Lcom/sportybet/android/instantwin/newtork/model/response/Sports;", "t", "", "featureCode", "Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderConfig;", "C", "(Ljava/lang/String;ILcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lbi50;", "", "Lcom/sportybet/android/instantwin/newtork/model/response/MarketType;", "y", "", "forceNew", "filterTournament", "Lcom/sportybet/android/instantwin/newtork/model/response/CreateEvent;", "g", "(Ljava/lang/String;Ljava/lang/Boolean;IZLcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "o", "Lcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualResponse;", "x", "j", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lsu5;", "Lcom/sportybet/android/instantwin/newtork/model/response/EventData;", "s", "(Ljava/lang/String;Ljava/lang/String;ILcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;)Lsu5;", "f", "Lcom/sportybet/android/instantwin/newtork/model/request/BetBuilderParameter;", "betBuilderParameter", "Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderOutcome;", "l", "(Lcom/sportybet/android/instantwin/newtork/model/request/BetBuilderParameter;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;)Lsu5;", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;", "ticketParameter", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;", "tracking", "Lcom/sportybet/android/instantwin/newtork/model/response/TicketResult;", "a", "(Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "roundId", "Lcom/sportybet/android/instantwin/newtork/model/response/Round;", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "B", "(Ljava/lang/String;Ljava/lang/String;ILcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "v", "leagueId", "Lcom/sportybet/android/instantwin/newtork/model/response/EventInRound;", "m", "u", "lastId", "pageSize", "filterSettled", "filterWinning", "", "startTime", "endTime", "Lcom/sportybet/android/instantwin/newtork/model/PageData;", "Lcom/sportybet/android/instantwin/newtork/model/response/Ticket;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "ticketId", "q", "orderId", "Lcom/sporty/android/common/network/data/BaseResponse;", "i", "Lcom/sportybet/android/instantwin/newtork/model/response/leaguestats/NetworkInstantVirtualLeagueStatsEnvelop;", "p", "Lcom/sportybet/android/instantwin/newtork/model/response/heattoheadstats/NetworkInstantVirtualTeamStatsEnvelop;", "e", "n", "z", "Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate;", "A", "(Lcom/sportybet/android/instantwin/newtork/model/request/BuildAndGoTicketCreate;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/recommendation/NetworkBetslipRecommendation;", "r", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface s8o {
    @flz("instantwin/api/v1/iwqk/buildandgo/instant-bets")
    Object A(@jh4 BuildAndGoTicketCreate buildAndGoTicketCreate, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super Round> v1bVar);

    @gmz("instantwin/api/v2/iwqk/round/settle")
    @fae
    Object B(@db30("sportId") String str, @db30("roundId") String str2, @db30("featureCode") int i, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super bi50<Round>> v1bVar);

    @sbj("instantwin/api/v2/iw/config/bet_builder")
    Object C(@db30("sportId") String str, @db30("featureCode") int i, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BetBuilderConfig> v1bVar);

    @flz("instantwin/api/v2/iwqk/ticket/create")
    @fae
    Object a(@jh4 TicketParameter ticketParameter, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super bi50<TicketResult>> v1bVar);

    @sbj("instantwin/api/v1/iwqk/auth/userCheck")
    Object b(@rhl("x-auth-token") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Unit> v1bVar);

    @sbj("instantwin/api/v1/stats/team-stats")
    Object e(@db30("sportId") String str, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantVirtualTeamStatsEnvelop> v1bVar);

    @sbj("instantwin/api/v2/iwqk/event/details_without_login")
    @fae
    su5<EventData> f(@db30("sportId") String sportId, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String eventId, @db30("featureCode") int featureCode, @b4f0 InstantWinBizTypeTag bizTypeTag);

    @sbj("instantwin/api/v3/iwqk/event/prepare_round")
    @fae
    Object g(@db30("sportId") String str, @db30("forceNew") Boolean bool, @db30("featureCode") int i, @db30("filterTournament") boolean z, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<CreateEvent>> v1bVar);

    @sbj("instantwin/api/v2/iwqk/round/get/unsettled")
    @fae
    Object h(@db30("sportId") String str, @db30("roundId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<Round>> v1bVar);

    @sbj("instantwin/api/v1/iwqk/ticket/v2/ticketNumber")
    Object i(@db30("orderId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super BaseResponse<String>> v1bVar);

    @sbj("instantwin/api/v2/iwqk/event/list_all_with_popular_markets_non_login")
    @fae
    Object j(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<InstantVirtualResponse>> v1bVar);

    @sbj("instantwin/api/v2/iwqk/ticket/list")
    Object k(@db30("sportId") String str, @db30("lastId") String str2, @db30("pageSize") Integer num, @db30("filterSettled") String str3, @db30("filterWinning") Boolean bool, @db30("startTime") Long l, @db30("endTime") Long l2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super PageData<Ticket>> v1bVar);

    @flz("instantwin/api/v2/iwqk/event/create_bet_builder")
    @fae
    su5<BetBuilderOutcome> l(@jh4 BetBuilderParameter betBuilderParameter, @b4f0 InstantWinBizTypeTag bizTypeTag);

    @sbj("instantwin/api/v2/iwqk/round/list_settle_events")
    @fae
    Object m(@db30("roundId") String str, @db30("leagueId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<List<EventInRound>>> v1bVar);

    @sbj("instantwin/api/v1/iwqk/buildandgo/available-games")
    Object n(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Round> v1bVar);

    @sbj("instantwin/api/v3/iwqk/event/prepare_round_without_login")
    @fae
    Object o(@db30("sportId") String str, @db30("forceNew") Boolean bool, @db30("featureCode") int i, @db30("filterTournament") boolean z, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<CreateEvent>> v1bVar);

    @sbj("instantwin/api/v1/stats/league-table")
    Object p(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantVirtualLeagueStatsEnvelop> v1bVar);

    @sbj("instantwin/api/v1/iwqk/ticket/detail")
    Object q(@db30("ticketId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Ticket> v1bVar);

    @sbj("instantwin/api/v1/iwqk/recommendation/selections")
    Object r(@db30("roundId") String str, @db30("sportId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkBetslipRecommendation> v1bVar);

    @sbj("instantwin/api/v2/iwqk/event/details")
    @fae
    su5<EventData> s(@db30("sportId") String sportId, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String eventId, @db30("featureCode") int featureCode, @b4f0 InstantWinBizTypeTag bizTypeTag);

    @sbj("instantwin/api/v1/iw/config/sport")
    Object t(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Sports> v1bVar);

    @sbj("instantwin/api/v2/iwqk/round/list_settle_events")
    Object u(@db30("roundId") String str, @db30("leagueId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super List<EventInRound>> v1bVar);

    @gmz("instantwin/api/v2/iwqk/round/settle")
    Object v(@db30("sportId") String str, @db30("roundId") String str2, @db30("featureCode") int i, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super Round> v1bVar);

    @sbj("instantwin/api/v2/iw/config/overall")
    Object w(@b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Overall> v1bVar);

    @sbj("instantwin/api/v2/iwqk/event/list_all_with_popular_markets")
    @fae
    Object x(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<InstantVirtualResponse>> v1bVar);

    @sbj("instantwin/api/v1/iwqk/market/type/list")
    @fae
    Object y(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super bi50<List<MarketType>>> v1bVar);

    @sbj("instantwin/api/v1/iwqk/buildandgo/available-games-without-login")
    Object z(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Round> v1bVar);
}
