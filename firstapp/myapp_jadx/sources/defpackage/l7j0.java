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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class l7j0 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-238411348);
        if (bVarI.q(i & 1, i != 0)) {
            g75.a(androidx.compose.foundation.a.b(j.i(j.g(d.a.b, 1.0f), 1.0f), j58.c(0.15f, j58.f), zk40.a), bVarI, 6);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new j7j0();
        }
    }

    public static final void b(final mxs mxsVar, final String str, final String str2, final long j, final long j2, a aVar, final int i) {
        mxs mxsVar2;
        int i2;
        String str3;
        b bVar;
        b bVarI = aVar.i(222352460);
        if ((i & 6) == 0) {
            mxsVar2 = mxsVar;
            i2 = (bVarI.M(mxsVar2) ? 4 : 2) | i;
        } else {
            mxsVar2 = mxsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= bVarI.M(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.e(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.e(j2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarH = h.h(j.g(d.a.b, 1.0f), 0.0f, 10.0f, 1);
            d160 d160VarA = b160.a(kw0.g, ht.a.j, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            long jB = i7f.b(11.0f, bVarI);
            t9i t9iVar = t9i.e;
            int i3 = i2 >> 3;
            int i4 = (i2 << 18) & 3670016;
            lkf0.b(str, null, j, jB, null, t9iVar, mxsVar2, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, (i3 & 896) | (i3 & 14) | 196608 | i4, 0, 130962);
            bVar = bVarI;
            int i5 = i2 >> 6;
            lkf0.b(str3, null, j2, i7f.b(11.0f, bVar), null, t9iVar, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, (i5 & 896) | (i5 & 14) | 196608 | i4, 0, 130962);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: i7j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l7j0.b(mxsVar, str, str2, j, j2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v61 */
    public static final void c(final d dVar, final mxs mxsVar, final boolean z, final String str, final double d, final Double d2, final Double d3, a aVar, final int i) {
        int i2;
        b bVar;
        int i3;
        int i4;
        str.getClass();
        b bVarI = aVar.i(173351929);
        if ((i & 48) == 0) {
            i2 = (bVarI.M(mxsVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.f(d) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(d2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(d3) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            com.sportygames.newcms.b bVar2 = (com.sportygames.newcms.b) bVarI.O(com.sportygames.newcms.c.a);
            Unit unit = Unit.a;
            boolean zA = ((i2 & 896) == 256) | bVarI.A(bVar2);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new k7j0(z, bVar2, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            double dDoubleValue = (d2 != null ? d2.doubleValue() : 0.0d) + d + (d3 != null ? d3.doubleValue() : 0.0d);
            d dVarG = j.g(dVar, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            int i5 = i2;
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar3 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar3);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            lu00 lu00Var = lu00.b2;
            String strC = com.sportygames.newcms.c.c(lu00Var.E0, new String[0], bVarI);
            long jB = i7f.b(16.0f, bVarI);
            t9i t9iVar = t9i.e;
            long jD = r58.d(4294827306L);
            d.a aVar3 = d.a.b;
            lkf0.b(strC, h.j(aVar3, 0.0f, 0.0f, 0.0f, 8.0f, 7), jD, jB, null, t9iVar, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i5 << 15) & 3670016) | 197040, 0, 130960);
            d dVarG2 = h.g(androidx.compose.foundation.a.b(ls7.a(j.g(aVar3, 1.0f), j060.c(8.0f)), j58.c(0.4f, j58.b), zk40.a), 11.0f, 11.0f);
            i78 i78VarA2 = g78.a(new kw0.i(0.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar3);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String strC2 = com.sportygames.newcms.c.c(lu00Var.G0, new String[0], bVarI);
            String str2 = str + ' ' + d6f.a(d);
            long j = j58.f;
            int i6 = ((i5 >> 3) & 14) | 27648;
            b(mxsVar, strC2, str2, j, j, bVarI, i6);
            b bVar4 = bVarI;
            if (d2 != null) {
                bVar4.N(-258014064);
                a(0, bVar4);
                b(mxsVar, com.sportygames.newcms.c.c(lu00Var.H0, new String[0], bVar4), "+ " + str + ' ' + d6f.a(d2.doubleValue()), j, j, bVar4, i6);
                bVar4 = bVar4;
                i3 = 0;
            } else {
                i3 = 0;
                bVar4.N(-261015019);
            }
            bVar4.X(i3);
            if (d3 != null) {
                bVar4.N(-257587504);
                a(i3, bVar4);
                b bVar5 = bVar4;
                b(mxsVar, com.sportygames.newcms.c.c(lu00Var.I0, new String[i3], bVar4), "+ " + str + ' ' + d6f.a(d3.doubleValue()), j, j, bVar5, i6);
                bVar4 = bVar5;
                i4 = 0;
            } else {
                bVar4.N(-261015019);
                i4 = i3;
            }
            bVar4.X(i4);
            a(i4, bVar4);
            b bVar6 = bVar4;
            b(mxsVar, com.sportygames.newcms.c.c(lu00Var.J0, new String[i4], bVar4), str + ' ' + d6f.a(dDoubleValue), r58.d(4294956800L), r58.d(4294956800L), bVar6, i6);
            bVar = bVar6;
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h7j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l7j0.c(dVar, mxsVar, z, str, d, d2, d3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
