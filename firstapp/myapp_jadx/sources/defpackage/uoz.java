package defpackage;

import androidx.compose.foundation.layout.g;
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
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class uoz {

    public static final class a implements bqz {
        public final /* synthetic */ zpz a;

        public a(zpz zpzVar) {
            this.a = zpzVar;
        }

        @Override // defpackage.bqz
        public final int a() {
            return this.a.k();
        }

        @Override // defpackage.bqz
        public final float b() {
            return this.a.l();
        }
    }

    public static final void a(final zpz zpzVar, final int i, final d dVar, Function1<? super Integer, Integer> function1, final long j, long j2, final float f, float f2, float f3, qx80 qx80Var, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        Function1<? super Integer, Integer> function2;
        int i4;
        final float f4;
        final float f5;
        final qx80 qx80Var2;
        final Function1<? super Integer, Integer> function3;
        final long j3;
        Function1<? super Integer, Integer> function4;
        qx80 qx80Var3;
        long j4;
        float f6;
        int i5;
        float f7;
        zpzVar.getClass();
        b bVarI = aVar.i(-1768938180);
        int i6 = i2 | (bVarI.M(zpzVar) ? 4 : 2) | (bVarI.d(i) ? 32 : 16);
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            function2 = function1;
        } else {
            function2 = function1;
            i4 = i6 | (bVarI.A(function2) ? 2048 : 1024);
        }
        int i8 = i4 | (bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 306249728;
        if (bVarI.q(i8 & 1, (306783379 & i8) != 306783378)) {
            bVarI.A0();
            int i9 = i2 & 1;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i9 == 0 || bVarI.h0()) {
                if (i7 != 0) {
                    Object objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new qoz();
                        bVarI.r(objY);
                    }
                    function4 = (Function1) objY;
                } else {
                    function4 = function2;
                }
                long jC = j58.c(0.38f, j);
                qx80Var3 = j060.a;
                j4 = jC;
                f6 = f;
                i5 = i8 & (-2143748097);
                f7 = f6;
            } else {
                bVarI.G();
                j4 = j2;
                qx80Var3 = qx80Var;
                function4 = function2;
                f6 = f2;
                i5 = i8 & (-2143748097);
                f7 = f3;
            }
            bVarI.Y();
            boolean z = (i5 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new a(zpzVar);
                bVarI.r(objY2);
            }
            float f8 = f7;
            Function1<? super Integer, Integer> function5 = function4;
            b((a) objY2, i, dVar, function5, j, j4, f, f6, f8, qx80Var3, bVarI, i5 & 2147483632);
            function3 = function5;
            j3 = j4;
            f4 = f6;
            f5 = f8;
            qx80Var2 = qx80Var3;
        } else {
            bVarI.G();
            f4 = f2;
            f5 = f3;
            qx80Var2 = qx80Var;
            function3 = function2;
            j3 = j2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, function3, j, j3, f, f4, f5, qx80Var2, i2, i3) { // from class: roz
                public final /* synthetic */ int b;
                public final /* synthetic */ d c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float i;
                public final /* synthetic */ float v;
                public final /* synthetic */ float w;
                public final /* synthetic */ qx80 y;
                public final /* synthetic */ int z;

                {
                    this.z = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1573249);
                    uoz.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, (a) obj, iA, this.z);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ce A[LOOP:0: B:110:0x01cc->B:111:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x0208  */
    /* JADX WARN: Code duplicated, block: B:130:0x020a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0220  */
    /* JADX WARN: Code duplicated, block: B:135:0x0224  */
    /* JADX WARN: Code duplicated, block: B:140:0x0242  */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    public static final void b(final bqz bqzVar, final int i, final d dVar, final Function1 function1, long j, long j2, final float f, final float f2, final float f3, final qx80 qx80Var, androidx.compose.runtime.a aVar, final int i2) {
        b bVar;
        long j3;
        int i3;
        int iHashCode;
        d dVarB;
        d dVarB2;
        int i4;
        int i5;
        boolean z;
        bqz bqzVar2;
        boolean z2;
        boolean z3;
        boolean zD;
        Object objY;
        long j4 = j2;
        b bVarI = aVar.i(494437797);
        int i6 = (i2 & 6) == 0 ? ((i2 & 8) == 0 ? bVarI.M(bqzVar) : bVarI.A(bqzVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= bVarI.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= bVarI.e(j) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i6 |= bVarI.e(j4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i6 |= bVarI.c(f) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i6 |= bVarI.c(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i6 |= bVarI.c(f3) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i6 |= bVarI.M(qx80Var) ? 536870912 : 268435456;
        }
        if (bVarI.q(i6 & 1, (306783379 & i6) != 306783378)) {
            bVarI.A0();
            if ((i2 & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            qyd0 qyd0Var = kna.h;
            final int iY0 = ((mmd) bVarI.O(qyd0Var)).y0(f);
            final int iY1 = ((mmd) bVarI.O(qyd0Var)).y0(f3);
            aiv aivVarC = g75.c(ht.a.d, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i3 = i6;
            } else {
                i3 = i6;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d160 d160VarA = b160.a(new kw0.i(f3, true, new hw0()), ht.a.k, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                dVarB = d.a.b;
                d dVarC2 = c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                j4 = j2;
                dVarB2 = androidx.compose.foundation.a.b(j.t(dVarB, f, f2), j4, qx80Var);
                bVarI.N(-797909769);
                for (i4 = 0; i4 < i; i4++) {
                    g75.a(dVarB2, bVarI, 0);
                }
                bVarI.X(false);
                bVarI.X(true);
                i5 = i3;
                if ((i5 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i5 & 14) != 4) {
                    if ((i5 & 8) != 0) {
                        bqzVar2 = bqzVar;
                        if (bVarI.A(bqzVar2)) {
                        }
                        boolean z4 = z | z2;
                        if ((i5 & 112) == 32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zD = z3 | z4 | bVarI.d(iY1) | bVarI.d(iY0);
                        objY = bVarI.y();
                        if (!zD || objY == androidx.compose.runtime.a.C0041a.a) {
                            bVar = bVarI;
                            final bqz bqzVar3 = bqzVar2;
                            Function1 function2 = new Function1() { // from class: soz
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    ((mmd) obj).getClass();
                                    bqz bqzVar4 = bqzVar3;
                                    Integer numValueOf = Integer.valueOf(bqzVar4.a());
                                    Function1 function3 = function1;
                                    int iIntValue = ((Number) function3.invoke(numValueOf)).intValue();
                                    float fB = bqzVar4.b();
                                    float fAbs = (Math.abs(fB) * (((Number) function3.invoke(Integer.valueOf(bqzVar4.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                                    int i7 = i - 1;
                                    if (i7 < 0) {
                                        i7 = 0;
                                    }
                                    return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                                }
                            };
                            bVar.r(function2);
                            objY = function2;
                        } else {
                            bVar = bVarI;
                        }
                        d dVarT = j.t(g.b(dVarB, (Function1) objY), f, f2);
                        if (i > 0) {
                            j3 = j;
                            dVarB = androidx.compose.foundation.a.b(dVarB, j3, qx80Var);
                        } else {
                            j3 = j;
                        }
                        g75.a(dVarT.n(dVarB), bVar, 0);
                        bVar.X(true);
                    } else {
                        bqzVar2 = bqzVar;
                    }
                    z2 = false;
                    boolean z5 = z | z2;
                    if ((i5 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zD = z3 | z5 | bVarI.d(iY1) | bVarI.d(iY0);
                    objY = bVarI.y();
                    if (zD) {
                        bVar = bVarI;
                        final bqz bqzVar4 = bqzVar2;
                        Function1 function3 = new Function1() { // from class: soz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                bqz bqzVar5 = bqzVar4;
                                Integer numValueOf = Integer.valueOf(bqzVar5.a());
                                Function1 function4 = function1;
                                int iIntValue = ((Number) function4.invoke(numValueOf)).intValue();
                                float fB = bqzVar5.b();
                                float fAbs = (Math.abs(fB) * (((Number) function4.invoke(Integer.valueOf(bqzVar5.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                                int i7 = i - 1;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                            }
                        };
                        bVar.r(function3);
                        objY = function3;
                    } else {
                        bVar = bVarI;
                        final bqz bqzVar5 = bqzVar2;
                        Function1 function4 = new Function1() { // from class: soz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                bqz bqzVar6 = bqzVar5;
                                Integer numValueOf = Integer.valueOf(bqzVar6.a());
                                Function1 function5 = function1;
                                int iIntValue = ((Number) function5.invoke(numValueOf)).intValue();
                                float fB = bqzVar6.b();
                                float fAbs = (Math.abs(fB) * (((Number) function5.invoke(Integer.valueOf(bqzVar6.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                                int i7 = i - 1;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                            }
                        };
                        bVar.r(function4);
                        objY = function4;
                    }
                    d dVarT2 = j.t(g.b(dVarB, (Function1) objY), f, f2);
                    if (i > 0) {
                        j3 = j;
                        dVarB = androidx.compose.foundation.a.b(dVarB, j3, qx80Var);
                    } else {
                        j3 = j;
                    }
                    g75.a(dVarT2.n(dVarB), bVar, 0);
                    bVar.X(true);
                } else {
                    bqzVar2 = bqzVar;
                }
                z2 = true;
                boolean z6 = z | z2;
                if ((i5 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zD = z3 | z6 | bVarI.d(iY1) | bVarI.d(iY0);
                objY = bVarI.y();
                if (zD) {
                    bVar = bVarI;
                    final bqz bqzVar6 = bqzVar2;
                    Function1 function5 = new Function1() { // from class: soz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            bqz bqzVar7 = bqzVar6;
                            Integer numValueOf = Integer.valueOf(bqzVar7.a());
                            Function1 function6 = function1;
                            int iIntValue = ((Number) function6.invoke(numValueOf)).intValue();
                            float fB = bqzVar7.b();
                            float fAbs = (Math.abs(fB) * (((Number) function6.invoke(Integer.valueOf(bqzVar7.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                            int i7 = i - 1;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                        }
                    };
                    bVar.r(function5);
                    objY = function5;
                } else {
                    bVar = bVarI;
                    final bqz bqzVar7 = bqzVar2;
                    Function1 function6 = new Function1() { // from class: soz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            bqz bqzVar8 = bqzVar7;
                            Integer numValueOf = Integer.valueOf(bqzVar8.a());
                            Function1 function7 = function1;
                            int iIntValue = ((Number) function7.invoke(numValueOf)).intValue();
                            float fB = bqzVar8.b();
                            float fAbs = (Math.abs(fB) * (((Number) function7.invoke(Integer.valueOf(bqzVar8.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                            int i7 = i - 1;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                        }
                    };
                    bVar.r(function6);
                    objY = function6;
                }
                d dVarT3 = j.t(g.b(dVarB, (Function1) objY), f, f2);
                if (i > 0) {
                    j3 = j;
                    dVarB = androidx.compose.foundation.a.b(dVarB, j3, qx80Var);
                } else {
                    j3 = j;
                }
                g75.a(dVarT3.n(dVarB), bVar, 0);
                bVar.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            d160 d160VarA2 = b160.a(new kw0.i(f3, true, new hw0()), ht.a.k, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            dVarB = d.a.b;
            d dVarC3 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            j4 = j2;
            dVarB2 = androidx.compose.foundation.a.b(j.t(dVarB, f, f2), j4, qx80Var);
            bVarI.N(-797909769);
            while (i4 < i) {
                g75.a(dVarB2, bVarI, 0);
            }
            bVarI.X(false);
            bVarI.X(true);
            i5 = i3;
            if ((i5 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            if ((i5 & 14) != 4) {
                if ((i5 & 8) != 0) {
                    bqzVar2 = bqzVar;
                    if (bVarI.A(bqzVar2)) {
                    }
                    boolean z7 = z | z2;
                    if ((i5 & 112) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zD = z3 | z7 | bVarI.d(iY1) | bVarI.d(iY0);
                    objY = bVarI.y();
                    if (zD) {
                        bVar = bVarI;
                        final bqz bqzVar8 = bqzVar2;
                        Function1 function7 = new Function1() { // from class: soz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                bqz bqzVar9 = bqzVar8;
                                Integer numValueOf = Integer.valueOf(bqzVar9.a());
                                Function1 function8 = function1;
                                int iIntValue = ((Number) function8.invoke(numValueOf)).intValue();
                                float fB = bqzVar9.b();
                                float fAbs = (Math.abs(fB) * (((Number) function8.invoke(Integer.valueOf(bqzVar9.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                                int i7 = i - 1;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                            }
                        };
                        bVar.r(function7);
                        objY = function7;
                    } else {
                        bVar = bVarI;
                        final bqz bqzVar9 = bqzVar2;
                        Function1 function8 = new Function1() { // from class: soz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                bqz bqzVar10 = bqzVar9;
                                Integer numValueOf = Integer.valueOf(bqzVar10.a());
                                Function1 function9 = function1;
                                int iIntValue = ((Number) function9.invoke(numValueOf)).intValue();
                                float fB = bqzVar10.b();
                                float fAbs = (Math.abs(fB) * (((Number) function9.invoke(Integer.valueOf(bqzVar10.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                                int i7 = i - 1;
                                if (i7 < 0) {
                                    i7 = 0;
                                }
                                return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                            }
                        };
                        bVar.r(function8);
                        objY = function8;
                    }
                    d dVarT4 = j.t(g.b(dVarB, (Function1) objY), f, f2);
                    if (i > 0) {
                        j3 = j;
                        dVarB = androidx.compose.foundation.a.b(dVarB, j3, qx80Var);
                    } else {
                        j3 = j;
                    }
                    g75.a(dVarT4.n(dVarB), bVar, 0);
                    bVar.X(true);
                } else {
                    bqzVar2 = bqzVar;
                }
                z2 = false;
                boolean z8 = z | z2;
                if ((i5 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zD = z3 | z8 | bVarI.d(iY1) | bVarI.d(iY0);
                objY = bVarI.y();
                if (zD) {
                    bVar = bVarI;
                    final bqz bqzVar10 = bqzVar2;
                    Function1 function9 = new Function1() { // from class: soz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            bqz bqzVar11 = bqzVar10;
                            Integer numValueOf = Integer.valueOf(bqzVar11.a());
                            Function1 function10 = function1;
                            int iIntValue = ((Number) function10.invoke(numValueOf)).intValue();
                            float fB = bqzVar11.b();
                            float fAbs = (Math.abs(fB) * (((Number) function10.invoke(Integer.valueOf(bqzVar11.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                            int i7 = i - 1;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                        }
                    };
                    bVar.r(function9);
                    objY = function9;
                } else {
                    bVar = bVarI;
                    final bqz bqzVar11 = bqzVar2;
                    Function1 function10 = new Function1() { // from class: soz
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            bqz bqzVar12 = bqzVar11;
                            Integer numValueOf = Integer.valueOf(bqzVar12.a());
                            Function1 function11 = function1;
                            int iIntValue = ((Number) function11.invoke(numValueOf)).intValue();
                            float fB = bqzVar12.b();
                            float fAbs = (Math.abs(fB) * (((Number) function11.invoke(Integer.valueOf(bqzVar12.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                            int i7 = i - 1;
                            if (i7 < 0) {
                                i7 = 0;
                            }
                            return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                        }
                    };
                    bVar.r(function10);
                    objY = function10;
                }
                d dVarT5 = j.t(g.b(dVarB, (Function1) objY), f, f2);
                if (i > 0) {
                    j3 = j;
                    dVarB = androidx.compose.foundation.a.b(dVarB, j3, qx80Var);
                } else {
                    j3 = j;
                }
                g75.a(dVarT5.n(dVarB), bVar, 0);
                bVar.X(true);
            } else {
                bqzVar2 = bqzVar;
            }
            z2 = true;
            boolean z9 = z | z2;
            if ((i5 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            zD = z3 | z9 | bVarI.d(iY1) | bVarI.d(iY0);
            objY = bVarI.y();
            if (zD) {
                bVar = bVarI;
                final bqz bqzVar12 = bqzVar2;
                Function1 function11 = new Function1() { // from class: soz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        bqz bqzVar13 = bqzVar12;
                        Integer numValueOf = Integer.valueOf(bqzVar13.a());
                        Function1 function12 = function1;
                        int iIntValue = ((Number) function12.invoke(numValueOf)).intValue();
                        float fB = bqzVar13.b();
                        float fAbs = (Math.abs(fB) * (((Number) function12.invoke(Integer.valueOf(bqzVar13.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                        int i7 = i - 1;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                    }
                };
                bVar.r(function11);
                objY = function11;
            } else {
                bVar = bVarI;
                final bqz bqzVar13 = bqzVar2;
                Function1 function12 = new Function1() { // from class: soz
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        bqz bqzVar14 = bqzVar13;
                        Integer numValueOf = Integer.valueOf(bqzVar14.a());
                        Function1 function13 = function1;
                        int iIntValue = ((Number) function13.invoke(numValueOf)).intValue();
                        float fB = bqzVar14.b();
                        float fAbs = (Math.abs(fB) * (((Number) function13.invoke(Integer.valueOf(bqzVar14.a() + ((int) Math.signum(fB))))).intValue() - iIntValue)) + iIntValue;
                        int i7 = i - 1;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        return new iwo(((long) ((int) ((iY1 + iY0) * f.d(fAbs, 0.0f, i7)))) << 32);
                    }
                };
                bVar.r(function12);
                objY = function12;
            }
            d dVarT6 = j.t(g.b(dVarB, (Function1) objY), f, f2);
            if (i > 0) {
                j3 = j;
                dVarB = androidx.compose.foundation.a.b(dVarB, j3, qx80Var);
            } else {
                j3 = j;
            }
            g75.a(dVarT6.n(dVarB), bVar, 0);
            bVar.X(true);
        } else {
            bVar = bVarI;
            j3 = j;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final long j5 = j3;
            final long j6 = j4;
            eVarZ.d = new Function2() { // from class: toz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    uoz.b(bqzVar, i, dVar, function1, j5, j6, f, f2, f3, qx80Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
