package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Cdo {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1795 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static short[] f1796 = null;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1797 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1798 = 1014900057;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1799 = -1249277938;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1800 = 117;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static byte[] f1801 = {-45, -43, -29, -93, -91, -45, -98, -79, -99, -93, -122, -88, -120, -5, -23, -30, -8, -32, -6, -30, -2, -17, zi.c.f161648z, -6, 17, zi.c.f161636n, 44, l3.a.f103428n7, zi.c.E, 5, -4, 70, 42, 57, 72, 87, 13, 53, 75, 53, 76, 45, 54, 39, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1802;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private JSONObject f1803;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> f1804;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1805;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ISAdQualityAdType f1806;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1807;

    public Cdo(JSONObject jSONObject) {
        this.f1806 = ISAdQualityAdType.UNKNOWN;
        this.f1807 = dz.m2088(jSONObject.optString(m1978(1249277938 - (Process.myTid() >> 22), (short) ((Process.myPid() >> 22) + 34), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1014899941, (byte) TextUtils.getTrimmedLength(""), (ViewConfiguration.getTouchSlop() >> 8) - 113).intern()));
        String strM2088 = dz.m2088(jSONObject.optString(m1978((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1249277941, (short) (TextUtils.getTrimmedLength("") + 82), (-1014899960) - View.MeasureSpec.getSize(0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getTrimmedLength("") - 111).intern()));
        if (!TextUtils.isEmpty(strM2088)) {
            this.f1806 = ISAdQualityAdType.fromInt(Integer.parseInt(strM2088));
        }
        this.f1803 = jSONObject.optJSONObject(m1978(1249277946 - KeyEvent.normalizeMetaState(0), (short) (106 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) - 1014899945, (byte) TextUtils.getCapsMode("", 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 112).intern());
        this.f1804 = jz.m2756(jSONObject, m1978(Color.blue(0) + 1249277951, (short) (19 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1014899961, (byte) Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 107).intern(), new ArrayList());
        this.f1805 = dz.m2088(jSONObject.optString(m1978((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1249277960, (short) (Gravity.getAbsoluteGravity(0, 0) - 9), KeyEvent.normalizeMetaState(0) - 1014899939, (byte) ((Process.getThreadPriority(0) + 20) >> 6), (-107) - Color.green(0)).intern()));
        this.f1802 = dz.m2088(jSONObject.optString(m1978((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1249277968, (short) ((-57) - View.combineMeasuredStates(0, 0)), Gravity.getAbsoluteGravity(0, 0) - 1014899938, (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getTrimmedLength("") - 103).intern()));
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m1979() {
        int i10 = f1795 + 37;
        f1797 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1802;
        }
        int i11 = 62 / 0;
        return this.f1802;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m1980() {
        JSONObject jSONObject;
        int i10 = f1795;
        int i11 = i10 + 117;
        f1797 = i11 % 128;
        if (i11 % 2 != 0) {
            jSONObject = this.f1803;
            int i12 = 2 / 0;
        } else {
            jSONObject = this.f1803;
        }
        f1797 = (i10 + 69) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m1981() {
        int i10 = (f1797 + 67) % 128;
        f1795 = i10;
        String str = this.f1805;
        f1797 = (i10 + 111) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ISAdQualityAdType m1982() {
        int i10 = f1797;
        ISAdQualityAdType iSAdQualityAdType = this.f1806;
        f1795 = (i10 + 87) % 128;
        return iSAdQualityAdType;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m1983() {
        int i10 = f1795 + 99;
        int i11 = i10 % 128;
        f1797 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1804;
        int i12 = i11 + 109;
        f1795 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 70 / 0;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m1984() {
        int i10 = f1797 + 5;
        f1795 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1807;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1978(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1800;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1801;
                    i14 = bArr != null ? (byte) (bArr[f1799 + i10] + i13) : (short) (f1796[f1799 + i10] + i13);
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f1799 + i15;
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f1798);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f1801;
                        if (bArr2 != null) {
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f1796;
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
}
