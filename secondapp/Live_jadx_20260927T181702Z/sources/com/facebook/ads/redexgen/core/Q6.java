package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.cast.MediaError;
import com.unity3d.mediation.LevelPlayAdError;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalKey;
import f6.q;
import java.util.Arrays;
import r7.i1;
import yr.a;
import zi.c;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Q6 {
    public static byte[] A02;
    public static String[] A03 = {"MIyaG5GGMOxZGMlafXmCt20n5rwr84Cp", "2d7Ue4OLDSzNDZ0wIaqfb27lMuRlGrEq", "mYVPmAfRmW7XSvdIWjd", "xGy6wksCbV1DRuK7mqOXpPoeqCYQ0xXA", "bG0ONBuurvv92UazdjN2MWGsVI3Uiutq", "DcUOjHhMMeDdpHUeoCsuhqU8ztRHLrD6", "9Z29anAmU4sgj9dhE7", "NGIsWgcUmAFv5dLZHkD"};
    public static final Q2 A04;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{122, 118, 118, 109, c.f161648z, 80, 75, 9, 4, c.H, 5, c.f161639q, c.B, 34, 5, 59, 10, c.C, c.f161638p, 5, 31, 81, 75, 64, 91, c.C, c.f161646x, c.f161638p, c.f161647y, 31, 8, 50, c.f161647y, 40, c.B, 9, c.H, c.H, c.f161647y, 65, 91, 125, 102, 37, 46, 35, 37, 45, 39, 36, 42, 35, 124, 102, a.f159811k, 38, 101, 110, 99, 101, 109, 99, 98, 60, 38, 7, 28, 95, 80, 93, 79, 79, 114, 93, 81, 89, 6, 28, 64, 91, c.B, c.A, c.f161643u, c.B, c.f161640r, c.D, c.C, c.A, c.H, 65, 91, 97, 122, 57, 53, 52, 46, 63, 52, 46, c.H, 63, 41, 57, 40, 51, 42, 46, 51, 53, 52, 96, 122, 36, 63, 122, q.A, 126, 125, 115, 122, 123, 37, 63, 96, 123, a.f159811k, 52, 56, 46, 40, 58, 57, 55, 62, 97, 123, 4, 31, 89, 80, 92, 74, 76, 90, 91, 5, 31, c.G, 6, 74, 73, 72, 65, 101, 74, 79, 69, 77, 71, 68, 74, 67, 28, 6, 89, 66, c.f161643u, 3, 1, 9, 3, 5, 7, 44, 3, c.f161639q, 7, 88, 66, 8, 19, 67, 82, 64, 64, 68, 92, 65, 87, 9, 19, c.C, 2, 81, 65, 80, 77, 78, 78, 67, 64, 78, 71, c.B, 2, 8, 19, 64, 86, 95, 86, 80, 71, 86, 87, 9, 19, 81, 74, c.H, c.f161639q, c.f161643u, c.H, 80, 74, 76, 87, 1, c.H, c.f161643u, 0, 62, 19, 77, 87, 42, 40, 63, 34, 36, 37, 52, 42, 40, 40, 46, 56, 56, 34, 41, 34, 39, 34, 63, 50, 52, 45, 36, 40, 62, 56, 76, 78, 89, 68, 66, 67, 82, 78, 65, 72, 76, 95, 82, 76, 78, 78, 72, 94, 94, 68, 79, 68, 65, 68, 89, 84, 82, 75, 66, 78, 88, 94, 6, 4, 19, c.f161638p, 8, 9, c.B, 4, c.f161635m, 2, 6, c.f161647y, c.B, 1, 8, 4, c.f161643u, c.f161646x, 109, 111, rg.a.f127263w, 101, 99, 98, 115, 111, 96, 105, 109, 126, 115, 127, 105, 96, 105, 111, rg.a.f127263w, 101, 99, 98, 94, 92, 75, 86, 80, 81, 64, 92, 83, 86, 92, 84, 79, 77, 90, 71, 65, 64, 81, 77, 65, 94, 87, 31, c.G, 10, c.A, 17, c.f161640r, 1, c.G, c.f161635m, 10, c.f161640r, c.f161643u, 5, c.B, c.H, 31, c.f161638p, c.A, c.H, c.f161643u, 4, 2, 123, 121, 110, 115, 117, 116, 101, 118, 117, 116, 125, 101, 121, 118, 115, 121, q.A, 49, 51, 36, 57, 63, 62, 47, 62, 53, 40, 36, 47, 49, 36, 47, a.f159811k, 63, 38, 53, a.f159811k, 53, 62, 36, 47, 55, 34, 49, 62, 37, 60, 49, 34, 57, 36, 41, 116, 118, 97, 124, 122, 123, 106, 123, 112, 109, 97, 106, 125, 97, rg.a.f127263w, 121, 106, 112, 121, 112, rg.a.f127263w, 112, 123, 97, 109, 111, rg.a.f127263w, 101, 99, 98, 115, 124, 109, 127, rg.a.f127263w, 105, 37, 39, 48, 45, 43, 42, 59, 52, 54, 33, 50, 45, 43, 49, 55, 59, 37, 48, 59, 41, 43, 50, 33, 41, 33, 42, 48, 59, 35, 54, 37, 42, 49, 40, 37, 54, 45, 48, a.f159811k, 68, 70, 81, 76, 74, 75, 90, 85, 87, 64, 83, 76, 74, 80, 86, 90, 77, 81, 72, 73, 90, 64, 73, 64, 72, 64, 75, 81, 98, 96, 119, 106, 108, 109, 124, 112, 96, q.A, 108, 111, 111, 124, 97, 98, 96, 104, 116, 98, q.A, 103, 77, 79, 88, 69, 67, 66, 83, 95, 79, 94, 67, 64, 64, 83, 74, 67, 94, 91, 77, 94, 72, c.f161648z, c.f161646x, 3, c.H, c.B, c.C, 8, 4, c.f161643u, c.E, c.f161643u, c.f161646x, 3, 124, 126, 105, 116, 114, 115, 98, 110, rg.a.f127263w, 105, 98, 110, rg.a.f127263w, q.A, rg.a.f127263w, 126, 105, 116, 114, 115, 97, 99, 116, 105, 111, 110, 127, 117, 110, 107, 110, 111, 119, 110, 65};
    }

    static {
        A09();
        if (Build.VERSION.SDK_INT >= 24) {
            A04 = new C0j() { // from class: com.facebook.ads.redexgen.X.0g
            };
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            A04 = new C0j();
        } else if (Build.VERSION.SDK_INT >= 22) {
            A04 = new C0m();
        } else {
            A04 = new C0p();
        }
    }

    public Q6(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    private final int A00() {
        return this.A01.getActions();
    }

    public static Q6 A01(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new Q6(accessibilityNodeInfo);
    }

    private final CharSequence A02() {
        return this.A01.getClassName();
    }

    private final CharSequence A03() {
        return this.A01.getContentDescription();
    }

    private final CharSequence A04() {
        return this.A01.getPackageName();
    }

    private final CharSequence A05() {
        return this.A01.getText();
    }

    private final String A06() {
        return A04.A02(this.A01);
    }

    public static String A07(int i10) {
        switch (i10) {
            case 1:
                return A08(367, 12, 15);
            case 2:
                return A08(294, 18, 25);
            case 4:
                return A08(577, 13, 9);
            case 8:
                return A08(312, 22, 114);
            case 16:
                return A08(334, 12, 65);
            case 32:
                String strA08 = A08(379, 17, 100);
                String[] strArr = A03;
                if (strArr[2].length() == strArr[7].length()) {
                    A03[0] = "SoHELriMkQBcnBScVZvUK7T5g3K9Fm6N";
                    return strA08;
                }
                break;
            case 64:
                if (A03[0].charAt(4) != 'k') {
                    String[] strArr2 = A03;
                    strArr2[2] = "WqW7FwrDIFS0bz5Pv3V";
                    strArr2[7] = "9aPQSHdK8ccW2UHKig7";
                    return A08(236, 26, 53);
                }
                A03[0] = "EQhP22rcQn8uHJztvMH4f7UvmkKbnpEF";
                return A08(236, 26, 53);
            case 128:
                return A08(i1.d.HandlerC1208d.f123898m, 32, 83);
            case 256:
                return A08(396, 35, 46);
            case 512:
                return A08(467, 39, 58);
            case 1024:
                return A08(MediaError.DetailedErrorCode.SMOOTH_MANIFEST, 24, SignalKey.EVENT_ID);
            case 2048:
                return A08(506, 28, 91);
            case 4096:
                return A08(556, 21, 82);
            case 8192:
                String strA09 = A08(534, 22, 125);
                String[] strArr3 = A03;
                if (strArr3[4].charAt(1) == strArr3[3].charAt(1)) {
                    String[] strArr4 = A03;
                    strArr4[2] = "qK4Dr1iI0ffiXenjEdF";
                    strArr4[7] = "zXyhBsmJjFlVcoSAhS3";
                    return strA09;
                }
                break;
            case 16384:
                return A08(346, 11, 80);
            case 32768:
                return A08(455, 12, 114);
            case 65536:
                return A08(357, 10, 0);
            case 131072:
                return A08(590, 20, 99);
            default:
                return A08(610, 14, 126);
        }
        throw new RuntimeException();
    }

    private final void A0A(Rect rect) {
        this.A01.getBoundsInParent(rect);
    }

    private final void A0B(Rect rect) {
        this.A01.getBoundsInScreen(rect);
    }

    private final boolean A0C() {
        return this.A01.isCheckable();
    }

    private final boolean A0D() {
        return this.A01.isChecked();
    }

    private final boolean A0E() {
        return this.A01.isClickable();
    }

    private final boolean A0F() {
        return this.A01.isEnabled();
    }

    private final boolean A0G() {
        return this.A01.isFocusable();
    }

    private final boolean A0H() {
        return this.A01.isFocused();
    }

    private final boolean A0I() {
        return this.A01.isLongClickable();
    }

    private final boolean A0J() {
        return this.A01.isPassword();
    }

    private final boolean A0K() {
        return this.A01.isScrollable();
    }

    private final boolean A0L() {
        return this.A01.isSelected();
    }

    public final AccessibilityNodeInfo A0M() {
        return this.A01;
    }

    public final void A0N(int i10) {
        this.A01.addAction(i10);
    }

    public final void A0O(CharSequence charSequence) {
        this.A01.setClassName(charSequence);
    }

    public final void A0P(Object obj) {
        A04.A03(this.A01, ((Q3) obj).A00);
    }

    public final void A0Q(Object obj) {
        A04.A04(this.A01, ((Q4) obj).A00);
    }

    public final void A0R(boolean z10) {
        this.A01.setScrollable(z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Q6 q10 = (Q6) obj;
        if (this.A01 == null) {
            if (q10.A01 != null) {
                return false;
            }
        } else if (!this.A01.equals(q10.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A01 == null) {
            return 0;
        }
        return this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        A0A(rect);
        StringBuilder builder = new StringBuilder().append(A08(5, 18, 53));
        sb2.append(builder.append(rect).toString());
        A0B(rect);
        StringBuilder builder2 = new StringBuilder().append(A08(23, 18, 37));
        sb2.append(builder2.append(rect).toString());
        sb2.append(A08(165, 15, 60)).append(A04());
        sb2.append(A08(65, 13, 98)).append(A02());
        sb2.append(A08(218, 8, 52)).append(A05());
        sb2.append(A08(91, 22, 4)).append(A03());
        sb2.append(A08(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 10, 41)).append(A06());
        sb2.append(A08(41, 13, 24)).append(A0C());
        sb2.append(A08(54, 11, 88)).append(A0D());
        sb2.append(A08(124, 13, 5)).append(A0G());
        sb2.append(A08(137, 11, 97)).append(A0H());
        sb2.append(A08(206, 12, 109)).append(A0L());
        sb2.append(A08(78, 13, 37)).append(A0E());
        sb2.append(A08(148, 17, 120)).append(A0I());
        sb2.append(A08(113, 11, 65)).append(A0F());
        sb2.append(A08(180, 12, 109)).append(A0J());
        StringBuilder builder3 = new StringBuilder().append(A08(192, 14, 124)).append(A0K());
        sb2.append(builder3.toString());
        sb2.append(A08(2, 3, 19));
        int iA00 = A00();
        while (iA00 != 0) {
            int iNumberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(iA00);
            iA00 &= ~iNumberOfTrailingZeros;
            sb2.append(A07(iNumberOfTrailingZeros));
            String[] strArr = A03;
            if (strArr[1].charAt(26) != strArr[5].charAt(26)) {
                throw new RuntimeException();
            }
            A03[0] = "u7URBkmoClRMdzvgw4WX3UmEFyKryATB";
            if (iA00 != 0) {
                sb2.append(A08(0, 2, 8));
            }
        }
        sb2.append(A08(LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, 1, 66));
        return sb2.toString();
    }
}
