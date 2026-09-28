package defpackage;

import android.content.DialogInterface;
import android.util.Pair;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class yzu implements InstantWinQuickBetView.b {
    public final /* synthetic */ MatchEventDetailActivity a;

    public yzu(MatchEventDetailActivity matchEventDetailActivity) {
        this.a = matchEventDetailActivity;
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void a(String str) {
        Integer numA;
        MatchEventDetailActivity matchEventDetailActivity = this.a;
        o4p o4pVar = ((n4p) matchEventDetailActivity.C1()).A().c;
        if (o4pVar == null || (numA = vcj.a(((n4p) matchEventDetailActivity.C1()).c())) == null) {
            return;
        }
        int iIntValue = numA.intValue();
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA = sqf0.a(o4pVar, ((n4p) matchEventDetailActivity.C1()).B, ((n4p) matchEventDetailActivity.C1()).C, matchEventDetailActivity.z1(), str);
        if (instantWinGiftApplicabilityContextA == null) {
            return;
        }
        m3v m3vVarI1 = matchEventDetailActivity.I1();
        bz3 bz3Var = bz3.SINGLE;
        fqk fqkVar = new fqk(iIntValue, instantWinGiftApplicabilityContextA, m3vVarI1.v.t0(SimulateBetConsts.BetslipType.SINGLE));
        ee<fqk> eeVar = matchEventDetailActivity.L;
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
        int i = MatchEventDetailActivity.U;
        final MatchEventDetailActivity matchEventDetailActivity = this.a;
        if (matchEventDetailActivity.H.length() == 0) {
            sqo.j(matchEventDetailActivity, new DialogInterface.OnClickListener() { // from class: mzu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int i3 = MatchEventDetailActivity.U;
                    matchEventDetailActivity.finish();
                }
            });
        } else {
            matchEventDetailActivity.startActivity(matchEventDetailActivity.A1().i(matchEventDetailActivity, matchEventDetailActivity.H));
        }
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void d(Map.Entry<String, BetSlipData> entry) {
        String key;
        if (entry == null || (key = entry.getKey()) == null) {
            return;
        }
        MatchEventDetailActivity matchEventDetailActivity = this.a;
        ((n4p) matchEventDetailActivity.C1()).I(key);
        ((n4p) matchEventDetailActivity.C1()).x(null);
        matchEventDetailActivity.S1();
        matchEventDetailActivity.a2();
        matchEventDetailActivity.T1();
        matchEventDetailActivity.I1().b0();
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinQuickBetView.b
    public final void e() {
        rjo.a.a.a = 1;
        cd cdVar = this.a.B;
        if (cdVar != null) {
            cdVar.G.setVisibility(8);
        }
    }
}
