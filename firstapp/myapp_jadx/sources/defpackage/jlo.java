package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.instantwin.router.bethistory.BuildAndGoHistoryInput;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import com.sportybet.android.instantwin.router.event.MatchEventInput;
import com.sportybet.android.instantwin.router.footballfamilysettlement.FootballFamilySettlementInput;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.instantwin.router.kickoff.KickoffInput;
import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import com.sportybet.android.instantwin.router.openbet.ScheduledFootballOpenBetsInput;
import com.sportybet.android.instantwin.router.penalty.SportyPenaltyInput;
import com.sportybet.android.instantwin.router.racingevent.InstantRacingEventInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity;

/* JADX INFO: loaded from: classes6.dex */
public interface jlo {
    vd<fqk, gqk> a();

    Intent b(Context context, SportyLegendsInput sportyLegendsInput);

    Intent c(Context context, h0o h0oVar);

    Intent d(Context context, InstantWinTicketDetailInput instantWinTicketDetailInput);

    Intent e(Context context, SportyLegendsSettlementInput sportyLegendsSettlementInput);

    InstantCalendarActivity.a f();

    void g(Context context, OpenBetInput openBetInput);

    p0v h();

    Intent i(Context context, String str);

    Intent j(Context context, FootballFamilySettlementInput footballFamilySettlementInput);

    Intent k(Context context, BuildAndGoHistoryInput buildAndGoHistoryInput);

    Intent l(Context context, InstantWinInput instantWinInput);

    Intent m(Context context, InstantRacingEventInput instantRacingEventInput);

    Intent n(Context context, SportyPenaltyInput sportyPenaltyInput);

    void o(Context context, String str);

    Intent p(Context context, KickoffInput kickoffInput);

    Intent q(Context context, MatchEventInput matchEventInput);

    Intent r(Context context, b2d0 b2d0Var);

    Intent s(Context context, ScheduledFootballOpenBetsInput scheduledFootballOpenBetsInput);

    Intent t(Context context, InstantWinBetHistoryInput instantWinBetHistoryInput);
}
