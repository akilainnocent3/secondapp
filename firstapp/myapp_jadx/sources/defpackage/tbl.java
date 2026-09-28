package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tbl {
    public static final f4c a = new f4c(0.34f, 1.2f, 0.64f, 1.0f);

    public static final void a(final d dVar, final long j, final double d, final mxs mxsVar, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(231057078);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.e(j) ? 32 : 16) | (bVarI.f(d) ? 256 : 128) | (bVarI.M(mxsVar) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(wd0Var) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new pbl(wd0Var, d, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{wd0Var.d()}, 1));
            t9i t9iVar = t9i.e;
            List listK = kotlin.collections.b.k(new j58(r58.d(4285585175L)), new j58(r58.d(4289986161L)), new j58(r58.d(4285585175L)), new j58(r58.d(4289986161L)));
            float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
            bVar = bVarI;
            lkf0.b(str, dVar, 0L, j, null, t9iVar, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, new imf0(new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), 0L, null, null, null, null, 0L, 33554430), bVar, ((i2 << 3) & 112) | 196608 | ((i2 << 6) & 7168) | ((i2 << 9) & 3670016), 1572864, 65428);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, d, mxsVar, i) { // from class: obl
                public final /* synthetic */ long b;
                public final /* synthetic */ double c;
                public final /* synthetic */ mxs d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tbl.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:212:0x0547  */
    /* JADX WARN: Code duplicated, block: B:218:0x059e  */
    /* JADX WARN: Code duplicated, block: B:221:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:222:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:227:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:234:0x066e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0672  */
    /* JADX WARN: Code duplicated, block: B:238:0x0679  */
    /* JADX WARN: Code duplicated, block: B:239:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:240:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:242:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:243:0x0711  */
    /* JADX WARN: Code duplicated, block: B:249:0x0758  */
    /* JADX WARN: Code duplicated, block: B:252:0x077e  */
    /* JADX WARN: Code duplicated, block: B:253:0x0782  */
    /* JADX WARN: Code duplicated, block: B:258:0x079d  */
    /* JADX WARN: Code duplicated, block: B:264:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:271:0x0843  */
    /* JADX WARN: Code duplicated, block: B:274:0x0862  */
    /* JADX WARN: Code duplicated, block: B:276:0x086c  */
    /* JADX WARN: Code duplicated, block: B:277:0x0873  */
    /* JADX WARN: Code duplicated, block: B:279:0x0877  */
    /* JADX WARN: Code duplicated, block: B:281:0x0881  */
    /* JADX WARN: Code duplicated, block: B:283:0x08a6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final ap20 ap20Var, final boolean z, final float f, final float f2, final long j, final long j2, final long j3, final tp10 tp10Var, pr50 pr50Var, String str, final boolean z2, ibl iblVar, final Long l, final Long l2, final Function1 function1, final boolean z3, final String str2, final String str3, a aVar, final int i) {
        final String str4;
        b bVar;
        pr50 pr50Var2;
        final ibl iblVar2;
        float f3;
        boolean z4;
        String strC;
        String strB;
        Object qblVar;
        char c;
        float f4;
        a.C0041a.C0042a c0042a;
        boolean z5;
        wd0 wd0Var;
        wd0 wd0Var2;
        int i2;
        boolean z6;
        yka.a.d dVar;
        androidx.compose.foundation.layout.d dVar2;
        boolean zM;
        Object objY;
        boolean z7;
        int iHashCode;
        float f5;
        hfs hfsVar;
        long jD;
        int iHashCode2;
        boolean z8;
        n54 n54Var;
        d.a aVar2;
        boolean z9;
        int i3;
        Double dValueOf;
        wd0<gly, jj0> wd0Var3 = iblVar.a;
        function1.getClass();
        b bVarI = aVar.i(-1275940264);
        int i4 = i | (bVarI.d(ap20Var.ordinal()) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.c(f2) ? 2048 : 1024) | (bVarI.e(j) ? 16384 : 8192) | (bVarI.e(j2) ? 131072 : 65536) | (bVarI.e(j3) ? 1048576 : 524288) | (bVarI.M(tp10Var) ? 8388608 : 4194304) | (bVarI.M(pr50Var) ? 67108864 : 33554432) | (bVarI.M(str) ? 536870912 : 268435456);
        int i5 = 64 | (bVarI.b(z2) ? 4 : 2) | (bVarI.A(iblVar) ? 32 : 16) | (bVarI.M(l) ? 256 : 128) | (bVarI.M(l2) ? 2048 : 1024) | (bVarI.A(function1) ? 16384 : 8192) | (bVarI.b(z3) ? 131072 : 65536) | (bVarI.M(str2) ? 1048576 : 524288) | (bVarI.M(str3) ? 8388608 : 4194304);
        if (bVarI.q(i4 & 1, ((i4 & 306783251) == 306783250 && (4793491 & i5) == 4793490) ? false : true)) {
            lu00 lu00Var = lu00.b2;
            mxs mxsVarA = d1a.a(d9i.a(lu00Var.h, bVarI));
            ap20 ap20Var2 = ap20.d;
            if (ap20Var == ap20Var2) {
                f3 = 0.0f;
            } else {
                f3 = z ? 30.0f : -30.0f;
            }
            boolean z10 = tp10Var.b;
            if (ap20Var == ap20Var2) {
                bVarI.N(33142898);
                z4 = z10;
                strC = c.c(lu00Var.r0, new String[0], bVarI);
                bVarI.X(false);
            } else {
                z4 = z10;
                if (z4) {
                    bVarI.N(33144814);
                    strC = c.c(lu00Var.q0, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(33146544);
                    strC = c.c(lu00Var.p0, new String[0], bVarI);
                    bVarI.X(false);
                }
            }
            String str5 = strC;
            n54 n54Var2 = ht.a.d;
            n54 n54Var3 = ht.a.f;
            if (!z) {
                n54Var3 = n54Var2;
            }
            d.a aVar3 = d.a.b;
            d dVarJ = z ? h.j(aVar3, 8.0f, 0.0f, 0.0f, 0.0f, 14) : h.j(aVar3, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            if (!z) {
                n54Var2 = n54Var3;
            }
            n54 n54Var4 = ht.a.a;
            n54 n54Var5 = z ? n54Var4 : ht.a.c;
            if (z4) {
                bVarI.N(-1074521380);
                strB = c.c(lu00Var.B0, new String[0], bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-1074469672);
                bVarI.X(false);
                strB = fyx.b(tp10Var.a);
            }
            String str6 = strB;
            int i6 = i5 & 112;
            int i7 = i4 & 29360128;
            boolean z11 = ((i4 & 234881024) == 67108864) | ((i5 & 896) == 256) | (i6 == 32 || bVarI.A(iblVar)) | ((i4 & 3670016) == 1048576) | (i7 == 8388608);
            Object objY2 = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z11 || objY2 == c0042a2) {
                c = ' ';
                f4 = 0.0f;
                c0042a = c0042a2;
                z5 = z2;
                qblVar = new qbl(l, pr50Var, iblVar, j3, tp10Var, null);
                bVarI.r(qblVar);
            } else {
                qblVar = objY2;
                z5 = z2;
                c0042a = c0042a2;
                c = ' ';
                f4 = 0.0f;
            }
            xvf.e(bVarI, l, (Function2) qblVar);
            int i8 = (int) (j2 >> c);
            int i9 = (int) (j2 & 4294967295L);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((i8 - ((int) (j >> c))) / 2.0f)) << c) | (((long) Float.floatToRawIntBits((i9 - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(((i8 - Float.intBitsToFloat((int) (wd0Var3.d().a >> c))) - (mmdVar.C1(r10.b.d().floatValue()) / 2.0f)) - Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)))) << c) | (((long) Float.floatToRawIntBits(((i9 - Float.intBitsToFloat((int) (wd0Var3.d().a & 4294967295L))) - (mmdVar.C1(iblVar.c.d().floatValue()) / 2.0f)) - Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L);
            int i10 = bg0.b;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                wd0 wd0Var4 = new wd0(new gly(0L), gjs.g, null, 12);
                bVarI.r(wd0Var4);
                objY3 = wd0Var4;
            }
            wd0 wd0Var5 = (wd0) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(f4);
                bVarI.r(objY4);
            }
            wd0 wd0Var6 = (wd0) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar = (ytw) objY5;
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zA = bVarI.A(wd0Var5) | ((((i5 & 14) ^ 6) > 4 && bVarI.b(z5)) || (i5 & 6) == 4) | bVarI.e(jFloatToRawIntBits) | bVarI.A(wd0Var6);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                wd0Var = wd0Var5;
                wd0Var2 = wd0Var6;
                i2 = 6;
                ag0 ag0Var = new ag0(z5, wd0Var, jFloatToRawIntBits, wd0Var2, ytwVar, null);
                bVarI.r(ag0Var);
                objY6 = ag0Var;
            } else {
                wd0Var2 = wd0Var6;
                wd0Var = wd0Var5;
                i2 = 6;
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY6);
            long j4 = ((gly) wd0Var.d()).a;
            float fFloatValue = ((Number) wd0Var2.d()).floatValue();
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            vbl vblVar = new vbl(fFloatValue, j4, zBooleanValue);
            int i11 = i5 >> 9;
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = ee0.a(1.0f);
                bVarI.r(objY7);
            }
            wd0 wd0Var7 = (wd0) objY7;
            Object objY8 = bVarI.y();
            if (objY8 == c0042a) {
                objY8 = ee0.a(f4);
                bVarI.r(objY8);
            }
            wd0 wd0Var8 = (wd0) objY8;
            boolean zA2 = ((((i11 & 14) ^ i2) > 4 && bVarI.M(l2)) || (i11 & i2) == 4) | bVarI.A(wd0Var7) | bVarI.A(wd0Var8);
            Object objY9 = bVarI.y();
            if (zA2 || objY9 == c0042a) {
                objY9 = new sbl(r12, wd0Var7, wd0Var8, null);
                bVarI.r(objY9);
            }
            xvf.e(bVarI, r12, (Function2) objY9);
            float fFloatValue2 = ((Number) wd0Var7.d()).floatValue();
            float fFloatValue3 = ((Number) wd0Var8.d()).floatValue();
            final ubl ublVar = new ubl(fFloatValue2, fFloatValue3);
            d dVarI = j.i(j.w(aVar3, iblVar.b.d().floatValue()), iblVar.c.d().floatValue());
            boolean z12 = i6 == 32 || bVarI.A(iblVar);
            Object objY10 = bVarI.y();
            if (z12 || objY10 == c0042a) {
                z6 = false;
                objY10 = new jbl(iblVar, 0);
                bVarI.r(objY10);
            } else {
                z6 = false;
            }
            d dVarB = g.b(dVarI, (Function1) objY10);
            boolean zM2 = (i7 == 8388608 ? true : z6) | bVarI.M(ublVar);
            Object objY11 = bVarI.y();
            if (zM2 || objY11 == c0042a) {
                objY11 = new Function1() { // from class: kbl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f6 = ublVar.a;
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.b(tp10Var.e ? 0.5f : 1.0f);
                        a7lVar.k(f6);
                        a7lVar.v(f6);
                        return Unit.a;
                    }
                };
                bVarI.r(objY11);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarB, (Function1) objY11);
            aiv aivVarC = g75.c(ht.a.e, z6);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                dVar = dVar3;
            } else {
                dVar = dVar3;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                if (z3 || str2 == null || str3 == null) {
                    bVarI.N(-1511996464);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1503704522);
                    int i12 = i5 >> 18;
                    brj.c((i12 & 14) | 384 | (i12 & 112), bVarI, j.e(aVar3, 1.0f), str2, str3);
                    bVarI.X(false);
                }
                dVar2 = androidx.compose.foundation.layout.d.a;
                float f6 = f2 / 5.0f;
                yka.a.d dVar4 = dVar;
                c((i4 >> 21) & 112, i7f.b(f6, bVarI), mxsVarA, pr50Var, bVarI, dVar2.b(aVar3, n54Var5));
                d dVarE = j.e(aVar3, 1.0f);
                zM = bVarI.M(vblVar);
                objY = bVarI.y();
                if (!zM || objY == c0042a) {
                    z7 = false;
                    objY = new lbl(vblVar, 0);
                    bVarI.r(objY);
                } else {
                    z7 = false;
                }
                d dVarA2 = androidx.compose.ui.graphics.a.a(dVarE, (Function1) objY);
                aiv aivVarC2 = g75.c(n54Var4, z7);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar4);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                n54 n54Var6 = n54Var2;
                d dVarA3 = ls7.a(j.c(j.g(dVar2.b(aVar3, n54Var6), 0.8f), 0.4f), j060.c(10.0f));
                if (pr50Var != null || pr50Var.e == qr50.b) {
                    f5 = 10.0f;
                    if (z4) {
                        if (z) {
                            hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4293636166L)), new j58(r58.d(4294432105L))), null, 0L, 9187343241974906880L, 0);
                        } else {
                            hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4294432105L)), new j58(r58.d(4293636166L))), null, 0L, 9187343241974906880L, 0);
                        }
                    } else if (z) {
                        hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4279919793L)), new j58(r58.d(4286830077L))), null, 0L, 9187343241974906880L, 0);
                    } else {
                        hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4286830077L)), new j58(r58.d(4279919793L))), null, 0L, 9187343241974906880L, 0);
                    }
                } else {
                    f5 = 10.0f;
                    hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4281282351L)), new j58(j58.b)), null, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), 0);
                }
                d dVarA4 = androidx.compose.foundation.a.a(dVarA3, hfsVar, null, f4, 6);
                if (pr50Var != null || pr50Var.e == qr50.b) {
                    jD = j58.l;
                } else {
                    jD = r58.d(4294960720L);
                }
                d dVarA5 = d35.a(dVarA4, 1.0f, jD, j060.c(f5));
                aiv aivVarC3 = g75.c(n54Var4, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarA5);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar4);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar);
                lkf0.b(str6, dVar2.b(dVarJ, n54Var6), j58.f, i7f.b(f6, bVarI), null, t9i.e, mxsVarA, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130960);
                bVarI.X(true);
                d dVarE2 = j.e(aVar3, 1.0f);
                if (!z2 || z4) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                n54Var = n54Var5;
                bg0.a(dVarE2, n54Var3, str5, z, f3, jFloatToRawIntBits2, fFloatValue, zBooleanValue, fFloatValue3, function1, z8, tp10Var.c, bVarI, ((i4 << 6) & 7168) | 6 | ((i5 << 15) & 1879048192));
                bVar = bVarI;
                bVar.X(true);
                if (str != null || str.length() <= 0) {
                    str4 = str;
                    aVar2 = aVar3;
                    z9 = false;
                    i3 = -1511996464;
                    bVar.N(-1511996464);
                    bVar.X(false);
                } else {
                    bVar.N(-1501214447);
                    aVar2 = aVar3;
                    str4 = str;
                    pg0.a((i4 >> 24) & 112, bVar, dVar2.b(aVar2, n54Var), str4);
                    z9 = false;
                    bVar.X(false);
                    i3 = -1511996464;
                }
                iblVar2 = iblVar;
                if (((Boolean) ((x5a0) iblVar2.d).getValue()).booleanValue()) {
                    bVar.N(1614149793);
                    pr50Var2 = pr50Var;
                    if (pr50Var != null) {
                        dValueOf = Double.valueOf(pr50Var2.a);
                    } else {
                        dValueOf = null;
                    }
                    if (dValueOf == null) {
                        bVar.N(-1500963968);
                    } else {
                        bVar.N(-1500963967);
                        a(dVar2.b(aVar2, n54Var), i7f.b(f2 / 3.0f, bVar), dValueOf.doubleValue(), mxsVarA, bVar, 0);
                        Unit unit = Unit.a;
                    }
                    bVar.X(z9);
                } else {
                    pr50Var2 = pr50Var;
                    bVar.N(i3);
                }
                bVar.X(z9);
                bVar.X(true);
            }
            n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            if (z3) {
                bVarI.N(-1511996464);
                bVarI.X(false);
            } else {
                bVarI.N(-1511996464);
                bVarI.X(false);
            }
            dVar2 = androidx.compose.foundation.layout.d.a;
            float f7 = f2 / 5.0f;
            yka.a.d dVar5 = dVar;
            c((i4 >> 21) & 112, i7f.b(f7, bVarI), mxsVarA, pr50Var, bVarI, dVar2.b(aVar3, n54Var5));
            d dVarE3 = j.e(aVar3, 1.0f);
            zM = bVarI.M(vblVar);
            objY = bVarI.y();
            if (zM) {
                z7 = false;
                objY = new lbl(vblVar, 0);
                bVarI.r(objY);
            } else {
                z7 = false;
                objY = new lbl(vblVar, 0);
                bVarI.r(objY);
            }
            d dVarA6 = androidx.compose.ui.graphics.a.a(dVarE3, (Function1) objY);
            aiv aivVarC4 = g75.c(n54Var4, z7);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = androidx.compose.ui.c.c(bVarI, dVarA6);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar2);
            n54 n54Var7 = n54Var2;
            d dVarA7 = ls7.a(j.c(j.g(dVar2.b(aVar3, n54Var7), 0.8f), 0.4f), j060.c(10.0f));
            if (pr50Var != null) {
                f5 = 10.0f;
                if (z4) {
                    if (z) {
                        hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4293636166L)), new j58(r58.d(4294432105L))), null, 0L, 9187343241974906880L, 0);
                    } else {
                        hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4294432105L)), new j58(r58.d(4293636166L))), null, 0L, 9187343241974906880L, 0);
                    }
                } else if (z) {
                    hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4279919793L)), new j58(r58.d(4286830077L))), null, 0L, 9187343241974906880L, 0);
                } else {
                    hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4286830077L)), new j58(r58.d(4279919793L))), null, 0L, 9187343241974906880L, 0);
                }
            } else {
                f5 = 10.0f;
                if (z4) {
                    if (z) {
                        hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4293636166L)), new j58(r58.d(4294432105L))), null, 0L, 9187343241974906880L, 0);
                    } else {
                        hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4294432105L)), new j58(r58.d(4293636166L))), null, 0L, 9187343241974906880L, 0);
                    }
                } else if (z) {
                    hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4279919793L)), new j58(r58.d(4286830077L))), null, 0L, 9187343241974906880L, 0);
                } else {
                    hfsVar = new hfs(kotlin.collections.b.k(new j58(r58.d(4286830077L)), new j58(r58.d(4279919793L))), null, 0L, 9187343241974906880L, 0);
                }
            }
            d dVarA8 = androidx.compose.foundation.a.a(dVarA7, hfsVar, null, f4, 6);
            if (pr50Var != null) {
                jD = j58.l;
            } else {
                jD = j58.l;
            }
            d dVarA9 = d35.a(dVarA8, 1.0f, jD, j060.c(f5));
            aiv aivVarC5 = g75.c(n54Var4, false);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS5 = bVarI.S();
            d dVarC5 = androidx.compose.ui.c.c(bVarI, dVarA9);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar2);
            hlh0.a(bVarI, ne00VarS5, dVar5);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC5, cVar2);
            lkf0.b(str6, dVar2.b(dVarJ, n54Var7), j58.f, i7f.b(f7, bVarI), null, t9i.e, mxsVarA, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 130960);
            bVarI.X(true);
            d dVarE4 = j.e(aVar3, 1.0f);
            if (z2) {
                z8 = false;
            } else {
                z8 = false;
            }
            n54Var = n54Var5;
            bg0.a(dVarE4, n54Var3, str5, z, f3, jFloatToRawIntBits2, fFloatValue, zBooleanValue, fFloatValue3, function1, z8, tp10Var.c, bVarI, ((i4 << 6) & 7168) | 6 | ((i5 << 15) & 1879048192));
            bVar = bVarI;
            bVar.X(true);
            if (str != null) {
                str4 = str;
                aVar2 = aVar3;
                z9 = false;
                i3 = -1511996464;
                bVar.N(-1511996464);
                bVar.X(false);
            } else {
                str4 = str;
                aVar2 = aVar3;
                z9 = false;
                i3 = -1511996464;
                bVar.N(-1511996464);
                bVar.X(false);
            }
            iblVar2 = iblVar;
            if (((Boolean) ((x5a0) iblVar2.d).getValue()).booleanValue()) {
                bVar.N(1614149793);
                pr50Var2 = pr50Var;
                if (pr50Var != null) {
                    dValueOf = Double.valueOf(pr50Var2.a);
                } else {
                    dValueOf = null;
                }
                if (dValueOf == null) {
                    bVar.N(-1500963968);
                } else {
                    bVar.N(-1500963967);
                    a(dVar2.b(aVar2, n54Var), i7f.b(f2 / 3.0f, bVar), dValueOf.doubleValue(), mxsVarA, bVar, 0);
                    Unit unit2 = Unit.a;
                }
                bVar.X(z9);
            } else {
                pr50Var2 = pr50Var;
                bVar.N(i3);
            }
            bVar.X(z9);
            bVar.X(true);
        } else {
            str4 = str;
            bVar = bVarI;
            pr50Var2 = pr50Var;
            iblVar2 = iblVar;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final pr50 pr50Var3 = pr50Var2;
            eVarZ.d = new Function2(z, f, f2, j, j2, j3, tp10Var, pr50Var3, str4, z2, iblVar2, l, l2, function1, z3, str2, str3, i) { // from class: mbl
                public final /* synthetic */ ibl A;
                public final /* synthetic */ Long B;
                public final /* synthetic */ Long C;
                public final /* synthetic */ Function1 D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long i;
                public final /* synthetic */ tp10 v;
                public final /* synthetic */ pr50 w;
                public final /* synthetic */ String y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    tbl.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, final long j, final mxs mxsVar, final pr50 pr50Var, a aVar, final d dVar) {
        int i2;
        b bVar;
        b bVarI = aVar.i(1812537979);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(pr50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(mxsVar) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            if (pr50Var == null || pr50Var.e == qr50.b) {
                bVar = bVarI;
                bVar.N(976203047);
            } else {
                bVarI.N(990301506);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = ee0.a(0.0f);
                    bVarI.r(objY);
                }
                wd0 wd0Var = (wd0) objY;
                boolean zA = bVarI.A(wd0Var);
                Object objY2 = bVarI.y();
                if (zA || objY2 == c0042a) {
                    objY2 = new rbl(wd0Var, null);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, pr50Var, (Function2) objY2);
                String str = "+ " + pr50Var.b + ' ' + ((int) pr50Var.a);
                t9i t9iVar = t9i.e;
                long jD = r58.d(4278253841L);
                boolean zA2 = bVarI.A(wd0Var);
                Object objY3 = bVarI.y();
                if (zA2 || objY3 == c0042a) {
                    objY3 = new uig(wd0Var, 1);
                    bVarI.r(objY3);
                }
                lkf0.b(str, androidx.compose.ui.graphics.a.a(dVar, (Function1) objY3), jD, j, null, t9iVar, mxsVar, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, ((i2 << 3) & 7168) | 196992 | ((i2 << 9) & 3670016), 0, 130960);
                bVar = bVarI;
            }
            bVar.X(false);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nbl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tbl.c(qj40.a(i | 1), j, mxsVar, pr50Var, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }
}
