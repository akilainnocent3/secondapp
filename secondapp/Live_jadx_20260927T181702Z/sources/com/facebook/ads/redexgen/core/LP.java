package com.facebook.ads.redexgen.core;

import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class LP {
    public static byte[] A00;
    public static String[] A01 = {"sX38XYxjSWs23SpIJtTv7zqsiULa6NDN", "GVdzvLjErUQlCiFlI6sj0UXKxa4oVMD1", "mIptDDVqgJzdzMBxnTdyNQyM9U5NEVN", "EbHk890dVqPqb4rol71PU8NjsI2mWG9N", "NaaYWHcYaAW6JEQtPhbZM5A", "ny7KRitGLB3lrMhzsw8kbWX2NySq0vmW", "JAavj5eiIDuEB7ikgcXMWWkFbaDdUxIE", "svQ0hoJoeE45w1Y6xC2"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static LN A02(InterfaceC3251ms interfaceC3251ms) throws IOException {
        byte[] bArr;
        C17074v c17074v = new C17074v(16);
        LO loA03 = A03(1718449184, interfaceC3251ms, c17074v);
        AbstractC16843y.A08(loA03.A01 >= 16);
        interfaceC3251ms.AGt(c17074v.A0l(), 0, 16);
        c17074v.A0f(0);
        int iA0G = c17074v.A0G();
        int iA0G2 = c17074v.A0G();
        int iA0F = c17074v.A0F();
        int iA0F2 = c17074v.A0F();
        int iA0G3 = c17074v.A0G();
        int iA0G4 = c17074v.A0G();
        int i10 = ((int) loA03.A01) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC3251ms.AGt(bArr, 0, i10);
        } else {
            bArr = C5C.A07;
        }
        interfaceC3251ms.AK3((int) (interfaceC3251ms.A8i() - interfaceC3251ms.A8n()));
        return new LN(iA0G, iA0G2, iA0F, iA0F2, iA0G3, iA0G4, bArr);
    }

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{59, c.f161640r, 13, c.f161648z, 19, 88, 17, c.f161635m, 88, c.f161636n, c.A, c.A, 88, c.f161646x, c.C, 10, 31, c.G, 88, 80, 6, 74, 63, 58, 83, 81, 88, c.f161636n, c.A, 88, c.f161635m, 19, 17, 8, 67, 88, 17, 28, 66, 88, 45, 3, 10, c.f161635m, c.f161648z, 13, 10, 3, 68, 17, 10, c.f161639q, 10, c.f161635m, 19, 10, 68, 51, 37, 50, 68, 7, c.f161636n, 17, 10, c.f161639q, 94, 68, 105, 82, 79, 73, 76, 76, 83, 78, 72, 89, 88, 28, 90, 83, 78, 81, 28, 72, 69, 76, 89, 6, 28, 105, 95, 72, 118, 91, 95, 90, 91, 76, 108, 91, 95, 90, 91, 76};
    }

    static {
        A05();
    }

    public static long A00(InterfaceC3251ms interfaceC3251ms) throws IOException {
        C17074v c17074v = new C17074v(8);
        LO chunkHeader = LO.A00(interfaceC3251ms, c17074v);
        if (chunkHeader.A00 != 1685272116) {
            interfaceC3251ms.AIl();
            return -1L;
        }
        interfaceC3251ms.A47(8);
        c17074v.A0f(0);
        interfaceC3251ms.AGt(c17074v.A0l(), 0, 8);
        long sampleDataSize = c17074v.A0N();
        interfaceC3251ms.AK3(((int) chunkHeader.A01) + 8);
        return sampleDataSize;
    }

    public static Pair<Long, Long> A01(InterfaceC3251ms interfaceC3251ms) throws IOException {
        interfaceC3251ms.AIl();
        LO loA03 = A03(1684108385, interfaceC3251ms, new C17074v(8));
        interfaceC3251ms.AK3(8);
        return Pair.create(Long.valueOf(interfaceC3251ms.A8n()), Long.valueOf(loA03.A01));
    }

    public static LO A03(int i10, InterfaceC3251ms interfaceC3251ms, C17074v c17074v) throws IOException {
        LO loA00 = LO.A00(interfaceC3251ms, c17074v);
        while (loA00.A00 != i10) {
            AbstractC16924g.A07(A04(91, 15, 125), A04(40, 28, 39) + loA00.A00);
            long j10 = loA00.A01 + 8;
            if (j10 <= 2147483647L) {
                interfaceC3251ms.AK3((int) j10);
                loA00 = LO.A00(interfaceC3251ms, c17074v);
            } else {
                throw C3K.A00(A04(0, 40, 59) + loA00.A00);
            }
        }
        return loA00;
    }

    public static boolean A06(InterfaceC3251ms interfaceC3251ms) throws IOException {
        C17074v c17074v = new C17074v(8);
        LO loA00 = LO.A00(interfaceC3251ms, c17074v);
        if (loA00.A00 != 1380533830) {
            int i10 = loA00.A00;
            if (A01[1].charAt(26) == 'h') {
                throw new RuntimeException();
            }
            A01[4] = "7d3HBnqB6pKujyEoyh9Hov6";
            if (i10 != 1380333108) {
                return false;
            }
        }
        interfaceC3251ms.AGt(c17074v.A0l(), 0, 4);
        c17074v.A0f(0);
        int iA0C = c17074v.A0C();
        if (iA0C != 1463899717) {
            AbstractC16924g.A05(A04(91, 15, 125), A04(68, 23, 127) + iA0C);
            return false;
        }
        return true;
    }
}
