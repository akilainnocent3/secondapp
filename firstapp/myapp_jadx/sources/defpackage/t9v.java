package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t9v implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t9v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                o7v o7vVar = (o7v) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((gwr) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    z9v.c(o7vVar, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ix30 ix30Var = (ix30) obj4;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d.a aVar3 = d.a.b;
                    d dVarC = c.c(aVar2, aVar3);
                    yka.k.getClass();
                    tsr.a aVar4 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar4);
                    } else {
                        aVar2.p();
                    }
                    yka.a.b bVar = yka.a.f;
                    hlh0.a(aVar2, aivVarC, bVar);
                    yka.a.d dVar = yka.a.e;
                    hlh0.a(aVar2, ne00VarO, dVar);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(aVar2, dVarC, cVar);
                    mw90.a("https://s.sporty.net/cms/locked_tier_cash_bg_3d037a0b1f.png", "rakeback_cash_background", androidx.compose.foundation.layout.d.a.f(aVar3), null, null, d0b.a.g, null, aVar2, 1572918, 1976);
                    qyd0 qyd0Var = ejb0.a;
                    kw0.i iVar = new kw0.i(((cjb0) aVar2.O(qyd0Var)).d, true, new hw0());
                    d dVarG = h.g(j.g(aVar3, 1.0f), ((cjb0) aVar2.O(qyd0Var)).e, ((cjb0) aVar2.O(qyd0Var)).f);
                    i78 i78VarA = g78.a(iVar, ht.a.n, aVar2, 48);
                    int iHashCode2 = Long.hashCode(aVar2.m());
                    ne00 ne00VarO2 = aVar2.o();
                    d dVarC2 = c.c(aVar2, dVarG);
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar4);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, i78VarA, bVar);
                    hlh0.a(aVar2, ne00VarO2, dVar);
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                        j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                    }
                    hlh0.a(aVar2, dVarC2, cVar);
                    lkf0.d(cb40.a(R.string.page_loyalty__rakeback_for_this_tier, new Object[0], aVar2), null, ((lib0) aVar2.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(kjb0.a)).o, aVar2, 0, 0, 131066);
                    hx30.i(ix30Var, aVar2, 0);
                    aVar2.s();
                    aVar2.s();
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }
}
