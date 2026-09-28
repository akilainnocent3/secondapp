package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.UpcomingEventTypes;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ul20 implements TabLayout.d {
    public final /* synthetic */ PreMatchSportActivity a;

    public ul20(PreMatchSportActivity preMatchSportActivity) {
        this.a = preMatchSportActivity;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        gVar.getClass();
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        PreMatchSportActivity preMatchSportActivity = this.a;
        preMatchSportActivity.J1();
        hjd0 hjd0Var = preMatchSportActivity.b;
        if (hjd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        hjd0Var.M.K();
        hjd0 hjd0Var2 = preMatchSportActivity.b;
        if (hjd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        hjd0Var2.N.setVisibility(8);
        jvd0 jvd0Var = preMatchSportActivity.G1().d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        tj20 tj20Var = preMatchSportActivity.I1().a;
        jvd0 jvd0Var2 = tj20Var.e;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        jvd0 jvd0Var3 = tj20Var.f;
        if (jvd0Var3 != null) {
            jvd0Var3.cancel((CancellationException) null);
        }
        jvd0 jvd0Var4 = tj20Var.h;
        if (jvd0Var4 != null) {
            jvd0Var4.cancel((CancellationException) null);
        }
        jvd0 jvd0Var5 = tj20Var.j;
        if (jvd0Var5 != null) {
            jvd0Var5.cancel((CancellationException) null);
        }
        if (gVar.e == UpcomingEventTypes.PRE_MATCH.getValue()) {
            preMatchSportActivity.I1().x1();
        } else {
            preMatchSportActivity.G1().x1(preMatchSportActivity.I1().e);
        }
        hjd0 hjd0Var3 = preMatchSportActivity.b;
        if (hjd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (hjd0Var3.B.a.e.isChecked()) {
            return;
        }
        hjd0 hjd0Var4 = preMatchSportActivity.b;
        if (hjd0Var4 != null) {
            hjd0Var4.J.scrollTo(0, 0);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
    }
}
