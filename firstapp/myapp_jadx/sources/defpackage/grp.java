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
public final class grp {
    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0164  */
    /* JADX WARN: Code duplicated, block: B:52:0x0170  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void a(final hfs hfsVar, int i, float f, a aVar, final int i2, final int i3) {
        float f2;
        boolean z;
        boolean z2;
        int i4;
        float f3;
        e eVarZ;
        d.a aVar2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        int i5;
        int iHashCode2;
        tsr.a aVar4;
        yka.a.C1350a c1350a2;
        b bVarI = aVar.i(-1065578527);
        int i6 = (bVarI.M(hfsVar) ? 4 : 2) | i2;
        int i7 = i3 & 4;
        if (i7 == 0) {
            if ((i2 & 384) == 0) {
                f2 = f;
                i6 |= bVarI.c(f2) ? 256 : 128;
            }
            z = true;
            if ((i6 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVarI.q(i6 & 1, z2)) {
                if (i7 != 0) {
                    f3 = 0.0f;
                } else {
                    f3 = f2;
                }
                aVar2 = d.a.b;
                d dVarJ = h.j(aVar2, 0.0f, f3, 0.0f, 0.0f, 13);
                i78 i78VarA = g78.a(new kw0.i(14.0f, true, new hw0()), ht.a.m, bVarI, 6);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarJ);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                bVarI.N(-2020563529);
                i4 = i;
                i5 = 0;
                while (i5 < i4) {
                    d dVarF = h.f(androidx.compose.foundation.a.b(ls7.a(j.i(j.w(aVar2, 160.0f), 64.0f), j060.c(8.0f)), ((lib0) bVarI.O(oib0.a)).d1, zk40.a), 8.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarF);
                    yka.k.getClass();
                    aVar4 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, yka.a.f);
                    hlh0.a(bVarI, ne00VarS2, yka.a.e);
                    c1350a2 = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                    }
                    hlh0.a(bVarI, dVarC2, yka.a.d);
                    g75.a(androidx.compose.foundation.a.a(ls7.a(j.i(j.g(aVar2, 1.0f), 48.0f), j060.c(4.0f)), hfsVar, null, 0.0f, 6), bVarI, 0);
                    bVarI.X(true);
                    i5++;
                    z = true;
                }
                bVarI.X(false);
                bVarI.X(z);
            } else {
                i4 = i;
                bVarI.G();
                f3 = f2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                final int i8 = i4;
                final float f4 = f3;
                eVarZ.d = new Function2() { // from class: frp
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        grp.a(hfsVar, i8, f4, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i6 |= 384;
        f2 = f;
        z = true;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVarI.q(i6 & 1, z2)) {
            if (i7 != 0) {
                f3 = 0.0f;
            } else {
                f3 = f2;
            }
            aVar2 = d.a.b;
            d dVarJ2 = h.j(aVar2, 0.0f, f3, 0.0f, 0.0f, 13);
            i78 i78VarA2 = g78.a(new kw0.i(14.0f, true, new hw0()), ht.a.m, bVarI, 6);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarJ2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, yka.a.f);
            hlh0.a(bVarI, ne00VarS3, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, yka.a.d);
            bVarI.N(-2020563529);
            i4 = i;
            i5 = 0;
            while (i5 < i4) {
                d dVarF2 = h.f(androidx.compose.foundation.a.b(ls7.a(j.i(j.w(aVar2, 160.0f), 64.0f), j060.c(8.0f)), ((lib0) bVarI.O(oib0.a)).d1, zk40.a), 8.0f);
                aiv aivVarC2 = g75.c(ht.a.a, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS4 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarF2);
                yka.k.getClass();
                aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS4, yka.a.e);
                c1350a2 = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                g75.a(androidx.compose.foundation.a.a(ls7.a(j.i(j.g(aVar2, 1.0f), 48.0f), j060.c(4.0f)), hfsVar, null, 0.0f, 6), bVarI, 0);
                bVarI.X(true);
                i5++;
                z = true;
            }
            bVarI.X(false);
            bVarI.X(z);
        } else {
            i4 = i;
            bVarI.G();
            f3 = f2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final int i9 = i4;
            final float f5 = f3;
            eVarZ.d = new Function2() { // from class: frp
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    grp.a(hfsVar, i9, f5, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, a aVar, int i) {
        b bVarI = aVar.i(1774457455);
        int i2 = i | 6;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            qyd0 qyd0Var = oib0.a;
            hfs hfsVarA = p590.a(kotlin.collections.b.k(new j58(((lib0) bVarI.O(qyd0Var)).M), new j58(((lib0) bVarI.O(qyd0Var)).N), new j58(((lib0) bVarI.O(qyd0Var)).M)), null, 0, 0L, null, bVarI, 0, 123);
            dVar = d.a.b;
            d dVarG = h.g(j.e(dVar, 1.0f), 16.0f, 12.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI = bVarI;
                bVarI.F(aVar2);
            } else {
                bVarI = bVarI;
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG2 = j.g(dVar, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            a(hfsVarA, 4, 0.0f, bVarI, 48, 4);
            ty0.a(bVarI, j.w(dVar, 24.0f));
            a(hfsVarA, 2, 36.0f, bVarI, 432, 0);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new erp(dVar, i);
        }
    }
}
