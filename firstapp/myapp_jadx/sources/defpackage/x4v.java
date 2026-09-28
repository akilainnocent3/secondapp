package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x4v implements yfo {
    public final /* synthetic */ y4v a;
    public final /* synthetic */ e b;
    public final /* synthetic */ bs3 c;

    public x4v(y4v y4vVar, e eVar, bs3 bs3Var) {
        this.a = y4vVar;
        this.b = eVar;
        this.c = bs3Var;
    }

    @Override // defpackage.yfo
    public final void a() {
        y4v y4vVar = this.a;
        uqm uqmVar = y4vVar.K;
        if (uqmVar == null) {
            Intrinsics.n("accountHelper");
            throw null;
        }
        if (uqmVar.getAccount() != null) {
            rdd0 rdd0Var = y4vVar.M;
            if (rdd0Var == null) {
                Intrinsics.n("sportyTrackingUseCase");
                throw null;
            }
            rdd0Var.a(new lmd("MatchEventOutcomeFragment#onOutcomeSelected"), k00.d);
            uqm uqmVar2 = y4vVar.K;
            if (uqmVar2 == null) {
                Intrinsics.n("accountHelper");
                throw null;
            }
            uqmVar2.logout();
        }
        final e eVar = this.b;
        sqo.j(eVar, new DialogInterface.OnClickListener() { // from class: w4v
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                eVar.finish();
            }
        });
    }

    @Override // defpackage.yfo
    public final void b(boolean z) {
        Event next;
        y4v y4vVar = this.a;
        if (!z) {
            Context context = y4vVar.getContext();
            if (context == null) {
                return;
            }
            String strC = ((n4p) y4vVar.p0()).c();
            InstantWinInput instantWinInput = new InstantWinInput(strC, null, null, y4vVar.o0().O.B(strC));
            jlo jloVar = y4vVar.L;
            if (jloVar == null) {
                Intrinsics.n("instantWinRouter");
                throw null;
            }
            Intent intentL = jloVar.l(context, instantWinInput);
            intentL.addFlags(65536);
            y4vVar.startActivity(intentL);
            return;
        }
        if (sqo.m(this.b, y4vVar.p0())) {
            return;
        }
        bs3 bs3Var = this.c;
        String str = bs3Var != null ? bs3Var.a : null;
        String str2 = bs3Var != null ? bs3Var.b : null;
        String str3 = bs3Var != null ? bs3Var.c : null;
        List<? extends Event> list = y4vVar.F;
        if (list == null) {
            next = null;
            break;
        }
        Iterator<? extends Event> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!TextUtils.equals(next.eventId, str));
        Market marketD = sqo.d(next, str2);
        Outcome outcomeH = sqo.h(marketD, str3);
        BetSlipData betSlipData = new BetSlipData(bs3Var != null ? bs3Var.a : null, bs3Var != null ? bs3Var.b : null, bs3Var != null ? bs3Var.c : null, marketD.title, outcomeH.desc, outcomeH.odds, next.homeTeamName, next.awayTeamName, outcomeH.probability, false);
        try {
            zi50.a aVar = zi50.b;
            if (outcomeH.probability == null) {
                xdp xdpVar = new xdp();
                xdpVar.i("roundId", ((n4p) y4vVar.p0()).t);
                String str4 = next.eventId;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                xdpVar.i(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, str4);
                String str6 = marketD.marketId;
                if (str6 != null) {
                    str5 = str6;
                }
                xdpVar.i("marketId", str5);
                JsonSerializeService jsonSerializeService = y4vVar.O;
                if (jsonSerializeService == null) {
                    Intrinsics.n("jsonSerializeService");
                    throw null;
                }
                xdpVar.i("outcome", jsonSerializeService.toJson(outcomeH));
                wsm wsmVar = y4vVar.N;
                if (wsmVar == null) {
                    Intrinsics.n("crashlyticsHelper");
                    throw null;
                }
                wsmVar.g("Null probability for outcome in MatchEventOutcomeFragment", xdpVar.toString(), new NullPointerException(), null);
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        ((n4p) y4vVar.p0()).v(sqo.b(bs3Var.a, bs3Var.b, bs3Var.c), betSlipData);
        y4vVar.o0().A();
        y4vVar.t0(bs3Var, true);
        b5v b5vVar = y4vVar.B;
        if (b5vVar != null) {
            b5vVar.u0();
        }
    }
}
