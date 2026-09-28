package defpackage;

import androidx.compose.foundation.f;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class pz90 {
    public static final pz90 a = new pz90();
    public static final float b;
    public static final float c;
    public static final j90 d;

    static {
        float f = x0a0.n;
        b = f;
        c = f;
        d = m90.a();
    }

    public static ez90 d(a aVar) {
        return g((d68) aVar.O(g68.a));
    }

    public static void e(tcf tcfVar, long j, float f, long j2) {
        tcf.n0(tcfVar, j2, tcfVar.C1(f) / 2.0f, j, 0.0f, null, 120);
    }

    public static void f(tcf tcfVar, i3z i3zVar, long j, long j2, long j3, float f, float f2) {
        lz50 lz50VarC;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (i3zVar == i3z.a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            lz50VarC = bys.c(pk40.b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            lz50VarC = bys.c(pk40.b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        j90 j90Var = d;
        bxz.s(j90Var, lz50VarC);
        tcf.Q1(tcfVar, j90Var, j3, 0.0f, null, 60);
        j90Var.j();
    }

    public static ez90 g(d68 d68Var) {
        ez90 ez90Var = d68Var.i0;
        if (ez90Var != null) {
            return ez90Var;
        }
        long jC = g68.c(d68Var, x0a0.h);
        e68 e68Var = x0a0.a;
        long jC2 = g68.c(d68Var, e68Var);
        e68 e68Var2 = x0a0.l;
        long jC3 = g68.c(d68Var, e68Var2);
        long jC4 = g68.c(d68Var, e68Var2);
        long jC5 = g68.c(d68Var, e68Var);
        long jH = r58.h(j58.c(x0a0.e, g68.c(d68Var, x0a0.d)), d68Var.p);
        e68 e68Var3 = x0a0.b;
        long jC6 = g68.c(d68Var, e68Var3);
        float f = x0a0.c;
        long jC7 = j58.c(f, jC6);
        e68 e68Var4 = x0a0.f;
        long jC8 = g68.c(d68Var, e68Var4);
        float f2 = x0a0.g;
        ez90 ez90Var2 = new ez90(jC, jC2, jC3, jC4, jC5, jH, jC7, j58.c(f2, jC8), j58.c(f2, g68.c(d68Var, e68Var4)), j58.c(f, g68.c(d68Var, e68Var3)));
        d68Var.i0 = ez90Var2;
        return ez90Var2;
    }

    public final void a(final psw pswVar, d dVar, final ez90 ez90Var, final boolean z, long j, a aVar, final int i) {
        final long j2;
        long j3;
        b bVarI = aVar.i(-290277409);
        int i2 = i | (bVarI.M(pswVar) ? 4 : 2) | 48 | (bVarI.M(ez90Var) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | 24576;
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                j3 = d0a0.c;
                dVar = d.a.b;
            } else {
                bVarI.G();
                j3 = j;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new SnapshotStateList();
                bVarI.r(objY);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objY;
            boolean z2 = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new nz90(pswVar, snapshotStateList, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, pswVar, (Function2) objY2);
            ty0.a(bVarI, androidx.compose.foundation.a.b(f.a(j.s(!snapshotStateList.isEmpty() ? k7f.a(k7f.c(j3) / 2.0f, k7f.b(j3)) : j3, dVar), pswVar), z ? ez90Var.a : ez90Var.f, xy80.b(x0a0.j, bVarI)));
            j2 = j3;
        } else {
            bVarI.G();
            j2 = j;
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(pswVar, dVar2, ez90Var, z, j2, i) { // from class: jz90
                public final /* synthetic */ psw b;
                public final /* synthetic */ d c;
                public final /* synthetic */ ez90 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(196609);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void b(final w0a0 w0a0Var, d dVar, final boolean z, final ez90 ez90Var, Function2 function2, gaj gajVar, float f, float f2, a aVar, final int i) {
        int i2;
        final d dVar2;
        final Function2 function3;
        final gaj gajVar2;
        final float f3;
        final float f4;
        int i3;
        Function2 function4;
        float f5;
        gaj gajVar3;
        d dVar3;
        float f6;
        b bVarI = aVar.i(49984771);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(w0a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= bVarI.M(ez90Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= bVarI.M(this) ? 67108864 : 33554432;
        }
        if (bVarI.q(i5 & 1, (38347923 & i5) != 38347922)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && bVarI.M(ez90Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z2 || objY == c0042a) {
                    objY = new Function2() { // from class: hz90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            tcf tcfVar = (tcf) obj;
                            pz90 pz90Var = pz90.a;
                            long jB = ez90Var.b(z, true);
                            pz90.e(tcfVar, ((gly) obj2).a, pz90.b, jB);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                Function2 function5 = (Function2) objY;
                i3 = i5 & (-57345);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = oz90.a;
                    bVarI.r(objY2);
                }
                float f7 = d0a0.d;
                function4 = function5;
                f5 = d0a0.e;
                gajVar3 = (gaj) objY2;
                dVar3 = d.a.b;
                f6 = f7;
            } else {
                bVarI.G();
                i3 = i5 & (-57345);
                dVar3 = dVar;
                function4 = function2;
                gajVar3 = gajVar;
                f6 = f;
                f5 = f2;
            }
            bVarI.Y();
            int i6 = i3 << 3;
            c(w0a0Var, dVar3, z, ez90Var, function4, gajVar3, f6, f5, bVarI, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            dVar2 = dVar3;
            f4 = f5;
            f3 = f6;
            gajVar2 = gajVar3;
            function3 = function4;
        } else {
            bVarI.G();
            dVar2 = dVar;
            function3 = function2;
            gajVar2 = gajVar;
            f3 = f;
            f4 = f2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.b(w0a0Var, dVar2, z, ez90Var, function3, gajVar2, f3, f4, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public final void c(final w0a0 w0a0Var, final d dVar, final boolean z, final ez90 ez90Var, final Function2 function2, final gaj gajVar, final float f, final float f2, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        b bVar;
        b bVarI = aVar.i(133396521);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(w0a0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.c(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.M(ez90Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= bVarI.A(gajVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= bVarI.c(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.c(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.b(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.b(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jB = ez90Var.b(z, false);
            final long jB2 = ez90Var.b(z, true);
            final long jA = ez90Var.a(z, false);
            final long jA2 = ez90Var.a(z, true);
            int i5 = i3;
            d dVarC = w0a0Var.m == i3z.a ? j.c(j.w(dVar, d0a0.a), 1.0f) : j.i(j.g(dVar, 1.0f), d0a0.a);
            int i6 = i5 & 112;
            boolean zA = (i6 == 32) | bVarI.A(w0a0Var);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new gaj() { // from class: kz90
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iY0;
                        t tVar = (t) obj;
                        final y yVarD0 = ((vhv) obj2).d0(((kxa) obj3).a);
                        if (g7f.b(Float.NaN, Float.NaN)) {
                            iY0 = w0a0Var.m == i3z.a ? yVarD0.a / 2 : yVarD0.b / 2;
                        } else {
                            iY0 = tVar.y0(Float.NaN);
                        }
                        return tVar.e1(yVarD0.a, yVarD0.b, jpu.b(new Pair(d0a0.f, Integer.valueOf(iY0))), new Function1() { // from class: gz90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ((y.a) obj4).s(yVarD0, 0, 0, 0.0f);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(objY);
            }
            d dVarN = dVarC.n(androidx.compose.ui.layout.j.a(d.a.b, (gaj) objY));
            boolean zA2 = (i6 == 32) | bVarI.A(w0a0Var) | bVarI.e(jB) | bVarI.e(jB2) | bVarI.e(jA) | bVarI.e(jA2) | ((i5 & 29360128) == 8388608) | ((i5 & 234881024) == 67108864) | ((i5 & 458752) == 131072) | ((i5 & 3670016) == 1048576) | ((i5 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                bVar = bVarI;
                Function1 function1 = new Function1() { // from class: lz90
                    /* JADX WARN: Code duplicated, block: B:127:0x031f  */
                    /* JADX WARN: Code duplicated, block: B:92:0x0246  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float fC1;
                        long j;
                        int iD;
                        float f3;
                        i3z i3zVar;
                        float f4;
                        char c2;
                        Function2 function3;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        tcf tcfVar;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        tcf tcfVar2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        float fC2;
                        float fC3;
                        tcf tcfVar3 = (tcf) obj;
                        boolean zB = g7f.b(Float.NaN, Float.NaN);
                        w0a0 w0a0Var2 = w0a0Var;
                        if (zB) {
                            fC1 = (w0a0Var2.m == i3z.a ? Float.intBitsToFloat((int) (tcfVar3.d() >> 32)) : Float.intBitsToFloat((int) (tcfVar3.d() & 4294967295L))) / 2.0f;
                        } else {
                            fC1 = tcfVar3.C1(Float.NaN);
                        }
                        pz90 pz90Var = pz90.a;
                        float[] fArr = w0a0Var2.g;
                        float fC = w0a0Var2.c();
                        int i7 = 0;
                        float fU1 = tcfVar3.u1(0);
                        float fU2 = tcfVar3.u1(0);
                        float fU3 = tcfVar3.u1(((u5a0) w0a0Var2.k).D());
                        float fU4 = tcfVar3.u1(((u5a0) w0a0Var2.l).D());
                        float fV1 = tcfVar3.v1(fC1);
                        i3z i3zVar2 = w0a0Var2.m;
                        boolean z2 = i3zVar2 == i3z.a;
                        boolean z3 = tcfVar3.getLayoutDirection() == asr.b;
                        boolean z4 = z3 && !z2;
                        float fC4 = tcfVar3.C1(fV1);
                        if (z2) {
                            j = 4294967295L;
                            iD = (int) (tcfVar3.d() & 4294967295L);
                        } else {
                            j = 4294967295L;
                            iD = (int) (tcfVar3.d() >> 32);
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat(iD);
                        if (Intrinsics.b(0.0f, ay0.x(fArr)) || Intrinsics.b(0.0f, ay0.J(fArr))) {
                        }
                        float fA = (fArr.length == 0 || (Intrinsics.b(fC, ay0.x(fArr)) || Intrinsics.b(fC, ay0.J(fArr)))) ? hxa.a(fIntBitsToFloat, 0.0f, fC, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fC4 * 2.0f)) * fC) + 0.0f + fC4;
                        int length = fArr.length;
                        float fC5 = tcfVar3.C1(f2);
                        float f5 = f;
                        if (Float.compare(f5, 0.0f) > 0) {
                            if (z2) {
                                tcfVar3.C1(fU2);
                                tcfVar3.C1(f5);
                                fC2 = tcfVar3.C1(fU4) / 2.0f;
                                fC3 = tcfVar3.C1(f5);
                            } else {
                                tcfVar3.C1(fU1);
                                tcfVar3.C1(f5);
                                fC2 = tcfVar3.C1(fU3) / 2.0f;
                                fC3 = tcfVar3.C1(f5);
                            }
                            f3 = fC3 + fC2;
                        } else {
                            f3 = 0.0f;
                        }
                        long jR1 = tcfVar3.R1();
                        Float.intBitsToFloat((int) (z2 ? jR1 & j : jR1 >> 32));
                        float f6 = (fIntBitsToFloat - f3) - fC4;
                        Function2 function4 = function2;
                        if (fA < f6) {
                            float f7 = z4 ? fC4 : fC5;
                            float f8 = z4 ? fC5 : fC4;
                            float f9 = fA + f3;
                            float f10 = fIntBitsToFloat - f9;
                            if (z2) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f9);
                                f4 = 0.0f;
                                c2 = ' ';
                            } else {
                                f4 = 0.0f;
                                c2 = ' ';
                                if (z3) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f9);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j2 = (jFloatToRawIntBits6 << c2) | (((long) iFloatToRawIntBits4) & j);
                            if (z2) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar3.d() >> c2)));
                                tcfVar2 = tcfVar3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f10);
                            } else {
                                tcfVar2 = tcfVar3;
                                if (z3) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar2.d() >> c2)) - f9;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (tcfVar2.d() & j));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (tcfVar2.d() & j));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f10);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j3 = (jFloatToRawIntBits8 & j) | (jFloatToRawIntBits7 << c2);
                            function3 = function4;
                            tcfVar3 = tcfVar2;
                            i3zVar = i3zVar2;
                            pz90.f(tcfVar3, i3zVar, j2, j3, jB, f7, f8);
                            if (z2) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar3.R1() >> c2)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fC4);
                            } else {
                                if (z3) {
                                    jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fC4)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar3.R1() & j)))) & j);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (tcfVar3.R1() & j));
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fC4);
                                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                if (function3 != null) {
                                    function3.invoke(tcfVar3, new gly(jFloatToRawIntBits10));
                                    Unit unit = Unit.a;
                                }
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j) | (jFloatToRawIntBits9 << c2);
                            if (function3 != null) {
                                function3.invoke(tcfVar3, new gly(jFloatToRawIntBits10));
                                Unit unit2 = Unit.a;
                            }
                        } else {
                            i3zVar = i3zVar2;
                            f4 = 0.0f;
                            c2 = ' ';
                            function3 = function4;
                        }
                        float f11 = fA - f3;
                        float f12 = !z4 ? fC4 : fC5;
                        float f13 = z4 ? fC4 : fC5;
                        float f14 = z4 ? f11 : f11 - f4;
                        if (f14 > f12) {
                            if (!z2 && z3) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar3.d() >> c2)) - f11);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f4);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f4);
                            }
                            long j4 = (jFloatToRawIntBits3 << c2) | (((long) iFloatToRawIntBits2) & j);
                            if (z2) {
                                tcfVar = tcfVar3;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f14)) & j) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar3.d() >> c2)))) << c2);
                            } else {
                                tcfVar = tcfVar3;
                                if (z3) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (tcfVar.d() & j));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f11);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (tcfVar.d() & j));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f14);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits3) & j);
                            }
                            long j5 = jFloatToRawIntBits5;
                            tcfVar3 = tcfVar;
                            pz90.f(tcfVar3, i3zVar, j4, j5, jB2, f12, f13);
                        }
                        float f15 = f4 + fC4;
                        float f16 = fIntBitsToFloat - fC4;
                        float f17 = fA - f3;
                        float f18 = fA + f3;
                        int length2 = fArr.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f19 = fArr[i7];
                            int i9 = i8 + 1;
                            if (function3 == null || i8 != fArr.length - 1) {
                                float fB = vcv.b(f15, f16, f19);
                                if (fB < f17 || fB > f18) {
                                    if (z2) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar3.R1() >> c2)));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fB);
                                    } else {
                                        if (z3) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (tcfVar3.d() >> c2)) - fB;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (tcfVar3.R1() & j));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (tcfVar3.R1() & j));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fB);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    gajVar.invoke(tcfVar3, new gly((jFloatToRawIntBits2 & j) | (jFloatToRawIntBits << c2)), new j58((fB < f4 || fB > f11) ? jA : jA2));
                                } else {
                                    f15 = f15;
                                    f17 = f17;
                                }
                            } else {
                                f15 = f15;
                                f17 = f17;
                            }
                            i7++;
                            i8 = i9;
                            f15 = f15;
                            f17 = f17;
                        }
                        return Unit.a;
                    }
                };
                bVar.r(function1);
                objY2 = function1;
            } else {
                bVar = bVarI;
            }
            rxo.b(dVarN, (Function1) objY2, bVar, 0);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mz90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.c(w0a0Var, dVar, z, ez90Var, function2, gajVar, f, f2, (a) obj, qj40.a(i | 1), qj40.a(i2));
                    return Unit.a;
                }
            };
        }
    }
}
