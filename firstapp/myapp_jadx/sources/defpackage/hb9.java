package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hb9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            d dVarI = h.i(dVarG, ((cjb0) aVar.O(qyd0Var)).f, ((cjb0) aVar.O(qyd0Var)).g, ((cjb0) aVar.O(qyd0Var)).f, 28.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarI);
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
            hlh0.a(aVar, aivVarC, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            q330.a(j.r(aVar2, 28.0f), ((lib0) aVar.O(oib0.a)).r, 0.0f, 0L, 0, 0.0f, aVar, 6, 60);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
