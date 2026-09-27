package com.facebook.ads.redexgen.core;

import android.os.SystemClock;
import f6.q;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3344oP implements AnonymousClass93 {
    public static byte[] A01;
    public static String[] A02 = {"JE7C4PJjP7BCbZqkJpMMyURXZ5h", "iMYF6XNZz1LBnq9Lsd18aPb3vu2", "XxqNLC6c7RSVqgSJXO5oI", "nEpRStmmyFjBR5hyZRShRQxXaXf0Mj7x", "WMevU6o4a2paeBy7iKLxLT9X", "1yBfwy19", "IbfL1f4elDnhfhlOaFmHA7", "3K7V2NpliX3hv5M7KS"};
    public final /* synthetic */ C3341oM A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {64, 76, 70, 103, q.f83619w, 99, 119, 110, 118, 67, 119, 102, 107, 109, 81, 107, 108, 105, c.B, 54, 63, 62, 35, 56, 63, 54, q.A, 56, 60, 33, 62, 34, 34, 56, 51, a.f159811k, 40, q.A, a.f159811k, 48, 35, 54, 52, q.A, 48, 36, 53, 56, 62, q.A, a.f159811k, 48, 37, 52, 63, 50, 40, 107, q.A, 98, 65, 68, 67, 88, 94, 68, 66, 17, 80, 68, 85, 88, 94, 17, 69, 88, 92, 84, 66, 69, 80, 92, 65, 17, c.C, 87, 67, 80, 92, 84, 17, 65, 94, 66, 88, 69, 88, 94, 95, 17, 92, 88, 66, 92, 80, 69, 82, 89, c.B, c.f161635m, 17, 102, 69, 64, 71, 92, 90, 64, 70, c.f161647y, 84, 64, 81, 92, 90, c.f161647y, 65, 92, 88, 80, 70, 65, 84, 88, 69, c.f161647y, c.G, 70, 76, 70, 65, 80, 88, c.f161647y, 86, 89, 90, 86, 94, c.f161647y, 88, 92, 70, 88, 84, 65, 86, 93, 28, c.f161639q, c.f161647y};
        if (A02[4].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "crOuuTwIIsvqp0CyO4zKH";
        strArr[6] = "QvBSziwTMADuiMqU3qgYIx";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C3344oP(C3341oM c3341oM) {
        this.A00 = c3341oM;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass93
    public final void AEM(long j10) {
        AbstractC16924g.A07(A00(2, 16, 116), A00(18, 41, 39) + j10);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass93
    public final void AFN(long j10) {
        if (this.A00.A0I != null) {
            C3341oM c3341oM = this.A00;
            String[] strArr = A02;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "XUD65QsQyQCwJDnhFrO8y";
            strArr2[6] = "L1DcP3KlVDNfGhVI0cZDzs";
            c3341oM.A0I.AFN(j10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass93
    public final void AFP(long j10, long j11, long j12, long j13) {
        StringBuilder sbAppend = new StringBuilder().append(A00(59, 52, 71)).append(j10);
        String strA00 = A00(0, 2, 26);
        String string = sbAppend.append(strA00).append(j11).append(strA00).append(j12).append(strA00).append(j13).append(strA00).append(this.A00.A06()).append(strA00).append(this.A00.A07()).toString();
        if (!C3341oM.A0v) {
            String message = A00(2, 16, 116);
            AbstractC16924g.A07(message, string);
            return;
        }
        throw new C9I(string);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass93
    public final void AG9(long j10, long j11, long j12, long j13) {
        StringBuilder sbAppend = new StringBuilder().append(A00(111, 50, 67)).append(j10);
        String strA00 = A00(0, 2, 26);
        String string = sbAppend.append(strA00).append(j11).append(strA00).append(j12).append(strA00).append(j13).append(strA00).append(this.A00.A06()).append(strA00).append(this.A00.A07()).toString();
        if (!C3341oM.A0v) {
            String message = A00(2, 16, 116);
            AbstractC16924g.A07(message, string);
            return;
        }
        throw new C9I(string);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass93
    public final void AGI(int i10, long j10) {
        if (this.A00.A0I != null) {
            this.A00.A0I.AGJ(i10, j10, SystemClock.elapsedRealtime() - this.A00.A07);
        }
    }
}
