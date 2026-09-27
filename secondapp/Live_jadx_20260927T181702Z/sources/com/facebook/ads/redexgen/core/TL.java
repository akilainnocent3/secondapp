package com.facebook.ads.redexgen.core;

import android.database.sqlite.SQLiteDatabase;
import java.util.Arrays;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class TL {
    public static byte[] A01;
    public final TH A00;

    static {
        A04();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 3);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, 64, 73, 44, 6, c.f161640r, 13, c.f161643u, 98, c.f161648z, 3, 0, c.f161638p, 7, 98, c.f161635m, 4, 98, 7, c.D, c.f161635m, 17, c.f161648z, 17, 98, 34, 52, a.f159811k, 52, 50, 37, 81};
    }

    public abstract String A06();

    public abstract TF[] A0A();

    public TL(TH th2) {
        this.A00 = th2;
    }

    private String A00() {
        TF[] tfArrA0A = A0A();
        if (tfArrA0A.length < 1) {
            return null;
        }
        String result = A01(0, 0, 12);
        for (int i10 = 0; i10 < tfArrA0A.length - 1; i10++) {
            result = result + tfArrA0A[i10].A02() + A01(20, 2, 43);
        }
        return result + tfArrA0A[tfArrA0A.length - 1].A02();
    }

    public static String A02(String str, TF[] tfArr) {
        StringBuilder sb2 = new StringBuilder(A01(56, 7, 114));
        for (int i10 = 0; i10 < tfArr.length - 1; i10++) {
            sb2.append(tfArr[i10].A01);
            sb2.append(A01(20, 2, 43));
        }
        sb2.append(tfArr[tfArr.length - 1].A01);
        sb2.append(A01(6, 6, 21));
        sb2.append(str);
        return sb2.toString();
    }

    public static String A03(String str, TF[] tfArr, TF tf2) {
        return A02(str, tfArr) + A01(12, 7, 119) + tf2.A01 + A01(2, 4, 116);
    }

    public final SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
