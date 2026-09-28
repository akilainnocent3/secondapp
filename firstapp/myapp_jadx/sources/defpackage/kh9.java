package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kh9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((gwr) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            hfs hfsVarA = m590.a(null, aVar, 3);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
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
            hlh0.a(aVar, i78VarA, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            ute.b(null, 4.0f, ((lib0) aVar.O(oib0.a)).q0, aVar, 48, 1);
            ty0.a(aVar, j.i(aVar2, ((cjb0) aVar.O(ejb0.a)).e));
            ugz.c(hfsVarA, aVar, 0);
            gqg.a(hfsVarA, aVar, 0);
            aVar.N(1059459610);
            for (int i = 0; i < 3; i++) {
                gqg.b(hfsVarA, null, aVar, 0, 2);
                if (i < 2) {
                    aVar.N(-1915778974);
                    ute.b(null, 0.0f, ((lib0) aVar.O(oib0.a)).q0, aVar, 0, 3);
                    aVar.H();
                } else {
                    aVar.N(-1915692484);
                    aVar.H();
                }
            }
            aVar.H();
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
