package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j99 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Integer) obj).intValue();
        a aVar = (a) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= aVar.d(iIntValue) ? 4 : 2;
        }
        if (aVar.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            d dVarR = j.r(h.j(d.a.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f);
            qyd0 qyd0Var = oib0.a;
            d dVarB = androidx.compose.foundation.a.b(dVarR, ((lib0) aVar.O(qyd0Var)).K0, j060.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            if (aVar.k() == null) {
                l2a.b();
                throw null;
            }
            aVar.D();
            if (aVar.g()) {
                aVar.F(aVar2);
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
            lkf0.d(String.valueOf(iIntValue), null, ((lib0) aVar.O(qyd0Var)).j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).o, aVar, 0, 0, 131066);
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
