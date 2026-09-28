package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qv70 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ uhd0 a;
    public final /* synthetic */ SearchFragment b;

    public qv70(uhd0 uhd0Var, SearchFragment searchFragment) {
        this.a = uhd0Var;
        this.b = searchFragment;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        RegularMarketRule regularMarketRule;
        RegularMarketRule regularMarketRuleB;
        uhd0 uhd0Var = this.a;
        SearchPreMatchPanel searchPreMatchPanel = uhd0Var.O;
        avy avyVarG = hih0.g(fVar);
        mfb0 mfb0Var = searchPreMatchPanel.B;
        if (mfb0Var != null && (regularMarketRule = searchPreMatchPanel.C) != null && (regularMarketRuleB = searchPreMatchPanel.getUpMarketTabUseCase().b(avyVarG, regularMarketRule, mfb0Var.getId(), false)) != null) {
            TabLayout tabLayout = searchPreMatchPanel.y;
            if (tabLayout == null) {
                Intrinsics.n("marketTabLayout");
                throw null;
            }
            int tabCount = tabLayout.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout tabLayout2 = searchPreMatchPanel.y;
                if (tabLayout2 == null) {
                    Intrinsics.n("marketTabLayout");
                    throw null;
                }
                TabLayout.g gVarK = tabLayout2.k(i);
                Object obj = gVarK != null ? gVarK.a : null;
                RegularMarketRule regularMarketRule2 = obj instanceof RegularMarketRule ? (RegularMarketRule) obj : null;
                if (Intrinsics.g(regularMarketRule2 != null ? regularMarketRule2.a : null, regularMarketRule.a)) {
                    gVarK.a = regularMarketRuleB;
                    searchPreMatchPanel.C = regularMarketRuleB;
                    searchPreMatchPanel.m(regularMarketRuleB);
                    break;
                }
            }
        }
        OneUpTwoUpSwitch.setState$default(uhd0Var.v, fVar, false, false, 4, null);
        SearchFragment searchFragment = this.b;
        mfb0 mfb0Var2 = searchFragment.R;
        searchFragment.v0(hih0.g(fVar), searchFragment.S, mfb0Var2 != null ? mfb0Var2.getId() : null, false);
    }
}
