package defpackage;

import com.sportybet.android.instantwin.newtork.model.PageData;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingEventInfo;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingMarketInfo;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingOverallConfig;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingRoundInfo;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSettleRound;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingSportConfig;
import com.sportybet.android.instantwin.newtork.model.response.racing.NetworkInstantRacingTicket;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\bJ.\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\u00020\u00152\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001a\u0010\bJ$\u0010\u001b\u001a\u00020\u00192\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001b\u0010\bJ$\u0010!\u001a\u00020 2\b\b\u0001\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b!\u0010\"J^\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010$\u001a\u00020#2\b\b\u0001\u0010%\u001a\u00020\u00132\b\b\u0001\u0010'\u001a\u00020&2\b\b\u0001\u0010(\u001a\u00020&2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b,\u0010-J$\u0010/\u001a\u00020+2\b\b\u0001\u0010.\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b/\u0010\b¨\u00060À\u0006\u0003"}, d2 = {"Losn;", "", "", "sportyBetAccessToken", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "bizTypeTag", "", "b", "(Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingOverallConfig;", "c", "(Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "sportId", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingSportConfig;", "d", "leagueId", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingMarketInfo;", "h", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "", "forceNew", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingRoundInfo;", "k", "(Ljava/lang/String;ZLcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "j", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingEventInfo;", "i", "g", "Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;", "ticketParameter", "Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;", "tracking", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingSettleRound;", "a", "(Lcom/sportybet/android/instantwin/newtork/model/request/TicketParameter;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinApiTracking;Lv1b;)Ljava/lang/Object;", "", "pageSize", "filterWinning", "", "startTimestampMillis", "endTimestampMillis", "lastId", "Lcom/sportybet/android/instantwin/newtork/model/PageData;", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicket;", "f", "(Ljava/lang/String;IZJJLjava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;Lv1b;)Ljava/lang/Object;", "ticketId", "e", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface osn {
    @flz("instantwin/api/race/v1/ticket/create")
    Object a(@jh4 TicketParameter ticketParameter, @b4f0 InstantWinApiTracking instantWinApiTracking, v1b<? super NetworkInstantRacingSettleRound> v1bVar);

    @sbj("instantwin/api/race/auth/userCheck")
    Object b(@rhl("x-auth-token") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super Unit> v1bVar);

    @sbj("instantwin/api/race/v1/config/overall")
    Object c(@b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingOverallConfig> v1bVar);

    @sbj("instantwin/api/race/v1/config/sport")
    Object d(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingSportConfig> v1bVar);

    @sbj("instantwin/api/race/v1/ticket/detail")
    Object e(@db30("ticketId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingTicket> v1bVar);

    @sbj("instantwin/api/race/v1/ticket/list")
    Object f(@db30("sportId") String str, @db30("pageSize") int i, @db30("filterWinning") boolean z, @db30("startTime") long j, @db30("endTime") long j2, @db30("lastId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super PageData<NetworkInstantRacingTicket>> v1bVar);

    @sbj("instantwin/api/race/v1/event/single_without_login")
    Object g(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingEventInfo> v1bVar);

    @sbj("instantwin/api/race/v1/markets")
    Object h(@db30("sportId") String str, @db30("leagueId") String str2, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingMarketInfo> v1bVar);

    @sbj("instantwin/api/race/v1/event/single")
    Object i(@db30("sportId") String str, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingEventInfo> v1bVar);

    @sbj("instantwin/api/race/v1/event/prepare_round_without_login")
    Object j(@db30("sportId") String str, @db30("forceNew") boolean z, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingRoundInfo> v1bVar);

    @sbj("instantwin/api/race/v1/event/prepare_round")
    Object k(@db30("sportId") String str, @db30("forceNew") boolean z, @b4f0 InstantWinBizTypeTag instantWinBizTypeTag, v1b<? super NetworkInstantRacingRoundInfo> v1bVar);
}
