package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p2d0 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ qcn b;

    public p2d0(List list, qcn qcnVar) {
        this.a = list;
        this.b = qcnVar;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            q3d0 q3d0Var = (q3d0) this.a.get(iIntValue);
            aVar2.N(1619955748);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
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
            hlh0.a(aVar2, i78VarA, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            qcn qcnVar = this.b;
            q2d0.a(g3w.b(aVar3, iIntValue == b.j(qcnVar), n2d0.a, aVar2, 6), q3d0Var, aVar2, 0);
            if (iIntValue < qcnVar.size() - 1) {
                aVar2.N(-802766593);
                ute.b(null, ((qhb0) aVar2.O(shb0.a)).a, ((lib0) aVar2.O(oib0.a)).A, aVar2, 0, 1);
                aVar2.H();
            } else {
                aVar2.N(-802524421);
                aVar2.H();
            }
            aVar2.s();
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
