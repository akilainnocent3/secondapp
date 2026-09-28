package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportytv.ui.SportyTvFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ued0 extends knb0 {
    public final /* synthetic */ SportyTvFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ued0(long j, SportyTvFragment sportyTvFragment) {
        super(j);
        this.f = sportyTvFragment;
    }

    @Override // defpackage.knb0
    public final void a() {
        itf0.a aVar = itf0.a;
        aVar.q("tag_timer");
        aVar.a("refreshTimer is finished", new Object[0]);
        SportyTvFragment sportyTvFragment = this.f;
        TabLayout tabLayout = sportyTvFragment.N;
        if (tabLayout == null) {
            Intrinsics.n("tabLayout");
            throw null;
        }
        TabLayout.g gVarK = tabLayout.k(0);
        Object obj = gVarK != null ? gVarK.a : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            sportyTvFragment.s0().A1(SportyTvFragment.q0(), str);
        }
    }

    @Override // defpackage.knb0
    public final void b() {
        itf0.a aVar = itf0.a;
        aVar.q("tag_timer");
        aVar.a("refreshTimer is ticking", new Object[0]);
    }
}
