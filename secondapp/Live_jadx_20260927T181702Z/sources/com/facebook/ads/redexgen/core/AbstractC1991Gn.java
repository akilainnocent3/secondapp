package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1991Gn {
    public static byte[] A00;
    public static String[] A01 = {"jnpQs", "68vQr4mYnLI0oxp3WZBPcyc6w04l8sdO", "1OtBqA6VhuQLpqBNtIteBoMpw2BUtlZT", "iBOJpCpDP8DiwQrVeW3OV9Em66L9h1f8", "Xaj0HtPMuTBdCp8NFbjtiHIpdpZCFdAK", "i4DAEtymK6yFJNiO2QALezQZgNrDh5qR", "4Bsy9O0lknqqP9xR2TNdH0U1zi1weR0A", "FgP5ewPOxCae6ADOyhugLxvte5BfjSLb"};
    public static final int[] A02;
    public static final int[] A03;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-10, -10, -8, -43, c.G, c.D, c.f161648z, c.C, c.D, 39, -43, c.H, 35, 40, 42, c.E, c.E, c.H, c.B, c.H, c.D, 35, 41, -43, c.C, c.f161648z, 41, c.f161648z, -13, -13, -11, -46, c.D, c.A, 19, c.f161648z, c.A, 36, -46, 41, 36, 33, 32, c.C, -46, 5, 19, 31, 34, c.H, c.E, 32, c.C, -46, -8, 36, c.A, 35, 39, c.A, 32, c.f161647y, 43, -46, -5, 32, c.f161648z, c.A, 42, 5, 37, 39, c.C, 56, 45, 48, c.f161640r, 41, 32, 51, 43, 32, c.H, 47, 32, 31, -37, 33, 45, 28, 40, 32, 7, 32, 41, 34, 47, 35, 1, 39, 28, 34, -37, -8, -37, -20, -8, 17, c.f161648z, c.B, 19, 19, c.f161643u, c.f161647y, c.A, 8, 7, a.f103460r7, 4, c.B, 7, c.f161636n, c.f161643u, a.f103460r7, c.f161643u, 5, 13, 8, 6, c.A, a.f103460r7, c.A, 28, 19, 8, -35, a.f103460r7, 68, 93, 98, q.f83619w, 95, 95, 94, 97, 99, 84, 83, c.f161639q, 84, 95, 50, 94, 93, 85, 88, 86, 41, c.f161639q, -19, -16, -76, a.C7, -82, -76, -80, -82};
    }

    static {
        A05();
        A03 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A02 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C17064u c17064u) {
        int iA04 = c17064u.A04(5);
        if (iA04 == 31) {
            int audioObjectType = c17064u.A04(6);
            return audioObjectType + 32;
        }
        return iA04;
    }

    public static int A01(C17064u c17064u) throws C3K {
        int iA04 = c17064u.A04(4);
        if (iA04 == 15) {
            int iA01 = c17064u.A01();
            if (A01[0].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "q0W1UZuAU1h4xSNvnmv6o4fLVDdZ81si";
            strArr[4] = "TmcMI11py7mWue9QV51Oyh4sKPsH3Jhr";
            if (iA01 >= 24) {
                int frequencyIndex = c17064u.A04(24);
                return frequencyIndex;
            }
            throw C3K.A01(A04(0, 28, 60), null);
        }
        if (iA04 < 13) {
            int frequencyIndex2 = A03[iA04];
            return frequencyIndex2;
        }
        throw C3K.A01(A04(28, 41, 57), null);
    }

    public static C1990Gm A02(C17064u c17064u, boolean z10) throws C3K {
        int iA00 = A00(c17064u);
        int iA01 = A01(c17064u);
        int iA04 = c17064u.A04(4);
        String str = A04(159, 8, 7) + iA00;
        if (iA00 == 5 || iA00 == 29) {
            iA01 = A01(c17064u);
            iA00 = A00(c17064u);
            if (iA00 == 22) {
                iA04 = c17064u.A04(4);
            }
        }
        if (z10) {
            switch (iA00) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    A06(c17064u, iA00, iA04);
                    int sampleRateHz = A01[0].length();
                    if (sampleRateHz != 5) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[6] = "3cbQZ4WWsbXwvX2zvxOiUlmwqxsyxREi";
                    strArr[3] = "nPAxNfqqgI9TB5NmScWQIj27S1nluV3e";
                    switch (iA00) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int iA05 = c17064u.A04(2);
                            if (iA05 == 2 || iA05 == 3) {
                                throw C3K.A00(A04(137, 22, 118) + iA05);
                            }
                    }
                    break;
                case 5:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 18:
                default:
                    throw C3K.A00(A04(106, 31, 42) + iA00);
            }
        }
        int channelCount = A02[iA04];
        if (channelCount != -1) {
            return new C1990Gm(iA01, channelCount, str);
        }
        throw C3K.A01(null, null);
    }

    public static C1990Gm A03(byte[] bArr) throws C3K {
        return A02(new C17064u(bArr), false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:15:0x0050  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public static void A06(C17064u c17064u, int i10, int i11) {
        boolean zA0H;
        String[] strArr;
        boolean frameLengthFlag = c17064u.A0H();
        if (frameLengthFlag) {
            AbstractC16924g.A07(A04(69, 7, 75), A04(76, 30, 66));
        }
        boolean frameLengthFlag2 = c17064u.A0H();
        if (!frameLengthFlag2) {
            zA0H = c17064u.A0H();
            if (i11 != 0) {
                if (i10 != 6 || i10 == 20) {
                    c17064u.A09(3);
                }
                if (zA0H) {
                    if (i10 == 22) {
                        c17064u.A09(16);
                    }
                    if (i10 != 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        c17064u.A09(3);
                    }
                    strArr = A01;
                    if (strArr[1].charAt(21) != strArr[4].charAt(21)) {
                        String[] strArr2 = A01;
                        strArr2[6] = "QrL8Tr8yy4gY8AXmFxmkTTkkR7JmfqMW";
                        strArr2[3] = "IjkFi7C6bNI16jdHGSbHtjLd4dsdDQNH";
                        c17064u.A09(1);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        } else if (A01[5].charAt(15) != 's') {
            String[] strArr3 = A01;
            strArr3[7] = "v2arTuVBFpHRdd6zD5uQKVaL6J866891";
            strArr3[2] = "F7KamgaQFU4osqLd0R7CHRmLJ4QhMqsw";
            c17064u.A09(14);
            zA0H = c17064u.A0H();
            if (i11 != 0) {
                if (i10 != 6) {
                    c17064u.A09(3);
                } else {
                    c17064u.A09(3);
                }
                if (zA0H) {
                    if (i10 == 22) {
                        c17064u.A09(16);
                    }
                    if (i10 != 17) {
                        c17064u.A09(3);
                    } else {
                        c17064u.A09(3);
                    }
                    strArr = A01;
                    if (strArr[1].charAt(21) != strArr[4].charAt(21)) {
                        String[] strArr4 = A01;
                        strArr4[6] = "QrL8Tr8yy4gY8AXmFxmkTTkkR7JmfqMW";
                        strArr4[3] = "IjkFi7C6bNI16jdHGSbHtjLd4dsdDQNH";
                        c17064u.A09(1);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        throw new RuntimeException();
    }

    public static byte[] A07(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }
}
