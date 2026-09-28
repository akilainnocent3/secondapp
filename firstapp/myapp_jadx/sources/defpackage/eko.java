package defpackage;

import com.sporty.android.core.model.config.BroadcastConfig;
import com.sportybet.android.instantwin.newtork.model.request.BuildAndGoTicketCreate;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.InstantVirtualResponse;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.instantwin.newtork.model.response.Overall;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketResult;
import com.sportybet.android.instantwin.newtork.model.response.heattoheadstats.NetworkInstantVirtualTeamStatsEnvelop;
import com.sportybet.android.instantwin.newtork.model.response.leaguestats.NetworkInstantVirtualLeagueStats;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public interface eko {
    Object A(String str, x1b x1bVar);

    Object B(String str, String str2, int i, InstantWinBetSource instantWinBetSource, x1b x1bVar);

    Object C(String str, x1b x1bVar);

    lyh<Round> D(BuildAndGoTicketCreate buildAndGoTicketCreate, InstantWinBetSource instantWinBetSource);

    Object E(String str, int i, String str2, boolean z, long j, long j2, String str3, x1b x1bVar);

    Serializable F(String str, String str2, x1b x1bVar);

    Object G(String str, boolean z, x1b x1bVar);

    lyh<List<BroadcastConfig>> H();

    Object I(int i, x1b x1bVar, String str);

    Object J(String str, String str2, int i, InstantWinBetSource instantWinBetSource, x1b x1bVar);

    Object K(String str, x1b x1bVar);

    Object L(String str, int i, String str2, boolean z, long j, long j2, String str3, x1b x1bVar);

    lyh a(String str, String str2);

    Serializable b(String str, String str2, x1b x1bVar);

    lyh c(String str, String str2, InstantWinBetSource instantWinBetSource);

    lyh<NetworkInstantVirtualTeamStatsEnvelop> d(String str, String str2);

    Object e(String str, String str2, int i, InstantWinBetSource instantWinBetSource, x1b x1bVar);

    lyh f(String str);

    lyh<List<NetworkInstantVirtualLeagueStats>> g(String str);

    Object h(String str, String str2, int i, InstantWinBetSource instantWinBetSource, x1b x1bVar);

    Object i(String str, int i, String str2, boolean z, long j, long j2, String str3, x1b x1bVar);

    Object j(String str, x1b x1bVar);

    Object k(String str, int i, long j, long j2, String str2, x1b x1bVar);

    Object l(String str, x1b x1bVar);

    lyh<List<EventInRound>> m(String str, String str2, String str3);

    lyh n(Boolean bool, String str);

    lyh<TicketResult> o(TicketParameter ticketParameter, InstantWinBetSource instantWinBetSource);

    Object p(String str, x1b x1bVar);

    lyh<Overall> q(String str);

    lyh<List<MarketType>> r(String str);

    lyh s();

    lyh<Round> t(String str, String str2);

    Object u(String str, int i, String str2, boolean z, long j, long j2, String str3, x1b x1bVar);

    Object v(String str, x1b x1bVar);

    Object w(String str, x1b x1bVar);

    lyh<InstantVirtualResponse> x(String str);

    Serializable y(String str, String str2, x1b x1bVar);

    Object z(String str, String str2, x1b x1bVar);
}
