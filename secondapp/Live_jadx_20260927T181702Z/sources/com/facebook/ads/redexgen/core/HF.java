package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class HF {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C17074v c17074v, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c17074v.A0I() + 1;
            case 7:
                int iA0M = c17074v.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return iA0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC3251ms interfaceC3251ms, HJ hj2) throws IOException {
        interfaceC3251ms.AIl();
        boolean z10 = true;
        interfaceC3251ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC3251ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        interfaceC3251ms.A47(2);
        int i10 = z10 ? 7 : 6;
        C17074v c17074v = new C17074v(i10);
        c17074v.A0e(HB.A00(interfaceC3251ms, c17074v.A0l(), 0, i10));
        interfaceC3251ms.AIl();
        HE he2 = new HE();
        boolean isBlockSizeVariable = A08(c17074v, hj2, z10, he2);
        if (isBlockSizeVariable) {
            return he2.A00;
        }
        throw C3K.A01(null, null);
    }

    public static boolean A02(int i10, HJ hj2) {
        if (i10 == 0) {
            return true;
        }
        int i11 = hj2.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i10 == i11;
    }

    public static boolean A03(int i10, HJ hj2) {
        if (i10 <= 7) {
            return i10 == hj2.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i10 <= 10 && hj2.A02 == 2;
    }

    public static boolean A04(C17074v c17074v, int i10) {
        int iA0I = c17074v.A0I();
        int crc = c17074v.A09();
        return iA0I == C5C.A0J(c17074v.A0l(), i10, crc + (-1), 0);
    }

    public static boolean A05(C17074v c17074v, HJ hj2, int i10) {
        int iA00 = A00(c17074v, i10);
        if (iA00 != -1) {
            int blockSizeSamples = hj2.A03;
            if (iA00 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C17074v c17074v, HJ hj2, int i10) {
        int sampleRate = hj2.A07;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == hj2.A08;
        }
        if (i10 == 12) {
            return c17074v.A0I() * 1000 == sampleRate;
        }
        if (i10 > 14) {
            return false;
        }
        int expectedSampleRate = c17074v.A0M();
        if (i10 == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(C17074v c17074v, HJ hj2, int i10, HE he2) {
        int iA09 = c17074v.A09();
        long jA0Q = c17074v.A0Q();
        long frameHeaderBytes = jA0Q >>> 16;
        if (frameHeaderBytes != i10) {
            return false;
        }
        int blockSizeKey = (int) ((jA0Q >> 8) & 15);
        long frameHeaderBytes2 = jA0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((jA0Q >> 4) & 15), hj2) && A02(frameStartPosition, hj2) && !(((jA0Q & 1) > 1L ? 1 : ((jA0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c17074v, hj2, (((jA0Q >>> 16) & 1) > 1L ? 1 : (((jA0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, he2) && A05(c17074v, hj2, (int) ((jA0Q >> 12) & 15)) && A06(c17074v, hj2, blockSizeKey) && A04(c17074v, iA09);
    }

    public static boolean A08(C17074v c17074v, HJ hj2, boolean z10, HE he2) {
        long utf8Value;
        try {
            long jA0S = c17074v.A0S();
            if (z10) {
                utf8Value = jA0S;
            } else {
                long utf8Value2 = hj2.A03;
                utf8Value = utf8Value2 * jA0S;
            }
            he2.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC3251ms interfaceC3251ms, HJ hj2, int i10, HE he2) throws IOException {
        long jA8i = interfaceC3251ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC3251ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC3251ms.AIl();
            interfaceC3251ms.A47((int) (jA8i - interfaceC3251ms.A8n()));
            return false;
        }
        C17074v c17074v = new C17074v(16);
        System.arraycopy(bArr, 0, c17074v.A0l(), 0, 2);
        byte[] frameStartBytes = c17074v.A0l();
        c17074v.A0e(HB.A00(interfaceC3251ms, frameStartBytes, 2, 14));
        interfaceC3251ms.AIl();
        interfaceC3251ms.A47((int) (jA8i - interfaceC3251ms.A8n()));
        return A07(c17074v, hj2, i10, he2);
    }
}
