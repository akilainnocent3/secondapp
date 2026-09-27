package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Js, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2073Js {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, 13, 1, 32, c.f161647y, c.B, -41, -17, -19, -12, -12, -19, q.f83622z, -21, -92, -10, -23, -15, -27, -19, q.f83622z, q.B, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, q.B, -92, -41, a.f103493v7, a.f103520y7, -92, -46, a.f103468s7, -48, -92, -7, q.f83622z, -19, -8, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static void A04(long j10, C17074v c17074v, InterfaceC2007Hd[] interfaceC2007HdArr) {
        int iA0I = c17074v.A0I();
        if ((iA0I & 64) != 0) {
            c17074v.A0g(1);
            int i10 = (iA0I & 31) * 3;
            int iA09 = c17074v.A09();
            for (InterfaceC2007Hd interfaceC2007Hd : interfaceC2007HdArr) {
                c17074v.A0f(iA09);
                interfaceC2007Hd.AIr(c17074v, i10);
                interfaceC2007Hd.AIu(j10, 1, i10, 0, null);
            }
        }
    }

    static {
        A02();
    }

    public static int A00(C17074v c17074v) {
        int i10 = 0;
        while (value != 0) {
            int iA0I = c17074v.A0I();
            i10 += iA0I;
            int b10 = A01[3].length();
            if (b10 == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (iA0I != 255) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    public static void A03(long j10, C17074v c17074v, InterfaceC2007Hd[] interfaceC2007HdArr) {
        while (true) {
            if (c17074v.A07() > 1) {
                int iA00 = A00(c17074v);
                int iA01 = A00(c17074v);
                int iA09 = c17074v.A09() + iA01;
                if (iA01 != -1) {
                    int payloadType = c17074v.A07();
                    if (iA01 > payloadType) {
                        AbstractC16924g.A07(A01(0, 7, 109), A01(7, 45, 69));
                        iA09 = c17074v.A0A();
                    } else if (iA00 == 4 && iA01 >= 8) {
                        int userIdentifier = c17074v.A0I();
                        int providerCode = c17074v.A0M();
                        int countryCode = 0;
                        if (providerCode == 49) {
                            countryCode = c17074v.A0C();
                        }
                        int iA0I = c17074v.A0I();
                        if (providerCode == 47) {
                            c17074v.A0g(1);
                        }
                        int i10 = (userIdentifier == 181 && (providerCode == 49 || providerCode == 47) && iA0I == 3) ? 1 : 0;
                        if (providerCode == 49) {
                            int userDataTypeCode = countryCode != 1195456820 ? 0 : 1;
                            i10 &= userDataTypeCode;
                        }
                        if (i10 != 0) {
                            A04(j10, c17074v, interfaceC2007HdArr);
                        }
                    }
                } else {
                    AbstractC16924g.A07(A01(0, 7, 109), A01(7, 45, 69));
                    iA09 = c17074v.A0A();
                }
                c17074v.A0f(iA09);
            } else {
                return;
            }
        }
    }
}
