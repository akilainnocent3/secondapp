package com.bytedance.adsdk.ugeno.vgm;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4235d4;
import f2.z1;
import gi.j;
import to.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.vgm.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0307hww {
        public GradientDrawable.Orientation hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        public float[] f32742sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        public int[] f32743tq;
    }

    public static int hww(String str) {
        return hww(str, -16777216);
    }

    public static boolean sd(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static C0307hww tq(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf(j.f86770c) + 1, str.lastIndexOf(j.f86771d));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iHww = hww(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0307hww c0307hww = new C0307hww();
            c0307hww.hww = vy(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iHww];
            float[] fArr = new float[iHww];
            for (int i10 = 0; i10 < iHww; i10++) {
                int iIndexOf2 = strSubstring3.indexOf(c.userBaseExtraDel2);
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(j.f86771d) : strTrim.indexOf(" ")) + 1;
                iArr[i10] = hww(strTrim.substring(0, iIndexOf3).trim());
                fArr[i10] = sd.hww(strTrim.substring(iIndexOf3, strTrim.indexOf(c.userBaseExtraDel2)).trim(), 0.0f) / 100.0f;
                int i11 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i11) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i11);
            }
            if (iHww < 2) {
                return null;
            }
            c0307hww.f32743tq = iArr;
            c0307hww.f32742sd = fArr;
            return c0307hww;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static GradientDrawable.Orientation vy(String str) {
        try {
            int i10 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            if (i10 == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i10 == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return i10 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int hww(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(C4235d4.i.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb2 = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i11 = 1; i11 < charArray.length; i11++) {
                    sb2.append(charArray[i11]);
                    sb2.append(charArray[i11]);
                }
                return Color.parseColor(sb2.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf(j.f86770c) + 1, str.indexOf(j.f86771d)).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i10;
    }

    public static int hww(String str, char c10) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static int hww(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i11 = 255;
        }
        return (i10 & z1.f82662x) | (i11 << 24);
    }
}
