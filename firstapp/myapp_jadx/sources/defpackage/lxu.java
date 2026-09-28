package defpackage;

import android.util.Pair;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class lxu implements InstantWinQuickBetView.b {
    public final /* synthetic */ MatchEventActivity a;

    public lxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void a(String str) {
        Integer numA;
        MatchEventActivity matchEventActivity = this.a;
        o4p o4pVar = ((n4p) matchEventActivity.C1()).A().c;
        if (o4pVar == null || (numA = vcj.a(((n4p) matchEventActivity.C1()).c())) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA = sqf0.a(o4pVar, ((n4p) matchEventActivity.C1()).B, ((n4p) matchEventActivity.C1()).C, matchEventActivity.z1(), str);
        if (instantWinGiftApplicabilityContextA == null) {
            return;
        }
        z5v z5vVarI1 = matchEventActivity.I1();
        bz3 bz3Var = bz3.SINGLE;
        fqk fqkVar = new fqk(iIntValue, instantWinGiftApplicabilityContextA, z5vVarI1.E.t0(SimulateBetConsts.BetslipType.SINGLE));
        ee<fqk> eeVar = matchEventActivity.S;
        if (eeVar != null) {
            eeVar.b(fqkVar);
        }
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void b(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        ((n4p) this.a.C1()).L(new Pair<>(str, str2));
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void c() {
        int i = MatchEventActivity.a0;
        this.a.O1();
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void d(Map.Entry<String, BetSlipData> entry) throws Throwable {
        String key = entry != null ? entry.getKey() : null;
        if (key == null || key.length() == 0) {
            return;
        }
        MatchEventActivity matchEventActivity = this.a;
        ((n4p) matchEventActivity.C1()).I(key);
        ((n4p) matchEventActivity.C1()).x(null);
        matchEventActivity.R1();
        matchEventActivity.Q1();
        matchEventActivity.I1().b0();
        y4v y4vVar = matchEventActivity.G;
        if (y4vVar != null) {
            y4vVar.r0();
        }
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void e() {
        rjo.a.a.a = 1;
        bd bdVar = this.a.B;
        if (bdVar != null) {
            bdVar.F.setVisibility(8);
        }
    }
}
