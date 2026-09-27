package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class aw {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f565 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f566 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f568 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f569 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f571 = 196;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private List<String> f572;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f573;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f574;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f570 = {312, 317, 308, 297, 306, 313, 304, 265, 310, 307, 228, 301, 311, 300, 296, 264, 293, 294};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f567 = {-249871222, 1447174715, 197520244, 1648896034, 317761997, -1233006717, -2034892610, -1853135002, -27184752, 502131792, -1648048931, -708895012, 815181033, 991412463, -1453478111, 1046018402, 55339931, -1757561124};

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aw$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        static final /* synthetic */ int[] f575;

        static {
            int[] iArr = new int[d.valuesCustom().length];
            f575 = iArr;
            try {
                iArr[d.f584.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f575[d.f587.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f575[d.f586.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f575[d.f583.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d {
        f584,
        f583,
        f586,
        f587;


        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private static int f576 = 0;

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private static int f577 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f578;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static byte[] f579;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f580;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static short[] f581;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f582;

        static {
            m615();
            f577 = (f576 + 63) % 128;
        }

        public static d valueOf(String str) {
            f577 = (f576 + 77) % 128;
            d dVar = (d) Enum.valueOf(d.class, str);
            int i10 = f577 + 105;
            f576 = i10 % 128;
            if (i10 % 2 == 0) {
                return dVar;
            }
            throw null;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            f576 = (f577 + 97) % 128;
            d[] dVarArr = (d[]) values().clone();
            int i10 = f576 + 117;
            f577 = i10 % 128;
            if (i10 % 2 != 0) {
                return dVarArr;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m614(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f2993) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f578;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f579;
                        i14 = bArr != null ? (byte) (bArr[f580 + i10] + i13) : (short) (f581[f580 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f2994 = ((i10 + i14) - 2) + f580 + i15;
                        o.f2995 = b10;
                        char c10 = (char) (i11 + f582);
                        o.f2997 = c10;
                        sb2.append(c10);
                        o.f2996 = o.f2997;
                        o.f2998 = 1;
                        while (o.f2998 < i14) {
                            byte[] bArr2 = f579;
                            if (bArr2 != null) {
                                int i16 = o.f2994;
                                o.f2994 = i16 - 1;
                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                            } else {
                                short[] sArr = f581;
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

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static void m615() {
            f580 = -1552642572;
            f578 = SignalKey.EVENT_ID;
            f582 = 736639886;
            f579 = new byte[]{-104, 0, zi.c.f161635m, -102, -17, 7, 13, 1, -102, 8, 3, 7, 3, -102, 17, 2, -23, 19};
        }
    }

    public aw(JSONObject jSONObject) {
        this.f573 = m608(jSONObject.optString(m609(null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), null, "\u0084\u0083\u0082\u0081").intern()));
        this.f572 = m610(jSONObject.optString(m611(new int[]{1677581700, 1568689871}, 2 - Color.green(0)).intern()));
        this.f574 = m607(jSONObject.optString(m611(new int[]{-1679930329, 672363503, 1731016771, -1658967260}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6).intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m607(String str) {
        if (!TextUtils.isEmpty(str)) {
            int i10 = f568 + 31;
            f565 = i10 % 128;
            if (i10 % 2 == 0) {
                if (!str.equals(m609(null, 85 - (Process.getThreadPriority(0) + 32), null, "\u0087\u0087\u0086\u0085").intern())) {
                    return str;
                }
            } else if (!str.equals(m609(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u0087\u0087\u0086\u0085").intern())) {
                return str;
            }
        }
        f568 = (f565 + 83) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static d m608(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 92611485) {
            if (str.equals(m611(new int[]{193453761, -1454093780, -47264438, -1708937903}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 5).intern())) {
                int i10 = (f568 + 7) % 128;
                f565 = i10;
                f568 = (i10 + 109) % 128;
                d dVar = d.f583;
                f568 = (f565 + 9) % 128;
                return dVar;
            }
            return d.f584;
        }
        if (iHashCode != 93621297) {
            if (iHashCode == 96946943 && str.equals(m611(new int[]{250876728, 1791501912, -1821617039, -934304173}, 5 - (Process.myTid() >> 22)).intern())) {
                int i11 = f568 + 27;
                f565 = i11 % 128;
                if (i11 % 2 != 0) {
                    d dVar2 = d.f587;
                    int i12 = f568 + 59;
                    f565 = i12 % 128;
                    if (i12 % 2 != 0) {
                        return dVar2;
                    }
                    throw null;
                }
                d dVar3 = d.f583;
                f568 = (f565 + 9) % 128;
                return dVar3;
            }
        } else if (str.equals(m611(new int[]{-1552137562, -558820683, -1114080678, 905784149}, 5 - View.getDefaultSize(0, 0)).intern())) {
            f565 = (f568 + 81) % 128;
            return d.f586;
        }
        return d.f584;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static List<String> m610(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i10 = f568 + 73;
        f565 = i10 % 128;
        List<String> listAsList = i10 % 2 == 0 ? Arrays.asList(str.split(m611(new int[]{-231744396, -1523333307}, 1 >>> TextUtils.getOffsetBefore("", 1)).intern())) : Arrays.asList(str.split(m611(new int[]{-231744396, -1523333307}, TextUtils.getOffsetBefore("", 0) + 1).intern()));
        f565 = (f568 + 69) % 128;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m613(String str) {
        try {
            int i10 = AnonymousClass4.f575[this.f573.ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                boolean zContains = this.f572.contains(str);
                int i11 = f565 + 79;
                f568 = i11 % 128;
                if (i11 % 2 == 0) {
                    return zContains;
                }
                throw null;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                }
                return false;
            }
            if (this.f572.size() > 0) {
                if (kc.m2814(str, this.f572.get(0)) < 0) {
                    return true;
                }
                f565 = (f568 + 63) % 128;
                return false;
            }
            if (this.f572.size() > 0) {
                f568 = (f565 + 63) % 128;
                if (kc.m2814(str, this.f572.get(0)) < 0) {
                    return false;
                }
                int i12 = f565 + 73;
                f568 = i12 % 128;
                return i12 % 2 == 0;
            }
            return false;
        } catch (Exception e10) {
            kd.m2827(m611(new int[]{-1666146046, 95630002, -1547939219, 180157551, -583088506, -2015564159, -58690802, -1335806337, 455296167, 1181227952, -1041048927, -1438469512}, AndroidCharacter.getMirror('0') - 26).intern(), m609(null, KeyEvent.keyCodeFromString("") + 127, null, "\u0084\u0087\u0092\u0091\u008d\u008c\u0090\u008f\u0087\u0086\u008a\u008e\u008d\u008b\u0085\u008c\u008b\u0089\u008a\u0089\u0089\u0088").intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m612() {
        int i10 = f565;
        String str = this.f574;
        f568 = (i10 + 17) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m609(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f570;
                int i11 = f571;
                if (f566) {
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
                if (f569) {
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
    private static String m611(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f567.clone();
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
}
