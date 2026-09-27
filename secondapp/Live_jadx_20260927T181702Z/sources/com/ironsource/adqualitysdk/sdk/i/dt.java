package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class dt {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static int f1853 = 1;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f1854;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1855;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f1856;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static char f1857;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static char[] f1858;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f1859;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static final Pattern f1860;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static final List<String> f1861;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static final Pattern f1862;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static final Pattern f1863;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Pattern f1864;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final Pattern f1865;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static final Pattern f1866;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Pattern f1867;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final Pattern f1868;

    static {
        m2058();
        f1867 = Pattern.compile(m2059("薶콞蟓꺕\u0ee0쥗䶴ɤ৯䦲誥栯蟓꺕\u0ee0쥗䶴ɤ믓霌併鯚驳\ud9e1Ꮧগ", 25 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        f1868 = Pattern.compile(m2059("쑸⇕ᕺ몚鵫ꇯ\ue30c夃쌢겛쑸⇕\ue2e9\ue9e1\uf47d煆", 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
        f1865 = Pattern.compile(m2059("ᔄѪᕺ몚鵫ꇯ㌇ؚ쌢겛ᔄѪ\ue2e9\ue9e1儁鶼", 15 - ImageFormat.getBitsPerPixel(0)).intern());
        f1864 = Pattern.compile(m2059("薶콞믓霌뤑韼煊ৌ\u1ae5턎믓霌뤑韼햍ే", 15 - View.resolveSize(0, 0)).intern());
        f1866 = Pattern.compile(m2059("薶콞믓霌뤑韼햍ే", 7 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
        f1860 = Pattern.compile(m2057(new int[]{63, 33, 0, 3}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001", false).intern());
        f1863 = Pattern.compile(m2059("帡娘軧ྟ", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3).intern());
        f1862 = Pattern.compile(m2057(new int[]{96, 5, 0, 0}, "\u0000\u0000\u0000\u0000\u0000", false).intern());
        f1861 = Arrays.asList(m2059("ᛟ⌅", KeyEvent.normalizeMetaState(0) + 2).intern(), m2059("ꦮ⒒ᩘ쐎", 5 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2059("砲㾹졊㍵", 4 - View.resolveSize(0, 0)).intern(), m2059("鐐\u0ee8⠧픋ུ갪", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 5).intern(), m2059("∐ᄎ㤉қＫ䔧", 5 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m2059("寬롦ێ⇓", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2).intern(), m2059("\uebe8凌䖫敤瀦ꚺ", 6 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
        f1855 = (f1853 + 85) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x031c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:52:0x0109 A[PHI: r8 r10
      0x0109: PHI (r8v28 com.ironsource.adqualitysdk.sdk.i.dy$d) = (r8v27 com.ironsource.adqualitysdk.sdk.i.dy$d), (r8v46 com.ironsource.adqualitysdk.sdk.i.dy$d) binds: [B:35:0x0081, B:37:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r10v9 java.lang.String) = (r10v8 java.lang.String), (r10v36 java.lang.String) binds: [B:35:0x0081, B:37:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0057. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x005a. Please report as an issue. */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<dy> m2054(String str, String str2, String str3) {
        int length;
        int i10;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < str3.length()) {
            int i13 = i11 + 1;
            char cCharAt = i13 < str3.length() ? str3.charAt(i13) : (char) 0;
            char cCharAt2 = str3.charAt(i11);
            if (cCharAt2 != '\n') {
                if (cCharAt2 != '%' && cCharAt2 != '[' && cCharAt2 != ']' && cCharAt2 != '{' && cCharAt2 != '}') {
                    if (cCharAt2 != '!') {
                        if (cCharAt2 != '\"') {
                            switch (cCharAt2) {
                                case '\'':
                                    String strM2055 = m2055(m2056(f1865, str3.substring(i11)));
                                    if (strM2055.length() == 1) {
                                        arrayList.add(new dy(dy.d.f1907, String.valueOf((int) strM2055.charAt(0)), i12));
                                    } else {
                                        arrayList.add(new dy(dy.d.f1909, strM2055, i12));
                                    }
                                    length = strM2055.length() + 2;
                                    i11 += length;
                                    break;
                                case '(':
                                case ')':
                                case '*':
                                case ',':
                                case '.':
                                case '/':
                                    break;
                                case '+':
                                    if (cCharAt == '+') {
                                        arrayList.add(new dy(dy.d.f1906, m2059("\ue362謺", 1 - TextUtils.indexOf((CharSequence) "", '0')).intern(), i12));
                                        i11 += 2;
                                    } else if (cCharAt == '-') {
                                        arrayList.add(new dy(dy.d.f1906, m2057(new int[]{0, 2, 0, 0}, "\u0001\u0000", false).intern(), i12));
                                        i11 += 2;
                                        f1853 = (f1855 + 67) % 128;
                                    }
                                    break;
                                case '-':
                                    if (cCharAt == '-') {
                                        arrayList.add(new dy(dy.d.f1906, m2057(new int[]{0, 2, 0, 0}, "\u0001\u0000", false).intern(), i12));
                                        i11 += 2;
                                        f1853 = (f1855 + 67) % 128;
                                    }
                                    break;
                                default:
                                    switch (cCharAt2) {
                                        case ':':
                                        case ';':
                                            break;
                                        case '<':
                                        case '=':
                                        case '>':
                                            break;
                                        default:
                                            if (!Character.isWhitespace(str3.charAt(i11))) {
                                                dy.d dVar = dy.d.f1904;
                                                String strM2056 = m2056(f1860, str3.substring(i11));
                                                if (TextUtils.isEmpty(strM2056)) {
                                                    dVar = dy.d.f1910;
                                                    strM2056 = m2056(f1867, str3.substring(i11));
                                                    if (TextUtils.isEmpty(strM2056)) {
                                                        i10 = 4;
                                                    } else {
                                                        i10 = 4;
                                                        int i14 = f1853 + 5;
                                                        f1855 = i14 % 128;
                                                        if (i14 % 2 == 0 ? strM2056.equals(m2059("寬롦\u1776\ue7b8", 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()) : strM2056.equals(m2059("寬롦\u1776\ue7b8", 4 << (TypedValue.complexToFraction(1, 1.0f, 2.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(1, 1.0f, 2.0f) == 0.0f ? 0 : -1))).intern())) {
                                                            dVar = dy.d.f1902;
                                                        } else {
                                                            f1853 = (f1855 + 123) % 128;
                                                            if (strM2056.equals(m2057(new int[]{45, 5, 0, 0}, "\u0000\u0001\u0001\u0001\u0000", false).intern())) {
                                                                dVar = dy.d.f1902;
                                                            } else if (f1861.contains(strM2056)) {
                                                                dVar = dy.d.f1908;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i10 = 4;
                                                }
                                                if (TextUtils.isEmpty(strM2056)) {
                                                    int i15 = f1853 + 93;
                                                    f1855 = i15 % 128;
                                                    if (i15 % 2 != 0) {
                                                        dVar = dy.d.f1905;
                                                        strM2056 = m2056(f1864, str3.substring(i11));
                                                        int i16 = 98 / 0;
                                                    } else {
                                                        dVar = dy.d.f1905;
                                                        strM2056 = m2056(f1864, str3.substring(i11));
                                                    }
                                                }
                                                if (TextUtils.isEmpty(strM2056)) {
                                                    dVar = dy.d.f1907;
                                                    strM2056 = m2056(f1866, str3.substring(i11));
                                                }
                                                if (TextUtils.isEmpty(strM2056)) {
                                                    dVar = dy.d.f1906;
                                                    strM2056 = m2056(f1862, str3.substring(i11));
                                                }
                                                if (TextUtils.isEmpty(strM2056)) {
                                                    dVar = dy.d.f1906;
                                                    strM2056 = m2056(f1863, str3.substring(i11));
                                                }
                                                if (!TextUtils.isEmpty(strM2056)) {
                                                    arrayList.add(new dy(dVar, strM2056, i12));
                                                    length = strM2056.length();
                                                    i11 += length;
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append(m2057(new int[]{2, 6, 17, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
                                                    sb2.append(str);
                                                    String string = sb2.toString();
                                                    StringBuilder sb3 = new StringBuilder();
                                                    sb3.append(m2059("ᶵ\uf78a鐐\u0ee8씝\ue832ꢳﰫ\ue821〺暪礦央탴꩖咘\uecd2\ude4e", TextUtils.indexOf((CharSequence) "", '0', 0) + 19).intern());
                                                    sb3.append(str3.charAt(i11));
                                                    sb3.append(m2057(new int[]{50, 13, 0, 13}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001", true).intern());
                                                    sb3.append(i11);
                                                    sb3.append(m2057(new int[]{41, i10, 126, 0}, "\u0000\u0001\u0001\u0000", false).intern());
                                                    sb3.append(str2);
                                                    co.m1578(string, sb3.toString(), null);
                                                }
                                            } else {
                                                f1853 = (f1855 + 23) % 128;
                                            }
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            String strM2057 = m2056(f1868, str3.substring(i11));
                            if (strM2057 == null) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(m2057(new int[]{2, 6, 17, 0}, "\u0001\u0001\u0001\u0001\u0001\u0001", false).intern());
                                sb4.append(str);
                                String string2 = sb4.toString();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m2057(new int[]{8, 33, 0, 21}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", true).intern());
                                sb5.append(i11);
                                sb5.append(m2057(new int[]{41, 4, 126, 0}, "\u0000\u0001\u0001\u0000", false).intern());
                                sb5.append(str2);
                                co.m1578(string2, sb5.toString(), null);
                            } else {
                                String strM2058 = m2055(strM2057);
                                arrayList.add(new dy(dy.d.f1909, strM2058, i12));
                                length = strM2058.length() + 2;
                                i11 += length;
                            }
                        }
                    }
                    if (cCharAt == '=') {
                        dy.d dVar2 = dy.d.f1906;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str3.charAt(i11));
                        sb6.append(m2059("乛\uebf7", -Process.getGidForName("")).intern());
                        arrayList.add(new dy(dVar2, sb6.toString(), i12));
                    } else if (cCharAt == '+') {
                        arrayList.add(new dy(dy.d.f1906, m2059("\ue362謺", 1 - TextUtils.indexOf((CharSequence) "", '0')).intern(), i12));
                    } else if (cCharAt == '-') {
                        arrayList.add(new dy(dy.d.f1906, m2057(new int[]{0, 2, 0, 0}, "\u0001\u0000", false).intern(), i12));
                        i11 += 2;
                        f1853 = (f1855 + 67) % 128;
                    }
                    i11 += 2;
                }
                dy.d dVar3 = dy.d.f1906;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str3.charAt(i11));
                arrayList.add(new dy(dVar3, sb7.toString(), i12));
            } else {
                i12++;
                f1855 = (f1853 + 111) % 128;
            }
            i11 = i13;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2058() {
        f1856 = (char) 58808;
        f1857 = (char) 17955;
        f1854 = (char) 21237;
        f1859 = (char) 483;
        f1858 = new char[]{22, '-', kj.e.f102543c, 'i', zi.c.N, zi.c.N, '|', 'a', 16, 'C', 'j', 'k', 'm', 's', 's', 'I', 'C', 'j', 'k', 'n', 'r', 'i', 'h', 'H', 'I', 'p', 'p', 'r', fw.b.f85384k, '2', 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', 'O', 194, 233, 197, '3', 'c', 'f', 'o', 'l', 16, 'G', 'n', 'l', 'n', 'n', 'n', 'q', 'o', 'H', 'J', 'j', '@', '0', 'j', 's', 'h', '\\', '^', 'G', 'S', fw.b.f85385l, '7', 'C', '?', 'A', '^', '\\', '^', 'G', 'S', fw.b.f85385l, '7', 'C', 'E', kj.e.f102543c, '3', kj.e.f102543c, 'A', 'F', 'E', 'C', 'C', 'E', 'H', 'g', '/', fw.b.f85385l, 'l', 'l', 'l'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2059(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1856)) ^ ((c11 >>> 5) + f1854)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1857) ^ ((c12 + i12) ^ ((c12 << 4) + f1859))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2055(String str) {
        f1855 = (f1853 + 9) % 128;
        String strSubstring = str.substring(1, str.length() - 1);
        f1855 = (f1853 + 115) % 128;
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2056(Pattern pattern, String str) {
        f1853 = (f1855 + 101) % 128;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strSubstring = str.substring(matcher.start(), matcher.end());
        int i10 = f1853 + 47;
        f1855 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 33 / 0;
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2057(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f1858, i10, cArr, 0, i11);
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
}
