package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ai implements Comparable<ai> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f284 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f285 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f286 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f287 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f288 = 244;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f289 = {360, 359, 345, 354, 356, 352, 347, 361, 349, 344};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jb f290;

    public ai(jb jbVar) {
        this.f290 = jbVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private long m364() {
        JSONObject jSONObjectM371;
        int i10;
        int i11 = f284 + 21;
        f285 = i11 % 128;
        if (i11 % 2 != 0) {
            jSONObjectM371 = m371();
            i10 = 109 << (TypedValue.complexToFraction(0, 2.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 2.0f, 2.0f) == 0.0f ? 0 : -1));
        } else {
            jSONObjectM371 = m371();
            i10 = 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
        }
        long jOptInt = jSONObjectM371.optInt(m367(null, i10, null, "\u0084\u0083").intern());
        f284 = (f285 + 119) % 128;
        return jOptInt;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m365() {
        int i10 = f285 + 95;
        f284 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f290.m2551();
        }
        this.f290.m2551();
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private long m366() {
        f284 = (f285 + 75) % 128;
        long jOptLong = m371().optLong(m367(null, View.MeasureSpec.getSize(0) + 127, null, "\u0082\u0081").intern());
        f285 = (f284 + 79) % 128;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<String> m368() {
        List<String> listAsList;
        int i10 = f285 + 113;
        f284 = i10 % 128;
        if (i10 % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = ih.f2506;
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = Arrays.asList(ih.f2506);
        }
        f284 = (f285 + 51) % 128;
        return listAsList;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ai aiVar) {
        f285 = (f284 + 85) % 128;
        int iM370 = m370(aiVar);
        f284 = (f285 + 115) % 128;
        return iM370;
    }

    public final boolean equals(Object obj) {
        int i10 = f285 + 75;
        f284 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 14 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj != null && ai.class == obj.getClass()) {
            return m365().equals(((ai) obj).m365());
        }
        f285 = (f284 + 55) % 128;
        return false;
    }

    public final int hashCode() {
        if (m371() == null) {
            f284 = (f285 + 113) % 128;
            return 0;
        }
        f285 = (f284 + 111) % 128;
        int iHashCode = m371().hashCode();
        int i10 = f285 + 73;
        f284 = i10 % 128;
        if (i10 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        f284 = (f285 + 45) % 128;
        String string = m371().toString();
        int i10 = f284 + 79;
        f285 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 16 / 0;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized JSONObject m371() {
        JSONObject jSONObjectM2552;
        f285 = (f284 + 91) % 128;
        jSONObjectM2552 = this.f290.m2552();
        int i10 = f284 + 81;
        f285 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jSONObjectM2552;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m373() {
        JSONObject jSONObjectM371;
        int iIndexOf;
        int i10 = f285 + 37;
        f284 = i10 % 128;
        if (i10 % 2 == 0) {
            jSONObjectM371 = m371();
            iIndexOf = 113 << TextUtils.indexOf("", "", 0, 0);
        } else {
            jSONObjectM371 = m371();
            iIndexOf = TextUtils.indexOf("", "", 0, 0) + 127;
        }
        return jSONObjectM371.optString(m367(null, iIndexOf, null, "\u0084\u0087\u0086\u0085").intern());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m375() {
        f284 = (f285 + 87) % 128;
        String strOptString = m371().optString(m367(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u008a\u0089\u0088").intern(), null);
        int i10 = f284 + 15;
        f285 = i10 % 128;
        if (i10 % 2 == 0) {
            return strOptString;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final jb m376() {
        int i10 = f284;
        jb jbVar = this.f290;
        f285 = (i10 + 17) % 128;
        return jbVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m367(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            try {
                char[] cArr2 = f289;
                int i11 = f288;
                if (f287) {
                    int length = bArr.length;
                    m.f2990 = length;
                    char[] cArr3 = new char[length];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i12 = m.f2989;
                        int i13 = m.f2990 - 1;
                        int i14 = m.f2989;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        m.f2989 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f286) {
                    int length2 = cArr.length;
                    m.f2990 = length2;
                    char[] cArr4 = new char[length2];
                    m.f2989 = 0;
                    while (m.f2989 < m.f2990) {
                        int i15 = m.f2989;
                        int i16 = m.f2990 - 1;
                        int i17 = m.f2989;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        m.f2989 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                m.f2990 = length3;
                char[] cArr5 = new char[length3];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i18 = m.f2989;
                    int i19 = m.f2990 - 1;
                    int i20 = m.f2989;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    m.f2989 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int m370(ai aiVar) {
        f285 = (f284 + 91) % 128;
        long jM366 = m366();
        long jM367 = aiVar.m366();
        if (jM366 < jM367) {
            f285 = (f284 + 57) % 128;
            return -1;
        }
        if (jM366 == jM367) {
            return m369(aiVar);
        }
        return 1;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m372(int i10) {
        try {
            f284 = (f285 + 51) % 128;
            if (this.f290.m2552() != null) {
                int i11 = f284 + 19;
                f285 = i11 % 128;
                if (i11 % 2 != 0) {
                    jz.m2753(this.f290.m2552(), i10, m368());
                    throw null;
                }
                jz.m2753(this.f290.m2552(), i10, m368());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m374(String str) throws UnsupportedEncodingException {
        JSONObject jSONObjectM371;
        String strM367;
        int i10 = f285 + 29;
        f284 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                jSONObjectM371 = m371();
                strM367 = m367(null, 25768 - (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            } else {
                jSONObjectM371 = m371();
                strM367 = m367(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008a\u0089\u0088");
            }
            jSONObjectM371.put(strM367.intern(), str);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int m369(ai aiVar) {
        long jM364 = m364();
        long jM365 = aiVar.m364();
        if (jM364 >= jM365) {
            if (jM364 != jM365) {
                return 1;
            }
            f285 = (f284 + 19) % 128;
            return 0;
        }
        int i10 = f284 + 111;
        f285 = i10 % 128;
        if (i10 % 2 == 0) {
            return -1;
        }
        int i11 = 73 / 0;
        return -1;
    }
}
