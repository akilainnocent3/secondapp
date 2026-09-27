package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import f6.q;
import java.util.Arrays;
import rg.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class SY {
    public static byte[] A01;
    public SharedPreferences A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 127);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, 44, 62, 45, 58, 60, 33, 59, 33, 38, 47, 1, 44, 80, 69, 69, 67, 88, 83, 68, 69, 88, 94, 95, a.f127263w, 85, 93, 95, 93, 86, 91, 106, 109, c.B, c.f161646x, c.f161648z, 85, c.G, c.D, c.B, c.H, c.C, c.f161646x, c.f161646x, c.f161640r, 85, c.D, 31, 8, 85, c.f161643u, 31, c.G, c.D, 115, 118, 114, 118, 107, 94, 123, 75, 109, 126, 124, 116, 118, q.A, a.f127263w};
    }

    public SY(T8 t10) {
        this.A00 = t10.getSharedPreferences(ProcessUtils.getProcessSpecificName(A00(33, 21, 4), t10), 0);
    }

    public final SX A02() {
        SharedPreferences sharedPreferences = this.A00;
        String strA00 = A00(0, 13, 55);
        if (sharedPreferences.contains(strA00)) {
            return new SX(this.A00.getString(strA00, A00(0, 0, 75)), this.A00.getBoolean(A00(54, 15, 96), false), SW.A08, this.A00.getLong(A00(26, 7, 65), -1L));
        }
        return SX.A00();
    }

    public final String A03() {
        return this.A00.getString(A00(13, 13, 78), A00(0, 0, 75));
    }

    public final void A04(SX sx2) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(0, 13, 55), sx2.A03());
        editorEdit.putBoolean(A00(54, 15, 96), sx2.A04());
        editorEdit.putLong(A00(26, 7, 65), sx2.A01());
        editorEdit.apply();
    }

    public final void A05(String str) {
        SharedPreferences.Editor editorEdit = this.A00.edit();
        editorEdit.putString(A00(13, 13, 78), str);
        editorEdit.apply();
    }
}
