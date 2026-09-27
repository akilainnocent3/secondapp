package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l3.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class MV {
    public static byte[] A02;
    public static final String[] A03;
    public String A00;
    public final C5O A01;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 44);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-91, -123, a.f103511x7, -66, a.f103502w7, a.f103452q7, 125, -79, -94, -75, -79, 125, -83, -81, -90, -86, -98, -81, -74, 125, -88, -94, -74, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, a.f103493v7, a.f103452q7, a.f103511x7, -60, -47, a.f103468s7, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, a.f103493v7, -66, -48, -47, -68, -47, -52, -46, a.f103436o7, a.f103468s7, -68, -47, a.f103476t7, a.f103502w7, a.f103452q7, -48, -47, -66, a.f103502w7, a.f103520y7, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -122, -98, -83, -96, -100, -81, -96, 123, -81, -100, -99, -89, -96, 123, -25, -11, q.f83622z, -13, a.f103460r7, -9, -28, -27, -17, q.B, a.f103460r7, -20, -23, a.f103460r7, q.B, -5, -20, -10, -9, -10, a.f103460r7, 127, -78, -87, -118, -90, -101, -77, -97, -84, 125, -101, -99, -94, -97, -128, -93, -90, -97, -121, -97, -82, -101, -98, -101, -82, -101, 13, 2, c.f161646x, c.f161647y, 0, c.f161647y, c.f161640r, c.f161648z, 4, 9, 0, c.f161647y, 10, c.f161638p, 6, c.f161646x, c.f161647y, 2, c.f161638p, 17, q.B, a.C7, -22, -29, -16, -28, -89, -102, -90, -98, -96, -109, -97, -105, 82, 111, 82, q.A};
    }

    static {
        A03();
        A03 = new String[]{A01(181, 4, 13), A01(HideBottomViewOnScrollBehavior.f50183l, 6, 80), A01(155, 20, 117)};
    }

    public MV(C5O c5o) {
        this.A01 = c5o;
    }

    private Cursor A00() {
        AbstractC16843y.A01(this.A00);
        return this.A01.getReadableDatabase().query(this.A00, A03, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(129, 26, 14) + str;
    }

    public static void A04(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(108, 21, 119) + str);
    }

    public final Map<String, MU> A05() throws C5N {
        try {
            Cursor cursorA00 = A00();
            try {
                HashMap map = new HashMap(cursorA00.getCount());
                while (cursorA00.moveToNext()) {
                    map.put((String) AbstractC16843y.A01(cursorA00.getString(0)), new MU(cursorA00.getLong(1), cursorA00.getLong(2)));
                }
                if (cursorA00 != null) {
                    cursorA00.close();
                }
                return map;
            } catch (Throwable th2) {
                if (cursorA00 != null) {
                    try {
                        cursorA00.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    public final void A06(long j10) throws C5N {
        try {
            String hexString = Long.toHexString(j10);
            String hexUid = A02(hexString);
            this.A00 = hexUid;
            if (C5Q.A00(this.A01.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    C5Q.A04(writableDatabase, 2, hexString, 1);
                    String hexUid2 = this.A00;
                    A04(writableDatabase, hexUid2);
                    StringBuilder sb2 = new StringBuilder();
                    String hexUid3 = A01(95, 13, 47);
                    StringBuilder sbAppend = sb2.append(hexUid3);
                    String hexUid4 = this.A00;
                    StringBuilder sbAppend2 = sbAppend.append(hexUid4);
                    String hexUid5 = A01(0, 1, 89);
                    StringBuilder sbAppend3 = sbAppend2.append(hexUid5);
                    String hexUid6 = A01(1, 94, 49);
                    writableDatabase.execSQL(sbAppend3.append(hexUid6).toString());
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    public final void A07(String str) throws C5N {
        AbstractC16843y.A01(this.A00);
        try {
            this.A01.getWritableDatabase().delete(this.A00, A01(185, 8, 6), new String[]{str});
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    public final void A08(String str, long j10, long j11) throws C5N {
        AbstractC16843y.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(A01(181, 4, 13), str);
            contentValues.put(A01(HideBottomViewOnScrollBehavior.f50183l, 6, 80), Long.valueOf(j10));
            contentValues.put(A01(155, 20, 117), Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.A00, null, contentValues);
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    public final void A09(Set<String> set) throws C5N {
        AbstractC16843y.A01(this.A00);
        try {
            SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.A00, A01(185, 8, 6), new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }
}
