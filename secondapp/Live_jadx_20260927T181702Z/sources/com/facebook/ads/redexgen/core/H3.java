package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class H3 {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, a.C7, -35, -47, -16, -27, q.B, -36, -12, q.f83622z, -7, -7, q.f83622z, -9, -16, -87, -5, -18, -10, -22, q.f83622z, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, a.f103529z7, -46, -87, -41, a.f103502w7, -43, -87, -2, -9, q.f83622z, -3, -73};
    }

    public static int A00(C17074v c17074v) {
        int i10 = 0;
        while (value != 0) {
            int b10 = c17074v.A0I();
            i10 += b10;
            if (b10 != 255) {
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
                        AbstractC16924g.A07(A01(0, 7, 3), A01(7, 45, 16));
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
                    AbstractC16924g.A07(A01(0, 7, 3), A01(7, 45, 16));
                    iA09 = c17074v.A0A();
                }
                c17074v.A0f(iA09);
            } else {
                return;
            }
        }
    }

    public static void A04(long j10, C17074v c17074v, InterfaceC2007Hd[] interfaceC2007HdArr) {
        int firstByte = c17074v.A0I();
        if (!((firstByte & 64) != 0)) {
            return;
        }
        c17074v.A0g(1);
        int i10 = (firstByte & 31) * 3;
        int iA09 = c17074v.A09();
        for (InterfaceC2007Hd interfaceC2007Hd : interfaceC2007HdArr) {
            c17074v.A0f(iA09);
            interfaceC2007Hd.AIr(c17074v, i10);
            if (j10 != -9223372036854775807L) {
                interfaceC2007Hd.AIu(j10, 1, i10, 0, null);
            }
        }
    }
}
