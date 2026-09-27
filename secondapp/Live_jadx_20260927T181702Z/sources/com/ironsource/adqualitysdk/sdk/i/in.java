package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.Intent;
import com.vungle.ads.internal.signals.SignalKey;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class in {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f2576 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2577 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2578 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2579;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2580;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, Integer> f2581;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2582;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<String, Integer> f2583;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<String, Object> f2584;

    static {
        m2467();
        f2584 = new HashMap();
        f2581 = new HashMap();
        f2583 = new HashMap();
        f2577 = (f2578 + 87) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2465(Context context, String str, JSONObject jSONObject, Object... objArr) {
        ij.m2452(context).m2457(new Intent(str).putExtra(ih.f2495, jSONObject.toString()));
        int i10 = f2578 + SignalKey.EVENT_ID;
        f2577 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2466(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            try {
                char[] cArr2 = new char[cArr.length];
                n.f2991 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = n.f2991;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c10 = cArr3[1];
                            char c11 = cArr3[0];
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2576)) ^ ((c11 >>> 5) + f2579)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2580) ^ ((c12 + i12) ^ ((c12 << 4) + f2582))));
                            i12 -= 40503;
                        }
                        int i14 = n.f2991;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        n.f2991 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2467() {
        f2576 = (char) 49744;
        f2580 = (char) 42214;
        f2579 = (char) 16025;
        f2582 = (char) 21861;
    }
}
