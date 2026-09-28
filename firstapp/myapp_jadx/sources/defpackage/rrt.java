package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rrt {
    public static final void a(d dVar, trt trtVar, op8 op8Var, a aVar, final int i, final int i2) {
        op8 op8Var2;
        final d dVar2;
        final trt trtVar2;
        b bVarI = aVar.i(1081653748);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.d(trtVar == null ? -1 : trtVar.ordinal()) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            trt trtVar3 = i4 != 0 ? trt.c : trtVar;
            trtVar3.getClass();
            final float fB = mla.b(1.0f, bVarI);
            final long j = trtVar3.a;
            long j2 = trtVar3.b;
            final float f = fB / 2.0f;
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(j.g(h.h(aVar2, 16.0f, 0.0f, 2), 1.0f), j2, zk40.a);
            boolean zE = bVarI.e(j) | bVarI.c(f) | bVarI.c(fB);
            Object objY = bVarI.y();
            if (zE || objY == a.C0041a.a) {
                objY = new Function1() { // from class: prt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        qc6.b bVar;
                        long j3;
                        long j4 = j;
                        float f2 = f;
                        float f3 = fB;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            j3 = jD;
                            bVar = bVarF1;
                            try {
                                tcf.Z1(lzaVar, j4, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), f3, 0, null, 496);
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f2;
                                tcf.Z1(lzaVar, j4, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), f3, 0, null, 496);
                                hrh.a(bVar, j3);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                hrh.a(bVar, j3);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVarF1;
                            j3 = jD;
                        }
                    }
                };
                bVarI.r(objY);
            }
            d dVarC = androidx.compose.ui.draw.a.c(dVarB, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            op8Var2 = op8Var;
            w1i.a(6, op8Var2, bVarI, true);
            trtVar2 = trtVar3;
            dVar2 = aVar2;
        } else {
            op8Var2 = op8Var;
            bVarI.G();
            dVar2 = dVar;
            trtVar2 = trtVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final op8 op8Var3 = op8Var2;
            eVarZ.d = new Function2() { // from class: qrt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rrt.a(dVar2, trtVar2, op8Var3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    public static final void b(float f, final trt trtVar, Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i, final int i2) {
        float f2;
        int i3;
        Function2<? super a, ? super Integer, Unit> function3;
        boolean z;
        final float f3;
        final Function2<? super a, ? super Integer, Unit> function4;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function5;
        final float fB;
        final float f4;
        final float fB2;
        final long j;
        boolean zE;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z2;
        trtVar.getClass();
        b bVarI = aVar.i(-671767424);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (bVarI.c(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                function3 = function2;
                i3 |= bVarI.A(function3) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i4 != 0) {
                    f3 = 24.0f;
                } else {
                    f3 = f2;
                }
                if (i5 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                fB = mla.b(1.0f, bVarI);
                f4 = fB / 2.0f;
                fB2 = mla.b(8.0f, bVarI) - f4;
                j = trtVar.a;
                d dVarB = androidx.compose.foundation.a.b(j.i(j.g(h.h(d.a.b, 16.0f, 0.0f, 2), 1.0f), f3), trtVar.b, j060.d(0.0f, 0.0f, 8.0f, 8.0f));
                zE = bVarI.e(j) | bVarI.c(f4) | bVarI.c(fB2) | bVarI.c(fB);
                objY = bVarI.y();
                if (zE || objY == a.C0041a.a) {
                    Function1 function1 = new Function1() { // from class: krt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws Throwable {
                            qc6.b bVar;
                            long j2;
                            long j3 = j;
                            float f5 = f4;
                            float f6 = fB2;
                            float f7 = fB;
                            lza lzaVar = (lza) obj;
                            lzaVar.getClass();
                            lzaVar.b2();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                            qc6.b bVarF1 = lzaVar.F1();
                            long jD = bVarF1.d();
                            bVarF1.a().p();
                            try {
                                bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                float f8 = f6 * 2.0f;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f8) - f5)) & 4294967295L);
                                bVar = bVarF1;
                                j2 = jD;
                                try {
                                    tcf.I(lzaVar, j3, 90.0f, 90.0f, false, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f5)) & 4294967295L) | (Float.floatToRawIntBits(f6 + f5) << 32);
                                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f6) - f5;
                                    tcf.Z1(lzaVar, j3, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f5)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), f7, 0, null, 496);
                                    tcf.I(lzaVar, j3, 0.0f, 90.0f, false, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f8) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f8) - f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                    tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f6) - f5)) & 4294967295L), f7, 0, null, 496);
                                    tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f6) - f5)) & 4294967295L), f7, 0, null, 496);
                                    hrh.a(bVar, j2);
                                    return Unit.a;
                                } catch (Throwable th) {
                                    th = th;
                                    hrh.a(bVar, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar = bVarF1;
                                j2 = jD;
                            }
                        }
                    };
                    bVarI.r(function1);
                    objY = function1;
                }
                d dVarC = androidx.compose.ui.draw.a.c(dVarB, (Function1) objY);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarC);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                if (function5 == null) {
                    bVarI.N(1386575567);
                    z2 = false;
                } else {
                    z2 = false;
                    bVarI.N(1386575568);
                    function5.invoke(bVarI, 0);
                }
                bVarI.X(z2);
                bVarI.X(true);
                function4 = function5;
            } else {
                bVarI.G();
                f3 = f2;
                function4 = function3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: lrt
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rrt.b(f3, trtVar, function4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        function3 = function2;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i4 != 0) {
                f3 = 24.0f;
            } else {
                f3 = f2;
            }
            if (i5 != 0) {
                function5 = null;
            } else {
                function5 = function3;
            }
            fB = mla.b(1.0f, bVarI);
            f4 = fB / 2.0f;
            fB2 = mla.b(8.0f, bVarI) - f4;
            j = trtVar.a;
            d dVarB2 = androidx.compose.foundation.a.b(j.i(j.g(h.h(d.a.b, 16.0f, 0.0f, 2), 1.0f), f3), trtVar.b, j060.d(0.0f, 0.0f, 8.0f, 8.0f));
            zE = bVarI.e(j) | bVarI.c(f4) | bVarI.c(fB2) | bVarI.c(fB);
            objY = bVarI.y();
            if (zE) {
                Function1 function6 = new Function1() { // from class: krt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        qc6.b bVar;
                        long j2;
                        long j3 = j;
                        float f5 = f4;
                        float f6 = fB2;
                        float f7 = fB;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            float f8 = f6 * 2.0f;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f8) - f5)) & 4294967295L);
                            bVar = bVarF1;
                            j2 = jD;
                            try {
                                tcf.I(lzaVar, j3, 90.0f, 90.0f, false, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f5)) & 4294967295L) | (Float.floatToRawIntBits(f6 + f5) << 32);
                                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f6) - f5;
                                tcf.Z1(lzaVar, j3, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f5)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), f7, 0, null, 496);
                                tcf.I(lzaVar, j3, 0.0f, 90.0f, false, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f8) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f8) - f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f6) - f5)) & 4294967295L), f7, 0, null, 496);
                                tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f6) - f5)) & 4294967295L), f7, 0, null, 496);
                                hrh.a(bVar, j2);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                hrh.a(bVar, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVarF1;
                            j2 = jD;
                        }
                    }
                };
                bVarI.r(function6);
                objY = function6;
            } else {
                Function1 function7 = new Function1() { // from class: krt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        qc6.b bVar;
                        long j2;
                        long j3 = j;
                        float f5 = f4;
                        float f6 = fB2;
                        float f7 = fB;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            float f8 = f6 * 2.0f;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f8) - f5)) & 4294967295L);
                            bVar = bVarF1;
                            j2 = jD;
                            try {
                                tcf.I(lzaVar, j3, 90.0f, 90.0f, false, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f5)) & 4294967295L) | (Float.floatToRawIntBits(f6 + f5) << 32);
                                float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f6) - f5;
                                tcf.Z1(lzaVar, j3, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f5)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32), f7, 0, null, 496);
                                tcf.I(lzaVar, j3, 0.0f, 90.0f, false, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f8) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f8) - f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f6) - f5)) & 4294967295L), f7, 0, null, 496);
                                tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - f6) - f5)) & 4294967295L), f7, 0, null, 496);
                                hrh.a(bVar, j2);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                hrh.a(bVar, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVarF1;
                            j2 = jD;
                        }
                    }
                };
                bVarI.r(function7);
                objY = function7;
            }
            d dVarC3 = androidx.compose.ui.draw.a.c(dVarB2, (Function1) objY);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarC3);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            if (function5 == null) {
                bVarI.N(1386575567);
                z2 = false;
            } else {
                z2 = false;
                bVarI.N(1386575568);
                function5.invoke(bVarI, 0);
            }
            bVarI.X(z2);
            bVarI.X(true);
            function4 = function5;
        } else {
            bVarI.G();
            f3 = f2;
            function4 = function3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lrt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rrt.b(f3, trtVar, function4, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final srt srtVar, a aVar, final int i) {
        int i2;
        b bVar;
        b bVarI = aVar.i(-707814852);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(srtVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d.a aVar2 = d.a.b;
            d dVarH = h.h(androidx.compose.foundation.a.b(j.i(ls7.a(h.j(aVar2, 40.0f, 0.0f, 0.0f, 0.0f, 14), j060.c(40.0f)), 20.0f), srtVar.a, zk40.a), 8.0f, 0.0f, 2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d("✸ ".concat(cb40.a(R.string.page_loyalty__ongoing, new Object[0], bVarI)), androidx.compose.foundation.layout.d.a.b(aVar2, ht.a.e), srtVar.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.C1_R, bVarI), bVarI, 0, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mrt
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    rrt.c(srtVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void d(float f, final trt trtVar, Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i, final int i2) {
        float f2;
        int i3;
        Function2<? super a, ? super Integer, Unit> function3;
        boolean z;
        final float f3;
        final Function2<? super a, ? super Integer, Unit> function4;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function5;
        final float fB;
        final float f4;
        final float fB2;
        final long j;
        boolean zE;
        Object objY;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z2;
        trtVar.getClass();
        b bVarI = aVar.i(1250170496);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            f2 = f;
        } else if ((i & 6) == 0) {
            f2 = f;
            i3 = (bVarI.c(f2) ? 4 : 2) | i;
        } else {
            f2 = f;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.d(trtVar.ordinal()) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                function3 = function2;
                i3 |= bVarI.A(function3) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i4 != 0) {
                    f3 = 24.0f;
                } else {
                    f3 = f2;
                }
                if (i5 != 0) {
                    function5 = null;
                } else {
                    function5 = function3;
                }
                fB = mla.b(1.0f, bVarI);
                f4 = fB / 2.0f;
                fB2 = mla.b(8.0f, bVarI) - f4;
                j = trtVar.a;
                d dVarB = androidx.compose.foundation.a.b(j.i(j.g(h.h(d.a.b, 16.0f, 0.0f, 2), 1.0f), f3), trtVar.b, j060.d(8.0f, 8.0f, 0.0f, 0.0f));
                zE = bVarI.e(j) | bVarI.c(f4) | bVarI.c(fB2) | bVarI.c(fB);
                objY = bVarI.y();
                if (zE || objY == a.C0041a.a) {
                    Function1 function1 = new Function1() { // from class: nrt
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws Throwable {
                            qc6.b bVar;
                            long j2;
                            long j3 = j;
                            float f5 = f4;
                            float f6 = fB2;
                            float f7 = fB;
                            lza lzaVar = (lza) obj;
                            lzaVar.getClass();
                            lzaVar.b2();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                            qc6.b bVarF1 = lzaVar.F1();
                            long jD = bVarF1.d();
                            bVarF1.a().p();
                            try {
                                bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                                float f8 = f6 * 2.0f;
                                bVar = bVarF1;
                                j2 = jD;
                                try {
                                    tcf.I(lzaVar, j3, 180.0f, 90.0f, false, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                    float f9 = f6 + f5;
                                    tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f6) - f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), f7, 0, null, 496);
                                    tcf.I(lzaVar, j3, 270.0f, 90.0f, false, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f8) - f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + 10.0f;
                                    tcf.Z1(lzaVar, j3, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), f7, 0, null, 496);
                                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5;
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + f5;
                                    tcf.Z1(lzaVar, j3, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L), f7, 0, null, 496);
                                    hrh.a(bVar, j2);
                                    return Unit.a;
                                } catch (Throwable th) {
                                    th = th;
                                    hrh.a(bVar, j2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bVar = bVarF1;
                                j2 = jD;
                            }
                        }
                    };
                    bVarI.r(function1);
                    objY = function1;
                }
                d dVarC = androidx.compose.ui.draw.a.c(dVarB, (Function1) objY);
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarC);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                if (function5 == null) {
                    bVarI.N(2140143259);
                    z2 = false;
                } else {
                    z2 = false;
                    bVarI.N(2140143260);
                    function5.invoke(bVarI, 0);
                }
                bVarI.X(z2);
                bVarI.X(true);
                function4 = function5;
            } else {
                bVarI.G();
                f3 = f2;
                function4 = function3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ort
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rrt.d(f3, trtVar, function4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        function3 = function2;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i4 != 0) {
                f3 = 24.0f;
            } else {
                f3 = f2;
            }
            if (i5 != 0) {
                function5 = null;
            } else {
                function5 = function3;
            }
            fB = mla.b(1.0f, bVarI);
            f4 = fB / 2.0f;
            fB2 = mla.b(8.0f, bVarI) - f4;
            j = trtVar.a;
            d dVarB2 = androidx.compose.foundation.a.b(j.i(j.g(h.h(d.a.b, 16.0f, 0.0f, 2), 1.0f), f3), trtVar.b, j060.d(8.0f, 8.0f, 0.0f, 0.0f));
            zE = bVarI.e(j) | bVarI.c(f4) | bVarI.c(fB2) | bVarI.c(fB);
            objY = bVarI.y();
            if (zE) {
                Function1 function6 = new Function1() { // from class: nrt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        qc6.b bVar;
                        long j2;
                        long j3 = j;
                        float f5 = f4;
                        float f6 = fB2;
                        float f7 = fB;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                            float f8 = f6 * 2.0f;
                            bVar = bVarF1;
                            j2 = jD;
                            try {
                                tcf.I(lzaVar, j3, 180.0f, 90.0f, false, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                float f9 = f6 + f5;
                                tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f6) - f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), f7, 0, null, 496);
                                tcf.I(lzaVar, j3, 270.0f, 90.0f, false, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f8) - f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + 10.0f;
                                tcf.Z1(lzaVar, j3, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), f7, 0, null, 496);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5;
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + f5;
                                tcf.Z1(lzaVar, j3, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L), f7, 0, null, 496);
                                hrh.a(bVar, j2);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                hrh.a(bVar, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVarF1;
                            j2 = jD;
                        }
                    }
                };
                bVarI.r(function6);
                objY = function6;
            } else {
                Function1 function7 = new Function1() { // from class: nrt
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        qc6.b bVar;
                        long j2;
                        long j3 = j;
                        float f5 = f4;
                        float f6 = fB2;
                        float f7 = fB;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                            float f8 = f6 * 2.0f;
                            bVar = bVarF1;
                            j2 = jD;
                            try {
                                tcf.I(lzaVar, j3, 180.0f, 90.0f, false, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                float f9 = f6 + f5;
                                tcf.Z1(lzaVar, j3, (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f6) - f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), f7, 0, null, 496);
                                tcf.I(lzaVar, j3, 270.0f, 90.0f, false, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f8) - f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L), 0.0f, new yae0(f7, 0.0f, 0, 0, null, 30), 832);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + 10.0f;
                                tcf.Z1(lzaVar, j3, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L), f7, 0, null, 496);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L);
                                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f5;
                                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) + f5;
                                tcf.Z1(lzaVar, j3, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L), f7, 0, null, 496);
                                hrh.a(bVar, j2);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                hrh.a(bVar, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = bVarF1;
                            j2 = jD;
                        }
                    }
                };
                bVarI.r(function7);
                objY = function7;
            }
            d dVarC3 = androidx.compose.ui.draw.a.c(dVarB2, (Function1) objY);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarC3);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            if (function5 == null) {
                bVarI.N(2140143259);
                z2 = false;
            } else {
                z2 = false;
                bVarI.N(2140143260);
                function5.invoke(bVarI, 0);
            }
            bVarI.X(z2);
            bVarI.X(true);
            function4 = function5;
        } else {
            bVarI.G();
            f3 = f2;
            function4 = function3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ort
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rrt.d(f3, trtVar, function4, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final trt trtVar, final srt srtVar, a aVar, final int i) {
        trtVar.getClass();
        b bVarI = aVar.i(1191957407);
        int i2 = (bVarI.d(srtVar == null ? -1 : srtVar.ordinal()) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            float f = srtVar != null ? 10.0f : 0.0f;
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarJ = h.j(aVar2, 0.0f, f, 0.0f, 0.0f, 13);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarJ);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d(0.0f, trtVar, null, bVarI, 48, 5);
            bVarI.X(true);
            if (srtVar != null) {
                bVarI.N(-1684407290);
                c(srtVar, bVarI, (i2 >> 3) & 14);
            } else {
                bVarI.N(-676986723);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(srtVar, i) { // from class: irt
                public final /* synthetic */ srt b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    rrt.e(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(d dVar, trt trtVar, final float f, final op8 op8Var, a aVar, final int i) {
        final d dVar2;
        b bVarI = aVar.i(2096432273);
        int i2 = i | 54;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            trtVar = trt.c;
            trtVar.getClass();
            i060 i060VarC = j060.c(8.0f);
            qyd0 qyd0Var = ejb0.a;
            float f2 = ((cjb0) bVarI.O(qyd0Var)).f;
            d.a aVar2 = d.a.b;
            d dVarF = h.f(d35.a(androidx.compose.foundation.a.b(ls7.a(j.g(h.h(aVar2, f2, 0.0f, 2), 1.0f), i060VarC), trtVar.b, zk40.a), 1.0f, trtVar.a, i060VarC), ((cjb0) bVarI.O(qyd0Var)).h);
            i78 i78VarA = g78.a(new kw0.i(f, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            op8Var.invoke(l78.a, bVarI, 54);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        final trt trtVar2 = trtVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(trtVar2, f, op8Var, i) { // from class: jrt
                public final /* synthetic */ trt b;
                public final /* synthetic */ float c;
                public final /* synthetic */ op8 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3457);
                    rrt.f(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
