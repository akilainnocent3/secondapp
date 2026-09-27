package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Messenger;
import java.util.Arrays;
import javax.annotation.Nullable;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2348Un {
    public static byte[] A06;
    public static String[] A07 = {"6qWdP8UnAqk2", "MP5OshbzeeKQXWypFydZHFaUVi2SMaBY", "YZOrpgpjnThYhZrbQ", "9FBJpZQghCKG6mC2kMssKZrg31bKkWn0", "1igNFrY6lER43", "wq7phLHZ3BH2hfkM7", "H4ZPtJlAPqOhXadVzSXMAib", "ZeuNk8rzE4mqHJK5cCc2mdI2UMeFjq1Z"};

    @Nullable
    public Messenger A00;
    public boolean A01 = false;
    public final ServiceConnection A02 = new ServiceConnectionC2347Um(this);
    public final C2900gi A03;
    public final String A04;
    public final String A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        byte[] bArr = {-32, -47, -30, -47, -35, -17, -47, -34, -17, -27, -27, a.E7, -44, -4, -19, -2, -19, -7, c.f161635m, -4, -2, -5, 0, -5, -17, -5, -8, c.f161635m, 2, -15, -2, -1, -11, -5, -6, a.f103444p7, -78, a.f103460r7, -78, -66, -48, a.f103460r7, -74, a.f103452q7, a.f103476t7, -74, -60, a.f103468s7, -48, -70, -75, c.f161638p, 31, 33, 41, 31, 37, 35, -19, 33, 45, 43, 46, 45, 44, 35, 44, 50, -34, 44, 45, 50, -34, 36, 45, 51, 44, 34, -34, 45, 48, -34, 43, 39, 49, 49, 39, 44, 37, -34, 46, 35, 48, 43, 39, 49, 49, 39, 45, 44, 49, -69, -35, a.B7, a.f103529z7, -48, -34, -34, -44, a.E7, -46, -117, -35, -48, -36, -32, -48, -34, -33, 1, 13, c.f161635m, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 19, 2, 7, 3, c.f161636n, 1, 3, c.f161636n, 3, c.f161643u, c.f161647y, 13, c.f161640r, 9, -52, -33, 19, 2, 7, 3, c.f161636n, 1, 3, -20, 3, c.f161643u, c.f161647y, 13, c.f161640r, 9, -15, 3, c.f161640r, c.f161646x, 7, 1, 3, 2, c.f161638p, c.f161636n, a.f103520y7, 5, 0, 2, 4, 1, c.f161638p, c.f161638p, 10, a.f103520y7, 10, 0, 19, 0, 13, 0, 43, 50, 37, 33, 56, 35, 46, 43, 38, 35, 54, 43, 49, 48};
        String[] strArr = A07;
        if (strArr[0].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[0] = "tkHV67jO43cW";
        strArr2[4] = "7eV9Uq8jXNAYU";
        A06 = bArr;
    }

    static {
        A06();
    }

    public C2348Un(C2900gi c2900gi, String str, String str2) {
        this.A03 = c2900gi;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putInt(A05(13, 22, 88), 1);
        bundle.putString(A05(0, 13, 60), this.A04);
        bundle.putString(A05(35, 16, 29), this.A05);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i10, C2313Te c2313Te) {
        this.A03.A08().ABC(A05(189, 14, 110), i10, c2313Te);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(int i10, C2313Te c2313Te) {
        c2313Te.A05(1);
        this.A03.A08().ABD(A05(189, 14, 110), i10, c2313Te);
    }

    public final void A0C() {
        A08(AbstractC2312Td.A1t, new C2313Te(A05(101, 18, 23), this.A05));
        Intent intent = new Intent();
        intent.setClassName(A05(jj.c.f100514f, 19, 75), A05(119, 51, 74));
        try {
            if (!this.A03.bindService(intent, this.A02, 1)) {
                A08(AbstractC2312Td.A1p, new C2313Te(A05(51, 50, 106)));
                this.A03.unbindService(this.A02);
            }
        } catch (Exception e10) {
            A07(AbstractC2312Td.A1o, new C2313Te(e10));
        }
    }
}
