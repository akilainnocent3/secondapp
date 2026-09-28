package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ctw<K> {
    public long[] a;
    public Object[] b;
    public float[] c;
    public int d;
    public int e;
    public int f;

    public ctw(int i) {
        this.a = fz60.a;
        this.b = bza.c;
        this.c = ixh.a;
        if (i >= 0) {
            c(fz60.e(i));
        } else {
            hb5.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i) {
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

    public final int b(Object obj) {
        int i = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.d;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final void c(int i) {
        long[] jArr;
        int iMax = i > 0 ? Math.max(7, fz60.d(i)) : 0;
        this.d = iMax;
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
        this.f = fz60.a(this.d) - this.e;
        this.b = new Object[iMax];
        this.c = new float[iMax];
    }

    public final void d(float f, String str) {
        long j;
        long j2;
        int i;
        int i2;
        long j3;
        int iNumberOfTrailingZeros;
        long[] jArr;
        Object[] objArr;
        float[] fArr;
        String str2 = str;
        int i3 = -862048943;
        int iHashCode = str2.hashCode() * (-862048943);
        int i4 = iHashCode ^ (iHashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        loop0: while (true) {
            long[] jArr2 = this.a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            int i12 = 1;
            int i13 = i9;
            int i14 = 0;
            long j4 = (((-i11) >> 63) & (jArr2[i10 + 1] << (64 - i11))) | (jArr2[i10] >>> i11);
            long j5 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L);
            while (j7 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i8) & i7;
                int i15 = i3;
                if (Intrinsics.g(this.b[iNumberOfTrailingZeros], str2)) {
                    break loop0;
                }
                j7 &= j7 - 1;
                i3 = i15;
            }
            int i16 = i3;
            if ((j4 & ((~j4) << 6) & (-9187201950435737472L)) != 0) {
                int iA = a(i5);
                long j8 = 255;
                if (this.f != 0 || ((this.a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = j5;
                    j2 = 255;
                    i = 1;
                    i2 = 0;
                    j3 = 128;
                } else {
                    int i17 = this.d;
                    if (i17 > 8) {
                        j3 = 128;
                        long j9 = this.e;
                        nbh0.a aVar = nbh0.b;
                        if (Long.compare((j9 * 32) ^ Long.MIN_VALUE, (((long) i17) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.a;
                            int i18 = this.d;
                            Object[] objArr2 = this.b;
                            float[] fArr2 = this.c;
                            int i19 = (i18 + 7) >> 3;
                            int i20 = 0;
                            while (i20 < i19) {
                                long j10 = jArr3[i20] & (-9187201950435737472L);
                                jArr3[i20] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
                                i20++;
                                j8 = j8;
                                j5 = j5;
                            }
                            j = j5;
                            j2 = j8;
                            char c = 7;
                            int iZ = ay0.z(jArr3);
                            int i21 = iZ - 1;
                            jArr3[i21] = (jArr3[i21] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iZ] = jArr3[0];
                            int i22 = 0;
                            while (i22 != i18) {
                                int i23 = i22 >> 3;
                                int i24 = (i22 & 7) << 3;
                                long j11 = (jArr3[i23] >> i24) & j2;
                                if (j11 != 128 && j11 == 254) {
                                    Object obj = objArr2[i22];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : i14) * i16;
                                    int i25 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i26 = i25 >>> 7;
                                    int iA2 = a(i26);
                                    int i27 = i26 & i18;
                                    char c2 = c;
                                    if (((iA2 - i27) & i18) / 8 == ((i22 - i27) & i18) / 8) {
                                        int i28 = i14;
                                        jArr3[i23] = (((long) (i25 & 127)) << i24) | (jArr3[i23] & (~(j2 << i24)));
                                        jArr3[jArr3.length - 1] = (jArr3[i28] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                        i12 = i12;
                                        c = c2;
                                        i14 = i28;
                                    } else {
                                        int i29 = i12;
                                        int i30 = i14;
                                        int i31 = iA2 >> 3;
                                        long j12 = jArr3[i31];
                                        int i32 = (iA2 & 7) << 3;
                                        if (((j12 >> i32) & j2) == 128) {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i31] = ((~(j2 << i32)) & j12) | (((long) (i25 & 127)) << i32);
                                            jArr3[i23] = (jArr3[i23] & (~(j2 << i24))) | (128 << i24);
                                            objArr[iA2] = objArr[i22];
                                            objArr[i22] = null;
                                            fArr[iA2] = fArr[i22];
                                            fArr[i22] = 0.0f;
                                        } else {
                                            objArr = objArr2;
                                            fArr = fArr2;
                                            jArr3[i31] = (((long) (i25 & 127)) << i32) | ((~(j2 << i32)) & j12);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i22];
                                            objArr[i22] = obj2;
                                            float f2 = fArr[iA2];
                                            fArr[iA2] = fArr[i22];
                                            fArr[i22] = f2;
                                            i22--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i30] & 72057594037927935L) | Long.MIN_VALUE;
                                        i22++;
                                        i12 = i29;
                                        c = c2;
                                        i14 = i30;
                                        objArr2 = objArr;
                                        fArr2 = fArr;
                                    }
                                } else {
                                    i22++;
                                }
                            }
                            i = i12;
                            i2 = i14;
                            this.f = fz60.a(this.d) - this.e;
                        }
                        iA = a(i5);
                    } else {
                        j3 = 128;
                    }
                    j = j5;
                    j2 = 255;
                    i = 1;
                    i2 = 0;
                    int iC = fz60.c(this.d);
                    long[] jArr4 = this.a;
                    Object[] objArr3 = this.b;
                    float[] fArr3 = this.c;
                    int i33 = this.d;
                    c(iC);
                    long[] jArr5 = this.a;
                    Object[] objArr4 = this.b;
                    float[] fArr4 = this.c;
                    int i34 = this.d;
                    int i35 = 0;
                    while (i35 < i33) {
                        if (((jArr4[i35 >> 3] >> ((i35 & 7) << 3)) & 255) < j3) {
                            Object obj3 = objArr3[i35];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i16;
                            int i36 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = a(i36 >>> 7);
                            jArr = jArr5;
                            long j13 = i36 & 127;
                            int i37 = iA3 >> 3;
                            int i38 = (iA3 & 7) << 3;
                            long j14 = (jArr[i37] & (~(255 << i38))) | (j13 << i38);
                            jArr[i37] = j14;
                            jArr[(((iA3 - 7) & i34) + (i34 & 7)) >> 3] = j14;
                            objArr4[iA3] = obj3;
                            fArr4[iA3] = fArr3[i35];
                        } else {
                            jArr = jArr5;
                        }
                        i35++;
                        jArr5 = jArr;
                    }
                    iA = a(i5);
                }
                this.e++;
                int i39 = this.f;
                long[] jArr6 = this.a;
                int i40 = iA >> 3;
                long j15 = jArr6[i40];
                int i41 = (iA & 7) << 3;
                if (((j15 >> i41) & j2) == j3) {
                    i2 = i;
                }
                this.f = i39 - i2;
                int i42 = this.d;
                long j16 = (j15 & (~(j2 << i41))) | (j << i41);
                jArr6[i40] = j16;
                jArr6[(((iA - 7) & i42) + (i42 & 7)) >> 3] = j16;
                iNumberOfTrailingZeros = ~iA;
                break;
            }
            i9 = i13 + 8;
            i8 = (i8 + i9) & i7;
            str2 = str;
            i3 = i16;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.b[iNumberOfTrailingZeros] = str;
        this.c[iNumberOfTrailingZeros] = f;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[LOOP:0: B:14:0x0023->B:29:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ctw)) {
            return false;
        }
        ctw ctwVar = (ctw) obj;
        if (ctwVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            float f = fArr[i4];
                            int iB = ctwVar.b(obj2);
                            if (iB < 0 || f != ctwVar.c[iB]) {
                                break loop0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        iHashCode += Float.hashCode(fArr[i4]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return iHashCode;
                }
            }
            if (i == length) {
                return iHashCode;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
                            i2++;
                            if (i2 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ctw() {
        this((Object) null);
    }

    public /* synthetic */ ctw(Object obj) {
        this(6);
    }
}
