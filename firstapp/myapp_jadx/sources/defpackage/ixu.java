package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;

/* JADX INFO: loaded from: classes6.dex */
public final class ixu extends ek90 {
    public final /* synthetic */ MatchEventActivity a;

    public ixu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // defpackage.ek90, com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        wvi wviVar;
        xvi xviVar;
        int i = MatchEventActivity.a0;
        MatchEventActivity matchEventActivity = this.a;
        bd bdVar = matchEventActivity.B;
        if (bdVar != null) {
            bdVar.G.x0();
        }
        y4v y4vVar = matchEventActivity.G;
        if (y4vVar != null && (xviVar = y4vVar.f) != null) {
            xviVar.b.x0();
        }
        lyu lyuVar = matchEventActivity.D;
        if (lyuVar != null && (wviVar = lyuVar.f) != null) {
            wviVar.b.x0();
        }
        z5v z5vVarI1 = matchEventActivity.I1();
        Object obj = gVar != null ? gVar.a : null;
        MarketType marketType = obj instanceof MarketType ? (MarketType) obj : null;
        z5vVarI1.C1(marketType != null ? marketType.type : null);
        if (matchEventActivity.J1()) {
            matchEventActivity.T1(false);
            matchEventActivity.V1(false);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        wvi wviVar;
        xvi xviVar;
        String str = "market_tab_" + ((Object) (gVar != null ? gVar.c : null));
        int i = MatchEventActivity.a0;
        MatchEventActivity matchEventActivity = this.a;
        matchEventActivity.S1(str);
        bd bdVar = matchEventActivity.B;
        if (bdVar != null) {
            bdVar.G.x0();
        }
        y4v y4vVar = matchEventActivity.G;
        if (y4vVar != null && (xviVar = y4vVar.f) != null) {
            xviVar.b.x0();
        }
        lyu lyuVar = matchEventActivity.D;
        if (lyuVar != null && (wviVar = lyuVar.f) != null) {
            wviVar.b.x0();
        }
        z5v z5vVarI1 = matchEventActivity.I1();
        Object obj = gVar != null ? gVar.a : null;
        MarketType marketType = obj instanceof MarketType ? (MarketType) obj : null;
        z5vVarI1.C1(marketType != null ? marketType.type : null);
        if (matchEventActivity.J1()) {
            matchEventActivity.T1(false);
            matchEventActivity.V1(false);
        }
        y4v y4vVar2 = matchEventActivity.G;
        matchEventActivity.H = y4vVar2 != null ? y4vVar2.s0() : null;
    }
}
