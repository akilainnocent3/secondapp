package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rtw<K, V> extends ez60<K, V> {
    public int f;

    public rtw(int i) {
        this.a = fz60.a;
        Object[] objArr = bza.c;
        this.b = objArr;
        this.c = objArr;
        if (i >= 0) {
            j(fz60.e(i));
        } else {
            hb5.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void g() {
        this.e = 0;
        long[] jArr = this.a;
        if (jArr != fz60.a) {
            xx0.n(jArr, -9187201950435737472L);
            long[] jArr2 = this.a;
            int i = this.d;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        xx0.l(0, this.d, null, this.c);
        xx0.l(0, this.d, null, this.b);
        this.f = fz60.a(this.d) - this.e;
    }

    public final int h(int i) {
        int i2 = this.d;
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

    public final int i(K k) {
        long j;
        long j2;
        long j3;
        long[] jArr;
        Object[] objArr;
        int i = -862048943;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.d;
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
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], k)) {
                    return iNumberOfTrailingZeros;
                }
                j7 &= j7 - 1;
                i = i11;
            }
            int i12 = i;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int iH = h(i3);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iH >> 3] >> ((iH & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                } else {
                    int i13 = this.d;
                    if (i13 > 8) {
                        int i14 = 8;
                        long j9 = this.e;
                        nbh0.a aVar = nbh0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i13) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i15 = this.d;
                            Object[] objArr2 = this.b;
                            Object[] objArr3 = this.c;
                            j3 = 128;
                            int i16 = (i15 + 7) >> 3;
                            int i17 = 0;
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
                            jArr3[i19] = (jArr3[i19] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ] = jArr3[0];
                            int i20 = 0;
                            while (i20 != i15) {
                                int i21 = i20 >> 3;
                                int i22 = (i20 & 7) << 3;
                                long j12 = (jArr3[i21] >> i22) & j;
                                if (j12 != 128 && j12 == 254) {
                                    Object obj = objArr2[i20];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i12;
                                    int i23 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i24 = i23 >>> 7;
                                    int iH2 = h(i24);
                                    int i25 = i24 & i15;
                                    if (((iH2 - i25) & i15) / i18 == ((i20 - i25) & i15) / i18) {
                                        jArr3[i21] = (((long) (i23 & 127)) << i22) | (jArr3[i21] & (~(j << i22)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i20++;
                                        i18 = i18;
                                    } else {
                                        int i26 = i18;
                                        int i27 = iH2 >> 3;
                                        long j13 = jArr3[i27];
                                        int i28 = (iH2 & 7) << 3;
                                        if (((j13 >> i28) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i27] = ((~(j << i28)) & j13) | (((long) (i23 & 127)) << i28);
                                            jArr3[i21] = (jArr3[i21] & (~(j << i22))) | (128 << i22);
                                            objArr[iH2] = objArr[i20];
                                            objArr[i20] = null;
                                            objArr3[iH2] = objArr3[i20];
                                            objArr3[i20] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i27] = (((long) (i23 & 127)) << i28) | ((~(j << i28)) & j13);
                                            Object obj2 = objArr[iH2];
                                            objArr[iH2] = objArr[i20];
                                            objArr[i20] = obj2;
                                            Object obj3 = objArr3[iH2];
                                            objArr3[iH2] = objArr3[i20];
                                            objArr3[i20] = obj3;
                                            i20--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i20++;
                                        i18 = i26;
                                        i15 = i15;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i20++;
                                }
                            }
                            this.f = fz60.a(this.d) - this.e;
                        }
                        iH = h(i3);
                    }
                    j = 255;
                    j2 = j5;
                    j3 = 128;
                    int iC = fz60.c(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr4 = this.b;
                    Object[] objArr5 = this.c;
                    int i29 = this.d;
                    j(iC);
                    long[] jArr5 = this.a;
                    Object[] objArr6 = this.b;
                    Object[] objArr7 = this.c;
                    int i30 = this.d;
                    int i31 = 0;
                    while (i31 < i29) {
                        if (((jArr4[i31 >> 3] >> ((i31 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr4[i31];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i12;
                            int i32 = iHashCode3 ^ (iHashCode3 << 16);
                            int iH3 = h(i32 >>> 7);
                            jArr = jArr5;
                            long j14 = i32 & 127;
                            int i33 = iH3 >> 3;
                            int i34 = (iH3 & 7) << 3;
                            long j15 = (jArr[i33] & (~(255 << i34))) | (j14 << i34);
                            jArr[i33] = j15;
                            jArr[(((iH3 - 7) & i30) + (i30 & 7)) >> 3] = j15;
                            objArr6[iH3] = obj4;
                            objArr7[iH3] = objArr5[i31];
                        } else {
                            jArr = jArr5;
                        }
                        i31++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iH = h(i3);
                }
                this.e++;
                int i35 = this.f;
                long[] jArr6 = this.a;
                int i36 = iH >> 3;
                long j16 = jArr6[i36];
                int i37 = (iH & 7) << 3;
                this.f = i35 - (((j16 >> i37) & j) == j3 ? 1 : 0);
                int i38 = this.d;
                long j17 = (j16 & (~(j << i37))) | (j2 << i37);
                jArr6[i36] = j17;
                jArr6[(((iH - 7) & i38) + (i38 & 7)) >> 3] = j17;
                return ~iH;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
            i4 = i10;
            i = i12;
        }
    }

    public final void j(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, fz60.d(i)) : 0;
        this.d = iMax;
        if (iMax == 0) {
            jArr = fz60.a;
        } else {
            int i2 = ((iMax + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            int i3 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j)) | j;
            jArr = jArr2;
        }
        this.a = jArr;
        this.f = fz60.a(this.d) - this.e;
        Object[] objArr = bza.c;
        this.b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.c = objArr;
    }

    public final V k(K k) {
        int iNumberOfTrailingZeros;
        int i = 0;
        int iHashCode = (k != null ? k.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
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
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], k)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return l(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final V l(int i) {
        this.e--;
        long[] jArr = this.a;
        int i2 = this.d;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.b[i] = null;
        Object[] objArr = this.c;
        V v = (V) objArr[i];
        objArr[i] = null;
        return v;
    }

    public final void m(K k, V v) {
        int i = i(k);
        if (i < 0) {
            i = ~i;
        }
        this.b[i] = k;
        this.c[i] = v;
    }

    public rtw() {
        this((Object) null);
    }

    public /* synthetic */ rtw(Object obj) {
        this(6);
    }
}
