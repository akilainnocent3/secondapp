package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import cv.z0;
import java.io.UnsupportedEncodingException;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class di extends cz implements cl {

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static int f1723 = 1;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static char[] f1724 = {'t', 226, 226, 208, 200, 204, 204, PublicSuffixDatabase.f119166e, 'R', 'g', 'n', 'h', 'e', 'h', 'j', 'a', 'f', 't', 'j', 'l', 'l', 'l', 143, 141, 152, 161, '|', 150, 143, 145, 137, 152, 149, 137, 'k', 156, 141, 146, 278, 285, 299, 300, 302, 302, 307, 299, 301, 301, 274, 282, 300, 300, 261, 274, 227, 276, 261, 275, 260, 233, 261, 278, 265, 276, 257, 156, 304, 283, 289, 311, 311, 309, 289, 290, 305, 'V', 165, 165, 156, 148, 164, 172, 166, 165, 172, 151, 143, 's', z0.f77345j, 148, z0.f77344i, 147, 'x', 159, z0.f77344i, 134, 262, 262, 246, 245, 267, 243, 236, 257, 264, 258, 255, 258, 260, 245, 240, '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', fw.b.f85384k, 'l', 'l', '2', 'd', 'f', 'm', 'a', 'Z', 'f', 'U', fw.b.f85384k, 'l', 'f', 157, 311, 301, 301, 284, 278, 295, 276, 285, 308, 307, 300, 298, 297};

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static long f1725 = 5147170450295727915L;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1726;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private String f1727;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private String f1728;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String f1729;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String f1730;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String f1731;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String f1732;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f1733;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1734;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1735;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1736;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1737;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1738;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Object m1879() {
        int i10 = (f1726 + 69) % 128;
        f1723 = i10;
        String str = this.f1728;
        int i11 = i10 + 101;
        f1726 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private void m1881(String str) {
        int i10 = f1726;
        int i11 = i10 + 25;
        f1723 = i11 % 128;
        int i12 = i11 % 2;
        this.f1727 = str;
        if (i12 == 0) {
            throw null;
        }
        int i13 = i10 + 77;
        f1723 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 74 / 0;
        }
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private Object m1882() {
        int i10 = f1726;
        int i11 = i10 + 5;
        f1723 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        String str = this.f1727;
        f1723 = (i10 + 27) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private String m1884() {
        int i10 = f1723;
        int i11 = i10 + 7;
        f1726 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f1730;
        int i12 = i10 + 121;
        f1726 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m1887(String str) {
        int i10 = (f1726 + 93) % 128;
        f1723 = i10;
        this.f1731 = str;
        f1726 = (i10 + 89) % 128;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private String m1888() {
        int i10 = f1723;
        String str = this.f1731;
        int i11 = i10 + 91;
        f1726 = i11 % 128;
        if (i11 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private void m1891(String str) {
        int i10 = f1726;
        this.f1729 = str;
        int i11 = i10 + 65;
        f1723 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m1892() {
        int i10 = f1723 + 87;
        int i11 = i10 % 128;
        f1726 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1729;
        int i12 = i11 + 87;
        f1723 = i12 % 128;
        if (i12 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m1894() {
        int i10 = (f1723 + 53) % 128;
        f1726 = i10;
        String str = this.f1737;
        int i11 = i10 + 87;
        f1723 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 6 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m1898(String str) {
        int i10 = f1723 + 1;
        int i11 = i10 % 128;
        f1726 = i11;
        int i12 = i10 % 2;
        this.f1736 = str;
        if (i12 != 0) {
            throw null;
        }
        int i13 = i11 + 103;
        f1723 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m1900(String str) {
        int i10 = f1723 + 105;
        f1726 = i10 % 128;
        int i11 = i10 % 2;
        this.f1738 = str;
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m1902(String str) {
        int i10 = (f1726 + 113) % 128;
        f1723 = i10;
        this.f1734 = str;
        f1726 = (i10 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m1905(String str) {
        int i10 = f1726 + 99;
        f1723 = i10 % 128;
        int i11 = i10 % 2;
        this.f1737 = str;
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private JSONObject m1880() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(ih.f2514, this.f1734);
            jSONObject.putOpt(ih.f2513, this.f1737);
            jSONObject.putOpt(ih.f2519, this.f1738);
            jSONObject.putOpt(ih.f2518, this.f1735);
            jSONObject.putOpt(ih.f2517, this.f1731);
            jSONObject.putOpt(ih.f2512, this.f1730);
            jSONObject.putOpt(ih.f2511, this.f1732);
            jSONObject.putOpt(ih.f2510, this.f1729);
            jSONObject.putOpt(ih.f2505, this.f1733);
        } catch (JSONException unused) {
        }
        f1726 = (f1723 + 71) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m1883(String str) {
        int i10 = f1723 + 67;
        f1726 = i10 % 128;
        int i11 = i10 % 2;
        this.f1728 = str;
        if (i11 != 0) {
            int i12 = 65 / 0;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m1885(String str) {
        int i10 = f1726 + 31;
        f1723 = i10 % 128;
        int i11 = i10 % 2;
        this.f1732 = str;
        if (i11 == 0) {
            int i12 = 76 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m1886() {
        int i10 = f1726 + 91;
        int i11 = i10 % 128;
        f1723 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1732;
        int i12 = i11 + 49;
        f1726 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 86 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m1889(String str) {
        int i10 = f1726;
        int i11 = i10 + 1;
        f1723 = i11 % 128;
        int i12 = i11 % 2;
        this.f1730 = str;
        if (i12 == 0) {
            int i13 = 46 / 0;
        }
        f1723 = (i10 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1890() {
        int i10 = f1723 + 83;
        int i11 = i10 % 128;
        f1726 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        String str = this.f1733;
        f1723 = (i11 + 5) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m1893(String str) {
        int i10 = f1726;
        this.f1733 = str;
        int i11 = i10 + 111;
        f1723 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 38 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m1896(String str) {
        int i10 = f1723;
        this.f1735 = str;
        int i11 = i10 + 99;
        f1726 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 70 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m1897() {
        int i10 = (f1723 + 39) % 128;
        f1726 = i10;
        String str = this.f1735;
        int i11 = i10 + 91;
        f1723 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m1899() {
        int i10 = f1723 + 1;
        f1726 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f1738;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m1901() {
        int i10 = f1726 + SignalKey.EVENT_ID;
        f1723 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1734;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Object m1903() {
        String str;
        int i10 = f1723;
        int i11 = i10 + 63;
        f1726 = i11 % 128;
        if (i11 % 2 != 0) {
            str = this.f1736;
            int i12 = 54 / 0;
        } else {
            str = this.f1736;
        }
        int i13 = i10 + 35;
        f1726 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1904(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f1724, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    i.f2447 = 0;
                    char c10 = 0;
                    while (true) {
                        int i14 = i.f2447;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                        }
                        c10 = cArr2[i14];
                        i.f2447 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    i.f2447 = 0;
                    while (true) {
                        int i16 = i.f2447;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        i.f2447 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    i.f2447 = 0;
                    while (true) {
                        int i17 = i.f2447;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        i.f2447 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo767(String str, List<Object> list, ch chVar) {
        switch (str.hashCode()) {
            case -2118395364:
                if (str.equals(m1895("뻅꿔뺢ᨔ࢚⇉吶퐉∍\uec75\uf173뎖蟩伾鷉ཱུ梳튲㸪", -MotionEvent.axisFromString("")).intern())) {
                    f1723 = (f1726 + 101) % 128;
                    return m1894();
                }
                return null;
            case -2061646392:
                if (str.equals(m1904(new int[]{75, 12, 57, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001", false).intern())) {
                    m1889((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -1670022962:
                if (str.equals(m1904(new int[]{111, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    int i10 = f1726 + 115;
                    f1723 = i10 % 128;
                    if (i10 % 2 == 0) {
                        m1905((String) cz.m1806(list, 0, String.class));
                    } else {
                        m1881((String) cz.m1806(list, 0, String.class));
                    }
                }
                return null;
            case -1616003519:
                if (str.equals(m1895("␏⯧⑨ˉ販臓䳫琑룂桝\ue9bb\u139fᴾ쬃蔉꽃\uf26f", 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                    return m1899();
                }
                return null;
            case -1585083924:
                if (str.equals(m1904(new int[]{7, 15, 0, 12}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", false).intern())) {
                    m1898((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -1581443134:
                if (str.equals(m1904(new int[]{122, 11, 0, 0}, "\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    return m1882();
                }
                return null;
            case -1448564938:
                if (str.equals(m1895("笇⧻筠㬖躵㓂甴섇\ue7d8橜큗Ꚏ䈲줈볙ᩲ굤咺ἅＣ", TextUtils.indexOf("", "", 0, 0) + 1).intern())) {
                    f1723 = (f1726 + 33) % 128;
                    return m1890();
                }
                return null;
            case -1295434132:
                if (str.equals(m1904(new int[]{133, 14, r1.o.f123455u, 1}, "\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", false).intern())) {
                    m1883((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -1207642840:
                if (str.equals(m1904(new int[]{37, 15, 192, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", true).intern())) {
                    f1723 = (f1726 + 101) % 128;
                    m1905((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -1027873480:
                if (str.equals(m1904(new int[]{65, 10, 197, 1}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true).intern())) {
                    m1887((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -869156349:
                if (str.equals(m1895("赑졚败䎺漞땈ඦ䂺ᆒ诣", 1 - Color.green(0)).intern())) {
                    f1723 = (f1726 + 121) % 128;
                    return m1880();
                }
                return null;
            case -841872307:
                if (str.equals(m1895("쉊믑숹瓮Ჟ戌㫌韎庇\uf86b龜\uf040ﭻ嬵\uf32e䲜ᐪ", Color.alpha(0) + 1).intern())) {
                    m1900((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -587837303:
                if (str.equals(m1895("ꑎ옳ꐽꝿ慽\udaaf\ue95d⽪㢑薔䰾䣰鵳⛑₥\uf41f爼뭹荬ᅎ", 1 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern())) {
                    f1723 = (f1726 + 109) % 128;
                    m1891((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case -75693804:
                if (str.equals(m1895("ಠ糃ೇኖ\udb8d曩岴錩遨㽝藺", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    return m1901();
                }
                return null;
            case 476302072:
                if (str.equals(m1895("\u202e㔏⁉捊鉁\uece1\u2d68ᤢ볫皼蠋纹ᤄ헾\ue481쉖\uf649䡙", (ViewConfiguration.getPressedStateDuration() >> 16) + 1).intern())) {
                    return m1879();
                }
                return null;
            case 684328276:
                if (str.equals(m1895("燊\uf7e2熭庛催裎Ⴙ紝\ued03둄뗬᪆䣡᜕\ud97c꙳", 1 - View.resolveSizeAndState(0, 0, 0)).intern())) {
                    return m1884();
                }
                return null;
            case 1014959530:
                if (str.equals(m1904(new int[]{95, 16, 154, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001", false).intern())) {
                    m1893((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case 1076166944:
                if (str.equals(m1895("⛂鞝⚥謨ビ䙀씊뎂먜퐯恋퐙ῳ睨ೣ棐\uf0a2", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
                    int i11 = f1723 + 31;
                    f1726 = i11 % 128;
                    if (i11 % 2 == 0) {
                        return m1897();
                    }
                }
                return null;
            case 1243605525:
                if (str.equals(m1895("꤬\ue7caꥋ㘼䂄ᕸ砞\ue0bd㗳ꑭ\udd7d蜧逑ܨ뇦㯈罞骀ሯ\ude99", -TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) {
                    return m1892();
                }
                return null;
            case 1330288580:
                if (str.equals(m1895("\uee34舺\uee53奇╴环ᝥ虩狪솂눰\ue1f2휥拝", -TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                    return m1888();
                }
                return null;
            case 1390601082:
                if (str.equals(m1904(new int[]{87, 8, 47, 4}, (String) null, true).intern())) {
                    m1885((String) cz.m1806(list, 0, String.class));
                }
                return null;
            case 1799130848:
                if (str.equals(m1904(new int[]{22, 15, 40, 1}, (String) null, true).intern())) {
                    return m1903();
                }
                return null;
            case 1850298156:
                if (str.equals(m1904(new int[]{52, 13, 160, 6}, (String) null, true).intern())) {
                    int i12 = f1723 + 67;
                    f1726 = i12 % 128;
                    if (i12 % 2 == 0) {
                        m1896((String) cz.m1806(list, 0, String.class));
                    }
                }
                return null;
            case 1951713542:
                if (str.equals(m1895("騥\uf217驂嗢啙仔ᯀ묑ۺ놰뺩\udc9d", -ExpandableListView.getPackedPositionChild(0L)).intern())) {
                    return m1886();
                }
                return null;
            case 1984415776:
                if (str.equals(m1904(new int[]{0, 7, 118, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001", false).intern())) {
                    m1902((String) cz.m1806(list, 0, String.class));
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1895(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            try {
                char[] cArrM2198 = h.m2198(f1725, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2198.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f1725));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2198, 4, cArrM2198.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }
}
