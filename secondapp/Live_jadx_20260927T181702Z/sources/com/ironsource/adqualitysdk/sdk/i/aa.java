package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class aa<T> extends w<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f69 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f70 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f71 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f72 = {-72, f6.q.A, -124, -66, rg.a.f127263w, -121, rg.a.f127263w, -114, 114, -65, l3.a.f103502w7, 62, l3.a.A7, 49, l3.a.f103502w7, -34, 35, -28, 13, -43, 59, -44, 51, 58, l3.a.f103493v7, l3.a.f103476t7, -79, -74, 66, -74, 106, -128, -80, 73, -71, 87, 90, -111, -80, 0, -3, 74, 6, l3.a.C7, 76, -78, 79, 98, -76, 9, -27, -16, -3, l3.a.f103444p7, 37, -37, 53, -116, f6.q.A, 49, l3.a.f103520y7, yr.a.f159811k, -56, l3.a.f103484u7, 54, -113, 102, l3.a.f103511x7, 53, -56, -27};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f73 = 1306129093;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f74 = 673858351;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f75 = 81;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<WebView, js> f76 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<jk> f77 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jp f78;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f79;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f80;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f81;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private js f82;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f83;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aa$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class AnonymousClass3 implements jk {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f84 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f87 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean f89 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f91 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f92 = 14;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f90 = {129, 130, 'p', 'q', 'o', 's', 'r', fw.b.f85389p, 'e', 'd', 'w', 133, 'O', 'V', '|', 'z', 128, 'S', fw.b.f85383j, kj.e.f102543c, 132, 'x'};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static long f85 = -6702392760180083472L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f86 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f88 = 0;

        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ void m223(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z10) {
            int i10 = f84 + 55;
            f87 = i10 % 128;
            int i11 = i10 % 2;
            anonymousClass3.m224(webView, str, z10);
            if (i11 != 0) {
                int i12 = 86 / 0;
            }
            f84 = (f87 + 111) % 128;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m224(final WebView webView, final String str, final boolean z10) {
            t.m2948(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo231() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo213 = aa.this.mo213(webView);
                    t.m2950(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3.2

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f102 = 1;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f103 = 0;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static long f104 = 51974363563975081L;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m232(String str2, int i10) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (h.f2284) {
                                try {
                                    char[] cArrM2198 = h.m2198(f104, cArr, i10);
                                    h.f2285 = 4;
                                    while (true) {
                                        int i11 = h.f2285;
                                        if (i11 < cArrM2198.length) {
                                            h.f2283 = i11 - 4;
                                            int i12 = h.f2285;
                                            cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f104));
                                            h.f2285++;
                                        } else {
                                            str3 = new String(cArrM2198, 4, cArrM2198.length - 4);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo231() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ih.f2526, str);
                                jSONObject.put(ih.f2527, m232("\udf94\udfe3눟폀\uef77ⱆ붗", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                                jSONObject.put(ih.f2539, originalUrl);
                                if (z10) {
                                    f103 = (f102 + 105) % 128;
                                    jSONObject.put(ih.f2536, true);
                                }
                                f103 = (f102 + 45) % 128;
                            } catch (JSONException e10) {
                                String strIntern = m232("\u191f᥈軳\uef3f᭤\ud854\ue8ef챂鿒ܗ釕果ᐳ膆ࢯ\ufe6f誗᫆輏瓗", 1 - (Process.myTid() >> 22)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m232("孊嬏탬넷ﵥ㹅荤\ua7f0\udd9c奚矐ఝ噧\udfa7\ueeab闚죈䓅楛ὴ䆶쵧\ue3c4預艹뎀媰憰糼㢌핏", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                                sb2.append(e10.getLocalizedMessage());
                                k.m2765(strIntern, sb2.toString());
                            }
                            C05603 c05603 = C05603.this;
                            aa aaVar = aa.this;
                            aaVar.mo1668(jSONObject, webView, aa.m208(aaVar), objMo213);
                        }
                    });
                }
            });
            f84 = (f87 + 27) % 128;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m226(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f90;
                    int i11 = f92;
                    if (f91) {
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
                    if (f89) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo229(WebView webView, String str, String str2) {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (strSubstring.equals(m226(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                f84 = (f87 + 109) % 128;
                aa.m200(aa.this, webView);
                return;
            }
            if (strSubstring.equals(m225("Ⲥ턿\ue4bbა꺭㽪", (char) (ExpandableListView.getPackedPositionChild(0L) + 59468), "\uf4f0ꁐ克ꋼ", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "楬怕䯷珨").intern())) {
                JSONObject jSONObjectM202 = aa.m202(strSubstring2);
                aa aaVar = aa.this;
                aaVar.m221(jSONObjectM202, webView, aaVar.mo213(webView));
                return;
            }
            if (strSubstring.equals(m226(null, 127 - View.resolveSize(0, 0), null, "\u0085\u0085\u0084\u0083\u0082\u0081").intern())) {
                int i10 = f87 + 113;
                f84 = i10 % 128;
                if (i10 % 2 != 0) {
                    JSONObject jSONObjectM203 = aa.m202(strSubstring2);
                    aa aaVar2 = aa.this;
                    aaVar2.mo1659(jSONObjectM203, webView, aa.m208(aaVar2), aa.this.mo213(webView));
                    return;
                } else {
                    JSONObject jSONObjectM204 = aa.m202(strSubstring2);
                    aa aaVar3 = aa.this;
                    aaVar3.mo1659(jSONObjectM204, webView, aa.m208(aaVar3), aa.this.mo213(webView));
                    int i11 = 39 / 0;
                    return;
                }
            }
            if (!strSubstring.equals(m226(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0084\u0085\u0084\u0083\u0082\u0081").intern())) {
                if (strSubstring.equals(m226(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0087\u0085\u0084\u0083\u0082\u0081").intern())) {
                    f84 = (f87 + 59) % 128;
                    JSONObject jSONObjectM205 = aa.m202(strSubstring2);
                    kd.m2829(jSONObjectM205.optString(m226(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0088\u0085\u0082").intern()), jSONObjectM205.optString(m225("흹ꀂ䘩몚㍖", (char) (49468 - ((byte) KeyEvent.getModifierMetaStateMask())), "\uf4f0ꁐ克ꋼ", 1031845588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "픝肶㴽濁").intern()), jSONObjectM205.optString(m225("ﱅ\ud835ƻ攬ﵣ桯", (char) (Color.argb(0, 0, 0, 0) + 1886), "\uf4f0ꁐ克ꋼ", (-1) - MotionEvent.axisFromString(""), "顭谐廪萇").intern()), jSONObjectM205.optString(m225("髂鿻懄쩮\uf4ae", (char) (50576 - Color.red(0)), "\uf4f0ꁐ克ꋼ", (-1758873904) - View.MeasureSpec.getSize(0), "킥⦶邗\uf8c5").intern()));
                    return;
                }
                return;
            }
            int i12 = f87 + 27;
            f84 = i12 % 128;
            if (i12 % 2 != 0) {
                JSONObject jSONObjectM206 = aa.m202(strSubstring2);
                jSONObjectM206.remove(ih.f2535);
                aa aaVar4 = aa.this;
                aaVar4.mo1667(jSONObjectM206, webView, aaVar4.mo213(webView));
                return;
            }
            JSONObject jSONObjectM207 = aa.m202(strSubstring2);
            jSONObjectM207.remove(ih.f2535);
            aa aaVar5 = aa.this;
            aaVar5.mo1667(jSONObjectM207, webView, aaVar5.mo213(webView));
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void mo230(final WebView webView, final String str, final boolean z10) {
            t.m2950(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo231() {
                    if (aa.m207(aa.this)) {
                        if (aa.m201(aa.this) == null || aa.m201(aa.this).isEmpty()) {
                            AnonymousClass3.m223(AnonymousClass3.this, webView, str, z10);
                            return;
                        }
                        Iterator it = aa.m201(aa.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m223(AnonymousClass3.this, webView, str, z10);
                                return;
                            }
                        }
                    }
                }
            });
            f87 = (f84 + 59) % 128;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo227(WebView webView) {
            f84 = (f87 + 65) % 128;
            aa.m200(aa.this, webView);
            f87 = (f84 + 79) % 128;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m225(String str, char c10, String str2, int i10, String str3) {
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f85) ^ ((long) f86)) ^ ((long) f88));
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo228(WebView webView, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ih.f2537, str);
                jSONObject.put(ih.f2534, ih.f2531);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ih.f2538, jSONObject);
                aa aaVar = aa.this;
                aaVar.mo1664(jSONObject2, webView, this, aaVar.mo213(webView));
                f87 = (f84 + 93) % 128;
            } catch (Exception e10) {
                kd.m2827(m226(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0091\u0086\u0090\u0087\u008f\u0085\u008e\u0087\u008d\u008c\u0086\u008b\u008a\u0083\u0086\u0089").intern(), m226(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u008f\u0093\u0081\u0096\u0094\u0082\u008f\u0086\u0095\u0086\u0094\u0084\u0084\u008c\u0094\u0088\u008f\u008b\u0082\u0085\u0086\u0091\u0084\u0094\u0091\u0093\u0091\u0091\u0092").intern(), e10, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m200(aa aaVar, WebView webView) {
        int i10 = f70 + 41;
        f71 = i10 % 128;
        int i11 = i10 % 2;
        aaVar.m205(webView);
        if (i11 != 0) {
            throw null;
        }
        f71 = (f70 + 45) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m201(aa aaVar) {
        int i10 = (f70 + 109) % 128;
        f71 = i10;
        List<String> list = aaVar.f81;
        f70 = (i10 + 111) % 128;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ bb.e m208(aa aaVar) {
        f70 = (f71 + 65) % 128;
        bb.e eVarM210 = aaVar.m210();
        f70 = (f71 + 125) % 128;
        return eVarM210;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        WebView webView;
        try {
            if (view instanceof WebView) {
                int i18 = f70 + 45;
                f71 = i18 % 128;
                if (i18 % 2 != 0) {
                    webView = (WebView) view;
                    int i19 = 55 / 0;
                    if (!this.f76.containsKey(webView)) {
                        return;
                    }
                } else {
                    webView = (WebView) view;
                    if (!this.f76.containsKey(webView)) {
                        return;
                    }
                }
                m205(webView);
                f70 = (f71 + 29) % 128;
            }
        } catch (Throwable th2) {
            kd.m2827(m204((-673858342) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1306129007) - TextUtils.lastIndexOf("", '0'), (byte) ((-57) - Color.blue(0)), TextUtils.indexOf("", "", 0, 0) - 82).intern(), m204(Color.alpha(0) - 673858326, (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1306129024) - TextUtils.getCapsMode("", 0, 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 80), (-82) - (Process.myTid() >> 22)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract T mo213(WebView webView);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo217(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f71 + 101;
        f70 = i10 % 128;
        int i11 = i10 % 2;
        m221(jSONObject, (WebView) obj, obj2);
        if (i11 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ void mo222(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f71 + 29;
        f70 = i10 % 128;
        int i11 = i10 % 2;
        m203(jSONObject, (WebView) obj, obj2);
        if (i11 == 0) {
            throw null;
        }
        int i12 = f70 + 109;
        f71 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m202(String str) {
        int i10 = f70 + 7;
        f71 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM211 = m211(str);
        if (i11 != 0) {
            int i12 = 64 / 0;
        }
        return jSONObjectM211;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m207(aa aaVar) {
        int i10 = f70;
        f71 = (i10 + 59) % 128;
        boolean z10 = aaVar.f79;
        f71 = (i10 + 59) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bb.e m210() {
        js jsVar = this.f82;
        if (jsVar != null) {
            f71 = (f70 + 49) % 128;
            bb.e eVarM2677 = jsVar.m2677();
            f70 = (f71 + 123) % 128;
            return eVarM2677;
        }
        int i10 = f71 + 27;
        f70 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final WebView m212() {
        int i10 = f70;
        f71 = (i10 + 79) % 128;
        js jsVar = this.f82;
        if (jsVar == null) {
            return null;
        }
        int i11 = i10 + 97;
        f71 = i11 % 128;
        if (i11 % 2 == 0) {
            return jsVar.m2679();
        }
        jsVar.m2679();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m219(WebView webView) {
        int i10 = f71 + 117;
        f70 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
            if (webView == null) {
                return;
            }
        } else if (webView == null) {
            return;
        }
        if (this.f76.containsKey(webView)) {
            return;
        }
        f70 = (f71 + 111) % 128;
        js jsVarM2672 = js.m2672(webView, m204(View.resolveSizeAndState(0, 0, 0) - 673858351, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 1306128996, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 113), TextUtils.getOffsetBefore("", 0) - 82).intern());
        if (this.f82 == null) {
            this.f82 = jsVarM2672;
            f70 = (f71 + 83) % 128;
        }
        this.f76.put(webView, jsVarM2672);
        jk jkVarM209 = m209();
        this.f77.add(jkVarM209);
        jsVarM2672.m2675(jkVarM209);
        m205(webView);
        webView.addOnLayoutChangeListener(this);
        f70 = (f71 + 31) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m214(List<WebView> list) {
        int i10 = f70 + 83;
        f71 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
            if (list == null) {
                return;
            }
        } else if (list == null) {
            return;
        }
        Iterator<WebView> it = list.iterator();
        f70 = (f71 + 99) % 128;
        while (it.hasNext()) {
            m219(it.next());
            f71 = (f70 + 3) % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m216(String str, List<String> list, boolean z10, boolean z11, boolean z12) {
        this.f83 = z10;
        this.f78 = new jp(str, z12);
        this.f79 = z11;
        this.f81 = list;
        int i10 = f71 + 11;
        f70 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m199(WebView webView) {
        int i10 = f71 + 29;
        f70 = i10 % 128;
        if (i10 % 2 == 0) {
            this.f78.m2666(webView);
            throw null;
        }
        this.f78.m2666(webView);
        f71 = (f70 + 3) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m211(String str) {
        f71 = (f70 + 21) % 128;
        try {
            String strDecode = URLDecoder.decode(str, m204((-673858303) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-1) - MotionEvent.axisFromString("")), TextUtils.getTrimmedLength("") - 1306129008, (byte) (2 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 83).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                return new JSONObject(strDecode);
            }
        } catch (Exception e10) {
            k.m2785(m204((ViewConfiguration.getFadingEdgeLength() >> 16) - 673858342, (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1306129006) - Color.blue(0), (byte) ((-58) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) - 81).intern(), m204((-673858298) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((-1) - TextUtils.lastIndexOf("", '0')), (-1306129024) - TextUtils.getTrimmedLength(""), (byte) ((-57) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 81).intern(), e10);
        }
        JSONObject jSONObject = new JSONObject();
        f71 = (f70 + 67) % 128;
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m215() {
        for (WebView webView : this.f76.keySet()) {
            webView.removeOnLayoutChangeListener(this);
            js jsVar = this.f76.get(webView);
            Iterator<jk> it = this.f77.iterator();
            while (it.hasNext()) {
                int i10 = f70 + 41;
                f71 = i10 % 128;
                if (i10 % 2 == 0) {
                    jsVar.m2680(it.next());
                } else {
                    jsVar.m2680(it.next());
                    throw null;
                }
            }
            f70 = (f71 + 15) % 128;
        }
        this.f77.clear();
        this.f82 = null;
        this.f76.clear();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m203(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f71 + 103;
        f70 = i10 % 128;
        if (i10 % 2 != 0) {
            jSONObject.remove(ih.f2535);
            super.mo222(jSONObject, webView, t10);
            f70 = (f71 + 109) % 128;
        } else {
            jSONObject.remove(ih.f2535);
            super.mo222(jSONObject, webView, t10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jk m209() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        f70 = (f71 + 67) % 128;
        return anonymousClass3;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m220(String str) {
        int i10 = (f70 + 91) % 128;
        f71 = i10;
        this.f80 = str;
        int i11 = i10 + 63;
        f70 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String mo218(T t10) {
        int i10 = f70;
        String str = this.f80;
        f71 = (i10 + 105) % 128;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m221(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f70 + 59;
        f71 = i10 % 128;
        if (i10 % 2 == 0) {
            m206(jSONObject, webView);
            super.mo217(jSONObject, webView, t10);
        } else {
            m206(jSONObject, webView);
            super.mo217(jSONObject, webView, t10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m205(WebView webView) {
        int i10 = f70 + 111;
        f71 = i10 % 128;
        if (i10 % 2 == 0) {
            js jsVar = this.f76.get(webView);
            if (this.f83 && jsVar.m2676()) {
                if (!ki.m2868(webView)) {
                    jsVar.m2678();
                }
                m199(webView);
            }
            int i11 = f71 + 1;
            f70 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.f76.get(webView);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m206(JSONObject jSONObject, WebView webView) {
        boolean z10;
        if (webView != null) {
            f71 = (f70 + 9) % 128;
            try {
                String str = ih.f2498;
                if (webView.getWindowToken() != null) {
                    z10 = true;
                } else {
                    f71 = (f70 + 31) % 128;
                    z10 = false;
                }
                jSONObject.put(str, z10);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m204(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f75;
                int i14 = i12 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f72;
                    if (bArr != null) {
                        i14 = (byte) (bArr[f74 + i10] + i13);
                    } else {
                        i14 = (short) (f69[f74 + i10] + i13);
                    }
                }
                if (i14 > 0) {
                    o.f2994 = ((i10 + i14) - 2) + f74 + i15;
                    o.f2995 = b10;
                    char c10 = (char) (i11 + f73);
                    o.f2997 = c10;
                    sb2.append(c10);
                    o.f2996 = o.f2997;
                    o.f2998 = 1;
                    while (o.f2998 < i14) {
                        byte[] bArr2 = f72;
                        if (bArr2 != null) {
                            int i16 = o.f2994;
                            o.f2994 = i16 - 1;
                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                        } else {
                            short[] sArr = f69;
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
