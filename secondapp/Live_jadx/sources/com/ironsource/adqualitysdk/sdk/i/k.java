package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2937 = {'\n', 57064, 17315, 58414, 1695, 43826, 52734, 28276, 37059, 13634, 22068, 63713, 7472, 49029, 8256, 17140, 59216, 2509, 43704, 53045, 29064, 37467, 13489};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2938 = -7004983622510535312L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2939 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2940;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m2763(String str, String str2) {
        f2939 = (f2940 + 77) % 128;
        m2767(str, str, str2);
        int i10 = f2940 + 57;
        f2939 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static void m2764(String str, String str2) {
        f2940 = (f2939 + 121) % 128;
        m2777(str, str2, (Object) null);
        f2939 = (f2940 + 101) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2765(String str, String str2) {
        f2939 = (f2940 + 87) % 128;
        m2785(str, str2, null);
        f2940 = (f2939 + 13) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2772() {
        f2939 = (f2940 + 21) % 128;
        boolean zM2934 = s.m2906().m2934();
        int i10 = f2939 + 121;
        f2940 = i10 % 128;
        if (i10 % 2 == 0) {
            return zM2934;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static ISAdQualityLogLevel m2773() {
        int i10 = f2939 + 25;
        f2940 = i10 % 128;
        if (i10 % 2 == 0) {
            return s.m2906().m2935();
        }
        s.m2906().m2935();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2783(String str, String str2, boolean z10) {
        f2940 = (f2939 + 17) % 128;
        m2770(str, str, str2, z10);
        f2940 = (f2939 + 25) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2785(String str, String str2, Throwable th2) {
        f2939 = (f2940 + 101) % 128;
        m2768(str, str, str2, th2, false);
        int i10 = f2940 + 43;
        f2939 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r6 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (m2773().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.f2939 = (com.ironsource.adqualitysdk.sdk.i.k.f2940 + 67) % 128;
        android.util.Log.e(m2775(r3), r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.i.k.f2940 + 13;
        com.ironsource.adqualitysdk.sdk.i.k.f2939 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m2772() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m2772() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        android.util.Log.e(m2775(r2), r4, r5);
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2768(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.Throwable r5, boolean r6) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f2939
            int r0 = r0 + 11
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2940 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            boolean r0 = m2772()
            r1 = 65
            int r1 = r1 / 0
            if (r0 == 0) goto L25
            goto L1d
        L17:
            boolean r0 = m2772()
            if (r0 == 0) goto L25
        L1d:
            java.lang.String r2 = m2775(r2)
            android.util.Log.e(r2, r4, r5)
            return
        L25:
            if (r6 == 0) goto L42
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r2 = m2773()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r6 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.ERROR
            boolean r2 = r2.shouldPrintLog(r6)
            if (r2 == 0) goto L42
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2940
            int r2 = r2 + 67
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2939 = r2
            java.lang.String r2 = m2775(r3)
            android.util.Log.e(r2, r4, r5)
        L42:
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2940
            int r2 = r2 + 13
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2939 = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L4f
            return
        L4f:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m2768(java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable, boolean):void");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2769(String str, String str2) {
        int i10 = f2940 + 91;
        f2939 = i10 % 128;
        int i11 = i10 % 2;
        m2771(str, str2, null);
        if (i11 == 0) {
            int i12 = 47 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2779(String str, String str2, Throwable th2, boolean z10) {
        f2939 = (f2940 + 79) % 128;
        m2768(str, str, str2, th2, z10);
        f2940 = (f2939 + 53) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2782(String str, String str2, String str3, boolean z10) {
        if (m2772()) {
            int i10 = f2939 + 21;
            f2940 = i10 % 128;
            if (i10 % 2 == 0) {
                Log.i(m2775(str), str3);
                return;
            } else {
                Log.i(m2775(str), str3);
                throw null;
            }
        }
        if (z10 && m2773().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            f2939 = (f2940 + 41) % 128;
            Log.i(m2775(str2), str3);
        }
        int i11 = f2939 + 9;
        f2940 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2784(String str, String str2) {
        f2939 = (f2940 + 3) % 128;
        m2782(str, str, str2, false);
        f2940 = (f2939 + 93) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2771(String str, String str2, Throwable th2) {
        f2939 = (f2940 + 41) % 128;
        m2768(str, str, str2, th2, true);
        int i10 = f2940 + 103;
        f2939 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2776(String str, String str2) {
        f2940 = (f2939 + 59) % 128;
        m2782(str, str, str2, true);
        int i10 = f2939 + 125;
        f2940 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2770(String str, String str2, String str3, boolean z10) {
        int i10 = f2940 + 85;
        f2939 = i10 % 128;
        int i11 = i10 % 2;
        m2768(str, str2, str3, null, z10);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2777(String str, String str2, Object obj) {
        f2940 = (f2939 + 111) % 128;
        m2778(str, str, str2, obj, false);
        f2940 = (f2939 + 73) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2778(String str, String str2, String str3, Object obj, boolean z10) {
        f2939 = (f2940 + 33) % 128;
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m2774((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            sb2.append(obj.toString());
            str3 = sb2.toString();
        }
        if (m2772()) {
            Log.d(m2775(str), str3);
            return;
        }
        if (z10) {
            f2939 = (f2940 + 47) % 128;
            if (m2773().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
                Log.d(m2775(str2), str3);
                f2939 = (f2940 + 91) % 128;
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2766(String str, String str2, Object obj) {
        int i10 = f2940 + 7;
        f2939 = i10 % 128;
        int i11 = i10 % 2;
        m2781(str, str, str2, obj);
        if (i11 == 0) {
            throw null;
        }
        f2939 = (f2940 + 113) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        if (m2773().shouldPrintLog(com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.k.f2940 = (com.ironsource.adqualitysdk.sdk.i.k.f2939 + 87) % 128;
        android.util.Log.v(m2775(r3), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (m2772() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (m2772() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        android.util.Log.v(m2775(r2), r4);
        com.ironsource.adqualitysdk.sdk.i.k.f2940 = (com.ironsource.adqualitysdk.sdk.i.k.f2939 + 117) % 128;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m2767(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.k.f2940
            int r0 = r0 + 115
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2939 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L17
            boolean r0 = m2772()
            r1 = 15
            int r1 = r1 / 0
            if (r0 == 0) goto L2d
            goto L1d
        L17:
            boolean r0 = m2772()
            if (r0 == 0) goto L2d
        L1d:
            java.lang.String r2 = m2775(r2)
            android.util.Log.v(r2, r4)
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2939
            int r2 = r2 + 117
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2940 = r2
            return
        L2d:
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r2 = m2773()
            com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel r0 = com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel.VERBOSE
            boolean r2 = r2.shouldPrintLog(r0)
            if (r2 == 0) goto L48
            int r2 = com.ironsource.adqualitysdk.sdk.i.k.f2939
            int r2 = r2 + 87
            int r2 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.k.f2940 = r2
            java.lang.String r2 = m2775(r3)
            android.util.Log.v(r2, r4)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.k.m2767(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2780(String str, String str2) {
        f2939 = (f2940 + 123) % 128;
        m2781(str, str, str2, (Object) null);
        f2940 = (f2939 + 109) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2781(String str, String str2, String str3, Object obj) {
        int i10 = f2940 + 81;
        f2939 = i10 % 128;
        m2778(str, str2, str3, obj, i10 % 2 != 0);
        f2939 = (f2940 + 47) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2775(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2774((char) (56993 - View.resolveSize(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, 22 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb2.append(str);
        String string = sb2.toString();
        f2939 = (f2940 + 101) % 128;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2774(char c10, int i10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2937[i10 + i12]) ^ (((long) i12) * f2938)) ^ ((long) c10));
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
}
