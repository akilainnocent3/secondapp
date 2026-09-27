package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class HL {
    public static byte[] A09;
    public static String[] A0A = {"EsB1Svc2O0r", "neXgiGAVZF2hPSW", "e5UrGC6TzR", "xWVfqfZ1XD25z1nFBwMIBfHnywy3RQhb", "m9mgew9TdIxun9z0pjAF4NJPGlbJBstI", "nE", "RVA0jPrNpk", "4CgUEtTVWe3Kq65nNHH5xBV3YKPxdnIZ"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static HL A00(C17074v c17074v) throws C3K {
        try {
            c17074v.A0g(21);
            int iA0I = c17074v.A0I() & 3;
            int iA0I2 = c17074v.A0I();
            int i10 = 0;
            int iA09 = c17074v.A09();
            for (int i11 = 0; i11 < iA0I2; i11++) {
                c17074v.A0g(1);
                int iA0M = c17074v.A0M();
                for (int i12 = 0; i12 < iA0M; i12++) {
                    int iA0M2 = c17074v.A0M();
                    i10 += iA0M2 + 4;
                    c17074v.A0g(iA0M2);
                }
            }
            c17074v.A0f(iA09);
            byte[] bArr = new byte[i10];
            int i13 = 0;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            float f10 = 1.0f;
            String strA03 = null;
            for (int i19 = 0; i19 < iA0I2; i19++) {
                int iA0I3 = c17074v.A0I() & 63;
                int iA0M3 = c17074v.A0M();
                for (int i20 = 0; i20 < iA0M3; i20++) {
                    int iA0M4 = c17074v.A0M();
                    System.arraycopy(HS.A03, 0, bArr, i13, HS.A03.length);
                    int length = i13 + HS.A03.length;
                    System.arraycopy(c17074v.A0l(), c17074v.A09(), bArr, length, iA0M4);
                    if (iA0I3 == 33 && i20 == 0) {
                        HP hpA05 = HS.A05(bArr, length, length + iA0M4);
                        i14 = hpA05.A0A;
                        i15 = hpA05.A08;
                        i16 = hpA05.A02;
                        i17 = hpA05.A01;
                        i18 = hpA05.A03;
                        f10 = hpA05.A00;
                        strA03 = AnonymousClass46.A03(hpA05.A07, hpA05.A0B, hpA05.A06, hpA05.A05, hpA05.A0C, hpA05.A04);
                    }
                    i13 = length + iA0M4;
                    c17074v.A0g(iA0M4);
                }
            }
            return new HL(i10 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iA0I + 1, i14, i15, f10, strA03, i16, i17, i18);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C3K.A01(A01(0, 25, 126), e10);
        }
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0A[5].length() == 29) {
                throw new RuntimeException();
            }
            A0A[5] = "YyBlh7kREcvGfk8zeLahZrRMr2fR36";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 68);
            i13++;
        }
    }

    public static void A02() {
        A09 = new byte[]{127, 72, 72, 85, 72, c.D, 74, 91, 72, 73, 83, 84, 93, c.D, 114, 127, 108, 121, c.D, 89, 85, 84, 92, 83, 93};
    }

    static {
        A02();
    }

    public HL(List<byte[]> initializationData, int i10, int i11, int i12, float f10, String str, int i13, int i14, int i15) {
        this.A08 = initializationData;
        this.A05 = i10;
        this.A06 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A07 = str;
        this.A02 = i13;
        this.A01 = i14;
        this.A03 = i15;
    }
}
