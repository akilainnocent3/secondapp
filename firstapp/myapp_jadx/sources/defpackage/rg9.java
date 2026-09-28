package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rg9 implements gaj {
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
            int iE = ((int) (r75Var.e() / 114.0f)) + 1;
            float fA = qvf.a(r75Var.d(), 12.0f);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar, 0);
            int iHashCode = Long.hashCode(aVar.m());
            ne00 ne00VarO = aVar.o();
            d dVarC = c.c(aVar, dVarE);
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
            aVar.N(-899648933);
            for (int i = 0; i < iE; i++) {
                g75.a(androidx.compose.foundation.a.a(ls7.a(j.g(j.i(h.j(aVar2, fA, 12.0f, fA, 0.0f, 8), 102.0f), 1.0f), j060.c(4.0f)), m590.a(null, aVar, 3), null, 0.0f, 6), aVar, 0);
            }
            aVar.H();
            aVar.s();
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
