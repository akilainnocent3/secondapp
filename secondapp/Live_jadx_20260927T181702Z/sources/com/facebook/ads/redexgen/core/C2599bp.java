package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import l3.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2599bp implements TO {
    public static byte[] A00;
    public static String[] A01 = {"N9cBQFuEXnMHuOhuUHmrN1NbOn9dUH6l", "t4327HI34dmOHxHgJ5Xqb1TMdgfhViRu", "W9WF83HwW2JJuxhyMa", "tDcIRbsxuTPzi4rfI85ylCxCUvgLsm3F", "qO4Uq7mg6XVWSCx2fb2lLTULAXcH9HmN", "DdhWBjv", "pI4BrYZb6jEfbOR6K30piOXwM4lgsdMH", "sO2hGyIlN5zgciGhFXZ1rYz4NH0oO9ru"};

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-70, -73, a.f103502w7, -73, -43, a.f103476t7, -56, a.f103468s7, -71, -69, a.f103493v7, a.f103493v7, -65, -60, -67, -43, a.f103468s7, a.f103476t7, a.f103502w7, -65, a.f103468s7, -60, a.f103493v7, -43, -71, a.f103468s7, a.f103511x7, -60, a.f103502w7, -56, a.A7, -43, a.f103444p7, -69, a.A7, 48, 45, 64, 45, 75, 60, 62, 59, 47, 49, 63, 63, 53, 58, 51, 75, 59, 60, 64, 53, 59, 58, 63, 75, 55, 49, 69, 5, 2, c.f161647y, 2, 32, 17, 19, c.f161640r, 4, 6, c.f161646x, c.f161646x, 10, c.f161639q, 8, 32, c.f161640r, 17, c.f161647y, 10, c.f161640r, c.f161639q, c.f161646x, 32, c.f161646x, c.f161647y, 2, c.f161647y, 6, 32, c.f161636n, 6, c.D};
        String[] strArr = A01;
        if (strArr[6].charAt(20) == strArr[0].charAt(20)) {
            throw new RuntimeException();
        }
        A01[2] = "00h";
        A00 = bArr;
    }

    static {
        A01();
    }

    @Override // com.facebook.ads.redexgen.core.TO
    public final void ACV(TN tn2) {
        String[] stringArray;
        Integer integer;
        Integer integer2;
        if (!AdInternalSettings.sDataProcessingOptionsUpdate.getAndSet(false)) {
            return;
        }
        synchronized (AdInternalSettings.sSettingsBundle) {
            stringArray = AdInternalSettings.sSettingsBundle.getStringArray(A00(35, 27, 123));
            integer = AdInternalSettings.sSettingsBundle.getInteger(A00(0, 35, 5));
            integer2 = AdInternalSettings.sSettingsBundle.getInteger(A00(62, 33, 80));
        }
        tn2.AFu(stringArray, integer, integer2);
    }
}
