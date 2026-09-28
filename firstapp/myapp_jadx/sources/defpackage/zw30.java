package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.campaign.data.model.HeaderPayload;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zw30 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zw30(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ix30 ix30Var = (ix30) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d.a aVar2 = d.a.b;
                    d dVarC = c.c(aVar, aVar2);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar, aivVarC, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar, dVarC, cVar);
                    mw90.a("https://s.sporty.net/cms/locked_tier_cash_bg_3d037a0b1f.png", "locked_rakeback_cash_background", androidx.compose.foundation.layout.d.a.f(aVar2), null, null, d0b.a.g, null, aVar, 1572918, 1976);
                    d dVarG = j.g(h.g(aVar2, 12.0f, 16.0f), 1.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
                    int iHashCode2 = Long.hashCode(aVar.m());
                    ne00 ne00VarO2 = aVar.o();
                    d dVarC2 = c.c(aVar, dVarG);
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, i78VarA, bVar);
                    hlh0.a(aVar, ne00VarO2, dVar);
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar, dVarC2, cVar);
                    lkf0.d(cb40.a(R.string.page_loyalty__max_rakeback, new Object[0], aVar), null, ((lib0) aVar.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, aVar), aVar, 0, 0, 131066);
                    ty0.a(aVar, j.i(aVar2, 8.0f));
                    hx30.i(ix30Var, aVar, 0);
                    aVar.s();
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                i96 i96Var = (i96) obj4;
                Iterable iterable = (List) obj;
                String str = (String) obj2;
                HeaderPayload headerPayload = (HeaderPayload) obj3;
                str.getClass();
                headerPayload.getClass();
                Integer id = headerPayload.getId();
                String strValueOf = id != null ? String.valueOf(id.intValue()) : null;
                if (strValueOf == null) {
                    strValueOf = "";
                }
                if (iterable == null) {
                    iterable = m2g.a;
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
                    if (tournamentId != null) {
                        kag0.u(i96Var, tournamentId.longValue(), str, strValueOf);
                    }
                }
                if (str.equals("int")) {
                    str = "br";
                }
                wzm wzmVar = i96Var.b;
                jgg0 jgg0Var = jgg0.c;
                wzm.g(wzmVar, jgg0Var, i96Var.c.a(jgg0Var, str, 0L, "", ""));
                return Unit.a;
        }
    }
}
