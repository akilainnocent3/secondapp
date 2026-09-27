package com.facebook.ads.redexgen.core;

import f6.q;
import java.util.Arrays;
import org.json.JSONArray;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum XF {
    A07(0),
    A0G(1),
    A08(2),
    A0H(3),
    A09(4),
    A06(5),
    A0E(6),
    A0F(7),
    A0K(8),
    A0D(9),
    A0A(10),
    A0I(11),
    A0J(16),
    A0C(17),
    A0B(18);

    public static byte[] A01;
    public static String[] A02 = {"GbuBsSM1xhQoS8Y9reObCc9WG4REEdk3", "3inGwPOv", "kEgr1UstPMrvCW01nPyEnw", "sDtxFhHTxnkounG", "sPUJsFRJw3lzzMTWDdjyjiVEH8hW8JO7", "B8rHcVyybdzy0uHTSoedXLBdMJjc3Dyy", "NVuWY3VIAgTMV2CQJlZL2IdcLJ4", "cMObfoRVVv9ZpGW59yOoyGmNv0XOfBEh"};
    public static final XF[] A03;
    public static final String A04;
    public final int A00;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {88, 93, 70, 90, 81, 86, 80, 90, 92, 74, 122, 107, 107, q.f83619w, 122, 127, 43, 58, 58, 53, 43, 46, 53, 60, 88, 110, 127, 127, 112, 106, 97, 104, 110, 104, 106, 98, 106, 97, 123, 112, 110, 107, 71, 68, 75, 75, 64, 87, 90, 81, 74, 90, 76, 75, 81, 64, 87, 86, 81, 76, 81, 76, 68, 73, 52, 32, 55, 35, 39, 55, 60, 49, 43, 45, 49, 51, 34, 34, 59, 60, 53, 43, 55, 55, 51, 60, 47, 42, 45, 40, 48, 8, c.f161639q, 13, 8, c.f161639q, 4, c.H, c.A, 8, 5, 4, c.f161638p, c.H, 0, 5, 93, 68, 72, 67, 69, 94, 80, 80, 82, 69, c.f161647y, c.f161636n, 0, c.f161635m, 13, c.f161648z, c.B, c.B, c.D, 13, 0, 17, c.f161640r, 0, c.H, 10, c.f161635m, c.f161640r, 0, c.f161648z, c.f161643u, c.f161639q, 0, 19, c.f161640r, c.B, c.B, c.f161648z, 17, c.B, 103, 98, 101, 96, 116, 106, 111, 77, 72, 79, 74, 94, 64, 69, 94, 87, 51, 3, c.f161636n, c.C, 4, c.E, 8, c.f161643u, c.f161638p, 1, 2, c.H, 8, c.f161643u, c.f161639q, c.B, c.C, c.C, 2, 3, 47, 52, 51, 60, 51, 63, 62, 37, 54, 53, a.f159811k, a.f159811k, 51, 52, a.f159811k, 57, 38, 43, 42, 32, 48, 46, 43};
        if (A02[5].charAt(26) != 'j') {
            throw new RuntimeException();
        }
        A02[5] = "gBI5PCJLXGTma8ivl9EUy8DAEVjXdNbR";
        A01 = bArr;
    }

    static {
        A03();
        A03 = new XF[]{A0H, A09, A06, A0F, A0I, A0J, A0C, A0B};
        JSONArray jSONArray = new JSONArray();
        for (XF supportedCapability : A03) {
            jSONArray.put(supportedCapability.A00());
        }
        A04 = jSONArray.toString();
    }

    XF(int i10) {
        this.A00 = i10;
    }

    private final int A00() {
        return this.A00;
    }

    public static String A01() {
        return A04;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.A00);
    }
}
