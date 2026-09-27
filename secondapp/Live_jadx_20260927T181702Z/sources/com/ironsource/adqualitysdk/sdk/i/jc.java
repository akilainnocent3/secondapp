package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class jc {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2719 = {'\'', 23, '2', 'i', 'g', '*', 'n', 137, 138, 146, 151, 148, 143, 145, '2', 'J', 'R', 'r'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2720 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2721 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f2722;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2723;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f2724;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f2725;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2726;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private final String f2727;

        public b(String str, String str2, String str3) {
            super(str, str2);
            this.f2727 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﾒ */
        public final String mo2564() {
            return m2560(this.f2727);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends e {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private final String f2728;

        public c(String str, String str2, String str3) {
            super(str, str2);
            this.f2728 = str3;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jc
        /* JADX INFO: renamed from: ﾒ */
        public final String mo2564() {
            return m2560(this.f2728);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends jc {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static short[] f2729 = null;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static byte[] f2730 = {-107, -8, -1, zi.c.f161636n, -103, -11, 9, 55, l3.a.f103436o7, -1, -4, 9};

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static int f2731 = 123424552;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2732 = 111;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f2733 = -29444390;

        public d(String str, String str2) {
            super(str, m2565((-123424552) - TextUtils.getTrimmedLength(""), (short) View.getDefaultSize(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 29444489, (byte) TextUtils.getCapsMode("", 0, 0), (-112) - View.resolveSize(0, 0)).intern(), str2, m2565(KeyEvent.getDeadChar(0, 0) - 123424548, (short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 29444497, (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (KeyEvent.getMaxKeyCode() >> 16) - 112).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static String m2565(int i10, short s10, int i11, byte b10, int i12) {
            String string;
            synchronized (o.f2993) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2732;
                    int i14 = i12 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f2730;
                        i14 = bArr != null ? (byte) (bArr[f2731 + i10] + i13) : (short) (f2729[f2731 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f2994 = ((i10 + i14) - 2) + f2731 + i15;
                        o.f2995 = b10;
                        char c10 = (char) (i11 + f2733);
                        o.f2997 = c10;
                        sb2.append(c10);
                        o.f2996 = o.f2997;
                        o.f2998 = 1;
                        while (o.f2998 < i14) {
                            byte[] bArr2 = f2730;
                            if (bArr2 != null) {
                                int i16 = o.f2994;
                                o.f2994 = i16 - 1;
                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                            } else {
                                short[] sArr = f2729;
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

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends jc {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static long f2734 = 7164907263120509370L;

        public e(String str, String str2) {
            super(str, m2566("\u09d9躾܂龕", 34667 - Color.argb(0, 0, 0, 0)).intern(), str2, m2566("\u09d0㠤樏鰓츠\uf07e≚咢", 12780 - ImageFormat.getBitsPerPixel(0)).intern(), (byte) 0);
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2566(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f2019) {
                try {
                    f.f2017 = i10;
                    char[] cArr2 = new char[cArr.length];
                    f.f2018 = 0;
                    while (true) {
                        int i11 = f.f2018;
                        if (i11 < cArr.length) {
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f2734);
                            f.f2018++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str2;
        }
    }

    public /* synthetic */ jc(String str, String str2, String str3, String str4, byte b10) {
        this(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static String m2554() {
        int i10 = f2720 + 13;
        f2721 = i10 % 128;
        if (i10 % 2 == 0) {
            ar.m438().mo453();
            throw null;
        }
        String strMo453 = ar.m438().mo453();
        int i11 = f2720 + 97;
        f2721 = i11 % 128;
        if (i11 % 2 != 0) {
            return strMo453;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m2555() {
        f2720 = (f2721 + 33) % 128;
        String strIntern = m2558(new int[]{5, 9, 38, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", true).intern();
        String strM2554 = m2554();
        if (!this.f2726) {
            return strIntern;
        }
        int i10 = f2720 + 11;
        f2721 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(strM2554);
            throw null;
        }
        if (TextUtils.isEmpty(strM2554)) {
            return strIntern;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strIntern);
        sb2.append(m2558(new int[]{14, 4, 0, 1}, "\u0001\u0000\u0001\u0000", true).intern());
        sb2.append(strM2554);
        sb2.append(m2558(new int[]{0, 1, 31, 0}, wo.g.f143517x2, false).intern());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m2556() {
        int i10 = f2720 + 81;
        int i11 = i10 % 128;
        f2721 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f2723;
        f2720 = (i11 + 59) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m2557() {
        String str;
        int i10 = f2720 + 65;
        int i11 = i10 % 128;
        f2721 = i11;
        if (i10 % 2 == 0) {
            str = this.f2722;
            int i12 = 73 / 0;
        } else {
            str = this.f2722;
        }
        int i13 = i11 + 115;
        f2720 = i13 % 128;
        if (i13 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2559() {
        int i10 = f2721;
        String str = this.f2724;
        f2720 = (i10 + 21) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2561() {
        f2720 = (f2721 + 67) % 128;
        String strReplace = mo2564().replace(m2558(new int[]{0, 1, 31, 0}, wo.g.f143517x2, false).intern(), m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        f2720 = (f2721 + 21) % 128;
        return strReplace;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String m2562() {
        int i10 = f2721;
        String str = this.f2725;
        f2720 = (i10 + 23) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2563() {
        int i10 = f2721 + 111;
        f2720 = i10 % 128;
        this.f2726 = i10 % 2 != 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public String mo2564() {
        String strM2555 = m2555();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM2555);
        sb2.append(this.f2724);
        sb2.append(m2558(new int[]{0, 1, 31, 0}, wo.g.f143517x2, false).intern());
        sb2.append(this.f2722);
        sb2.append(m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        sb2.append(m2558(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        sb2.append(this.f2725);
        sb2.append(m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        sb2.append(this.f2723);
        String string = sb2.toString();
        int i10 = f2720 + 3;
        f2721 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 20 / 0;
        }
        return string;
    }

    private jc(String str, String str2, String str3, String str4) {
        this.f2724 = str;
        this.f2722 = str2;
        this.f2725 = str3;
        this.f2723 = str4;
        this.f2726 = true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2558(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f2719, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m2560(String str) {
        String strM2555 = m2555();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM2555);
        sb2.append(m2559());
        sb2.append(m2558(new int[]{0, 1, 31, 0}, wo.g.f143517x2, false).intern());
        sb2.append(m2558(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m2558(new int[]{0, 1, 31, 0}, wo.g.f143517x2, false).intern());
        sb2.append(str);
        sb2.append(m2558(new int[]{0, 1, 31, 0}, wo.g.f143517x2, false).intern());
        sb2.append(m2557());
        sb2.append(m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        sb2.append(m2558(new int[]{2, 3, 0, 0}, "\u0000\u0000\u0001", true).intern());
        sb2.append(m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        sb2.append(m2562());
        sb2.append(m2558(new int[]{1, 1, 0, 1}, wo.g.f143517x2, true).intern());
        sb2.append(m2556());
        String string = sb2.toString();
        int i10 = f2720 + 47;
        f2721 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 1 / 0;
        }
        return string;
    }
}
