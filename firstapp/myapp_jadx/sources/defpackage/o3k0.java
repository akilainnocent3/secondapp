package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o3k0 {
    public static final void a(final int i, final int i2, final hfs hfsVar, qx80 qx80Var, a aVar, final d dVar) {
        int i3;
        b bVarI = aVar.i(-808589570);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && bVarI.M(qx80Var)) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
                int i4 = i2 & 4;
            } else if ((i2 & 4) != 0) {
                qx80Var = j060.c(4.0f);
            }
            bVarI.Y();
            g75.a(androidx.compose.foundation.a.a(ls7.a(dVar, qx80Var), hfsVar, null, 0.0f, 6), bVarI, 0);
        } else {
            bVarI.G();
        }
        final qx80 qx80Var2 = qx80Var;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n3k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o3k0.a(qj40.a(i | 1), i2, hfsVar, qx80Var2, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(hfs hfsVar, a aVar, int i) {
        hfs hfsVar2;
        b bVarI = aVar.i(-1619561656);
        int i2 = (bVarI.M(hfsVar) ? 32 : 16) | i;
        int i3 = 3;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 0.35f), 16.0f);
            n54.a aVar3 = ht.a.m;
            int i4 = (i2 >> 3) & 14;
            hfsVar2 = hfsVar;
            a(i4, 4, hfsVar2, null, bVarI, k78.a(aVar3, dVarI));
            qyd0 qyd0Var = ejb0.a;
            d dVarI2 = j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).d, bVarI, aVar2, 1.0f), 80.0f);
            qyd0 qyd0Var2 = ajb0.a;
            int i5 = i4 | 48;
            a(i5, 0, hfsVar2, j060.c(((zib0) bVarI.O(qyd0Var2)).d), bVarI, dVarI2);
            a(i5, 0, hfsVar2, j060.c(((zib0) bVarI.O(qyd0Var2)).d), bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).d, bVarI, aVar2, 1.0f), 80.0f));
            a(i4, 4, hfsVar2, null, bVarI, k78.a(aVar3, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).i, bVarI, aVar2, 0.3f), 14.0f)));
            a(i4, 4, hfsVar2, null, bVarI, k78.a(aVar3, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).c, bVarI, aVar2, 0.9f), 14.0f)));
            a(i4, 4, hfsVar2, null, bVarI, k78.a(aVar3, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).c, bVarI, aVar2, 0.85f), 14.0f)));
        } else {
            hfsVar2 = hfsVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cnb(i, i3, hfsVar2);
        }
    }

    public static final void c(hfs hfsVar, a aVar, int i) {
        hfs hfsVar2;
        b bVarI = aVar.i(-675616117);
        int i2 = (bVarI.M(hfsVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            hfsVar2 = hfsVar;
            a((i2 & 14) | 48, 0, hfsVar2, j060.c(0.0f), bVarI, j.i(j.g(aVar2, 1.0f), 150.0f));
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(ejb0.a)).c));
        } else {
            hfsVar2 = hfsVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new g4l(i, 1, hfsVar2);
        }
    }

    public static final void d(int i, a aVar) {
        b bVarI = aVar.i(-162883472);
        if (bVarI.q(i & 1, i != 0)) {
            hfs hfsVarA = m590.a(kotlin.collections.b.k(new j58(r58.d(4282467403L)), new j58(r58.d(4280559147L)), new j58(r58.d(4282467403L))), bVarI, 2);
            d.a aVar2 = d.a.b;
            d dVarC = op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14);
            kw0.k kVar = kw0.c;
            n54.a aVar3 = ht.a.n;
            i78 i78VarA = g78.a(kVar, aVar3, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
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
            hlh0.a(bVarI, dVarC2, cVar);
            c(hfsVarA, bVarI, 0);
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = ejb0.a;
            d dVarH = h.h(dVarG, ((cjb0) bVarI.O(qyd0Var)).g, 0.0f, 2);
            i78 i78VarA2 = g78.a(kVar, aVar3, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH);
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
            hlh0.a(bVarI, dVarC3, cVar);
            a(48, 4, hfsVarA, null, bVarI, j.i(j.g(aVar2, 0.85f), 20.0f));
            a(48, 4, hfsVarA, null, bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).c, bVarI, aVar2, 0.75f), 20.0f));
            a(48, 4, hfsVarA, null, bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).h, bVarI, aVar2, 0.85f), 14.0f));
            a(48, 4, hfsVarA, null, bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).c, bVarI, aVar2, 0.9f), 14.0f));
            a(48, 4, hfsVarA, null, bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).c, bVarI, aVar2, 0.65f), 14.0f));
            a(48, 4, hfsVarA, null, bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(qyd0Var)).h, bVarI, aVar2, 0.6f), 16.0f));
            a(48, 0, hfsVarA, j060.c(((zib0) bVarI.O(ajb0.a)).d), bVarI, j.i(hib0.a(aVar2, 28.0f, bVarI, aVar2, 1.0f), 48.0f));
            ty0.a(bVarI, j.i(aVar2, ((cjb0) bVarI.O(qyd0Var)).i));
            b(hfsVarA, bVarI, 6);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new m3k0();
        }
    }
}
