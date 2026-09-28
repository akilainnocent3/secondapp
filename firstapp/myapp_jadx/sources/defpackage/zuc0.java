package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyOverallConfig;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySettleRound;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltySportConfig;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyStats;
import com.sportybet.android.instantwin.newtork.model.response.penalty.NetworkSportyPenaltyUserRound;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\bJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0014\u0010\bJ.\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0018J.\u0010\u0019\u001a\u00020\u00162\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0019\u0010\u0018J$\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u001d\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!À\u0006\u0003"}, d2 = {"Lzuc0;", "", "", "sportyBetAccessToken", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "bizTypeTag", "", "b", "(Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOverallConfig;", "c", "(Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "sportId", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltySportConfig;", "d", "", "forceNew", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyUserRound;", "f", "(Ljava/lang/String;ZLcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "g", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyStats;", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "h", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;", "ticketParameter", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;", "tracking", "Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltySettleRound;", "a", "(Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface zuc0 {
    @flz("instantwin/api/v1/instantbet/createAndSettle")
    Object a(@jh4 TicketParameter ticketParameter, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super NetworkSportyPenaltySettleRound> v1bVar);

    @sbj("instantwin/api/v1/iwqk/auth/userCheck")
    Object b(@rhl("x-auth-token") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Unit> v1bVar);

    @sbj("instantwin/api/v2/iw/config/overall")
    Object c(@b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyPenaltyOverallConfig> v1bVar);

    @sbj("instantwin/api/v1/iw/config/sport")
    Object d(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyPenaltySportConfig> v1bVar);

    @sbj("instantwin/api/v1/instantbet/team-stats")
    Object e(@db30("sportId") String str, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyPenaltyStats> v1bVar);

    @sbj("instantwin/api/v1/instantbet/prepareRound")
    Object f(@db30("sportId") String str, @db30("forceNew") boolean z, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyPenaltyUserRound> v1bVar);

    @sbj("instantwin/api/v1/instantbet/prepareRound_without_login")
    Object g(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyPenaltyUserRound> v1bVar);

    @sbj("instantwin/api/v1/instantbet/team-stats-without-login")
    Object h(@db30("sportId") String str, @db30(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID) String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkSportyPenaltyStats> v1bVar);
}
