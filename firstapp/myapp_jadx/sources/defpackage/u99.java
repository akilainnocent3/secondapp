package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u99 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r75 r75Var = (r75) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        r75Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(r75Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iE = ((int) (r75Var.e() / 72.0f)) + 1;
            d dVarG = j.g(d.a.b, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarG);
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
            hlh0.a(aVar, i78VarA, yka.a.f);
            hlh0.a(aVar, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar, iHashCode, c1350a);
            }
            hlh0.a(aVar, dVarC, yka.a.d);
            aVar.N(1885192372);
            for (int i = 0; i < iE; i++) {
                e8r.a(0, aVar);
            }
            aVar.H();
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
