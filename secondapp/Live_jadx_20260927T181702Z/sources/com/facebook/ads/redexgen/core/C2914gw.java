package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.api.BuildConfigApi;
import f6.q;
import java.util.Arrays;
import java.util.Locale;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2914gw {
    public static byte[] A02;
    public static String[] A03 = {"lJVeP2IR7ua2", "jEDUnDrnc1QBGJRRXgI1zLNGeQAVlRB5", "4J1evWwVBwsv6j2jE3cxdE8l4EvJqUWx", "hbOpPbm2Lvz8WBi4M4lcAmyYP20RrxkZ", "42MJRsHMkke9vUn", "N1ePHibZvm11p1YoQp9n3cvTSohhnC86", "pzMHmXStxFGPpObuVYX1kVlrzXN", "JuJmyZjKd3poC4Sz8wRazc2gW2"};
    public static final String A04;
    public final SR A00;
    public final C2306Sx A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{81, 115, q.f83619w, 109, 110, 96, 101, 104, 111, 102, 33, 36, 101, 33, 96, 114, 114, q.f83619w, 117, 114, 60, c.H, 9, 0, 3, 13, 8, 5, 2, c.f161635m, 76, 5, 1, 13, c.f161635m, 9, 86, 76, 73, 31, 118, 84, 67, 74, 73, 71, 66, 79, 72, 65, 6, 75, 71, 84, 77, 83, 86, 28, 6, 3, 85, 86, 116, 99, 106, 105, 103, 98, 111, 104, 97, 38, 112, 111, 98, 99, 105, 60, 38, 35, 117, 50, 101, 48, 48, 96, 97, 98, 98, 123, 52, 110, 101, q.f83619w, 123, 103, 103, 51, 111, 123, 55, q.f83619w, 55, 101, 123, q.f83619w, 55, q.f83619w, 55, 51, q.f83619w, 50, 52, 53, 53, 51, 98, 55, 53, 34, 33, 34, 51, 36, 47, 106, q.A, 116, q.A, 112, 104, q.A};
    }

    static {
        A02();
        A04 = C2914gw.class.getSimpleName();
    }

    public C2914gw(SR sr2, C2896ge c2896ge) {
        this.A00 = sr2;
        this.A00.A40(new C2916gy(this));
        this.A01 = new C2306Sx(c2896ge);
        A01();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (BuildConfigApi.isDebug()) {
            Locale locale = Locale.US;
            SR sr2 = this.A00;
            if (A03[2].charAt(7) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "B9WAOcp3zNbG4sQr12bKZPkRro";
            strArr[6] = "6ENVq9NVFWRAnG6rhAVuoXedHs5";
            String.format(locale, A00(0, 20, 44), Integer.valueOf(sr2.A6x().size()));
        }
        for (SU su2 : this.A00.A6x()) {
            switch (SQ.A00[su2.A9O().ordinal()]) {
                case 1:
                    A04(su2.getUrl());
                    break;
                case 2:
                    A06(su2.getUrl());
                    break;
                case 3:
                    A05(su2.getUrl());
                    break;
            }
        }
        this.A01.A0X(new C2915gx(this), new C2299Sq(A00(81, 36, 123), A00(125, 7, 50)));
    }

    private void A04(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(20, 20, 65), str);
        }
        C2304Sv c2304Sv = new C2304Sv(str, -1, -1, A00(81, 36, 123), A00(125, 7, 50));
        c2304Sv.A02 = A00(117, 8, 106);
        this.A01.A0c(c2304Sv);
    }

    private void A05(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(40, 21, 11), str);
        }
        C2302St c2302St = new C2302St(str, A00(81, 36, 123), A00(125, 7, 50));
        c2302St.A04 = true;
        c2302St.A02 = A00(117, 8, 106);
        this.A01.A0Y(c2302St);
    }

    private void A06(String str) {
        if (BuildConfigApi.isDebug()) {
            String.format(Locale.US, A00(61, 20, 43), str);
        }
        C2302St c2302St = new C2302St(str, A00(81, 36, 123), A00(125, 7, 50));
        c2302St.A04 = false;
        c2302St.A02 = A00(117, 8, 106);
        this.A01.A0b(c2302St);
    }
}
