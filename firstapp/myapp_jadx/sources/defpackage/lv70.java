package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchFragment$observe$1$1", f = "SearchFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lv70 extends tje0 implements Function2<List<? extends RegularMarketRule>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ uhd0 b;
    public final /* synthetic */ SearchFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv70(uhd0 uhd0Var, SearchFragment searchFragment, v1b<? super lv70> v1bVar) {
        super(2, v1bVar);
        this.b = uhd0Var;
        this.c = searchFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lv70 lv70Var = new lv70(this.b, this.c, v1bVar);
        lv70Var.a = obj;
        return lv70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends RegularMarketRule> list, v1b<? super Unit> v1bVar) {
        return ((lv70) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        RegularMarketRule regularMarketRule;
        Object obj2;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SearchLivePanel searchLivePanel = this.b.H;
        list.getClass();
        TabLayout tabLayout = searchLivePanel.L;
        if (tabLayout == null) {
            Intrinsics.n("marketTabLayout");
            throw null;
        }
        TabLayout.g gVarK = tabLayout.k(searchLivePanel.R);
        if (gVarK == null || (obj2 = gVarK.a) == null) {
            regularMarketRule = null;
        } else {
            if (!(obj2 instanceof RegularMarketRule)) {
                obj2 = null;
            }
            regularMarketRule = (RegularMarketRule) obj2;
        }
        tabLayout.n();
        if (!list.isEmpty()) {
            int i = 0;
            int i2 = 0;
            for (Object obj3 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                RegularMarketRule regularMarketRule2 = (RegularMarketRule) obj3;
                searchLivePanel.getEarlyPayoutMarketResolver().getClass();
                RegularMarketRule regularMarketRuleD = hkf.d(regularMarketRule2);
                searchLivePanel.I.a.getContext();
                HashSet hashSet = tru.a;
                String str = regularMarketRuleD.b;
                TabLayout.g gVarL = tabLayout.l();
                gVarL.e(str);
                gVarL.a = regularMarketRule2;
                tabLayout.b(gVarL);
                if (Intrinsics.g(regularMarketRule != null ? regularMarketRule.a : null, regularMarketRule2.a)) {
                    i = i2;
                }
                i2 = i3;
            }
            tabLayout.s(tabLayout.k(i), true);
        }
        RegularMarketRule marketRule = searchLivePanel.getMarketRule();
        if (marketRule != null) {
            mfb0 sportRule = searchLivePanel.getSportRule();
            ohp<Object>[] ohpVarArr = SearchFragment.V;
            SearchFragment searchFragment = this.c;
            searchFragment.C0(sportRule, marketRule);
            searchFragment.q0().x1(marketRule, false);
        }
        return Unit.a;
    }
}
