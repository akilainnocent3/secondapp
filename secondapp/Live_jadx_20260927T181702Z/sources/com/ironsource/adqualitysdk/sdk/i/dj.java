package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media.AudioAttributesCompat;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class dj extends cz implements cl {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1739 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1741 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1749;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1750;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1752;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1746 = {3780, 55073, 48418, 33580, 26889, 20239, 5396, 64381, 49527, 42858, 'b', 55703, 45954, 36236, 26557, 16828, 2020, 56858, 46081, 35330, 24624, 17971, 7204, 62044, 51287, 44545, 25051, 47163, 53808, 60423, 1557, 8194, 31237, 38003, 44652, 51307, 57936, 15476, 22085, 28834, 35499, 42157, 65210, 6293, 12970, 19595, 26365, 32995, 'g', 55699, 45976, 36259, 26556, 16796, 7073, 62924, 53205, 43464, 33769, 24055, 16835, 38967, 62012, 52239, 9743, fw.b.f85380g, 23061, 46194, 36472, 59505, 49755, 7236, 30281, 20671, 43710, 33935, 56992, 33365, 23457, 12714, 3993, 58777, 50111, 39299, 30715, 19958, 11259, 451, 'g', 55699, 45976, 36256, 26538, 16801, 7077, 62942, 53203, 43463, 33775, 24038, 14285, 4360, 60177, 50436, 40724, 31000, 21293, 11567, 1885};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1744 = 1655881082737973750L;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f1740 = true;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1742 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1745 = AudioAttributesCompat.O;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1743 = {319, 388, 374, 389, 340, 384, 383, 372, 387, 351, 370, 382, 376, 350, 373, 378, 392, 380, 338, 355, 391, 390, 346, 343, 381, 353, 347};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1751 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private double f1748 = -1.0d;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f1747 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1906() {
        String strIntern;
        int i10 = f1741 + 33;
        f1739 = i10 % 128;
        if (i10 % 2 != 0) {
            m1907();
            throw null;
        }
        if (m1907()) {
            strIntern = m1912(View.resolveSize(0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 3746), 10 - TextUtils.indexOf("", "", 0, 0)).intern();
            f1739 = (f1741 + 117) % 128;
        } else {
            strIntern = m1912(Process.getGidForName("") + 11, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m1912((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1929), 10 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb2.append(this.f1751);
        sb2.append(m1913(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u0081").intern());
        sb2.append(strIntern);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean m1907() {
        int i10 = f1739 + 53;
        f1741 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1749;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1908() {
        int i10 = f1739;
        String str = this.f1750;
        f1741 = (i10 + 21) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1910() {
        int i10 = f1741 + 121;
        f1739 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1751;
        }
        int i11 = 54 / 0;
        return this.f1751;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Double m1911() {
        int i10 = f1741 + 95;
        f1739 = i10 % 128;
        if (i10 % 2 == 0) {
            return Double.valueOf(this.f1748);
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1914(boolean z10) {
        int i10 = f1739;
        this.f1749 = z10;
        int i11 = i10 + 93;
        f1741 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 89 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1916(String str) {
        int i10 = (f1739 + 61) % 128;
        f1741 = i10;
        this.f1751 = str;
        f1739 = (i10 + 95) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1917(String str) {
        int i10 = (f1739 + 89) % 128;
        f1741 = i10;
        this.f1752 = str;
        f1739 = (i10 + 111) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1909() {
        int i10 = f1739 + 113;
        f1741 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1752;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1912(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1746[i10 + i12]) ^ (((long) i12) * f1744)) ^ ((long) c10));
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m1915() {
        int i10 = f1739;
        boolean z10 = this.f1747;
        f1741 = (i10 + 25) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1919(Double d10) {
        f1739 = (f1741 + 61) % 128;
        this.f1748 = d10.doubleValue();
        int i10 = f1741 + 71;
        f1739 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m1921() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(ih.f2542, this.f1752);
            double d10 = this.f1748;
            if (d10 > -1.0d) {
                int i10 = f1741 + 25;
                f1739 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject2.put(ih.f2491, d10);
                    throw null;
                }
                jSONObject2.put(ih.f2491, d10);
            }
            jSONObject2.put(ih.f2494, this.f1750);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                if (this.f1747) {
                    f1739 = (f1741 + 37) % 128;
                    jSONObject2.put(ih.f2490, true);
                    f1741 = (f1739 + 89) % 128;
                }
                jSONObject.put(ih.f2493, jSONObject2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m1918(boolean z10) {
        int i10 = (f1741 + 91) % 128;
        f1739 = i10;
        this.f1747 = z10;
        f1741 = (i10 + 37) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m1920(String str) {
        int i10 = (f1739 + 43) % 128;
        f1741 = i10;
        this.f1750 = str;
        f1739 = (i10 + 115) % 128;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009c, code lost:
    
        if (r6.equals(m1912(78 - (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)), (char) (android.view.KeyEvent.keyCodeFromString("") + 33330), 11 - (android.view.ViewConfiguration.getScrollBarSize() >> 8)).intern()) != false) goto L25;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo767(java.lang.String r6, java.util.List<java.lang.Object> r7, com.ironsource.adqualitysdk.sdk.i.ch r8) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dj.mo767(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1913(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f1743;
                int i11 = f1745;
                if (f1742) {
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
                if (f1740) {
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
}
