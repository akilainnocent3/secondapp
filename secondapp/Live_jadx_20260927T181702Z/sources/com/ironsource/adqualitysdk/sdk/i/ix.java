package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import cv.z0;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ix {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2638 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2639 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2642 = 5;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2640 = {'N', 'e', 't', 'U', 'i', 'l', 's', 'E', 'r', 'o', ' ', 'n', 'd', 'g', 'p', 'q', fw.b.f85389p, ':', 'C', '-', 'c', 'z', 'G', 'T', 'O'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2641 = true;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2637 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2644 = 108;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2643 = {193, 192, 178, 153, 164, 188, 187, 191, 175, 219, 218, 224, 209, 229, 220, 205, 216, 213, 207, 155, 214, 223, z0.f77346k, 140, 212, 222, z0.f77347l, 225, 210, 152, 142, 166, 233};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static HttpURLConnection m2504(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2503("\u0002\fÃ", View.MeasureSpec.getMode(0) + 3, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 112)).intern());
        int i10 = f2639 + 21;
        f2638 = i10 % 128;
        if (i10 % 2 != 0) {
            return httpURLConnection;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static iq m2505(JSONObject jSONObject, String str) {
        HttpURLConnection httpURLConnectionM2507;
        long jM2733;
        String strM2510;
        int responseCode;
        String responseMessage;
        int i10 = f2639 + 23;
        f2638 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                httpURLConnectionM2507 = m2507(str);
                byte[] bArrM2512 = m2512(httpURLConnectionM2507, jSONObject);
                jM2733 = jx.m2733();
                m2514(httpURLConnectionM2507, bArrM2512);
                strM2510 = m2510(httpURLConnectionM2507);
                responseCode = httpURLConnectionM2507.getResponseCode();
                responseMessage = httpURLConnectionM2507.getResponseMessage();
                if (responseCode >= 28484) {
                    httpURLConnectionM2507.disconnect();
                }
            } else {
                httpURLConnectionM2507 = m2507(str);
                byte[] bArrM2513 = m2512(httpURLConnectionM2507, jSONObject);
                jM2733 = jx.m2733();
                m2514(httpURLConnectionM2507, bArrM2513);
                strM2510 = m2510(httpURLConnectionM2507);
                responseCode = httpURLConnectionM2507.getResponseCode();
                responseMessage = httpURLConnectionM2507.getResponseMessage();
                if (responseCode >= 400) {
                    httpURLConnectionM2507.disconnect();
                }
            }
            String str2 = responseMessage;
            iq iqVar = new iq(strM2510, responseCode, str2, jx.m2733() - jM2733);
            int i11 = f2638 + 9;
            f2639 = i11 % 128;
            if (i11 % 2 == 0) {
                return iqVar;
            }
            throw null;
        } catch (Throwable th2) {
            String strIntern = m2503("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", Process.getGidForName("") + 9, (byte) (Gravity.getAbsoluteGravity(0, 0) + 35)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2503("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u0013\u000e\u0007\u0001\r\u0005\u0000\u0010\u0015\u0006\u0007\u0001\u000f\f", 28 - TextUtils.indexOf("", ""), (byte) (89 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2785(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static iq m2508(String str) {
        HttpURLConnection httpURLConnectionM2504;
        long jM2733;
        String strM2510;
        int responseCode;
        String responseMessage;
        int i10 = f2639 + 75;
        f2638 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                httpURLConnectionM2504 = m2504(str);
                jM2733 = jx.m2733();
                strM2510 = m2510(httpURLConnectionM2504);
                responseCode = httpURLConnectionM2504.getResponseCode();
                responseMessage = httpURLConnectionM2504.getResponseMessage();
                if (responseCode >= 29428) {
                    httpURLConnectionM2504.disconnect();
                }
            } else {
                httpURLConnectionM2504 = m2504(str);
                jM2733 = jx.m2733();
                strM2510 = m2510(httpURLConnectionM2504);
                responseCode = httpURLConnectionM2504.getResponseCode();
                responseMessage = httpURLConnectionM2504.getResponseMessage();
                if (responseCode >= 400) {
                    httpURLConnectionM2504.disconnect();
                }
            }
            iq iqVar = new iq(strM2510, responseCode, responseMessage, jx.m2733() - jM2733);
            int i11 = f2638 + 47;
            f2639 = i11 % 128;
            if (i11 % 2 == 0) {
                return iqVar;
            }
            throw null;
        } catch (Throwable th2) {
            String strIntern = m2503("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", (ViewConfiguration.getPressedStateDuration() >> 16) + 8, (byte) (35 - Color.green(0))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2503("\b\t\t\u0005\u0005\r\u000b\u0006\f\r\u0001\u000e\u000e\u000b\u000b\u0003\u0000\f\u0006\u0003\u0010\u0011\u0006\u000b\u0007\u0016\u0087", 27 - TextUtils.getOffsetBefore("", 0), (byte) (View.combineMeasuredStates(0, 0) + 103)).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2785(strIntern, sb2.toString(), th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2514(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.connect();
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.flush();
        m2511(dataOutputStream);
        f2638 = (f2639 + 99) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m2516(iq iqVar) {
        int i10 = f2638 + 43;
        f2639 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (iqVar == null) {
            return null;
        }
        String strM2471 = iqVar.m2471();
        f2638 = (f2639 + 57) % 128;
        return strM2471;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2503(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            try {
                char[] cArr2 = f2640;
                char c10 = f2642;
                char[] cArr3 = new char[i10];
                if (i10 % 2 != 0) {
                    i10--;
                    cArr3[i10] = (char) (cArr[i10] - b10);
                }
                if (i10 > 1) {
                    g.f2134 = 0;
                    while (true) {
                        int i11 = g.f2134;
                        if (i11 >= i10) {
                            break;
                        }
                        g.f2133 = cArr[i11];
                        g.f2131 = cArr[g.f2134 + 1];
                        if (g.f2133 == g.f2131) {
                            cArr3[g.f2134] = (char) (g.f2133 - b10);
                            cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                        } else {
                            g.f2132 = g.f2133 / c10;
                            g.f2130 = g.f2133 % c10;
                            g.f2135 = g.f2131 / c10;
                            g.f2128 = g.f2131 % c10;
                            if (g.f2130 == g.f2128) {
                                g.f2132 = ((g.f2132 + c10) - 1) % c10;
                                g.f2135 = ((g.f2135 + c10) - 1) % c10;
                                int i12 = (g.f2132 * c10) + g.f2130;
                                int i13 = (g.f2135 * c10) + g.f2128;
                                int i14 = g.f2134;
                                cArr3[i14] = cArr2[i12];
                                cArr3[i14 + 1] = cArr2[i13];
                            } else if (g.f2132 == g.f2135) {
                                g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                int i15 = (g.f2132 * c10) + g.f2130;
                                int i16 = (g.f2135 * c10) + g.f2128;
                                int i17 = g.f2134;
                                cArr3[i17] = cArr2[i15];
                                cArr3[i17 + 1] = cArr2[i16];
                            } else {
                                int i18 = (g.f2132 * c10) + g.f2128;
                                int i19 = (g.f2135 * c10) + g.f2130;
                                int i20 = g.f2134;
                                cArr3[i20] = cArr2[i18];
                                cArr3[i20 + 1] = cArr2[i19];
                            }
                        }
                        g.f2134 += 2;
                    }
                }
                str2 = new String(cArr3);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2515(String str) {
        int i10 = f2639 + 65;
        f2638 = i10 % 128;
        int i11 = i10 % 2;
        int length = str.length();
        if (i11 == 0) {
            if (length <= 5209) {
                return false;
            }
        } else if (length <= 256) {
            return false;
        }
        int i12 = f2639 + 15;
        f2638 = i12 % 128;
        if (i12 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2512(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws Throwable {
        String strM2506 = m2506(jSONObject);
        byte[] bytes = strM2506.getBytes(m2509(null, 127 - (Process.myTid() >> 22), null, "\u0085\u0084\u0083\u0082\u0081").intern());
        if (!m2515(strM2506)) {
            return bytes;
        }
        f2639 = (f2638 + 121) % 128;
        httpURLConnection.setRequestProperty(m2503("\u0013\b\f\u0001\u0006\u0010\u0004\u0011\u0006\f\u0018\u0005\u000e\u0002\f\u000e", 16 - View.getDefaultSize(0, 0), (byte) (20 - TextUtils.getCapsMode("", 0, 0))).intern(), m2503("\u000b\u0017\t\u0013", 4 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 14)).intern());
        byte[] bArrM2513 = m2513(bytes);
        f2638 = (f2639 + 109) % 128;
        return bArrM2513;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static HttpURLConnection m2507(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(m2509(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0082\u0088\u0087\u0086").intern());
        httpURLConnection.setRequestProperty(m2509(null, (Process.myTid() >> 22) + 127, null, "\u008d\u008f\u008e\u0082\u0084\u008c\u008b\u008d\u008c\u008b\u008a\u0089").intern(), m2509(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0085\u0084\u009d\u008c\u009c\u009b\u008c\u008d\u0096\u009a\u0090\u0099\u0093\u0098\u0097\u008b\u008a\u0096\u0095\u0094\u008b\u008a\u0092\u008c\u0090\u0093\u0092\u0091\u008f\u008f\u0090").intern());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(60000);
        f2639 = (f2638 + 17) % 128;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2510(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        String string = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        f2639 = (f2638 + 5) % 128;
                        if (stringBuffer.length() > 0) {
                            int i10 = f2638 + 109;
                            f2639 = i10 % 128;
                            if (i10 % 2 != 0) {
                                stringBuffer.append('a');
                            } else {
                                stringBuffer.append('\r');
                            }
                        }
                        stringBuffer.append(line);
                    }
                    string = stringBuffer.toString();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        k.m2785(m2503("\u0001\u0002\u0003\u0004\u0003\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 8, (byte) (35 - Gravity.getAbsoluteGravity(0, 0))).intern(), m2503("\b\t\t\u0005\u0005\r\u000b\u0003\u008a\u008a\u0001\u000e\u000e\u000b\u0006\u0003\t\u000b\u0006\u000e\u000b\u0006", ExpandableListView.getPackedPositionGroup(0L) + 22, (byte) (22 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern(), th);
                    } finally {
                        m2511(inputStream);
                        m2511(bufferedReader);
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            bufferedReader = null;
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2506(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strM2706 = jv.m2706(string);
        String strSubstring = string.substring(0, string.lastIndexOf(125));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strSubstring);
        sb2.append(m2509(null, 127 - TextUtils.indexOf("", "", 0), null, "\u009f \u009f\u0096\u0099\u009f\u009e").intern());
        sb2.append(strM2706);
        sb2.append(m2509(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "¡\u009f").intern());
        String string2 = sb2.toString();
        f2639 = (f2638 + 73) % 128;
        return string2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m2511(Closeable closeable) {
        f2639 = (f2638 + 29) % 128;
        if (closeable != null) {
            try {
                closeable.close();
                f2639 = (f2638 + 21) % 128;
            } catch (Throwable unused) {
                return;
            }
        }
        int i10 = f2638 + 93;
        f2639 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 30 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] m2513(byte[] bArr) throws Throwable {
        GZIPOutputStream gZIPOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.flush();
                    gZIPOutputStream2.close();
                    return byteArrayOutputStream.toByteArray();
                } catch (Exception e10) {
                    e = e10;
                    gZIPOutputStream = gZIPOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    if (gZIPOutputStream != null) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2509(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2643;
                int i11 = f2644;
                if (f2637) {
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
                if (f2641) {
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
