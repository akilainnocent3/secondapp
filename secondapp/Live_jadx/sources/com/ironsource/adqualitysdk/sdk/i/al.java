package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class al {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f299 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f300;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f301;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f302 = m390("\u0006\u0013\uffd0\u000f\u0007\u0006\u000b\u0003\u0016\u000b\u0011\u0010\uffd0\u0017\u0010\u000b\u0016\u001bￕ\u0006\uffd0\u0005\u0011\u000f\n\u0016\u0016\u0012\u0015ￜ\uffd1\uffd1\u000bￏ\u0003", TextUtils.indexOf("", "", 0) + 35, false, 23 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionChild(0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE).intern();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f303 = m390("\u0015ￜ\uffd1\uffd1\u0011ￏ\u0003\u0006\u0013\uffd0\u000f\u0007\u0006\u000b\u0003\u0016\u000b\u0011\u0010\uffd0\u0017\u0010\u000b\u0016\u001bￕ\u0006\uffd0\u0005\u0011\u000f\n\u0016\u0016\u0012", 35 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), false, View.resolveSize(0, 0) + 31, 212 - TextUtils.getOffsetBefore("", 0)).intern();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f304 = m390("\uffd0\u0010\u0011\u000b\u0016\u0003\u000b\u0006\u0007\u000f\uffd0\u0013\u0006\u0003ￏ\u0003\uffd1\uffd1ￜ\u0015\u0012\u0016\u0016\n\u000f\u0011\u0005\uffd0\u0006ￕ\u001b\u0016\u000b\u0010\u0017", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 35, true, 24 - (ViewConfiguration.getTapTimeout() >> 16), (SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 211).intern();

    static {
        m388();
        m390("\ufffa\u0019￦￡ￖ\ufff9￬\u0007\u0004\ufff2,$\ufff8\u0019\u0016", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15, true, ImageFormat.getBitsPerPixel(0) + 4, 193 - Color.blue(0)).intern();
        int i10 = f301 + 63;
        f299 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public al() {
        m390("\u0005\u0003\u0001\u0012\u0014\u0002\u0004ￎ\u0016\u000bￎ\u000b\u0003\u0001\u0002", 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), true, TextUtils.getOffsetAfter("", 0) + 5, (KeyEvent.getMaxKeyCode() >> 16) + Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE).intern();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m388() {
        f300 = 118;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m389(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            f301 = (f299 + 1) % 128;
            str = "";
        }
        sb2.append(str);
        sb2.append(m390(wo.g.f143517x2, 1 - TextUtils.indexOf("", "", 0, 0), true, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 165).intern());
        if (str2 != null) {
            f299 = (f301 + 81) % 128;
        } else {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m391(String str) {
        int i10 = f301 + 87;
        f299 = i10 % 128;
        if (i10 % 2 != 0) {
            return m389(this.f302, str);
        }
        int i11 = 84 / 0;
        return m389(this.f302, str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m392() {
        int i10 = f301 + 81;
        int i11 = i10 % 128;
        f299 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f302;
        f301 = (i11 + 51) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m394(String str) {
        f301 = (f299 + 81) % 128;
        String strM389 = m389(this.f303, str);
        f299 = (f301 + 85) % 128;
        return strM389;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m387() {
        int i10 = f299 + 83;
        f301 = i10 % 128;
        return (i10 % 2 != 0 ? m390("\u0005\u0003\u0001\u0012\u0014\u0002\u0004ￎ\u0016\u000bￎ\u000b\u0003\u0001\u0002", 113 >>> Process.getGidForName(""), false, 3 / (TypedValue.complexToFloat(1) > 1.0f ? 1 : (TypedValue.complexToFloat(1) == 1.0f ? 0 : -1)), 7407 >> Color.alpha(1)) : m390("\u0005\u0003\u0001\u0012\u0014\u0002\u0004ￎ\u0016\u000bￎ\u000b\u0003\u0001\u0002", Process.getGidForName("") + 16, true, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 5, 214 - Color.alpha(0))).intern();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m390(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            try {
                char[] cArr2 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i13 = b.f704;
                    if (i13 >= i10) {
                        break;
                    }
                    b.f705 = cArr[i13];
                    cArr2[b.f704] = (char) (b.f705 + i12);
                    int i14 = b.f704;
                    cArr2[i14] = (char) (cArr2[i14] - f300);
                    b.f704 = i14 + 1;
                }
                if (i11 > 0) {
                    b.f707 = i11;
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr2, 0, cArr3, 0, i10);
                    int i15 = b.f707;
                    System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                    int i16 = b.f707;
                    System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                }
                if (z10) {
                    char[] cArr4 = new char[i10];
                    b.f704 = 0;
                    while (true) {
                        int i17 = b.f704;
                        if (i17 >= i10) {
                            break;
                        }
                        cArr4[i17] = cArr2[(i10 - i17) - 1];
                        b.f704 = i17 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m393() {
        int i10 = f299;
        String str = this.f304;
        int i11 = i10 + 111;
        f301 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
