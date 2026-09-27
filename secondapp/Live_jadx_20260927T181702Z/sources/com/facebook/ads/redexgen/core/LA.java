package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;
import l3.a;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LA {
    public static byte[] A09;
    public static String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass53 A08 = new AnonymousClass53(0);
    public long A01 = -9223372036854775807L;
    public long A02 = -9223372036854775807L;
    public long A00 = -9223372036854775807L;
    public final C17074v A07 = new C17074v();

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, a.f103529z7, -20, -30, -25, -32, -103, a.f103520y7, a.f103452q7, a.f103476t7, -66, a.f103428n7, a.f103529z7, a.f103484u7, -52, -66, a.f103520y7, -103, -30, -25, -20, -19, -34, a.B7, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, a.f103436o7, -111, a.f103452q7, -65, -82, a.f103444p7, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public LA(int i10) {
        this.A06 = i10;
    }

    private int A00(InterfaceC3251ms interfaceC3251ms) {
        this.A07.A0i(C5C.A07);
        this.A03 = true;
        interfaceC3251ms.AIl();
        return 0;
    }

    private int A01(InterfaceC3251ms interfaceC3251ms, HV hv2, int i10) throws IOException {
        int iMin = (int) Math.min(this.A06, interfaceC3251ms.A8O());
        if (interfaceC3251ms.A8n() != 0) {
            hv2.A00 = 0;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC3251ms.AIl();
        interfaceC3251ms.AGt(this.A07.A0l(), 0, iMin);
        this.A01 = A03(this.A07, i10);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC3251ms interfaceC3251ms, HV hv2, int i10) throws IOException {
        long inputLength = interfaceC3251ms.A8O();
        int iMin = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - ((long) iMin);
        if (interfaceC3251ms.A8n() != inputLength2) {
            hv2.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(iMin);
        interfaceC3251ms.AIl();
        interfaceC3251ms.AGt(this.A07.A0l(), 0, iMin);
        this.A02 = A04(this.A07, i10);
        this.A05 = true;
        return 0;
    }

    private long A03(C17074v c17074v, int i10) {
        int iA0A = c17074v.A0A();
        for (int iA09 = c17074v.A09(); iA09 < iA0A; iA09++) {
            int searchEndPosition = c17074v.A0l()[iA09];
            if (searchEndPosition == 71) {
                long jA01 = LI.A01(c17074v, iA09, i10);
                if (jA01 != -9223372036854775807L) {
                    return jA01;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long A04(C17074v c17074v, int i10) {
        int iA09 = c17074v.A09();
        int iA0A = c17074v.A0A();
        for (int i11 = iA0A - 188; i11 >= iA09; i11--) {
            if (LI.A03(c17074v.A0l(), iA09, iA0A, i11)) {
                long jA01 = LI.A01(c17074v, i11, i10);
                if (jA01 != -9223372036854775807L) {
                    return jA01;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int A07(InterfaceC3251ms interfaceC3251ms, HV hv2, int i10) throws IOException {
        if (i10 <= 0) {
            return A00(interfaceC3251ms);
        }
        if (!this.A05) {
            return A02(interfaceC3251ms, hv2, i10);
        }
        if (this.A02 == -9223372036854775807L) {
            return A00(interfaceC3251ms);
        }
        if (!this.A04) {
            int iA01 = A01(interfaceC3251ms, hv2, i10);
            if (A0A[0].charAt(2) == 'O') {
                throw new RuntimeException();
            }
            A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
            return iA01;
        }
        if (this.A01 == -9223372036854775807L) {
            return A00(interfaceC3251ms);
        }
        this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC16924g.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
            this.A00 = -9223372036854775807L;
        }
        return A00(interfaceC3251ms);
    }

    public final long A08() {
        return this.A00;
    }

    public final AnonymousClass53 A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
