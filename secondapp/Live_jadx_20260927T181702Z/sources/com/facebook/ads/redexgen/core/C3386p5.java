package com.facebook.ads.redexgen.core;

import f6.q;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3386p5 extends C17135b {
    public static byte[] A02;
    public final int A00;
    public final C17205i A01;

    static {
        A06();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A02 = new byte[]{a.E7, -30, -37, -41, q.B, -22, -37, -18, -22, -92, -96, -28, -27, -22, -106, -26, -37, q.B, -29, -33, -22, -22, -37, a.B7, -92, -96};
    }

    public C3386p5(C17205i c17205i, int i10, int i11) {
        super(A03(i10, i11));
        this.A01 = c17205i;
        this.A00 = i11;
    }

    public C3386p5(IOException iOException, C17205i c17205i, int i10, int i11) {
        super(iOException, A03(i10, i11));
        this.A01 = c17205i;
        this.A00 = i11;
    }

    public C3386p5(String str, C17205i c17205i, int i10, int i11) {
        super(str, A03(i10, i11));
        this.A01 = c17205i;
        this.A00 = i11;
    }

    public C3386p5(String str, IOException iOException, C17205i c17205i, int i10, int i11) {
        super(str, iOException, A03(i10, i11));
        this.A01 = c17205i;
        this.A00 = i11;
    }

    public static int A03(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    public static C3386p5 A04(IOException iOException, C17205i c17205i, int i10) {
        int errorCode;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            errorCode = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            errorCode = 1004;
        } else if (message != null) {
            String strA01 = AbstractC3095k7.A01(message);
            String message2 = A05(0, 26, 62);
            if (strA01.matches(message2)) {
                errorCode = 2007;
            } else {
                errorCode = 2001;
            }
        } else {
            errorCode = 2001;
        }
        if (errorCode == 2007) {
            return new AM(iOException, c17205i);
        }
        return new C3386p5(iOException, c17205i, errorCode, i10);
    }
}
