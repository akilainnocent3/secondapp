package defpackage;

import java.io.EOFException;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(lb5 lb5Var, rl5 rl5Var, long j, long j2, int i) {
        e580 e580Var;
        long j3 = j;
        long j4 = j2;
        rl5Var.getClass();
        long j5 = i;
        l.b(rl5Var.d(), 0L, j5);
        if (i <= 0) {
            hb5.a("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            kb5.a(avg.a(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder sbA = q6a0.a(j3, "fromIndex > toIndex: ", " > ");
            sbA.append(j4);
            throw new IllegalArgumentException(sbA.toString().toString());
        }
        long j6 = lb5Var.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (e580Var = lb5Var.a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                e580Var = e580Var.g;
                e580Var.getClass();
                j6 -= (long) (e580Var.c - e580Var.b);
            }
            byte[] bArrI = rl5Var.i();
            byte b2 = bArrI[0];
            long jMin = Math.min(j4, (lb5Var.b - j5) + 1);
            while (j6 < jMin) {
                byte[] bArr = e580Var.a;
                int iMin = (int) Math.min(e580Var.c, (((long) e580Var.b) + jMin) - j6);
                for (int i2 = (int) ((((long) e580Var.b) + j3) - j6); i2 < iMin; i2++) {
                    if (bArr[i2] == b2 && b(e580Var, i2 + 1, bArrI, 1, i)) {
                        return ((long) (i2 - e580Var.b)) + j6;
                    }
                }
                j6 += (long) (e580Var.c - e580Var.b);
                e580Var = e580Var.f;
                e580Var.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + ((long) (e580Var.c - e580Var.b));
            if (j8 > j3) {
                break;
            }
            e580Var = e580Var.f;
            e580Var.getClass();
            j7 = j8;
        }
        byte[] bArrI2 = rl5Var.i();
        byte b3 = bArrI2[0];
        long jMin2 = Math.min(j4, (lb5Var.b - j5) + 1);
        while (j7 < jMin2) {
            byte[] bArr2 = e580Var.a;
            int iMin2 = (int) Math.min(e580Var.c, (((long) e580Var.b) + jMin2) - j7);
            for (int i3 = (int) ((((long) e580Var.b) + j3) - j7); i3 < iMin2; i3++) {
                if (bArr2[i3] == b3 && b(e580Var, i3 + 1, bArrI2, 1, i)) {
                    return ((long) (i3 - e580Var.b)) + j7;
                }
            }
            j7 += (long) (e580Var.c - e580Var.b);
            e580Var = e580Var.f;
            e580Var.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(e580 e580Var, int i, byte[] bArr, int i2, int i3) {
        int i4 = e580Var.c;
        byte[] bArr2 = e580Var.a;
        while (i2 < i3) {
            if (i == i4) {
                e580Var = e580Var.f;
                e580Var.getClass();
                byte[] bArr3 = e580Var.a;
                bArr2 = bArr3;
                i = e580Var.b;
                i4 = e580Var.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(lb5 lb5Var, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (lb5Var.m(j2) == 13) {
                String strV = lb5Var.V(j2, Charsets.UTF_8);
                lb5Var.skip(2L);
                return strV;
            }
        }
        String strV2 = lb5Var.V(j, Charsets.UTF_8);
        lb5Var.skip(1L);
        return strV2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a1 A[LOOP:0: B:8:0x001c->B:49:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0 A[SYNTHETIC] */
    public static final int d(lb5 lb5Var, t2z t2zVar, boolean z) {
        int i;
        int i2;
        int i3;
        e580 e580Var;
        int i4;
        t2zVar.getClass();
        e580 e580Var2 = lb5Var.a;
        if (e580Var2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = e580Var2.a;
        int i5 = e580Var2.b;
        int i6 = e580Var2.c;
        int[] iArr = t2zVar.c;
        e580 e580Var3 = e580Var2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (e580Var3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            e580Var3 = e580Var3.f;
                            e580Var3.getClass();
                            int i16 = e580Var3.b;
                            byte[] bArr2 = e580Var3.a;
                            i2 = e580Var3.c;
                            if (e580Var3 == e580Var2) {
                                i3 = i16;
                                bArr = bArr2;
                                e580Var3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        e580Var3.getClass();
                        e580 e580Var4 = e580Var3.f;
                        e580Var4.getClass();
                        i3 = e580Var4.b;
                        byte[] bArr3 = e580Var4.a;
                        i4 = e580Var4.c;
                        if (e580Var4 != e580Var2) {
                            e580Var = e580Var4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            e580Var = null;
                        }
                    } else {
                        e580Var = e580Var3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        e580Var3 = e580Var;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    e580Var3 = e580Var;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
