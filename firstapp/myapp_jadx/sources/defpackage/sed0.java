package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportytv.ui.SportyTvFragment;

/* JADX INFO: loaded from: classes5.dex */
public final class sed0 implements TabLayout.d {
    public final /* synthetic */ SportyTvFragment a;

    public sed0(SportyTvFragment sportyTvFragment) {
        this.a = sportyTvFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        gVar.getClass();
        SportyTvFragment sportyTvFragment = this.a;
        sportyTvFragment.C0(gVar, true);
        sportyTvFragment.p0();
        sportyTvFragment.r0().k();
        Object obj = gVar.a;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            sportyTvFragment.s0().A1(SportyTvFragment.q0(), str);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
        this.a.C0(gVar, false);
    }
}
