package defpackage;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rk40 {
    public final qk40 a;
    public final npf0 b;
    public final etw<Function0<Unit>> c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ff g;
    public long h;
    public final sk40 i;
    public final qtw j;

    public static final class a extends qlr implements Function2<Long, Long, Unit> {
        public final /* synthetic */ npf0.a b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(npf0.a aVar, long j) {
            super(2);
            this.b = aVar;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Long l, Long l2) {
            long jLongValue = l.longValue();
            long jLongValue2 = l2.longValue();
            rk40.this.b.getClass();
            npf0.a(this.b, jLongValue, jLongValue2, this.c);
            return Unit.a;
        }
    }

    public rk40() {
        qk40 qk40Var = new qk40();
        qk40Var.a = new long[192];
        qk40Var.b = new long[192];
        this.a = qk40Var;
        this.b = new npf0();
        this.c = new etw<>((Object) null);
        this.h = -1L;
        this.i = new sk40(this);
        this.j = new qtw();
    }

    public static long a(ywx ywxVar, long j) {
        float[] fArrMo2getUnderlyingMatrixsQKQjiQ;
        int iA;
        vgz vgzVar = ywxVar.a0;
        if (vgzVar == null || (iA = tk40.a((fArrMo2getUnderlyingMatrixsQKQjiQ = vgzVar.mo2getUnderlyingMatrixsQKQjiQ()))) == 3) {
            return j;
        }
        if ((iA & 2) == 0) {
            return 9223372034707292159L;
        }
        return jwo.a(ddv.b(fArrMo2getUnderlyingMatrixsQKQjiQ, (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32)));
    }

    public static long h(tsr tsrVar) {
        wwx wwxVar = tsrVar.U;
        ywx ywxVar = wwxVar.d;
        long jD = 0;
        for (ywx ywxVar2 = wwxVar.c; ywxVar2 != null && ywxVar2 != ywxVar; ywxVar2 = ywxVar2.I) {
            long jA = a(ywxVar2, jD);
            if (iwo.b(jA, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jD = iwo.d(jA, ywxVar2.R);
        }
        return jD;
    }

    public static void i(tsr tsrVar) {
        long jH;
        ywx ywxVar = tsrVar.U.d;
        long jA = a(ywxVar, 0L);
        long jD = 9223372034707292159L;
        if (!tk40.b(jA)) {
            tsrVar.c = 9223372034707292159L;
            return;
        }
        long jD2 = iwo.d(jA, ywxVar.R);
        tsr tsrVarH = tsrVar.H();
        if (tsrVarH != null) {
            if (!tk40.b(tsrVarH.c)) {
                i(tsrVarH);
            }
            long j = tsrVarH.c;
            if (tk40.b(j)) {
                if (tsrVarH.f) {
                    jH = h(tsrVarH);
                    tsrVarH.e = jH;
                    tsrVarH.f = false;
                } else {
                    jH = tsrVarH.e;
                }
                if (tk40.b(jH)) {
                    jD = iwo.d(iwo.d(j, jH), jD2);
                }
            }
        } else {
            jD = jD2;
        }
        tsrVar.c = jD;
    }

    public final void b() {
        qk40 qk40Var;
        npf0 npf0Var;
        long j;
        long j2;
        int i;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long j3;
        int i2;
        Handler handler = gf.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = this.d;
        int i3 = 1;
        int i4 = 0;
        boolean z2 = z || this.e;
        qk40 qk40Var2 = this.a;
        npf0 npf0Var2 = this.b;
        if (z) {
            this.d = false;
            etw<Function0<Unit>> etwVar = this.c;
            Object[] objArr3 = etwVar.a;
            int i5 = etwVar.b;
            for (int i6 = 0; i6 < i5; i6++) {
                ((Function0) objArr3[i6]).invoke();
            }
            long[] jArr3 = qk40Var2.a;
            int i7 = qk40Var2.c;
            int i8 = 0;
            while (i8 < jArr3.length - 2 && i8 < i7) {
                long j4 = jArr3[i8 + 2];
                if ((((int) (j4 >> 61)) & i3) != 0) {
                    long j5 = jArr3[i8];
                    long j6 = jArr3[i8 + 1];
                    for (npf0.a aVarB = npf0Var2.a.b(((int) j4) & 67108863); aVarB != null; aVarB = null) {
                        long j7 = j5;
                        npf0.a(aVarB, j7, j6, jCurrentTimeMillis);
                        i7 = i7;
                        i8 = i8;
                        qk40Var2 = qk40Var2;
                        j5 = j7;
                        npf0Var2 = npf0Var2;
                    }
                }
                i8 += 3;
                npf0Var2 = npf0Var2;
                i7 = i7;
                qk40Var2 = qk40Var2;
                i3 = 1;
            }
            qk40Var = qk40Var2;
            npf0Var = npf0Var2;
            int i9 = 8;
            j = Long.MIN_VALUE;
            j2 = 128;
            msw<npf0.a> mswVar = npf0Var.a;
            Object[] objArr4 = mswVar.c;
            long[] jArr4 = mswVar.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j8 = jArr4[i10];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        int i12 = i4;
                        while (i12 < i11) {
                            if ((j8 & 255) < 128) {
                                npf0.a aVar = (npf0.a) objArr4[(i10 << 3) + i12];
                                for (npf0.a aVar2 = aVar; aVar2 != null; aVar2 = null) {
                                    long[] jArr5 = jArr4;
                                    Object[] objArr5 = objArr4;
                                    if (aVar.a == Long.MIN_VALUE) {
                                        a aVar3 = new a(aVar, jCurrentTimeMillis);
                                        long[] jArr6 = qk40Var.a;
                                        i2 = i9;
                                        int i13 = qk40Var.c;
                                        j3 = j8;
                                        int i14 = 0;
                                        while (i14 < jArr6.length - 2 && i14 < i13) {
                                            int i15 = i14;
                                            if ((((int) jArr6[i14 + 2]) & 67108863) == 0) {
                                                aVar3.invoke(Long.valueOf(jArr6[i15]), Long.valueOf(jArr6[i15 + 1]));
                                                break;
                                            }
                                            i14 = i15 + 3;
                                        }
                                    } else {
                                        j3 = j8;
                                        i2 = i9;
                                    }
                                    objArr4 = objArr5;
                                    jArr4 = jArr5;
                                    i9 = i2;
                                    j8 = j3;
                                }
                            }
                            int i16 = i9;
                            j8 >>= i16;
                            i12++;
                            objArr4 = objArr4;
                            jArr4 = jArr4;
                            i9 = i16;
                        }
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        if (i11 != i9) {
                            break;
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                    }
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                    objArr4 = objArr2;
                    jArr4 = jArr2;
                    i4 = 0;
                    i9 = 8;
                }
            }
            long[] jArr7 = qk40Var.a;
            int i17 = qk40Var.c;
            for (int i18 = 0; i18 < jArr7.length - 2 && i18 < i17; i18 += 3) {
                int i19 = i18 + 2;
                jArr7[i19] = jArr7[i19] & (-2305843009213693953L);
            }
        } else {
            qk40Var = qk40Var2;
            npf0Var = npf0Var2;
            j = Long.MIN_VALUE;
            j2 = 128;
        }
        if (this.e) {
            this.e = false;
            long j9 = npf0Var.b;
            msw<npf0.a> mswVar2 = npf0Var.a;
            Object[] objArr6 = mswVar2.c;
            long[] jArr8 = mswVar2.a;
            int length2 = jArr8.length - 2;
            if (length2 >= 0) {
                int i20 = 0;
                while (true) {
                    long j10 = jArr8[i20];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i21 = 8 - ((~(i20 - length2)) >>> 31);
                        long j11 = j10;
                        int i22 = 0;
                        while (i22 < i21) {
                            if ((j11 & 255) < j2) {
                                npf0.a aVar4 = (npf0.a) objArr6[(i20 << 3) + i22];
                                while (aVar4 != null) {
                                    long[] jArr9 = jArr8;
                                    Object[] objArr7 = objArr6;
                                    long j12 = aVar4.a;
                                    if (jCurrentTimeMillis - j12 > 0 || j12 == j) {
                                        aVar4.a = jCurrentTimeMillis;
                                        throw null;
                                    }
                                    objArr6 = objArr7;
                                    aVar4 = null;
                                    jArr8 = jArr9;
                                }
                            }
                            j11 >>= 8;
                            i22++;
                            objArr6 = objArr6;
                            jArr8 = jArr8;
                        }
                        jArr = jArr8;
                        objArr = objArr6;
                        if (i21 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr8;
                        objArr = objArr6;
                    }
                    if (i20 == length2) {
                        break;
                    }
                    i20++;
                    objArr6 = objArr;
                    jArr8 = jArr;
                }
            }
        }
        if (z2) {
            npf0Var.getClass();
        }
        if (this.f) {
            i = 0;
            this.f = false;
            long[] jArr10 = qk40Var.a;
            int i23 = qk40Var.c;
            long[] jArr11 = qk40Var.b;
            int i24 = 0;
            for (int i25 = 0; i25 < jArr10.length - 2 && i24 < jArr11.length - 2 && i25 < i23; i25 += 3) {
                int i26 = i25 + 2;
                if (jArr10[i26] != 2305843009213693951L) {
                    jArr11[i24] = jArr10[i25];
                    jArr11[i24 + 1] = jArr10[i25 + 1];
                    jArr11[i24 + 2] = jArr10[i26];
                    i24 += 3;
                }
            }
            qk40Var.c = i24;
            qk40Var.a = jArr11;
            qk40Var.b = jArr10;
        } else {
            i = 0;
        }
        npf0Var.getClass();
        if (-1 > jCurrentTimeMillis) {
            return;
        }
        msw<npf0.a> mswVar3 = npf0Var.a;
        Object[] objArr8 = mswVar3.c;
        long[] jArr12 = mswVar3.a;
        int length3 = jArr12.length - 2;
        if (length3 < 0) {
            return;
        }
        int i27 = i;
        while (true) {
            long j13 = jArr12[i27];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i28 = 8 - ((~(i27 - length3)) >>> 31);
                long j14 = j13;
                for (int i29 = i; i29 < i28; i29++) {
                    if ((j14 & 255) < j2) {
                        for (npf0.a aVar5 = (npf0.a) objArr8[(i27 << 3) + i29]; aVar5 != null; aVar5 = null) {
                        }
                    }
                    j14 >>= 8;
                }
                if (i28 != 8) {
                    return;
                }
            }
            if (i27 == length3) {
                return;
            } else {
                i27++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00da  */
    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    public final void c(tsr tsrVar, boolean z) {
        char c;
        boolean z2;
        tsr tsrVarH;
        int i;
        wwx wwxVar = tsrVar.U;
        ywx ywxVar = wwxVar.d;
        zhv zhvVar = tsrVar.V.p;
        int iO0 = zhvVar.o0();
        float fL0 = zhvVar.l0();
        qtw qtwVar = this.j;
        qtwVar.a = 0.0f;
        qtwVar.b = 0.0f;
        qtwVar.c = iO0;
        qtwVar.d = fL0;
        while (true) {
            c = ' ';
            if (ywxVar == null) {
                break;
            }
            vgz vgzVar = ywxVar.a0;
            if (vgzVar != null) {
                float[] fArrMo2getUnderlyingMatrixsQKQjiQ = vgzVar.mo2getUnderlyingMatrixsQKQjiQ();
                if (!fdv.a(fArrMo2getUnderlyingMatrixsQKQjiQ)) {
                    ddv.c(fArrMo2getUnderlyingMatrixsQKQjiQ, qtwVar);
                }
            }
            long j = ywxVar.R;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
            qtwVar.a += fIntBitsToFloat;
            qtwVar.b += fIntBitsToFloat2;
            qtwVar.c += fIntBitsToFloat;
            qtwVar.d += fIntBitsToFloat2;
            ywxVar = ywxVar.I;
        }
        int i2 = (int) qtwVar.a;
        int i3 = (int) qtwVar.b;
        int i4 = (int) qtwVar.c;
        int i5 = (int) qtwVar.d;
        int i6 = tsrVar.b;
        qk40 qk40Var = this.a;
        if (z) {
            qk40 qk40Var2 = qk40Var;
            z2 = true;
            tsrVarH = tsrVar.H();
            if (tsrVarH != null) {
                i = tsrVarH.b;
            } else {
                i = -1;
            }
            qk40Var2.a(i6, i2, i3, i4, i5, i, wwxVar.c(1024), wwxVar.c(16));
        } else {
            int i7 = i6 & 67108863;
            long[] jArr = qk40Var.a;
            int i8 = qk40Var.c;
            int i9 = 0;
            while (true) {
                if (i9 >= jArr.length - 2 || i9 >= i8) {
                    qk40 qk40Var3 = qk40Var;
                    z2 = true;
                    tsrVarH = tsrVar.H();
                    if (tsrVarH != null) {
                        i = tsrVarH.b;
                    } else {
                        i = -1;
                    }
                    qk40Var3.a(i6, i2, i3, i4, i5, i, wwxVar.c(1024), wwxVar.c(16));
                } else {
                    int i10 = i9 + 2;
                    char c2 = c;
                    qk40 qk40Var4 = qk40Var;
                    long j2 = jArr[i10];
                    z2 = true;
                    if ((((int) j2) & 67108863) == i7) {
                        jArr[i9] = (((long) i2) << c2) | (((long) i3) & 4294967295L);
                        jArr[i9 + 1] = (((long) i4) << c2) | (((long) i5) & 4294967295L);
                        jArr[i10] = 2305843009213693952L | j2;
                    } else {
                        i9 += 3;
                        c = c2;
                        qk40Var = qk40Var4;
                    }
                }
            }
        }
        this.d = z2;
    }

    public final void d(tsr tsrVar) {
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            tsr tsrVar2 = tsrVarArr[i2];
            c(tsrVar2, false);
            d(tsrVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [ff, java.lang.Runnable] */
    public final void e(tsr tsrVar) {
        this.d = true;
        int i = tsrVar.b & 67108863;
        qk40 qk40Var = this.a;
        long[] jArr = qk40Var.a;
        int i2 = qk40Var.c;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            long j = jArr[i4];
            if ((((int) j) & 67108863) == i) {
                jArr[i4] = 2305843009213693952L | j;
                break;
            }
        }
        boolean z = this.g != null;
        this.b.getClass();
        if (z) {
            return;
        }
        if (this.h == -1 && z) {
            return;
        }
        ff ffVar = this.g;
        if (ffVar != null) {
            Handler handler = gf.a;
            gf.a.removeCallbacks(ffVar);
        }
        Handler handler2 = gf.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = Math.max(-1L, 16 + jCurrentTimeMillis);
        this.h = jMax;
        long j2 = jMax - jCurrentTimeMillis;
        final sk40 sk40Var = this.i;
        ?? r11 = new Runnable() { // from class: ff
            @Override // java.lang.Runnable
            public final void run() {
                sk40Var.invoke();
            }
        };
        gf.a.postDelayed(r11, j2);
        this.g = r11;
    }

    public final void f(tsr tsrVar) {
        long jH = h(tsrVar);
        if (!tk40.b(jH)) {
            d(tsrVar);
            return;
        }
        tsrVar.e = jH;
        tsrVar.f = false;
        duw<tsr> duwVarK = tsrVar.K();
        tsr[] tsrVarArr = duwVarK.a;
        int i = duwVarK.c;
        for (int i2 = 0; i2 < i; i2++) {
            g(tsrVarArr[i2], false);
        }
        e(tsrVar);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0164  */
    /* JADX WARN: Code duplicated, block: B:55:0x0169  */
    public final void g(tsr tsrVar, boolean z) {
        tsr tsrVarH;
        int i;
        long j;
        char c;
        int i2;
        zhv zhvVar = tsrVar.V.p;
        int iO0 = zhvVar.o0();
        int iL0 = zhvVar.l0();
        long j2 = tsrVar.c;
        long j3 = tsrVar.d;
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        i(tsrVar);
        long j4 = tsrVar.c;
        if (!tk40.b(j4)) {
            c(tsrVar, z);
            return;
        }
        tsrVar.d = (((long) iL0) & 4294967295L) | (((long) iO0) << 32);
        int i5 = (int) (j4 >> 32);
        int i6 = (int) (j4 & 4294967295L);
        int i7 = i5 + iO0;
        int i8 = i6 + iL0;
        if (!z && iwo.b(j4, j2) && i3 == iO0 && i4 == iL0) {
            return;
        }
        int i9 = tsrVar.b;
        wwx wwxVar = tsrVar.U;
        qk40 qk40Var = this.a;
        if (z) {
            tsrVarH = tsrVar.H();
            if (tsrVarH != null) {
                i = tsrVarH.b;
            } else {
                i = -1;
            }
            qk40Var.a(i9, i5, i6, i7, i8, i, wwxVar.c(1024), wwxVar.c(16));
        } else {
            int i10 = i9 & 67108863;
            long[] jArr = qk40Var.a;
            int i11 = qk40Var.c;
            int i12 = 0;
            while (true) {
                if (i12 >= jArr.length - 2 || i12 >= i11) {
                    tsrVarH = tsrVar.H();
                    if (tsrVarH != null) {
                        i = tsrVarH.b;
                    } else {
                        i = -1;
                    }
                    qk40Var.a(i9, i5, i6, i7, i8, i, wwxVar.c(1024), wwxVar.c(16));
                } else {
                    int i13 = i12 + 2;
                    int i14 = i12;
                    long j5 = jArr[i13];
                    if ((((int) j5) & 67108863) == i10) {
                        long j6 = jArr[i14];
                        jArr[i14] = (((long) i5) << 32) | (((long) i6) & 4294967295L);
                        jArr[i14 + 1] = (((long) i7) << 32) | (((long) i8) & 4294967295L);
                        long j7 = 2305843009213693952L;
                        jArr[i13] = j5 | 2305843009213693952L;
                        int i15 = i5 - ((int) (j6 >> 32));
                        int i16 = i6 - ((int) j6);
                        if ((i15 != 0) | (i16 != 0)) {
                            long j8 = -4503599560261633L;
                            char c2 = 26;
                            long[] jArr2 = qk40Var.a;
                            long[] jArr3 = qk40Var.b;
                            jArr3[0] = (j5 & (-4503599560261633L)) | (((long) ((i14 + 3) & 67108863)) << 26);
                            int i17 = 1;
                            while (i17 > 0) {
                                i17--;
                                long j9 = jArr3[i17];
                                int i18 = ((int) j9) & 67108863;
                                int i19 = ((int) (j9 >> c2)) & 67108863;
                                char c3 = 511;
                                int i20 = ((int) (j9 >> 52)) & 511;
                                int length = i20 == 511 ? jArr2.length : i20 + i19;
                                if (i19 < 0) {
                                    break;
                                }
                                char c4 = c2;
                                while (i19 < jArr2.length - 2 && i19 < length) {
                                    int i21 = i19 + 2;
                                    long j10 = jArr2[i21];
                                    long j11 = j8;
                                    if ((((int) (j10 >> c4)) & 67108863) == i18) {
                                        long j12 = jArr2[i19];
                                        int i22 = i19 + 1;
                                        j = j7;
                                        long j13 = jArr2[i22];
                                        i2 = i19;
                                        jArr2[i2] = (((long) (((int) j12) + i16)) & 4294967295L) | (((long) (((int) (j12 >> 32)) + i15)) << 32);
                                        jArr2[i22] = (((long) (((int) j13) + i16)) & 4294967295L) | (((long) (((int) (j13 >> 32)) + i15)) << 32);
                                        jArr2[i21] = j10 | j;
                                        c = 511;
                                        if ((((int) (j10 >> 52)) & 511) > 0) {
                                            jArr3[i17] = (j10 & j11) | (((long) ((i2 + 3) & 67108863)) << c4);
                                            i17++;
                                        }
                                    } else {
                                        j = j7;
                                        c = c3;
                                        i2 = i19;
                                    }
                                    i19 = i2 + 3;
                                    c3 = c;
                                    j8 = j11;
                                    j7 = j;
                                }
                                c2 = c4;
                                j8 = j8;
                                j7 = j7;
                            }
                        }
                    } else {
                        i12 = i14 + 3;
                    }
                }
            }
        }
        this.d = true;
    }

    public final void j(tsr tsrVar) {
        int i = tsrVar.b & 67108863;
        qk40 qk40Var = this.a;
        long[] jArr = qk40Var.a;
        int i2 = qk40Var.c;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i4 = i3 + 2;
            if ((((int) jArr[i4]) & 67108863) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i4] = 2305843009213693951L;
                break;
            }
        }
        this.d = true;
        this.f = true;
    }
}
