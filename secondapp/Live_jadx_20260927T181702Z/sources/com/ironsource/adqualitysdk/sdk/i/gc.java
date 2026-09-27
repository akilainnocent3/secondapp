package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class gc extends gl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2143 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2144 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2145 = {5, zi.c.f161635m, -3, zi.c.f161635m, -20, 36, -19, 35, -36, 2, -15, -3, 6, 28, -27, -1, -3, 41, zi.c.E, l3.a.f103460r7, 7, -15, 69, l3.a.f103460r7, 7, -15, -6, 5, zi.c.f161635m, -3, zi.c.f161635m, -20, 4, 13, 3, 51, l3.a.f103493v7, 2, -15, -3, 6, -4, 5, -1, -3, 9, 59, l3.a.f103444p7, -2, zi.c.f161636n, 9, 6, -1, -13, 17, -7, -11, 2, 13, 3, 0, 0};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2146 = 44;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static short[] f2147 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2148 = -1709537723;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2149 = 1006258830;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2165(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2146;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2145;
                    i14 = bArr != null ? (byte) (bArr[f2149 + i10] + i13) : (short) (f2147[f2149 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f2149 + i15;
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f2148);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f2145;
                        if (bArr2 != null) {
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f2147;
                            int i17 = o.f2994;
                            o.f2994 = i17 - 1;
                            o.f2997 = (char) (o.f2996 + (((short) (sArr[i17] + s10)) ^ o.f2995));
                        }
                        sb2.append(o.f2997);
                        o.f2996 = o.f2997;
                        o.f2998++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo2153() {
        bg bgVar = new bg(mo2156());
        f2144 = (f2143 + 7) % 128;
        return bgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo2154() {
        int i10 = f2144 + 121;
        f2143 = i10 % 128;
        String strIntern = (i10 % 2 != 0 ? m2165(Drawable.resolveOpacity(1, 1) - 1006258830, (short) View.resolveSize(1, 1), Gravity.getAbsoluteGravity(1, 0) * 1709537822, (byte) TextUtils.getTrimmedLength(""), 7 >>> ((Process.getThreadPriority(1) * 85) / 66)) : m2165((-1006258830) - Drawable.resolveOpacity(0, 0), (short) View.resolveSize(0, 0), Gravity.getAbsoluteGravity(0, 0) + 1709537822, (byte) TextUtils.getTrimmedLength(""), ((Process.getThreadPriority(0) + 20) >> 6) + 7)).intern();
        int i11 = f2143 + 99;
        f2144 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo2155() {
        f2143 = (f2144 + 83) % 128;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo2156() {
        int i10 = f2143 + 17;
        f2144 = i10 % 128;
        int i11 = i10 % 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return (i11 == 0 ? m2165((jElapsedRealtime > 1L ? 1 : (jElapsedRealtime == 1L ? 0 : -1)) * (-1006258779), (short) (ViewConfiguration.getJumpTapTimeout() + 58), 1709537819 << (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionType(1L), Color.alpha(0) * 118) : m2165((-1006258779) - (jElapsedRealtime > 0L ? 1 : (jElapsedRealtime == 0L ? 0 : -1)), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1709537819, (byte) ExpandableListView.getPackedPositionType(0L), Color.alpha(0) - 33)).intern();
    }
}
