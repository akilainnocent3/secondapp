package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class stw<E> extends gz60<E> {
    public int e;

    public stw(int i) {
        this.a = fz60.a;
        this.b = bza.c;
        if (i >= 0) {
            h(fz60.e(i));
        } else {
            hb5.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean d(E e) {
        int i = this.d;
        this.b[f(e)] = e;
        return this.d != i;
    }

    public final void e() {
        this.d = 0;
        long[] jArr = this.a;
        if (jArr != fz60.a) {
            xx0.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.c;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        xx0.l(0, this.c, null, this.b);
        this.e = fz60.a(this.c) - this.d;
    }

    public final int f(E e) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.c;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr2 = this.a;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j4 = ((jArr2[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr2[i8] >>> i9);
            long j5 = i4;
            int i10 = i4;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L);
            while (j7 != 0) {
                int iNumberOfTrailingZeros = (i6 + (Long.numberOfTrailingZeros(j7) >> 3)) & i5;
                int i11 = i;
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], e)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iG = g(i3);
                long j8 = 255;
                if (this.e != 0 || ((this.a[iG >> 3] >> ((iG & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.c;
                    if (i13 > 8) {
                        int i14 = 8;
                        long j9 = this.d;
                        nbh0.a aVar = nbh0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.c;
                            Object[] objArr2 = this.b;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
                            j3 = 128;
                            while (i17 < i16) {
                                long j10 = j8;
                                long j11 = jArr3[i17] & (-9187201950435737472L);
                                jArr3[i17] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
                                i17++;
                                i14 = i14;
                                j5 = j5;
                                j8 = j10;
                            }
                            j = j8;
                            j2 = j5;
                            int i18 = i14;
                            int iZ = ay0.z(jArr3);
                            int i19 = iZ - 1;
                            long j12 = 72057594037927935L;
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j13 = (jArr3[i21] >> i22) & j;
                                if (j13 != 128 && j13 == 254) {
                                    Object obj = objArr2[i20];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i12;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iG2 = g(i24);
                                    int i25 = i24 & i15;
                                    if (((iG2 - i25) & i15) / i18 == ((i20 - i25) & i15) / i18) {
                                        long j14 = j12;
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | ((~(j << i22)) & jArr3[i21]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j14) | Long.MIN_VALUE;
                                        i20++;
                                        j12 = j14;
                                    } else {
                                        long j15 = j12;
                                        int i26 = iG2 >> 3;
                                        long j16 = jArr3[i26];
                                        int i27 = (iG2 & 7) << 3;
                                        if (((j16 >> i27) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i26] = ((~(j << i27)) & j16) | (((long) (i23 & 127)) << i27);
                                            jArr3[i21] = (jArr3[i21] & (~(j << i22))) | (128 << i22);
                                            objArr[iG2] = objArr[i20];
                                            objArr[i20] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i26] = (((long) (i23 & 127)) << i27) | ((~(j << i27)) & j16);
                                            Object obj2 = objArr[iG2];
                                            objArr[iG2] = objArr[i20];
                                            objArr[i20] = obj2;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j15) | Long.MIN_VALUE;
                                        i20++;
                                        j12 = j15;
                                        i18 = i18;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            this.e = fz60.a(this.c) - this.d;
                        }
                        iG = g(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iC = fz60.c(this.c);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    int i28 = this.c;
                    h(iC);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    int i29 = this.c;
                    int i30 = 0;
                    while (i30 < i28) {
                        if (((jArr4[i30 >> 3] >> ((i30 & 7) << 3)) & 255) < 128) {
                            Object obj3 = objArr3[i30];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i12;
                            int i31 = iHashCode3 ^ (iHashCode3 << 16);
                            int iG3 = g(i31 >>> 7);
                            long j17 = i31 & 127;
                            int i32 = iG3 >> 3;
                            int i33 = (iG3 & 7) << 3;
                            jArr = jArr5;
                            long j18 = (jArr5[i32] & (~(255 << i33))) | (j17 << i33);
                            jArr[i32] = j18;
                            jArr[(((iG3 - 7) & i29) + (i29 & 7)) >> 3] = j18;
                            objArr4[iG3] = obj3;
                        } else {
                            jArr = jArr5;
                        }
                        i30++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iG = g(i3);
                }
                this.d++;
                int i34 = this.e;
                long[] jArr6 = this.a;
                int i35 = iG >> 3;
                long j19 = jArr6[i35];
                int i36 = (iG & 7) << 3;
                this.e = i34 - (((j19 >> i36) & j) == j3 ? 1 : 0);
                int i37 = this.c;
                long j20 = (j19 & (~(j << i36))) | (j2 << i36);
                jArr6[i35] = j20;
                jArr6[(((iG - 7) & i37) + (i37 & 7)) >> 3] = j20;
                return iG;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final int g(int i) {
        int i2 = this.c;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.a;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void h(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, fz60.d(i)) : 0;
        this.c = iMax;
        if (iMax == 0) {
            jArr = fz60.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.a = jArr;
        int i3 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        this.e = fz60.a(this.c) - this.d;
        this.b = iMax == 0 ? bza.c : new Object[iMax];
    }

    public final void i(E e) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.c;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], e)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i += 8;
                i5 = i6 + i;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m(iNumberOfTrailingZeros);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(gz60<E> gz60Var) {
        gz60Var.getClass();
        Object[] objArr = gz60Var.b;
        long[] jArr = gz60Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        k(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(E e) {
        this.b[f(e)] = e;
    }

    public final boolean l(E e) {
        int iNumberOfTrailingZeros;
        int iHashCode = (e != null ? e.hashCode() : 0) * (-862048943);
        int i = iHashCode ^ (iHashCode << 16);
        int i2 = i & 127;
        int i3 = this.c;
        int i4 = (i >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = this.a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = (((long) i2) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], e)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
        boolean z = iNumberOfTrailingZeros >= 0;
        if (z) {
            m(iNumberOfTrailingZeros);
        }
        return z;
    }

    public final void m(int i) {
        this.d--;
        long[] jArr = this.a;
        int i2 = this.c;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
    }

    public stw() {
        this((Object) null);
    }

    public /* synthetic */ stw(Object obj) {
        this(6);
    }
}
