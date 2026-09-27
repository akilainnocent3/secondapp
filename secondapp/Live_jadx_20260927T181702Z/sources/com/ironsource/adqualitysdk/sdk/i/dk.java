package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class dk extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1753 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1754 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1756 = 1310500565;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1758 = null;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1759 = 103;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1760 = 1435268900;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn f1761;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private hn f1763;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f1757 = {40, 93, 62, 83, 37, 82, 94, 41, 63, -128, 48, 97, 2, 53, 28, 47, 57, 1, 51, -29, 84, 10, 57, -128, -126, 48, 122, 122, zi.c.B, -128, zi.c.H, -121, 126, 58, 106, 125, 28, 41, 106, -127, 52, 92, zi.c.D, -119, -67, 74, -93, 80, l3.a.f103452q7, 79, 67, -66, -92, 85, l3.a.f103436o7, l3.a.f103444p7, -97, 4, -88, -89, 8, 3, l3.a.f103452q7, -85, -16, -72, zi.c.C, zi.c.f161648z, 118, -109, 89, f6.q.A, -124, -106, 91, -128, 125, -113, -115, 63, -123, -123, 103, -113, 105, -106, -119, 69, -91, 101, -120, 84, 3, -9, 80, 86, -15, -4, 87, 2, 84, 3, -9, 80, 86, zi.c.C, 73, 4, -123, rg.a.f127263w, -124, -119, -93, 106, 125, -92, 119, -127, -119, 123, -85, 92, -110, 117, -15, -32, -28, -19, 3, l3.a.f103529z7, -23, 4, -33, -27, -19, -37, zi.c.f161635m, -68, -10, -27, 97, 78, 82, 93, 115, 60, 89, 114, yr.a.f159811k, 105, 94, 88, 112, 65, f6.q.f83619w, 81, 69, -72, -60, 73, 99, -86, -67, f6.q.f83619w, -87, 77, 72, -66, 86, -91, 82, l3.a.f103444p7, -43, 4, 0, l3.a.E7, -33, -6, -3, -32, -6, 2, l3.a.A7, -35, 40, -46, 5, -90, 121, -123, -86, -92, -117, 126, -91, -117, -125, -76, -98, 93, -77, -126, -22, 55, 67, -18, -28, 77, 66, -29, 55, 58, -41, -26, 37, 62, zi.c.f161639q, zi.c.A, -11, 58, -67, l3.a.f103436o7, zi.c.f161635m, l3.a.f103484u7, 34, -77, -65, 38, 32, l3.a.f103529z7, l3.a.f103520y7, 47, -73, 17, l3.a.f103436o7, -79, 13, -19, 45, -66, -48, -47, -122, -76, -44, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int[] f1755 = {72526405, 498935741, 1850971941, 1462439246, -2132092223, 1708160554, -395663865, 1925863166, 681729306, 1944994731, 1568739955, -1563559347, -1507877317, 2004252735, 1293346952, -1201631360, 458925985, 1781078698};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final List<String> f1766 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f1765 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<String> f1764 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final List<String> f1767 = new ArrayList();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final List<String> f1768 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject f1762 = new JSONObject();

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private JSONObject m1922() {
        JSONObject jSONObject = new JSONObject();
        try {
            hn hnVar = this.f1761;
            if (hnVar != null) {
                f1754 = (f1753 + 33) % 128;
                jSONObject.put(ih.f2528, hnVar.m2223());
            }
            hn hnVar2 = this.f1763;
            if (hnVar2 != null) {
                f1753 = (f1754 + 89) % 128;
                jSONObject.put(ih.f2522, hnVar2.m2223());
            }
            if (this.f1766.size() > 0) {
                jSONObject.put(ih.f2520, new JSONArray((Collection) this.f1766));
                f1753 = (f1754 + 87) % 128;
            }
            if (this.f1765.size() > 0) {
                jSONObject.put(ih.f2516, new JSONArray((Collection) this.f1765));
            }
            if (this.f1764.size() > 0) {
                jSONObject.put(ih.f2515, new JSONArray((Collection) this.f1764));
                f1754 = (f1753 + 19) % 128;
            }
            if (this.f1767.size() > 0) {
                jSONObject.put(ih.f2523, new JSONArray((Collection) this.f1767));
            }
            if (this.f1768.size() > 0) {
                jSONObject.put(ih.f2524, new JSONArray((Collection) this.f1768));
            }
            if (this.f1762.length() > 0) {
                int i10 = f1753 + 41;
                f1754 = i10 % 128;
                if (i10 % 2 != 0) {
                    jSONObject.putOpt(ih.f2521, this.f1762.toString());
                    int i11 = 30 / 0;
                } else {
                    jSONObject.putOpt(ih.f2521, this.f1762.toString());
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String m1923() {
        int i10 = f1753 + 91;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            this.f1762.optString(ih.f2511);
            throw null;
        }
        String strOptString = this.f1762.optString(ih.f2511);
        f1753 = (f1754 + 23) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private String m1924() {
        f1754 = (f1753 + 87) % 128;
        String strOptString = this.f1762.optString(ih.f2523);
        f1753 = (f1754 + 47) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private JSONObject m1925() {
        int i10 = f1753 + 53;
        f1754 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1762;
        }
        int i11 = 38 / 0;
        return this.f1762;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String m1926() {
        f1754 = (f1753 + 53) % 128;
        String strOptString = this.f1762.optString(ih.f2515);
        int i10 = f1754 + 33;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 10 / 0;
        }
        return strOptString;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m1928(String str) {
        f1754 = (f1753 + 19) % 128;
        try {
            this.f1762.put(ih.f2511, str);
            int i10 = f1753 + 101;
            f1754 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private hn m1929() {
        int i10 = f1753;
        hn hnVar = this.f1761;
        f1754 = (i10 + 15) % 128;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1931() {
        String strOptString;
        int i10 = f1753 + 47;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            strOptString = this.f1762.optString(ih.f2524);
            int i11 = 42 / 0;
        } else {
            strOptString = this.f1762.optString(ih.f2524);
        }
        f1753 = (f1754 + 73) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1933() {
        f1753 = (f1754 + 109) % 128;
        String strOptString = this.f1762.optString(ih.f2520);
        f1753 = (f1754 + 69) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private hn m1935() {
        int i10 = f1754 + 1;
        int i11 = i10 % 128;
        f1753 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        hn hnVar = this.f1763;
        f1754 = (i11 + 81) % 128;
        return hnVar;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1937() {
        f1753 = (f1754 + 57) % 128;
        String strOptString = this.f1762.optString(ih.f2516);
        f1754 = (f1753 + 73) % 128;
        return strOptString;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> m1940() {
        int i10 = f1753 + 45;
        f1754 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1767;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<String> m1944() {
        int i10 = f1753;
        int i11 = i10 + 77;
        f1754 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        List<String> list = this.f1764;
        f1754 = (i10 + 15) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> m1950() {
        int i10 = (f1753 + 33) % 128;
        f1754 = i10;
        List<String> list = this.f1768;
        f1753 = (i10 + 33) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<String> m1955() {
        int i10 = f1753 + 117;
        f1754 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1766;
        }
        int i11 = 84 / 0;
        return this.f1766;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<String> m1958() {
        int i10 = f1754;
        List<String> list = this.f1765;
        int i11 = i10 + 27;
        f1753 = i11 % 128;
        if (i11 % 2 != 0) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1930(String str) {
        int i10 = f1753 + 113;
        f1754 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1762.put(ih.f2515, str);
                throw null;
            }
            this.f1762.put(ih.f2515, str);
            f1753 = (f1754 + 7) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1932(String str) {
        f1754 = (f1753 + 27) % 128;
        try {
            this.f1762.put(ih.f2516, str);
            int i10 = f1754 + 17;
            f1753 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1934(String str) {
        int i10 = f1753 + 89;
        f1754 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f1762.put(ih.f2520, str);
                int i11 = 5 / 0;
            } else {
                this.f1762.put(ih.f2520, str);
            }
            f1754 = (f1753 + 33) % 128;
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1936(String str) {
        f1753 = (f1754 + 57) % 128;
        try {
            this.f1762.put(ih.f2524, str);
            int i10 = f1754 + 125;
            f1753 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 80 / 0;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1938(String str) {
        f1753 = (f1754 + 59) % 128;
        try {
            this.f1762.put(ih.f2523, str);
            int i10 = f1753 + 15;
            f1754 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1943(List<String> list) {
        int i10 = f1754 + 29;
        f1753 = i10 % 128;
        if (i10 % 2 != 0) {
            m1948(list, this.f1765);
        } else {
            m1948(list, this.f1765);
            int i11 = 78 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1946(String str) {
        f1754 = (f1753 + 9) % 128;
        m1942(str, this.f1764);
        int i10 = f1753 + 101;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1952(String str) {
        f1753 = (f1754 + 47) % 128;
        m1942(str, this.f1768);
        int i10 = f1754 + 45;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1956(String str) {
        int i10 = f1754 + 67;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            m1942(str, this.f1765);
            throw null;
        }
        m1942(str, this.f1765);
        int i11 = f1753 + 3;
        f1754 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1959(String str) {
        f1753 = (f1754 + 61) % 128;
        m1942(str, this.f1766);
        int i10 = f1754 + 113;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1941(String str) {
        f1754 = (f1753 + 55) % 128;
        m1942(str, this.f1767);
        int i10 = f1753 + 9;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1947(List<String> list) {
        int i10 = f1753 + 121;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            m1948(list, this.f1767);
            int i11 = 25 / 0;
        } else {
            m1948(list, this.f1767);
        }
        f1754 = (f1753 + 89) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1953(List<String> list) {
        int i10 = f1754 + 27;
        f1753 = i10 % 128;
        if (i10 % 2 == 0) {
            m1948(list, this.f1768);
            int i11 = 43 / 0;
        } else {
            m1948(list, this.f1768);
        }
        f1754 = (f1753 + 125) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1957(List<String> list) {
        f1753 = (f1754 + 39) % 128;
        m1948(list, this.f1764);
        int i10 = f1753 + 61;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 81 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1960(List<String> list) {
        f1753 = (f1754 + 69) % 128;
        m1948(list, this.f1766);
        int i10 = f1753 + 103;
        f1754 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Object m1927() {
        boolean z10;
        if (this.f1766.size() <= 0) {
            f1753 = (f1754 + 11) % 128;
            if (this.f1765.size() <= 0) {
                f1754 = (f1753 + 109) % 128;
                if (this.f1768.size() > 0) {
                    z10 = true;
                } else {
                    f1754 = (f1753 + 119) % 128;
                    z10 = false;
                }
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1942(String str, List<String> list) {
        if (list == null || TextUtils.isEmpty(str) || list.contains(str)) {
            return;
        }
        f1753 = (f1754 + 117) % 128;
        list.add(str);
        f1754 = (f1753 + 49) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1945(hn hnVar) {
        if (hnVar != null) {
            this.f1761 = hnVar;
            f1754 = (f1753 + 13) % 128;
        }
        f1754 = (f1753 + 53) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1951(hn hnVar) {
        int i10 = (f1753 + 9) % 128;
        f1754 = i10;
        if (hnVar != null) {
            f1753 = (i10 + 67) % 128;
            this.f1763 = hnVar;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m1954(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f1755.clone();
                e.f1913 = 0;
                while (true) {
                    int i11 = e.f1913;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c10 = (char) (i12 >> 16);
                        cArr[0] = c10;
                        char c11 = (char) i12;
                        cArr[1] = c11;
                        char c12 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c12;
                        char c13 = (char) iArr[i11 + 1];
                        cArr[3] = c13;
                        e.f1915 = (c10 << 16) + c11;
                        e.f1914 = (c12 << 16) + c13;
                        e.m2090(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = e.f1915 ^ iArr2[i13];
                            e.f1915 = i14;
                            e.f1914 = e.m2089(i14) ^ e.f1914;
                            int i15 = e.f1915;
                            e.f1915 = e.f1914;
                            e.f1914 = i15;
                        }
                        int i16 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i16;
                        e.f1914 = i16 ^ iArr2[16];
                        e.f1915 ^= iArr2[17];
                        int i17 = e.f1914;
                        int i18 = e.f1915;
                        cArr[0] = (char) (i18 >>> 16);
                        cArr[1] = (char) i18;
                        int i19 = e.f1914;
                        cArr[2] = (char) (i19 >>> 16);
                        cArr[3] = (char) i19;
                        e.m2090(iArr2);
                        int i20 = e.f1913;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        e.f1913 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1949(JSONObject jSONObject) {
        int i10 = f1754 + 57;
        f1753 = i10 % 128;
        int i11 = i10 % 2;
        this.f1762 = jz.m2749(jSONObject);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m1948(List<String> list, List<String> list2) {
        if (list != null) {
            f1753 = (f1754 + 105) % 128;
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                f1754 = (f1753 + 65) % 128;
                m1942(it.next(), list2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0134  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo767(String str, List<Object> list, ch chVar) {
        byte b10;
        int i10 = f1754 + 45;
        f1753 = i10 % 128;
        if (i10 % 2 != 0) {
            switch (str.hashCode()) {
                case -1836320845:
                    b10 = !str.equals(m1954(new int[]{-1199955862, 1665796584, -800765037, 467666026, 1760024477, 1669471029}, 12 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) ? (byte) -1 : (byte) 7;
                    break;
                case -1833890347:
                    b10 = !str.equals(m1954(new int[]{1627642633, -766880718, -1396347217, -875008559, -223056821, 557878031}, 11 - Gravity.getAbsoluteGravity(0, 0)).intern()) ? (byte) -1 : (byte) 9;
                    break;
                case -1803337567:
                    b10 = !str.equals(m1939((-1435268698) - Color.alpha(0), (short) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 105), Drawable.resolveOpacity(0, 0) - 1310500450, (byte) (81 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-84) - KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : zi.c.E;
                    break;
                case -1712168770:
                    b10 = !str.equals(m1954(new int[]{1627642633, -766880718, 269053700, -1575955648, -2013132287, -1227428115}, TextUtils.indexOf("", "", 0, 0) + 11).intern()) ? (byte) -1 : (byte) 14;
                    break;
                case -1409157227:
                    b10 = !str.equals(m1939((ViewConfiguration.getPressedStateDuration() >> 16) - 1435268900, (short) ((-66) - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1310500462, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) - 31), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 91).intern()) ? (byte) -1 : (byte) 0;
                    break;
                case -1362450249:
                    b10 = !str.equals(m1954(new int[]{-132134310, 2076327793, 821358382, -1586332438, 2071203230, -1998993296, -1242011475, 351498058}, 15 - View.getDefaultSize(0, 0)).intern()) ? (byte) -1 : (byte) 33;
                    break;
                case -1273813711:
                    b10 = !str.equals(m1939((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1435268761, (short) (38 - TextUtils.indexOf("", "", 0)), (-1310500449) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) ((-124) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-86) - TextUtils.getOffsetBefore("", 0)).intern()) ? (byte) -1 : zi.c.A;
                    break;
                case -1249364341:
                    b10 = !str.equals(m1954(new int[]{-964166878, -655071619, -1105723839, -578874637}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6).intern()) ? (byte) -1 : (byte) 31;
                    break;
                case -1245993915:
                    b10 = !str.equals(m1939(((byte) KeyEvent.getModifierMetaStateMask()) - 1435268775, (short) ((-107) - Color.green(0)), Gravity.getAbsoluteGravity(0, 0) - 1310500462, (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 124), (Process.myTid() >> 22) - 86).intern()) ? (byte) -1 : (byte) 22;
                    break;
                case -1190960472:
                    b10 = !str.equals(m1939((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1435268681, (short) (ExpandableListView.getPackedPositionGroup(0L) - 113), (-1310500462) - ExpandableListView.getPackedPositionType(0L), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 77), (-81) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern()) ? (byte) -1 : zi.c.G;
                    break;
                case -1099149698:
                    b10 = !str.equals(m1939((-1435268877) - View.MeasureSpec.makeMeasureSpec(0, 0), (short) (KeyEvent.getDeadChar(0, 0) + 53), KeyEvent.keyCodeFromString("") - 1310500462, (byte) (64 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), View.MeasureSpec.getSize(0) - 81).intern()) ? (byte) -1 : (byte) 6;
                    break;
                case -1091371232:
                    b10 = !str.equals(m1939((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1435268856, (short) (125 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1310500468, (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 61), (Process.myTid() >> 22) - 90).intern()) ? (byte) -1 : (byte) 8;
                    break;
                case -1016025794:
                    b10 = !str.equals(m1954(new int[]{1627642633, -766880718, -1396347217, -875008559, -2059605302, 2031954964}, (ViewConfiguration.getPressedStateDuration() >> 16) + 12).intern()) ? (byte) -1 : (byte) 10;
                    break;
                case -924327250:
                    b10 = !str.equals(m1954(new int[]{-873379211, 1921296910, -315179222, 1534064542, 524488284, -575527758, -1182513729, -764577917}, 14 - View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 12;
                    break;
                case -905814529:
                    b10 = !str.equals(m1954(new int[]{852086821, 1119805024, -1105723839, -578874637}, 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 32;
                    break;
                case -890333697:
                    if (!str.equals(m1954(new int[]{-164680244, 608842177, 821358382, -1586332438, -1006538095, 769731358, -773590697, -158632438}, 14 - TextUtils.lastIndexOf("", '0', 0)).intern())) {
                        b10 = -1;
                    } else {
                        int i11 = f1754 + 37;
                        f1753 = i11 % 128;
                        if (i11 % 2 != 0) {
                            b10 = 5;
                        } else {
                            b10 = 2;
                        }
                    }
                    break;
                case -887729623:
                    b10 = !str.equals(m1939((-1435268888) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) ((-28) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1310500462, (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 30), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 91).intern()) ? (byte) -1 : (byte) 1;
                    break;
                case -869156349:
                    b10 = !str.equals(m1939((ViewConfiguration.getTapTimeout() >> 16) - 1435268660, (short) (ExpandableListView.getPackedPositionGroup(0L) + 97), Drawable.resolveOpacity(0, 0) - 1310500449, (byte) ((-50) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (-97) - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) ? (byte) -1 : (byte) 34;
                    break;
                case -747967915:
                    b10 = !str.equals(m1939((-1435268832) - TextUtils.indexOf("", ""), (short) ((-120) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Color.rgb(0, 0, 0) - 1293723252, (byte) ('7' - AndroidCharacter.getMirror('0')), (-93) - (ViewConfiguration.getScrollBarSize() >> 8)).intern()) ? (byte) -1 : (byte) 13;
                    break;
                case -333660891:
                    b10 = !str.equals(m1939((ViewConfiguration.getTapTimeout() >> 16) - 1435268744, (short) ((-4) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) - 1310500462, (byte) (65 - TextUtils.lastIndexOf("", '0', 0, 0)), (-86) - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()) ? (byte) -1 : (byte) 24;
                    break;
                case -259609707:
                    b10 = !str.equals(m1954(new int[]{-409939825, -1792533820, -315179222, 1534064542, 524488284, -575527758, -327088118, 373480316, 1424955633, 1192411908}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 18).intern()) ? (byte) -1 : (byte) 28;
                    break;
                case -140869031:
                    if (!str.equals(m1954(new int[]{1468079536, 527254633, -800765037, 467666026, 1760024477, 1669471029, -201232800, -1402455252, -677203471, -1612824910}, 19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern())) {
                        b10 = -1;
                    } else {
                        f1754 = (f1753 + 111) % 128;
                        b10 = 20;
                    }
                    break;
                case 20418827:
                    b10 = !str.equals(m1939((-1435268823) - TextUtils.getTrimmedLength(""), (short) ((-119) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1310500450, (byte) ((ViewConfiguration.getTouchSlop() >> 8) - 30), (-89) - MotionEvent.axisFromString("")).intern()) ? (byte) -1 : (byte) 17;
                    break;
                case 108267695:
                    if (!str.equals(m1939((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1435268727, (short) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 107), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1310500450, (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 104), (-87) - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        f1753 = (f1754 + 121) % 128;
                        b10 = zi.c.C;
                    }
                    break;
                case 177098421:
                    b10 = !str.equals(m1954(new int[]{1761882538, 129673512, 128682355, -1005862064, -223056821, 557878031}, Color.alpha(0) + 11).intern()) ? (byte) -1 : zi.c.f161639q;
                    break;
                case 213978610:
                    if (!str.equals(m1954(new int[]{-1153832661, 904893468, -315179222, 1534064542, -1359141531, -1090705527, -1389534746, 722237396, -1189123850, 2143397914, 515147528, -1130156474}, ((Process.getThreadPriority(0) + 20) >> 6) + 22).intern())) {
                        b10 = -1;
                    } else {
                        int i12 = f1754 + 5;
                        f1753 = i12 % 128;
                        b10 = i12 % 2 != 0 ? zi.c.f161643u : (byte) 125;
                    }
                    break;
                case 779164621:
                    b10 = !str.equals(m1939((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1435268809, (short) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 38), TextUtils.indexOf("", "", 0, 0) - 1310500450, (byte) (TextUtils.getTrimmedLength("") + 44), 65499 - AndroidCharacter.getMirror('0')).intern()) ? (byte) -1 : (byte) 19;
                    break;
                case 801466981:
                    b10 = !str.equals(m1939(Color.argb(0, 0, 0, 0) - 1435268844, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 35), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1310500469, (byte) ((Process.myTid() >> 22) + 59), (KeyEvent.getMaxKeyCode() >> 16) - 90).intern()) ? (byte) -1 : (byte) 11;
                    break;
                case 1195083870:
                    if (!str.equals(m1954(new int[]{1761882538, 129673512, 128682355, -1005862064, -2059605302, 2031954964}, View.MeasureSpec.makeMeasureSpec(0, 0) + 12).intern())) {
                        b10 = -1;
                    } else {
                        f1754 = (f1753 + 87) % 128;
                        b10 = 16;
                    }
                    break;
                case 1323380041:
                    if (!str.equals(m1954(new int[]{-239453369, -1215823024, 128682355, -1005862064, -2059605302, 2031954964}, 12 - KeyEvent.keyCodeFromString("")).intern())) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 1340011123:
                    b10 = !str.equals(m1954(new int[]{1786614892, -1351621077, 269053700, -1575955648, -2013132287, -1227428115}, 11 - View.MeasureSpec.getMode(0)).intern()) ? (byte) -1 : (byte) 3;
                    break;
                case 1345250484:
                    if (!str.equals(m1954(new int[]{-1626176195, -1783008857, 821358382, -1586332438, 952303545, -586849499, -800765037, 467666026, -479947119, 1701606488, 1408838437, 2082919660}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 21).intern())) {
                        b10 = -1;
                    } else {
                        f1753 = (f1754 + 63) % 128;
                        b10 = zi.c.H;
                    }
                    break;
                case 1939710523:
                    if (!str.equals(m1939(TextUtils.indexOf("", "") - 1435268713, (short) ((-16777238) - Color.rgb(0, 0, 0)), View.MeasureSpec.getSize(0) - 1310500462, (byte) ((-110) - Drawable.resolveOpacity(0, 0)), (-87) - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                        b10 = -1;
                    } else {
                        f1753 = (f1754 + 115) % 128;
                        b10 = zi.c.D;
                    }
                    break;
                case 2108820561:
                    b10 = !str.equals(m1939((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1435268793, (short) ((-5) - (KeyEvent.getMaxKeyCode() >> 16)), (-1310500451) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) ((-126) - TextUtils.getOffsetBefore("", 0)), (-86) - KeyEvent.normalizeMetaState(0)).intern()) ? (byte) -1 : zi.c.f161647y;
                    break;
                case 2109208793:
                    b10 = !str.equals(m1954(new int[]{-409939825, -1792533820, -315179222, 1534064542, 524488284, -575527758, -1182513729, -764577917}, 14 - (Process.myTid() >> 22)).intern()) ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return m1955();
                case 1:
                    return m1958();
                case 2:
                    return m1950();
                case 3:
                    return m1940();
                case 4:
                    return m1944();
                case 5:
                    return Integer.valueOf(m1929().m2223());
                case 6:
                    return Integer.valueOf(m1935().m2223());
                case 7:
                    m1959((String) cz.m1806(list, 0, String.class));
                    break;
                case 8:
                    m1960((List<String>) cz.m1806(list, 0, List.class));
                    break;
                case 9:
                    m1956((String) cz.m1806(list, 0, String.class));
                    break;
                case 10:
                    m1943((List<String>) cz.m1806(list, 0, List.class));
                    f1754 = (f1753 + 87) % 128;
                    break;
                case 11:
                    m1946((String) cz.m1806(list, 0, String.class));
                    break;
                case 12:
                    m1957((List<String>) cz.m1806(list, 0, List.class));
                    break;
                case 13:
                    m1941((String) cz.m1806(list, 0, String.class));
                    break;
                case 14:
                    m1947((List<String>) cz.m1806(list, 0, List.class));
                    break;
                case 15:
                    m1952((String) cz.m1806(list, 0, String.class));
                    break;
                case 16:
                    m1953((List<String>) cz.m1806(list, 0, List.class));
                    break;
                case 17:
                    m1945(hn.m2222(((Integer) cz.m1806(list, 0, Integer.class)).intValue()));
                    break;
                case 18:
                    m1951(hn.m2222(((Integer) cz.m1806(list, 0, Integer.class)).intValue()));
                    break;
                case 19:
                    m1934((String) cz.m1806(list, 0, String.class));
                    break;
                case 20:
                    return m1933();
                case 21:
                    m1932((String) cz.m1806(list, 0, String.class));
                    break;
                case 22:
                    return m1937();
                case 23:
                    m1936((String) cz.m1806(list, 0, String.class));
                    break;
                case 24:
                    return m1931();
                case 25:
                    m1938((String) cz.m1806(list, 0, String.class));
                    break;
                case 26:
                    return m1924();
                case 27:
                    m1930((String) cz.m1806(list, 0, String.class));
                    break;
                case 28:
                    return m1926();
                case 29:
                    return m1925();
                case 30:
                    m1949((JSONObject) cz.m1806(list, 0, JSONObject.class));
                    break;
                case 31:
                    return m1923();
                case 32:
                    m1928((String) cz.m1806(list, 0, String.class));
                    break;
                case 33:
                    return m1927();
                case 34:
                    return m1922();
            }
            f1753 = (f1754 + 55) % 128;
            return null;
        }
        str.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1939(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1759;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1757;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f1760 + i10] + i13);
                    } else {
                        i14 = (short) (f1758[f1760 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f1760 + i15;
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f1756);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f1757;
                        if (bArr2 != null) {
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f1758;
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
