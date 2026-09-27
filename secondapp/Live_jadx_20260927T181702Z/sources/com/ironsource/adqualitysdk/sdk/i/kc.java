package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.signals.SignalKey;
import cv.z0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class kc {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2963 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2964 = {fw.b.f85384k, 51818, 37976, 24241, 10473, 62250, 48485, '\\', 51738, 7151, 53726, 36792, 17664, 13083, 59636, 42660, 40071, 18977, 'H', 64896, 43984, 25067, 24369, 48877, '^', 51823, 37940, 24303, 10380, 62295, 48485, 34630, z0.f77338c, 46431, 32620, 8479, 60356, 40327, 18013, 2070, 3809, 50388, 39578, 20485, 9820};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2965 = 6849758736906832436L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2966 = 1;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r0 < r6.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b7, code lost:
    
        if (r0 < r6.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        return java.lang.Integer.signum(java.lang.Integer.valueOf(r5[r0]).compareTo(java.lang.Integer.valueOf(r6[r0])));
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m2814(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kc.m2814(java.lang.String, java.lang.String):int");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2818(String str) {
        f2966 = (f2963 + 19) % 128;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!str.startsWith(m2824(KeyEvent.getDeadChar(0, 0) + 23, (char) (ExpandableListView.getPackedPositionChild(0L) + 48820), -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2824(KeyEvent.getDeadChar(0, 0) + 24, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "") + 8).intern());
            sb2.append(str);
            str = sb2.toString();
        }
        if (str.endsWith(m2824(32 - View.MeasureSpec.getMode(0), (char) View.resolveSize(0, 0), TextUtils.getOffsetBefore("", 0) + 1).intern())) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(m2824((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 32, (char) (TextUtils.lastIndexOf("", '0', 0) + 46341), View.MeasureSpec.getMode(0) + 7).intern());
        String string = sb3.toString();
        f2963 = (f2966 + 15) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static List<String> m2820(String str, String str2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        f2963 = (f2966 + 45) % 128;
        while (matcher.find()) {
            if (matcher.groupCount() == 0) {
                f2963 = (f2966 + 41) % 128;
                arrayList.add(matcher.group());
                if (z10) {
                    f2966 = (f2963 + 63) % 128;
                    return arrayList;
                }
            } else {
                for (int i10 = 1; i10 <= matcher.groupCount(); i10++) {
                    f2963 = (f2966 + 65) % 128;
                    arrayList.add(matcher.group(i10));
                    if (z10) {
                        f2963 = (f2966 + 27) % 128;
                        return arrayList;
                    }
                }
            }
        }
        int i11 = f2966 + SignalKey.EVENT_ID;
        f2963 = i11 % 128;
        if (i11 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2822(String str, String str2) {
        int i10 = f2963 + 105;
        f2966 = i10 % 128;
        int i11 = i10 % 2;
        return m2820(str, str2, false);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2825(String str, JSONArray jSONArray, boolean z10) {
        f2966 = (f2963 + 111) % 128;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            f2963 = (f2966 + 3) % 128;
            String strM2816 = m2816(str, jSONArray.optString(i10), z10);
            if (strM2816 != null) {
                return strM2816;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2823(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        f2963 = (f2966 + 89) % 128;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            f2966 = (f2963 + 109) % 128;
            arrayList.addAll(m2820(str, jSONArray.optString(i10), false));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2826(String str) {
        f2966 = (f2963 + 101) % 128;
        if (TextUtils.isEmpty(str)) {
            f2963 = (f2966 + 31) % 128;
            return false;
        }
        return str.matches(m2824(8 - ImageFormat.getBitsPerPixel(0), (char) (7089 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 14).intern());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2824(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2964[i10 + i12]) ^ (((long) i12) * f2965)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2816(String str, String str2, boolean z10) {
        if (z10) {
            int i10 = f2963 + 83;
            f2966 = i10 % 128;
            if (i10 % 2 == 0) {
                m2818(str2);
                throw null;
            }
            str2 = m2818(str2);
        }
        List<String> listM2820 = m2820(str, str2, true);
        if (listM2820.size() <= 0) {
            return null;
        }
        int i11 = f2963 + 79;
        f2966 = i11 % 128;
        return i11 % 2 == 0 ? listM2820.get(1) : listM2820.get(0);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m2819(String str, String str2) {
        int length;
        int i10;
        int i11 = f2966 + SignalKey.EVENT_ID;
        f2963 = i11 % 128;
        if (i11 % 2 != 0) {
            length = str.length() % str2.length();
            i10 = 1;
        } else {
            length = str.length() - str2.length();
            i10 = 0;
        }
        return str.substring(i10, length);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2821(String str) {
        f2963 = (f2966 + 105) % 128;
        if (t.m2952()) {
            f2963 = (f2966 + 61) % 128;
            return false;
        }
        try {
            new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
            f2963 = (f2966 + 45) % 128;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m2817(String str, int i10) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        f2966 = (f2963 + 55) % 128;
        if (str.length() <= 0 || str.length() > i10) {
            return false;
        }
        f2963 = (f2966 + 45) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static String m2815(String str) {
        if (str != null && !t.m2952()) {
            f2966 = (f2963 + 73) % 128;
            if (m2821(str)) {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    f2963 = (f2966 + 117) % 128;
                    int i10 = 0;
                    while (true) {
                        int i11 = gZIPInputStream.read(bArr, i10, 8192 - i10);
                        if (i11 != -1) {
                            f2966 = (f2963 + 81) % 128;
                            i10 += i11;
                        } else {
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return new String(bArr, m2824(ExpandableListView.getPackedPositionGroup(0L) + 40, (char) (TextUtils.indexOf("", "", 0, 0) + 3764), ((Process.getThreadPriority(0) + 20) >> 6) + 5).intern());
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}
