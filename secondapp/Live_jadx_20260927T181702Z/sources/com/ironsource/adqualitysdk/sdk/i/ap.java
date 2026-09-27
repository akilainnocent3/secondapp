package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ap extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f352 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f353 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f354 = -634914241;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f355;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f356;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m429(String str, char c10, String str2, int i10, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            try {
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
                cArr4[0] = (char) (c10 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr3.length;
                char[] cArr6 = new char[length];
                j.f2675 = 0;
                while (true) {
                    int i11 = j.f2675;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c11 = cArr5[i12];
                        char c12 = (char) ((i14 + c11) % 65535);
                        j.f2674 = c12;
                        cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                        cArr4[i13] = c12;
                        int i15 = j.f2675;
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f352) ^ ((long) f354)) ^ ((long) f356));
                        j.f2675 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r0.opt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ap.f355 = (com.ironsource.adqualitysdk.sdk.i.ap.f353 + 101) % 128;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m430(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.ap.f353
            int r0 = r0 + 53
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ap.f355 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L17
            org.json.JSONObject r0 = r2.m432()
            r1 = 49
            int r1 = r1 / 0
            if (r0 != 0) goto L27
            goto L1d
        L17:
            org.json.JSONObject r0 = r2.m432()
            if (r0 != 0) goto L27
        L1d:
            int r3 = com.ironsource.adqualitysdk.sdk.i.ap.f353
            int r3 = r3 + 101
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.ap.f355 = r3
            r3 = 0
            return r3
        L27:
            java.lang.Object r3 = r0.opt(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ap.m430(java.lang.String):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m431() {
        f353 = (f355 + 109) % 128;
        String strOptString = m472().optString(m429("䀆횊ꊹ", (char) (42876 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", 1321286499 - Color.green(0), "揷섻籎Ꭷ").intern());
        int i10 = f353 + 79;
        f355 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m432() {
        f353 = (f355 + 77) % 128;
        JSONObject jSONObjectOptJSONObject = m472().optJSONObject(m429("佾㒫䀜妦赇곜", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 47601), "\u0000\u0000\u0000\u0000", ViewConfiguration.getMinimumFlingVelocity() >> 16, "嚙寉\uf1b8Ჹ").intern());
        int i10 = f355 + 41;
        f353 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
        }
        return jSONObjectOptJSONObject;
    }
}
