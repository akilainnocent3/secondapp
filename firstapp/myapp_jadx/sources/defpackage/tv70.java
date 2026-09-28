package defpackage;

import com.sportybet.plugin.realsports.data.SearchRequestData;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class tv70 implements rus {
    public final /* synthetic */ SearchFragment a;
    public final /* synthetic */ uhd0 b;
    public final /* synthetic */ SearchLivePanel c;

    public tv70(SearchFragment searchFragment, uhd0 uhd0Var, SearchLivePanel searchLivePanel) {
        this.a = searchFragment;
        this.b = uhd0Var;
        this.c = searchLivePanel;
    }

    @Override // defpackage.rus
    public final void b(mfb0 mfb0Var) {
        ohp<Object>[] ohpVarArr = SearchFragment.V;
        SearchFragment searchFragment = this.a;
        searchFragment.m0(null, true);
        searchFragment.q0().y = mfb0Var;
        n280 n280VarS0 = searchFragment.s0();
        n280 n280VarS1 = searchFragment.s0();
        String strValueOf = String.valueOf(this.b.E.getText());
        String id = mfb0Var.getId();
        SearchRequestData searchRequestData = (SearchRequestData) n280VarS1.v.getValue();
        searchRequestData.setKeyword(strValueOf);
        searchRequestData.setSport(id);
        searchRequestData.setProdId(1);
        jvd0 jvd0Var = n280VarS0.C;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        n280VarS0.C = ej5.c(o8i0.d(n280VarS0), null, null, new x180(n280VarS0, searchRequestData, null), 3);
    }

    @Override // defpackage.rus
    public final void c(RegularMarketRule regularMarketRule) {
        SearchFragment searchFragment = this.a;
        if (!searchFragment.isAdded() || searchFragment.getViewLifecycleOwner().getLifecycle().b().compareTo(s9s.b.d) < 0) {
            return;
        }
        searchFragment.C0(this.c.getSportRule(), regularMarketRule);
        searchFragment.q0().z = regularMarketRule;
        searchFragment.q0().x1(regularMarketRule, true);
    }
}
