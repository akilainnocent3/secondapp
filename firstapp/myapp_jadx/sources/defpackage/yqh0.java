package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yqh0 {
    public static final b a;

    public static class a {
        public static boolean a(byte b) {
            return b > -65;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i, int i2);

        public abstract int b(String str, byte[] bArr, int i, int i2);

        public final boolean c(byte[] bArr, int i, int i2) {
            return d(bArr, i, i2) == 0;
        }

        public abstract int d(byte[] bArr, int i, int i2);
    }

    public static final class c extends b {
        @Override // yqh0.b
        public final String a(byte[] bArr, int i, int i2) throws f0p {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                vqh0.a("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return null;
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (b < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b2;
                    while (i5 < i3) {
                        byte b3 = bArr[i5];
                        if (b3 < 0) {
                            break;
                        }
                        i5++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                    i4 = i6;
                    i = i5;
                } else if (b2 < -32) {
                    if (i5 >= i3) {
                        throw f0p.b();
                    }
                    i += 2;
                    byte b4 = bArr[i5];
                    int i7 = i4 + 1;
                    if (b2 < -62 || a.a(b4)) {
                        throw f0p.b();
                    }
                    cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                    i4 = i7;
                } else {
                    if (b2 >= -16) {
                        if (i5 >= i3 - 2) {
                            throw f0p.b();
                        }
                        byte b5 = bArr[i5];
                        int i8 = i + 3;
                        byte b6 = bArr[i + 2];
                        i += 4;
                        byte b7 = bArr[i8];
                        int i9 = i4 + 1;
                        if (!a.a(b5)) {
                            if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !a.a(b6) && !a.a(b7)) {
                                int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                                cArr[i4] = (char) ((i10 >>> 10) + 55232);
                                cArr[i9] = (char) ((i10 & 1023) + 56320);
                                i4 += 2;
                            }
                        }
                        throw f0p.b();
                    }
                    if (i5 >= i3 - 1) {
                        throw f0p.b();
                    }
                    int i11 = i + 2;
                    byte b8 = bArr[i5];
                    i += 3;
                    byte b9 = bArr[i11];
                    int i12 = i4 + 1;
                    if (a.a(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || a.a(b9)))) {
                        throw f0p.b();
                    }
                    cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                    i4 = i12;
                }
            }
            return new String(cArr, 0, i4);
        }

        @Override // yqh0.b
        public final int b(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char cCharAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) cCharAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char cCharAt2 = str.charAt(i6);
                if (cCharAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) cCharAt2;
                    i7++;
                } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new d(i6, length);
                            }
                            wqh0.a(cCharAt2, i7);
                            return 0;
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new d(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }

        @Override // yqh0.b
        public final int d(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    i = i3;
                } else if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b < -62) {
                        return -1;
                    }
                    i += 2;
                    if (bArr[i3] > -65) {
                        return -1;
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return yqh0.d(bArr, i3, i2);
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 > -65) {
                        return -1;
                    }
                    if (b == -32 && b2 < -96) {
                        return -1;
                    }
                    if (b == -19 && b2 >= -96) {
                        return -1;
                    }
                    i += 3;
                    if (bArr[i4] > -65) {
                        return -1;
                    }
                } else {
                    if (i3 >= i2 - 2) {
                        return yqh0.d(bArr, i3, i2);
                    }
                    int i5 = i + 2;
                    byte b3 = bArr[i3];
                    if (b3 > -65) {
                        return -1;
                    }
                    if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i6 = i + 3;
                    if (bArr[i5] > -65) {
                        return -1;
                    }
                    i += 4;
                    if (bArr[i6] > -65) {
                        return -1;
                    }
                }
            }
            return 0;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super(whs.b(i, i2, "Unpaired surrogate at index ", " of "));
        }
    }

    public static final class e extends b {
        public static int e(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                b bVar = yqh0.a;
                if (i > -12) {
                    return -1;
                }
                return i;
            }
            if (i2 == 1) {
                return yqh0.b(i, chh0.e(bArr, j));
            }
            if (i2 == 2) {
                return yqh0.c(i, chh0.e(bArr, j), chh0.e(bArr, j + 1));
            }
            x01.a();
            return 0;
        }

        @Override // yqh0.b
        public final String a(byte[] bArr, int i, int i2) throws f0p {
            Charset charset = gyo.a;
            String str = new String(bArr, i, i2, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                throw f0p.b();
            }
            return str;
        }

        @Override // yqh0.b
        public final int b(String str, byte[] bArr, int i, int i2) {
            long j;
            long j2;
            int i3;
            char cCharAt;
            long j3 = i;
            long j4 = ((long) i2) + j3;
            int length = str.length();
            if (length > i2 || bArr.length - i2 < i) {
                uqh0.a(str.charAt(length - 1), i + i2);
                return 0;
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (cCharAt = str.charAt(i4)) >= 128) {
                    break;
                }
                chh0.l(bArr, j3, (byte) cCharAt);
                i4++;
                j3 = 1 + j3;
            }
            if (i4 == length) {
                return (int) j3;
            }
            while (i4 < length) {
                char cCharAt2 = str.charAt(i4);
                if (cCharAt2 < 128 && j3 < j4) {
                    chh0.l(bArr, j3, (byte) cCharAt2);
                    j2 = j;
                    j3 += j;
                } else if (cCharAt2 >= 2048 || j3 > j4 - 2) {
                    j2 = j;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                        if (j3 > j4 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                throw new d(i4, length);
                            }
                            xqh0.a(cCharAt2, j3);
                            return 0;
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                chh0.l(bArr, j3, (byte) ((codePoint >>> 18) | 240));
                                chh0.l(bArr, j3 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j5 = j3 + 3;
                                chh0.l(bArr, 2 + j3, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 += 4;
                                chh0.l(bArr, j5, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new d(i4 - 1, length);
                    }
                    chh0.l(bArr, j3, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j6 = 2 + j3;
                    chh0.l(bArr, j3 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j3 += 3;
                    chh0.l(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j2 = j;
                    long j7 = j3 + j2;
                    chh0.l(bArr, j3, (byte) ((cCharAt2 >>> 6) | 960));
                    j3 += 2;
                    chh0.l(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                }
                i4++;
                j = j2;
            }
            return (int) j3;
        }

        @Override // yqh0.b
        public final int d(byte[] bArr, int i, int i2) {
            int i3;
            if ((i | i2 | (bArr.length - i2)) < 0) {
                vqh0.a("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                return 0;
            }
            long j = i;
            int i4 = (int) (((long) i2) - j);
            if (i4 >= 16) {
                int i5 = 8 - (((int) j) & 7);
                i3 = 0;
                long j2 = j;
                while (true) {
                    if (i3 >= i5) {
                        while (true) {
                            int i6 = i3 + 8;
                            if (i6 > i4 || (chh0.i(bArr, chh0.f + j2) & (-9187201950435737472L)) != 0) {
                                break;
                            }
                            j2 += 8;
                            i3 = i6;
                        }
                        while (true) {
                            if (i3 >= i4) {
                                i3 = i4;
                                break;
                            }
                            long j3 = j2 + 1;
                            if (chh0.e(bArr, j2) < 0) {
                                break;
                            }
                            i3++;
                            j2 = j3;
                        }
                    } else {
                        long j4 = j2 + 1;
                        if (chh0.e(bArr, j2) < 0) {
                            break;
                        }
                        i3++;
                        j2 = j4;
                    }
                }
            } else {
                i3 = 0;
            }
            int i7 = i4 - i3;
            long j5 = j + ((long) i3);
            while (true) {
                byte b = 0;
                while (i7 > 0) {
                    long j6 = j5 + 1;
                    byte bE = chh0.e(bArr, j5);
                    if (bE < 0) {
                        b = bE;
                        j5 = j6;
                        break;
                    }
                    i7--;
                    b = bE;
                    j5 = j6;
                }
                if (i7 == 0) {
                    return 0;
                }
                int i8 = i7 - 1;
                if (b < -32) {
                    if (i8 == 0) {
                        return b;
                    }
                    i7 -= 2;
                    if (b < -62) {
                        return -1;
                    }
                    long j7 = j5 + 1;
                    if (chh0.e(bArr, j5) > -65) {
                        return -1;
                    }
                    j5 = j7;
                } else if (b < -16) {
                    if (i8 < 2) {
                        return e(bArr, b, j5, i8);
                    }
                    i7 -= 3;
                    long j8 = j5 + 1;
                    byte bE2 = chh0.e(bArr, j5);
                    if (bE2 > -65) {
                        return -1;
                    }
                    if (b == -32 && bE2 < -96) {
                        return -1;
                    }
                    if (b == -19 && bE2 >= -96) {
                        return -1;
                    }
                    j5 += 2;
                    if (chh0.e(bArr, j8) > -65) {
                        return -1;
                    }
                } else {
                    if (i8 < 3) {
                        return e(bArr, b, j5, i8);
                    }
                    i7 -= 4;
                    long j9 = j5 + 1;
                    byte bE3 = chh0.e(bArr, j5);
                    if (bE3 > -65) {
                        return -1;
                    }
                    if ((((bE3 + 112) + (b << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j10 = 2 + j5;
                    if (chh0.e(bArr, j9) > -65) {
                        return -1;
                    }
                    j5 += 3;
                    if (chh0.e(bArr, j10) > -65) {
                        return -1;
                    }
                }
            }
        }
    }

    static {
        a = (chh0.e && chh0.d && !o20.a()) ? new e() : new c();
    }

    public static int a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i3 = 0;
                while (i < length2) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i) < 65536) {
                                throw new d(i, length2);
                            }
                            i++;
                        }
                    }
                    i++;
                }
                i2 += i3;
                break;
            }
            i2 += (127 - cCharAt) >>> 31;
            i++;
        }
        if (i2 >= length) {
            return i2;
        }
        sqh0.a(((long) i2) + 4294967296L);
        return 0;
    }

    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int c(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int d(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b2 > -12) {
                return -1;
            }
            return b2;
        }
        if (i3 == 1) {
            return b(b2, bArr[i]);
        }
        if (i3 == 2) {
            return c(b2, bArr[i], bArr[i + 1]);
        }
        x01.a();
        return 0;
    }
}
