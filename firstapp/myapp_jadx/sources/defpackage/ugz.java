package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ugz {
    public static final void a(final hfs hfsVar, a aVar, final int i) {
        b bVarI = aVar.i(1874948012);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarR = j.r(aVar2, 200.0f);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarR);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.i(j.g(aVar2, 1.0f), 124.0f), j060.e(12.0f, 12.0f, 0.0f, 0.0f, 12)), hfsVar, null, 0.0f, 6), bVarI, 0);
            qyd0 qyd0Var = ejb0.a;
            d dVarF = h.f(aVar2, ((cjb0) bVarI.O(qyd0Var)).e);
            i78 i78VarA2 = g78.a(kVar, aVar3, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarI = j.i(j.g(aVar2, 1.0f), 12.0f);
            i060 i060Var = gqg.a;
            g75.a(androidx.compose.foundation.a.a(dVarI, hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            g75.a(androidx.compose.foundation.a.a(j.i(hib0.a(aVar2, 4.0f, bVarI, aVar2, 0.7f), 12.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0);
            r9o.a(androidx.compose.foundation.a.a(j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).d, bVarI, aVar2, 0.4f), 10.0f), hfsVar, i060Var, 0.0f, 4), bVarI, 0, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: tgz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ugz.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final hfs hfsVar, a aVar, final int i) {
        b bVarI = aVar.i(1814843412);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarG = j.g(d.a.b, 1.0f);
            kw0.i iVar = new kw0.i(((cjb0) bVarI.O(ejb0.a)).e, true, new hw0());
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new hfg(hfsVar, 2);
                bVarI.r(objY);
            }
            aur.b(dVarG, null, null, iVar, null, null, false, null, (Function1) objY, bVarI, 6, 494);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: rgz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ugz.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final hfs hfsVar, a aVar, final int i) {
        b bVarI = aVar.i(-920246881);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar2, 0.3f), 16.0f), hfsVar, gqg.a, 0.0f, 4), bVarI, 0);
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(ejb0.a)).d));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: qgz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ugz.c(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
