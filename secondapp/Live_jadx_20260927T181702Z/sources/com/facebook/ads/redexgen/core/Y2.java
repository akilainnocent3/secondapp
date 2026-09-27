package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.internal.api.BuildConfigApi;
import f6.q;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import rg.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Y2 {
    public static byte[] A0I;
    public static String[] A0J = {"rKrHA1ppiEGtpGml0yFHxQc7aUVdIlaK", "Q4SIGH0IwDzvXyGW0zafZen9gbqpyN1f", "xGmPyT38DpqIOoHtA0YJEsvJmmnM9rU2", "YMTGToIzL8UnFUS7pkYkKngwhslhjZnz", "", "FtuyiQzUiuUOiWtDKsyDRDOBtN4yprur", "", "qY4faXAnnIeFUOBxRnakMYaEddWfOrH2"};
    public static final String A0K;
    public View A0F;
    public View A0G;
    public boolean A0H;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public int A03 = -1;
    public long A0C = -1;
    public int A09 = -1;
    public long A0E = -1;
    public long A0D = -1;
    public int A0A = -1;
    public int A0B = -1;
    public int A07 = -1;
    public int A08 = -1;
    public float A00 = -1.0f;
    public float A02 = -1.0f;
    public float A01 = -1.0f;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0I, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0I = new byte[]{0, c.f161636n, 115, 127, 60, 51, 54, 60, 52, 56, 42, 62, 45, 59, c.f161635m, 54, 50, 58, 101, 127, 75, 78, 122, 69, 89, 67, 94, 67, 69, 68, 114, 94, 91, 111, 80, 76, 86, 75, 86, 80, 81, 102, 105, 102, 99, 105, 97, 78, 111, 102, 107, 115, 94, 99, 103, 111, 119, a.f127263w, 125, 119, 127, 76, 47, 32, 37, 47, 39, c.f161647y, 95, 80, 85, 95, 87, 89, 88, 106, 85, 89, 75, 104, 93, 91, 1, 10, 0, 48, 13, 9, 1, 115, a.f127263w, 114, 78, 46, 37, 47, c.f161643u, c.f161646x, c.G, 0, 17, c.A, 108, 97, 109, 99, 108, 112, 56, 34, c.f161643u, yr.a.f159811k, 56, 50, 58, c.f161648z, 36, 48, 35, 53, c.f161646x, 63, 48, 51, yr.a.f159811k, 52, 53, 107, q.A, 84, 71, 66, 79, 83, 85, 126, 118, 101, 96, 109, q.A, 119, 93, c.f161638p, c.C, 31, 19, c.f161638p, c.B, c.f161647y, c.f161643u, c.E, 92, c.f161647y, 17, c.f161636n, c.f161638p, c.C, c.f161639q, c.f161639q, c.f161647y, 19, c.f161643u, 70, 92, 99, q.f83619w, q.A, 98, q.f83619w, 68, 121, 125, 117, 115, 116, 97, 114, 116, 88, 36, 35, 54, 37, 35, c.f161638p, c.f161639q, 17, 28, c.f161636n, c.f161640r};
    }

    static {
        A02();
        A0K = Y2.class.getSimpleName();
    }

    private EnumC2410Xc A00() {
        if (this.A0G == null || this.A0F == null) {
            return EnumC2410Xc.A0J;
        }
        View view = this.A0G;
        String[] strArr = A0J;
        if (strArr[6].length() == strArr[4].length()) {
            String[] strArr2 = A0J;
            strArr2[6] = "";
            strArr2[4] = "";
            if (view != this.A0F) {
                EnumC2410Xc enumC2410Xc = EnumC2410Xc.A0H;
                String[] strArr3 = A0J;
                if (strArr3[7].charAt(18) != strArr3[1].charAt(18)) {
                    throw new RuntimeException();
                }
                A0J[0] = "tmBamhoJLli8fG7mmMEXMJcTnxwesBVw";
                return enumC2410Xc;
            }
            Object tag = this.A0G.getTag(EnumC2410Xc.A02);
            if (tag == null) {
                return EnumC2410Xc.A0I;
            }
            if (!(tag instanceof EnumC2410Xc)) {
                EnumC2410Xc enumC2410Xc2 = EnumC2410Xc.A0K;
                if (A0J[2].charAt(2) == 'm') {
                    A0J[0] = "fnwPYOgaVMSkQLAdq2SZMccx8Jl2b0fK";
                    return enumC2410Xc2;
                }
            } else {
                return (EnumC2410Xc) tag;
            }
        }
        throw new RuntimeException();
    }

    public final long A03() {
        if (A07()) {
            return System.currentTimeMillis() - this.A0C;
        }
        return -1L;
    }

    public final Map<String, String> A04() {
        long j10;
        if (!this.A0H) {
            return null;
        }
        String strValueOf = String.valueOf((this.A02 * this.A01) / 2.0f);
        if (this.A0C > 0 && this.A0D > this.A0C) {
            j10 = this.A0D - this.A0C;
        } else {
            j10 = -1;
        }
        HashMap map = new HashMap();
        String strValueOf2 = String.valueOf(this.A04);
        String radius = A01(20, 11, 76);
        map.put(radius, strValueOf2);
        String strValueOf3 = String.valueOf(this.A05);
        String radius2 = A01(31, 11, 89);
        map.put(radius2, strValueOf3);
        String strValueOf4 = String.valueOf(this.A06);
        String radius3 = A01(186, 5, 30);
        map.put(radius3, strValueOf4);
        String strValueOf5 = String.valueOf(this.A03);
        String radius4 = A01(102, 6, 98);
        map.put(radius4, strValueOf5);
        String strA01 = A01(42, 14, 108);
        String radius5 = String.valueOf(j10);
        map.put(strA01, radius5);
        String strValueOf6 = String.valueOf(this.A0E);
        String radius6 = A01(165, 9, 118);
        map.put(radius6, strValueOf6);
        String strValueOf7 = String.valueOf(this.A0D);
        String radius7 = A01(82, 7, 2);
        map.put(radius7, strValueOf7);
        String strValueOf8 = String.valueOf(this.A0A);
        String radius8 = A01(174, 6, 102);
        map.put(radius8, strValueOf8);
        String strValueOf9 = String.valueOf(this.A0B);
        String radius9 = A01(180, 6, 49);
        map.put(radius9, strValueOf9);
        String strValueOf10 = String.valueOf(this.A07);
        String radius10 = A01(56, 6, 114);
        map.put(radius10, strValueOf10);
        String strValueOf11 = String.valueOf(this.A08);
        String radius11 = A01(62, 6, 42);
        map.put(radius11, strValueOf11);
        String strValueOf12 = String.valueOf(this.A07);
        String radius12 = A01(89, 4, 112);
        map.put(radius12, strValueOf12);
        String strValueOf13 = String.valueOf(this.A08);
        String radius13 = A01(93, 4, 45);
        map.put(radius13, strValueOf13);
        String strValueOf14 = String.valueOf(this.A00);
        String radius14 = A01(97, 5, 20);
        map.put(radius14, strValueOf14);
        String radius15 = A01(129, 7, 64);
        map.put(radius15, strValueOf);
        String radius16 = A01(136, 7, 98);
        map.put(radius16, strValueOf);
        String strValueOf15 = String.valueOf(A00().A06());
        String radius17 = A01(68, 14, 90);
        map.put(radius17, strValueOf15);
        return map;
    }

    public final void A05() {
        this.A0C = System.currentTimeMillis();
        if (BuildConfigApi.isDebug()) {
            String str = A01(143, 22, 26) + this.A0C;
        }
    }

    public final void A06(C2900gi c2900gi, MotionEvent motionEvent, View view, View view2) {
        if (view == null) {
            c2900gi.A0F().AKl();
            return;
        }
        if (!this.A0H) {
            this.A0H = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                InputDevice.MotionRange motionRange = device.getMotionRange(0);
                String[] strArr = A0J;
                if (strArr[3].charAt(6) != strArr[5].charAt(6)) {
                    String[] strArr2 = A0J;
                    strArr2[3] = "Gaq4uS8iinWfWA9p3yS2tuaxngbM8vTH";
                    strArr2[5] = "hEOHH5DdlsOTPss6NfO6KYKxbvbMxS72";
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(1);
                    if (motionRange != null && motionRange2 != null) {
                        this.A01 = Math.min(motionRange.getRange(), motionRange2.getRange());
                    }
                } else {
                    throw new RuntimeException();
                }
            }
            if (this.A01 <= 0.0f) {
                this.A01 = Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.A04 = (int) (iArr[0] / XX.A02);
                this.A05 = (int) (iArr[1] / XX.A02);
                this.A06 = (int) (view.getWidth() / XX.A02);
                this.A03 = (int) (view.getHeight() / XX.A02);
                this.A09 = 1;
                this.A0E = System.currentTimeMillis();
                this.A0A = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / XX.A02);
                int touchStartYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A0B = (int) (touchStartYInPx / XX.A02);
                this.A00 = motionEvent.getPressure();
                this.A02 = motionEvent.getSize();
                this.A0G = view2;
                return;
            case 1:
            case 3:
                this.A0D = System.currentTimeMillis();
                this.A07 = (int) (((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0]) / XX.A02);
                int touchEndYInPx = (((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1];
                this.A08 = (int) (touchEndYInPx / XX.A02);
                this.A0F = view2;
                return;
            case 2:
                this.A00 -= this.A00 / this.A09;
                this.A00 += motionEvent.getPressure() / this.A09;
                this.A02 -= this.A02 / this.A09;
                this.A02 += motionEvent.getSize() / this.A09;
                this.A09++;
                return;
            default:
                return;
        }
    }

    public final boolean A07() {
        return this.A0C != -1;
    }

    public final boolean A08() {
        return this.A0H;
    }

    public final boolean A09(Context context) {
        boolean z10;
        int iA07 = C2350Up.A07(context);
        long jA03 = A03();
        if (iA07 >= 0 && jA03 < iA07) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (BuildConfigApi.isDebug()) {
            String str = A01(108, 21, 55) + z10 + A01(2, 18, 57) + iA07 + A01(0, 2, 74) + jA03;
        }
        return z10;
    }
}
