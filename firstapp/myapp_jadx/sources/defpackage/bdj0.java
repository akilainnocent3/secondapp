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
public final class bdj0 {
    public static final void a(final int i, final int i2, final hfs hfsVar, qx80 qx80Var, a aVar, final d dVar) {
        int i3;
        b bVarI = aVar.i(737932020);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(hfsVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bVarI.M(qx80Var) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                qx80Var = zk40.a;
            }
            g75.a(androidx.compose.foundation.a.a(dVar, hfsVar, qx80Var, 0.0f, 4), bVarI, 0);
        } else {
            bVarI.G();
        }
        final qx80 qx80Var2 = qx80Var;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zcj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bdj0.a(qj40.a(i | 1), i2, hfsVar, qx80Var2, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(hfs hfsVar, a aVar, int i) {
        hfs hfsVar2 = hfsVar;
        b bVarI = aVar.i(-712411992);
        int i2 = i | (bVarI.M(hfsVar2) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarI = j.i(j.g(aVar2, 1.0f), 208.0f);
            qyd0 qyd0Var = ejb0.a;
            d dVarB = d35.b(ls7.a(dVarI, j060.c(((cjb0) bVarI.O(qyd0Var)).c)), 1.0f, hfsVar2, j060.c(((cjb0) bVarI.O(qyd0Var)).c));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            int i3 = ((i2 << 3) & 112) | 6;
            a(i3, 4, hfsVar2, null, bVarI, j.i(j.g(aVar2, 1.0f), 68.0f));
            ty0.a(bVarI, j.i(aVar2, 14.0f));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            a(i3, 4, hfsVar, null, bVarI, h.h(j.g(j.i(aVar2, 2.0f), 1.0f), 10.0f, 0.0f, 2));
            float f = 22.0f;
            d dVarH = h.h(j.i(j.g(aVar2, 1.0f), 22.0f), 10.0f, 0.0f, 2);
            n54.b bVar2 = ht.a.k;
            kw0.g gVar = kw0.g;
            d160 d160VarA = b160.a(gVar, bVar2, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            bVarI.N(-1809582930);
            int i4 = 0;
            while (i4 < 6) {
                a(i3, 0, hfsVar, j060.a, bVarI, j.r(aVar2, f));
                i4++;
                f = f;
            }
            f30.a(bVarI, false, true, true);
            d dVarH2 = h.h(j.i(hib0.a(aVar2, 18.0f, bVarI, aVar2, 1.0f), 14.0f), 10.0f, 0.0f, 2);
            n54.b bVar3 = ht.a.j;
            d160 d160VarA2 = b160.a(gVar, bVar3, bVarI, 6);
            int iHashCode4 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarH2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, d160VarA2, bVar4);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS4, dVar2);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a2);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC4, cVar2);
            a(i3, 4, hfsVar, null, bVarI, j.t(aVar2, 106.0f, 14.0f));
            a(i3, 4, hfsVar, null, bVarI, j.t(aVar2, 77.0f, 14.0f));
            szg.a(bVarI, true, aVar2, 14.0f, bVarI);
            d dVarH3 = h.h(j.i(j.g(aVar2, 1.0f), 14.0f), 10.0f, 0.0f, 2);
            d160 d160VarA3 = b160.a(gVar, bVar3, bVarI, 6);
            int iHashCode5 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarH3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA3, bVar4);
            hlh0.a(bVarI, ne00VarS5, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                n30.a(iHashCode5, bVarI, iHashCode5, c1350a2);
            }
            hlh0.a(bVarI, dVarC5, cVar2);
            a(i3, 4, hfsVar, null, bVarI, j.t(aVar2, 77.0f, 14.0f));
            a(i3, 4, hfsVar, null, bVarI, j.t(aVar2, 98.0f, 14.0f));
            bVarI.X(true);
            hfsVar2 = hfsVar;
            a(i3, 4, hfsVar2, null, bVarI, j.i(hib0.a(aVar2, ((cjb0) bVarI.O(ejb0.a)).e, bVarI, aVar2, 1.0f), 32.0f));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new eu60(hfsVar2, i);
        }
    }

    public static final void c(d dVar, a aVar, int i) {
        int i2;
        d dVar2;
        b bVarI = aVar.i(801131557);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            final hfs hfsVarA = m590.a(kotlin.collections.b.k(new j58(((lib0) bVarI.O(qyd0Var)).M), new j58(((lib0) bVarI.O(qyd0Var)).N), new j58(((lib0) bVarI.O(qyd0Var)).M)), bVarI, 2);
            dVar2 = dVar;
            qfj0.a(dVar2, false, pp8.b(938665496, new gaj() { // from class: adj0
                /* JADX WARN: Code duplicated, block: B:23:0x00f9  */
                /* JADX WARN: Code duplicated, block: B:25:0x0102  */
                /* JADX WARN: Code duplicated, block: B:26:0x0106  */
                /* JADX WARN: Code duplicated, block: B:31:0x0123  */
                /* JADX WARN: Code duplicated, block: B:34:0x01a2  */
                /* JADX WARN: Code duplicated, block: B:36:0x01ab  */
                /* JADX WARN: Code duplicated, block: B:37:0x01af  */
                /* JADX WARN: Code duplicated, block: B:42:0x01cc  */
                /* JADX WARN: Code duplicated, block: B:46:0x01e0  */
                /* JADX WARN: Code duplicated, block: B:49:0x01ec  */
                /* JADX WARN: Code duplicated, block: B:50:0x01ee  */
                /* JADX WARN: Code duplicated, block: B:54:0x020b  */
                /* JADX WARN: Code duplicated, block: B:58:0x0215  */
                /* JADX WARN: Code duplicated, block: B:60:0x022d  */
                /* JADX WARN: Code duplicated, block: B:62:0x0231  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
                    Throwable th;
                    yka.a.c cVar;
                    i78 i78VarA;
                    int iHashCode;
                    ne00 ne00VarO;
                    d dVarC;
                    hfs hfsVar;
                    d160 d160VarA;
                    int iHashCode2;
                    ne00 ne00VarO2;
                    d dVarC2;
                    float f;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((m75) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarG = j.g(j.i(aVar3, 460.0f), 1.0f);
                        qyd0 qyd0Var2 = ejb0.a;
                        d dVarI = h.i(dVarG, ((cjb0) aVar2.O(qyd0Var2)).h, ((cjb0) aVar2.O(qyd0Var2)).i, ((cjb0) aVar2.O(qyd0Var2)).h, ((cjb0) aVar2.O(qyd0Var2)).h);
                        kw0.i iVar = new kw0.i(((cjb0) aVar2.O(qyd0Var2)).f, true, new hw0());
                        n54.a aVar4 = ht.a.n;
                        i78 i78VarA2 = g78.a(iVar, aVar4, aVar2, 48);
                        int iHashCode3 = Long.hashCode(aVar2.m());
                        ne00 ne00VarO3 = aVar2.o();
                        d dVarC3 = c.c(aVar2, dVarI);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar2, i78VarA2, bVar);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar2, ne00VarO3, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g()) {
                            th = null;
                        } else {
                            th = null;
                            if (!Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode3))) {
                            }
                            cVar = yka.a.d;
                            hlh0.a(aVar2, dVarC3, cVar);
                            i78VarA = g78.a(new kw0.i(((cjb0) aVar2.O(qyd0Var2)).e, true, new hw0()), aVar4, aVar2, 48);
                            iHashCode = Long.hashCode(aVar2.m());
                            ne00VarO = aVar2.o();
                            dVarC = c.c(aVar2, aVar3);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw th;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, i78VarA, bVar);
                            hlh0.a(aVar2, ne00VarO, dVar3);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                            }
                            hlh0.a(aVar2, dVarC, cVar);
                            d dVarT = j.t(aVar3, 214.0f, 44.0f);
                            hfsVar = hfsVarA;
                            bdj0.a(6, 4, hfsVar, null, aVar2, dVarT);
                            bdj0.a(6, 4, hfsVar, null, aVar2, j.t(aVar3, 142.0f, 18.0f));
                            aVar2.s();
                            bdj0.a(6, 0, hfsVar, j060.c(((cjb0) aVar2.O(qyd0Var2)).c), aVar2, j.i(j.g(aVar3, 1.0f), 28.0f));
                            bdj0.b(hfsVar, aVar2, 0);
                            d dVarI2 = j.i(j.g(aVar3, 1.0f), 48.0f);
                            d160VarA = b160.a(new kw0.i(((cjb0) aVar2.O(qyd0Var2)).d, true, new hw0()), ht.a.j, aVar2, 0);
                            iHashCode2 = Long.hashCode(aVar2.m());
                            ne00VarO2 = aVar2.o();
                            dVarC2 = c.c(aVar2, dVarI2);
                            if (aVar2.k() != null) {
                                l2a.b();
                                throw th;
                            }
                            aVar2.D();
                            if (aVar2.g()) {
                                aVar2.F(aVar5);
                            } else {
                                aVar2.p();
                            }
                            hlh0.a(aVar2, d160VarA, bVar);
                            hlh0.a(aVar2, ne00VarO2, dVar3);
                            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar2, dVarC2, cVar);
                            d dVarC4 = j.c(aVar3, 1.0f);
                            if (1.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f = Float.MAX_VALUE;
                            } else {
                                f = 1.0f;
                            }
                            bdj0.a(0, 0, hfsVar, j060.c(2.0f), aVar2, dVarC4.n(new LayoutWeightElement(f, true)));
                            d dVarC5 = j.c(aVar3, 1.0f);
                            if (2.0f <= 0.0d) {
                                ukn.a("invalid weight; must be greater than zero");
                            }
                            bdj0.a(0, 0, hfsVar, j060.c(2.0f), aVar2, dVarC5.n(new LayoutWeightElement(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true)));
                            aVar2.s();
                            aVar2.s();
                        }
                        j3c.a(iHashCode3, aVar2, iHashCode3, c1350a);
                        cVar = yka.a.d;
                        hlh0.a(aVar2, dVarC3, cVar);
                        i78VarA = g78.a(new kw0.i(((cjb0) aVar2.O(qyd0Var2)).e, true, new hw0()), aVar4, aVar2, 48);
                        iHashCode = Long.hashCode(aVar2.m());
                        ne00VarO = aVar2.o();
                        dVarC = c.c(aVar2, aVar3);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw th;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, i78VarA, bVar);
                        hlh0.a(aVar2, ne00VarO, dVar3);
                        if (aVar2.g()) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        } else {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, cVar);
                        d dVarT2 = j.t(aVar3, 214.0f, 44.0f);
                        hfsVar = hfsVarA;
                        bdj0.a(6, 4, hfsVar, null, aVar2, dVarT2);
                        bdj0.a(6, 4, hfsVar, null, aVar2, j.t(aVar3, 142.0f, 18.0f));
                        aVar2.s();
                        bdj0.a(6, 0, hfsVar, j060.c(((cjb0) aVar2.O(qyd0Var2)).c), aVar2, j.i(j.g(aVar3, 1.0f), 28.0f));
                        bdj0.b(hfsVar, aVar2, 0);
                        d dVarI3 = j.i(j.g(aVar3, 1.0f), 48.0f);
                        d160VarA = b160.a(new kw0.i(((cjb0) aVar2.O(qyd0Var2)).d, true, new hw0()), ht.a.j, aVar2, 0);
                        iHashCode2 = Long.hashCode(aVar2.m());
                        ne00VarO2 = aVar2.o();
                        dVarC2 = c.c(aVar2, dVarI3);
                        if (aVar2.k() != null) {
                            l2a.b();
                            throw th;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar5);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, bVar);
                        hlh0.a(aVar2, ne00VarO2, dVar3);
                        if (aVar2.g()) {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        } else {
                            j3c.a(iHashCode2, aVar2, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar2, dVarC2, cVar);
                        d dVarC6 = j.c(aVar3, 1.0f);
                        if (1.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f = Float.MAX_VALUE;
                        } else {
                            f = 1.0f;
                        }
                        bdj0.a(0, 0, hfsVar, j060.c(2.0f), aVar2, dVarC6.n(new LayoutWeightElement(f, true)));
                        d dVarC7 = j.c(aVar3, 1.0f);
                        if (2.0f <= 0.0d) {
                            ukn.a("invalid weight; must be greater than zero");
                        }
                        bdj0.a(0, 0, hfsVar, j060.c(2.0f), aVar2, dVarC7.n(new LayoutWeightElement(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true)));
                        aVar2.s();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i2 & 14) | 384, 2);
        } else {
            dVar2 = dVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new dzt(dVar2, i);
        }
    }
}
