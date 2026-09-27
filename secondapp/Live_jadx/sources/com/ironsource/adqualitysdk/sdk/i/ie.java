package com.ironsource.adqualitysdk.sdk.i;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import cv.z0;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ie {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2454 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2455;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2456;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2457;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2458;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2459;

    static {
        m2420();
        f2457 = (f2454 + 1) % 128;
        f2456 = true;
        f2459 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, f6.q.f83619w, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, f6.q.A, 114, 115, 116, 117, 118, 119, rg.a.f127263w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2458 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, yr.a.f159811k, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, zi.c.f161635m, zi.c.f161636n, 13, zi.c.f161638p, zi.c.f161639q, zi.c.f161640r, 17, zi.c.f161643u, 19, zi.c.f161646x, zi.c.f161647y, zi.c.f161648z, zi.c.A, zi.c.B, zi.c.C, -9, -9, -9, -9, -9, -9, zi.c.D, zi.c.E, 28, zi.c.G, zi.c.H, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private ie() {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2418(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3) {
        int i13;
        int i14;
        int i15 = f2457 + SignalKey.EVENT_ID;
        int i16 = i15 % 128;
        f2454 = i16;
        int i17 = 0;
        if (i15 % 2 == 0) {
            int i18 = 75 / 0;
            if (i11 > 0) {
                i13 = (bArr[i10] << zi.c.B) >>> 8;
            } else {
                i13 = 0;
            }
        } else if (i11 > 0) {
            i13 = (bArr[i10] << zi.c.B) >>> 8;
        } else {
            i13 = 0;
        }
        if (i11 > 1) {
            f2457 = (i16 + 23) % 128;
            i14 = (bArr[i10 + 1] << zi.c.B) >>> 16;
        } else {
            i14 = 0;
        }
        int i19 = i13 | i14;
        if (i11 > 2) {
            f2454 = (f2457 + 51) % 128;
            i17 = (bArr[i10 + 2] << zi.c.B) >>> 24;
        }
        int i20 = i19 | i17;
        if (i11 == 1) {
            bArr2[i12] = bArr3[i20 >>> 18];
            bArr2[i12 + 1] = bArr3[(i20 >>> 12) & 63];
            bArr2[i12 + 2] = yr.a.f159811k;
            bArr2[i12 + 3] = yr.a.f159811k;
            f2454 = (f2457 + SignalKey.EVENT_ID) % 128;
            return bArr2;
        }
        if (i11 == 2) {
            bArr2[i12] = bArr3[i20 >>> 18];
            bArr2[i12 + 1] = bArr3[(i20 >>> 12) & 63];
            bArr2[i12 + 2] = bArr3[(i20 >>> 6) & 63];
            bArr2[i12 + 3] = yr.a.f159811k;
            return bArr2;
        }
        if (i11 != 3) {
            return bArr2;
        }
        bArr2[i12] = bArr3[i20 >>> 18];
        bArr2[i12 + 1] = bArr3[(i20 >>> 12) & 63];
        bArr2[i12 + 2] = bArr3[(i20 >>> 6) & 63];
        bArr2[i12 + 3] = bArr3[i20 & 63];
        return bArr2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m2419(byte[] bArr, int i10) throws ic {
        f2457 = (f2454 + 21) % 128;
        byte[] bArrM2417 = m2417(bArr, 0, i10, f2458);
        f2457 = (f2454 + 101) % 128;
        return bArrM2417;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2420() {
        f2455 = new char[]{16, 'J', 'l', 'l', 'l', 'f', 'j', 'G', 'B', 'l', 'v', 'm', 'A', 'J', 'j', '@', '#', '2', '2', '#', 'B', 'l', 'v', 'm', 'A', 'C', 'j', 'k', 'f', 'd', 'b', 'h', 'H', 'B', 'f', 'j', 'f', 'k', 'r', 'k', '2', 'B', '#', '2', '2', '#', 'C', 'c', 'f', 'o', 'l', 'h', 'r', 'L', 'I', 'n', 'h', 'j', 'g', 'f', 'o', 'I', 'B', 'i', 'i', 'B', 'G', 'j', 'C', 'B', 'i', 'h', 'i', 'i', 'd', 'd', 'B', 'K', 'k', 'f', 'p', 'm', 'B', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J', 'H', 'h', 'b', 'd', 'f', 'k', 'j', 'C', 'A', 'm', 'v', 144, 288, 288, 254, 263, 295, 290, 300, 297, 254, 256, 288, 294, 261, 256, 295, 302, 295, 290, 294, 290, 254, 262, 303, 293, 289, 294, 294, 295, 294, 255, 253, 297, 306, 296, 289, 293, 292, 293, 'N', 146, 172, 211, z0.f77343h, 218, 220, 178, z0.f77347l, 205, 204, 209, 209, 202, 211, 212, 211, z0.f77352q, 168, 210, 178, 153, 185, 202, 170, 153, 185, 210, 212, 181, 26, 'A', 20, 'J', 'f', 'g', 'k', 'f', 'd', 'd', 'F', '9', 'n', 'k', 'j', 'i', 'h', 'B', 'J', 's', 'i', 'e', 'j', 'j', 'k', 'j', 'C', 'A', 'e', 'd', 'i', 'i', 'b', 'k', 'l', 'k', 'I', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J'};
    }

    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] m2422(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = ((i11 + 2) / 3) << 2;
        int i13 = i12 + (i12 / Integer.MAX_VALUE);
        byte[] bArr3 = new byte[i13];
        int i14 = i11 - 2;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i15 < i14) {
            int i18 = ((bArr[i15] << zi.c.B) >>> 8) | ((bArr[i15 + 1] << zi.c.B) >>> 16) | ((bArr[i15 + 2] << zi.c.B) >>> 24);
            bArr3[i16] = bArr2[i18 >>> 18];
            int i19 = i16 + 1;
            bArr3[i19] = bArr2[(i18 >>> 12) & 63];
            bArr3[i16 + 2] = bArr2[(i18 >>> 6) & 63];
            bArr3[i16 + 3] = bArr2[i18 & 63];
            i17 += 4;
            if (i17 == Integer.MAX_VALUE) {
                bArr3[i16 + 4] = 10;
                f2454 = (f2457 + 1) % 128;
                i17 = 0;
                i16 = i19;
            }
            i15 += 3;
            i16 += 4;
        }
        if (i15 < i11) {
            int i20 = f2454 + 113;
            f2457 = i20 % 128;
            if (i20 % 2 != 0) {
                m2418(bArr, i15, i11 * i15, bArr3, i16, bArr2);
                if (i17 + 8 == Integer.MAX_VALUE) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                }
            } else {
                m2418(bArr, i15, i11 - i15, bArr3, i16, bArr2);
                if (i17 + 4 == Integer.MAX_VALUE) {
                    bArr3[i16 + 4] = 10;
                    i16++;
                }
            }
            i16 += 4;
        }
        if (f2456 || i16 == i13) {
            return bArr3;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2423(byte[] bArr) {
        int i10 = f2457 + 119;
        f2454 = i10 % 128;
        if (i10 % 2 == 0) {
            m2424(bArr, bArr.length, f2459);
            throw null;
        }
        String strM2424 = m2424(bArr, bArr.length, f2459);
        f2454 = (f2457 + 117) % 128;
        return strM2424;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2424(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArrM2422 = m2422(bArr, 0, i10, bArr2);
        String str = new String(bArrM2422, 0, bArrM2422.length);
        f2454 = (f2457 + 81) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m2426(String str) throws ic {
        byte[] bArrM2419;
        int i10 = f2454 + 91;
        f2457 = i10 % 128;
        if (i10 % 2 != 0) {
            byte[] bytes = str.getBytes();
            bArrM2419 = m2419(bytes, bytes.length);
            int i11 = 47 / 0;
        } else {
            byte[] bytes2 = str.getBytes();
            bArrM2419 = m2419(bytes2, bytes2.length);
        }
        int i12 = f2457 + 17;
        f2454 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 54 / 0;
        }
        return bArrM2419;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2425(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2455, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2447 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2447;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2447 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2447 = 0;
                    while (true) {
                        int i16 = i.f2447;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2447 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2447 = 0;
                    while (true) {
                        int i17 = i.f2447;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2447 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m2421(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        int i11 = (f2457 + 31) % 128;
        f2454 = i11;
        byte b10 = bArr[2];
        if (b10 == 61) {
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << zi.c.B) >>> 12) | ((bArr3[bArr[0]] << zi.c.B) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (b11 == 61) {
            int i12 = ((bArr3[bArr[1]] << zi.c.B) >>> 12) | ((bArr3[bArr[0]] << zi.c.B) >>> 6) | ((bArr3[b10] << zi.c.B) >>> 18);
            bArr2[i10] = (byte) (i12 >>> 16);
            bArr2[i10 + 1] = (byte) (i12 >>> 8);
            int i13 = i11 + 63;
            f2457 = i13 % 128;
            if (i13 % 2 == 0) {
                return 2;
            }
            throw null;
        }
        int i14 = ((bArr3[bArr[1]] << zi.c.B) >>> 12) | ((bArr3[bArr[0]] << zi.c.B) >>> 6) | ((bArr3[b10] << zi.c.B) >>> 18) | ((bArr3[b11] << zi.c.B) >>> 24);
        bArr2[i10] = (byte) (i14 >> 16);
        bArr2[i10 + 1] = (byte) (i14 >> 8);
        bArr2[i10 + 2] = (byte) i14;
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x003f A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] m2417(byte[] bArr, int i10, int i11, byte[] bArr2) throws ic {
        int i12;
        byte[] bArr3 = new byte[((i11 * 3) / 4) + 2];
        byte[] bArr4 = new byte[4];
        int iM2421 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            int i15 = (f2454 + 75) % 128;
            f2457 = i15;
            byte b10 = (byte) (bArr[i14] & 127);
            byte b11 = bArr2[b10];
            if (b11 >= -5) {
                int i16 = i15 + 93;
                f2454 = i16 % 128;
                if (i16 % 2 == 0) {
                    int i17 = 12 / 0;
                    if (b11 < -1) {
                        continue;
                    } else {
                        if (b10 == 61) {
                            f2454 = (i15 + 11) % 128;
                            int i18 = i11 - i14;
                            byte b12 = (byte) (bArr[i11 - 1] & 127);
                            if (i13 == 0 && i13 != 1) {
                                if (i13 == 3) {
                                    int i19 = i15 + 1;
                                    f2454 = i19 % 128;
                                    if (i19 % 2 != 0 ? i18 <= 2 : i18 <= 4) {
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(m2425(new int[]{40, 64, 0, 53}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false).intern());
                                    sb2.append(i14);
                                    throw new ic(sb2.toString());
                                }
                                if (i13 != 4 || i18 <= 1) {
                                    if (b12 == 61) {
                                        break;
                                    }
                                    f2454 = (i15 + 95) % 128;
                                    if (b12 == 10) {
                                        break;
                                    }
                                    throw new ic(m2425(new int[]{104, 39, 188, 35}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false).intern());
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(m2425(new int[]{40, 64, 0, 53}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001", false).intern());
                                sb3.append(i14);
                                throw new ic(sb3.toString());
                            }
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(m2425(new int[]{0, 40, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true).intern());
                            sb4.append(i14);
                            throw new ic(sb4.toString());
                        }
                        i12 = i13 + 1;
                        bArr4[i13] = b10;
                        if (i12 == 4) {
                            iM2421 += m2421(bArr4, bArr3, iM2421, bArr2);
                            f2457 = (f2454 + 123) % 128;
                            i13 = 0;
                        } else {
                            i13 = i12;
                        }
                    }
                } else if (b11 < -1) {
                    continue;
                } else {
                    if (b10 == 61) {
                        f2454 = (i15 + 11) % 128;
                        int i110 = i11 - i14;
                        byte b13 = (byte) (bArr[i11 - 1] & 127);
                        if (i13 == 0) {
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(m2425(new int[]{0, 40, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", true).intern());
                        sb5.append(i14);
                        throw new ic(sb5.toString());
                    }
                    i12 = i13 + 1;
                    bArr4[i13] = b10;
                    if (i12 == 4) {
                        iM2421 += m2421(bArr4, bArr3, iM2421, bArr2);
                        f2457 = (f2454 + 123) % 128;
                        i13 = 0;
                    } else {
                        i13 = i12;
                    }
                }
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(m2425(new int[]{143, 30, 104, 21}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", false).intern());
                sb6.append(i14);
                sb6.append(m2425(new int[]{TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 2, 20, 0}, "\u0000\u0000", true).intern());
                sb6.append((int) bArr[i14]);
                sb6.append(m2425(new int[]{HideBottomViewOnScrollBehavior.f50183l, 9, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", true).intern());
                throw new ic(sb6.toString());
            }
        }
        if (i13 != 0) {
            if (i13 != 1) {
                bArr4[i13] = yr.a.f159811k;
                iM2421 += m2421(bArr4, bArr3, iM2421, bArr2);
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(m2425(new int[]{184, 36, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000", false).intern());
                sb7.append(i11 - 1);
                throw new ic(sb7.toString());
            }
        }
        byte[] bArr5 = new byte[iM2421];
        System.arraycopy(bArr3, 0, bArr5, 0, iM2421);
        return bArr5;
    }
}
