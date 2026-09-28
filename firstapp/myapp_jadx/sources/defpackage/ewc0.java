package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes5.dex */
public final class ewc0 {
    public static final void a(d dVar, a aVar, int i) {
        b bVarI = aVar.i(-672606460);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            g75.a(androidx.compose.foundation.a.a(ls7.a(j.e(dVar, 1.0f), j060.c(8.0f)), m590.a(kotlin.collections.b.k(new j58(((lib0) bVarI.O(qyd0Var)).M), new j58(((lib0) bVarI.O(qyd0Var)).N), new j58(((lib0) bVarI.O(qyd0Var)).M)), bVarI, 2), null, 0.0f, 6), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new k3d(i, i3, dVar);
        }
    }

    public static final void b(final int i, final int i2, a aVar) {
        b bVarI = aVar.i(-478966312);
        int i3 = 2;
        boolean z = false;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            float f = 10.0f;
            float f2 = 0.0f;
            float f3 = 12.0f;
            g75.a(androidx.compose.foundation.a.a(j.i(j.g(h.j(h.h(aVar2, 10.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13), 0.39411765f), 20.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
            bVarI.N(244232019);
            int i4 = 0;
            while (i4 < i) {
                float f4 = 1.0f;
                float f5 = f3;
                d dVarJ = h.j(h.h(j.g(aVar2, 1.0f), f, f2, i3), 0.0f, f5, 0.0f, 0.0f, 13);
                d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.j, bVarI, 6);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarJ);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                g75.a(androidx.compose.foundation.a.a(j.i(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 34.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f4 = Float.MAX_VALUE;
                }
                g75.a(androidx.compose.foundation.a.a(j.i(new LayoutWeightElement(f4, true), 34.0f), m590.a(null, bVarI, 3), null, 0.0f, 6), bVarI, 0);
                bVarI.X(true);
                i4++;
                z = false;
                f2 = 0.0f;
                f3 = f5;
                f = 10.0f;
                i3 = 2;
            }
            bVarI.X(z);
            ute.b(h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((qhb0) bVarI.O(shb0.a)).a, ((lib0) bVarI.O(oib0.a)).A, bVarI, 6, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2) { // from class: dwc0
                public final /* synthetic */ int a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    ewc0.b(this.a, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, a aVar) {
        b bVarI = aVar.i(1400686441);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            qyd0 qyd0Var = oib0.a;
            long j = ((lib0) bVarI.O(qyd0Var)).i0;
            zk40.a aVar3 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarE, j, aVar3);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
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
            d dVarG = h.g(j.i(j.g(androidx.compose.foundation.a.b(aVar2, ((lib0) bVarI.O(qyd0Var)).b1, aVar3), 1.0f), 228.0f), 20.0f, 30.0f);
            d160 d160VarA = b160.a(new kw0.i(24.0f, true, new hw0()), ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), bVarI, 0);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            a(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), bVarI, 0);
            bVarI.X(true);
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), 48.0f), ((lib0) bVarI.O(qyd0Var)).q0, aVar3), bVarI, 0);
            b(1, 6, bVarI);
            b(4, 6, bVarI);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cwc0();
        }
    }
}
