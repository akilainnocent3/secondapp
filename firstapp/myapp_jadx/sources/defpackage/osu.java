package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.prematch.widget.MarketsTabs;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final class osu implements TabLayout.d {
    public final /* synthetic */ MarketsTabs a;

    public osu(MarketsTabs marketsTabs) {
        this.a = marketsTabs;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        gVar.getClass();
        Object obj = gVar.a;
        if (!(obj instanceof RegularMarketRule)) {
            obj = null;
        }
        RegularMarketRule regularMarketRule = (RegularMarketRule) obj;
        if (regularMarketRule == null) {
            return;
        }
        this.a.getMarketSelected().invoke(regularMarketRule);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
    }
}
