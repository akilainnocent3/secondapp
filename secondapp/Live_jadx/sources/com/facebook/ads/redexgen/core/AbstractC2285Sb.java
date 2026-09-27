package com.facebook.ads.redexgen.core;

import android.content.ContentResolver;
import android.database.Cursor;
import f6.q;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2285Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{a.f159811k, 53, 56, 79, 64, 74, 92, 65, 71, 74, 71, 74, 127, 115, 114, 104, 121, 114, 104, 38, 51, 51, 127, 115, q.A, 50, 122, 125, 127, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, rg.a.f127263w, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, rg.a.f127263w, 76, 110, 115, 106, 117, rg.a.f127263w, 121, 110, c.f161643u, c.A, 19, c.A, 10, 33, 10, c.f161636n, 31, c.G, c.f161647y, c.A, c.f161640r, c.C};
    }

    public static C2284Sa A00(ContentResolver contentResolver) {
        String strA01 = A01(72, 14, 113);
        String strA02 = A01(3, 9, 33);
        String strA03 = A01(0, 3, 83);
        Cursor c10 = null;
        try {
            c10 = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{strA03, strA02, strA01}, null, null, null);
            if (c10 == null || !c10.moveToFirst()) {
                return new C2284Sa(null, null, false);
            }
            String string = c10.getString(c10.getColumnIndex(strA03));
            String attributionId = c10.getString(c10.getColumnIndex(strA02));
            return new C2284Sa(string, attributionId, Boolean.valueOf(c10.getString(c10.getColumnIndex(strA01))).booleanValue());
        } finally {
            if (c10 != null) {
                c10.close();
            }
        }
    }
}
