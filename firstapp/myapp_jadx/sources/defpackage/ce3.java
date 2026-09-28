package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.android.instantwin.newtork.model.response.League;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class ce3 implements TabLayout.d {
    public final /* synthetic */ yd3 a;

    public ce3(yd3 yd3Var) {
        this.a = yd3Var;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        int i = gVar != null ? gVar.e : 0;
        yd3 yd3Var = this.a;
        ArrayList arrayList = yd3Var.G;
        League league = arrayList != null ? (League) arrayList.get(i) : null;
        List<EventInRound> list = (List) yd3Var.H.get(league != null ? league.leagueId : null);
        if (list != null) {
            yd3Var.q0(league != null ? league.leagueId : null);
            yd3Var.p0(list);
            return;
        }
        String str = league != null ? league.leagueId : null;
        String str2 = str == null ? "" : str;
        ktg ktgVar = (ktg) yd3Var.E.getValue();
        Round roundX1 = yd3Var.r0().x1();
        String str3 = roundX1 != null ? roundX1.roundId : null;
        String str4 = str3 == null ? "" : str3;
        String strC = ((n4p) yd3Var.s0()).c();
        jvd0 jvd0Var = ktgVar.e;
        if (jvd0Var != null) {
            if (!jvd0Var.isActive()) {
                jvd0Var = null;
            }
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
        }
        ktgVar.e = ej5.c(o8i0.d(ktgVar), null, null, new jtg(ktgVar, str4, str2, strC, null), 3);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }
}
