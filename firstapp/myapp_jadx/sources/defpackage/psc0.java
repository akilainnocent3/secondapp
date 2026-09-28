package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class psc0 implements TabLayout.d {
    public final /* synthetic */ SportyNewsListFragment a;

    public psc0(SportyNewsListFragment sportyNewsListFragment) {
        this.a = sportyNewsListFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        Object value;
        View view;
        TextView textView;
        int i = gVar != null ? gVar.e : 0;
        ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
        SportyNewsListFragment sportyNewsListFragment = this.a;
        TabLayout tabLayout = sportyNewsListFragment.o0().c;
        if (sportyNewsListFragment.J) {
            return;
        }
        TabLayout.g gVarK = tabLayout.k(i);
        sportyNewsListFragment.B = null;
        ((dkv) sportyNewsListFragment.w.getValue()).b.m(null);
        sportyNewsListFragment.q0().A.a(null);
        sportyNewsListFragment.q0().v.setValue(null);
        sportyNewsListFragment.A = String.valueOf(gVarK != null ? gVarK.a : null);
        sportyNewsListFragment.H = gVarK != null ? Integer.valueOf(gVarK.e) : 0;
        tabLayout.setSelectedTabIndicatorHeight(bqe.a(4.0f));
        ((alv) sportyNewsListFragment.v.getValue()).f.a(sn5.c(tabLayout, R.string.sporty_news__media_header_title, new Object[0]));
        SportyNewsListFragment.u0(gVarK);
        if (!String.valueOf((gVarK == null || (view = gVarK.f) == null || (textView = (TextView) view.findViewById(R.id.tab_title)) == null) ? null : textView.getText()).equals("Livescore")) {
            sportyNewsListFragment.r0(false);
            sportyNewsListFragment.n0();
            sportyNewsListFragment.q0().x1(String.valueOf(gVarK != null ? gVarK.a : null), "");
            return;
        }
        sportyNewsListFragment.r0(true);
        uqm uqmVar = sportyNewsListFragment.M;
        if (uqmVar == null) {
            Intrinsics.n("accountHelper");
            throw null;
        }
        String strA = inm.a("https://ls.sir.sportradar.com/sportybet23/", uqmVar.getLanguageCodeForBetRadar());
        wwd0 wwd0Var = sportyNewsListFragment.q0().f;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
        sportyNewsListFragment.o0().v.loadUrl(strA);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        SportyNewsListFragment.u0(gVar);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }
}
