package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class jz {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2931 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2932 = {261, 270, 266, 265, 272, 303, 292, 295, 302, 256, 301, 298, 219, 305, 284, 287, 297, 290, 293, 233, 227, 304, 286, 288, 228, 307, 308, 271, 291};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2933 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2934 = 187;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2935 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2936 = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        /* JADX INFO: renamed from: ﾒ */
        T mo505(JSONArray jSONArray, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo504(JSONObject jSONObject, String str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2748(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) {
        int i10 = f2931 + 125;
        int i11 = i10 % 128;
        f2933 = i11;
        if (i10 % 2 != 0) {
            int i12 = 89 / 0;
            if (jSONObject == null) {
                return;
            }
        } else if (jSONObject == null) {
            return;
        }
        int i13 = i11 + 71;
        f2931 = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 54 / 0;
            if (jSONObject2 == null) {
                return;
            }
        } else if (jSONObject2 == null) {
            return;
        }
        int i15 = i11 + 81;
        f2931 = i15 % 128;
        if (i15 % 2 == 0) {
            jSONObject2.keys();
            throw null;
        }
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                jSONObject.put(next, jSONObject2.opt(next));
            } catch (JSONException unused) {
            }
        }
        if (z10) {
            f2931 = (f2933 + 125) % 128;
            jSONObject.remove(ih.f2535);
            f2931 = (f2933 + 101) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m2749(JSONObject jSONObject) {
        int i10 = f2931 + 97;
        f2933 = i10 % 128;
        int i11 = i10 % 2;
        return m2761(jSONObject, false);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2753(JSONObject jSONObject, int i10, List<String> list) {
        int i11 = f2931 + 33;
        f2933 = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                jSONObject.names();
                throw null;
            }
            JSONArray jSONArrayNames = jSONObject.names();
            if (jSONArrayNames != null) {
                f2933 = (f2931 + 121) % 128;
                for (int i12 = 0; i12 < jSONArrayNames.length(); i12++) {
                    f2933 = (f2931 + 119) % 128;
                    String strOptString = jSONArrayNames.optString(i12);
                    if (list != null) {
                        f2933 = (f2931 + 69) % 128;
                        if (!list.contains(strOptString)) {
                            m2759(jSONObject, strOptString, i10);
                        }
                    } else {
                        m2759(jSONObject, strOptString, i10);
                    }
                }
            }
        } catch (JSONException e10) {
            k.m2785(m2754((String) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2754((String) null, 126 - Process.getGidForName(""), (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u0092\u0091\u0087\u0086\u008f\u0090\u0087\u0088\u008f\u008e\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <T> List<T> m2755(JSONArray jSONArray) {
        List<T> listM2760 = m2760(jSONArray, new b<T>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.b
            /* JADX INFO: renamed from: ﾒ */
            public final T mo505(JSONArray jSONArray2, int i10) {
                return (T) jSONArray2.opt(i10);
            }
        });
        int i10 = f2933 + 113;
        f2931 = i10 % 128;
        if (i10 % 2 != 0) {
            return listM2760;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m2761(JSONObject jSONObject, boolean z10) {
        int i10 = f2933 + 47;
        f2931 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                if (!z10) {
                    return jSONObject2;
                }
                int i11 = f2933 + 41;
                f2931 = i11 % 128;
                if (i11 % 2 != 0) {
                    jSONObject2.remove(ih.f2535);
                    return jSONObject2;
                }
                jSONObject2.remove(ih.f2535);
                throw null;
            } catch (JSONException unused) {
            }
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2750(JSONObject jSONObject, JSONObject jSONObject2) {
        f2933 = (f2931 + 3) % 128;
        m2748(jSONObject, jSONObject2, false);
        int i10 = f2933 + 105;
        f2931 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 83 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m2756(JSONObject jSONObject, String str, List<String> list) {
        f2931 = (f2933 + 71) % 128;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            return m2745(jSONArrayOptJSONArray);
        }
        int i10 = f2931 + 39;
        f2933 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 55 / 0;
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2759(JSONObject jSONObject, String str, int i10) throws JSONException {
        String strM2751 = m2751(jSONObject.opt(str), i10);
        if (strM2751 != null) {
            int i11 = f2933 + 79;
            f2931 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 25 / 0;
                if (strM2751.equals("")) {
                    f2931 = (f2933 + 19) % 128;
                    strM2751 = null;
                }
            } else if (strM2751.equals("")) {
                f2931 = (f2933 + 19) % 128;
                strM2751 = null;
            }
            jSONObject.put(str, strM2751);
        }
        int i13 = f2933 + 63;
        f2931 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a A[PHI: r3
      0x002a: PHI (r3v5 T) = (r3v4 T), (r3v6 T) binds: [B:12:0x0028, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> List<T> m2760(JSONArray jSONArray, b<T> bVar) {
        T tMo505;
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            int i11 = f2933 + 83;
            f2931 = i11 % 128;
            if (i11 % 2 == 0) {
                tMo505 = bVar.mo505(jSONArray, i10);
                int i12 = 4 / 0;
                if (tMo505 != null) {
                    f2931 = (f2933 + 9) % 128;
                    arrayList.add(tMo505);
                }
            } else {
                tMo505 = bVar.mo505(jSONArray, i10);
                if (tMo505 != null) {
                    f2931 = (f2933 + 9) % 128;
                    arrayList.add(tMo505);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Map<String, String> m2757(JSONObject jSONObject) {
        Map<String, String> mapM2752 = m2752(jSONObject, new c<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.jz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.jz.c
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ String mo504(JSONObject jSONObject2, String str) {
                return jSONObject2.optString(str, null);
            }
        });
        int i10 = f2931 + 11;
        f2933 = i10 % 128;
        if (i10 % 2 == 0) {
            return mapM2752;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<String> m2745(JSONArray jSONArray) {
        int i10 = f2933;
        int i11 = i10 + 21;
        f2931 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        if (jSONArray != null) {
            return m2755(jSONArray);
        }
        f2931 = (i10 + 79) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m2758(int i10, int i11, long j10, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (j10 > -1) {
                f2933 = (f2931 + 117) % 128;
                jSONObject.put(m2754((String) null, Color.alpha(0) + 127, (int[]) null, "\u009a").intern(), i10);
                jSONObject.put(m2754((String) null, 127 - ExpandableListView.getPackedPositionType(0L), (int[]) null, "\u009b").intern(), i11);
                jSONObject.put(m2754((String) null, Color.argb(0, 0, 0, 0) + 127, (int[]) null, "\u0086").intern(), j10);
                jSONObject.put(m2754((String) null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), (int[]) null, "\u0096").intern(), j11);
                f2933 = (f2931 + 15) % 128;
                return jSONObject;
            }
            jSONObject.put(m2754((String) null, 127 - Color.alpha(0), (int[]) null, "\u009a").intern(), -1);
            jSONObject.put(m2754((String) null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), (int[]) null, "\u009b").intern(), -1);
            jSONObject.put(m2754((String) null, 128 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (int[]) null, "\u0086").intern(), -1);
            jSONObject.put(m2754((String) null, ((byte) KeyEvent.getModifierMetaStateMask()) + 128, (int[]) null, "\u0096").intern(), -1);
            return jSONObject;
        } catch (JSONException e10) {
            k.m2785(m2754((String) null, 127 - (KeyEvent.getMaxKeyCode() >> 16), (int[]) null, "\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2754((String) null, ExpandableListView.getPackedPositionChild(0L) + 128, (int[]) null, "\u0091\u008c\u0089\u0093\u008d\u009d\u0097\u0096\u008c\u009c\u0086\u0089\u008f\u0088\u008d\u0092\u0091\u0087\u0086\u008f\u0098\u008b\u0097\u008d\u008b\u008c\u008b\u008b\u008a").intern(), e10);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2751(Object obj, int i10) throws JSONException {
        int i11 = f2931 + 13;
        int i12 = i11 % 128;
        f2933 = i12;
        if (i11 % 2 == 0) {
            if (obj instanceof JSONObject) {
                m2747((JSONObject) obj, i10);
            } else if (obj instanceof JSONArray) {
                int i13 = i12 + 83;
                f2931 = i13 % 128;
                if (i13 % 2 == 0) {
                    m2762((JSONArray) obj, i10);
                    int i14 = 67 / 0;
                } else {
                    m2762((JSONArray) obj, i10);
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > i10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.substring(0, i10));
                    sb2.append(m2754((String) null, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 128, (int[]) null, "\u0099\u0090\u0098\u0086\u008f\u0097\u0091\u0096\u008b\u0086\u0095\u0094\u0094\u0094").intern());
                    return sb2.toString();
                }
                f2933 = (f2931 + 43) % 128;
                return str;
            }
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2747(JSONObject jSONObject, int i10) {
        f2931 = (f2933 + 21) % 128;
        m2753(jSONObject, i10, null);
        f2933 = (f2931 + 29) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2746(JSONArray jSONArray, int i10, int i11) throws JSONException {
        String strM2751;
        int i12 = f2931 + 111;
        f2933 = i12 % 128;
        if (i12 % 2 != 0) {
            strM2751 = m2751(jSONArray.opt(i10), i11);
            int i13 = 33 / 0;
            if (strM2751 == null) {
                return;
            }
        } else {
            strM2751 = m2751(jSONArray.opt(i10), i11);
            if (strM2751 == null) {
                return;
            }
        }
        jSONArray.put(i10, strM2751);
        f2933 = (f2931 + 85) % 128;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static void m2762(JSONArray jSONArray, int i10) throws JSONException {
        f2931 = (f2933 + 115) % 128;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            f2931 = (f2933 + 59) % 128;
            m2746(jSONArray, i11, i10);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> Map<String, T> m2752(JSONObject jSONObject, c<T> cVar) {
        if (jSONObject == null) {
            return null;
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            int i10 = f2931 + 71;
            f2933 = i10 % 128;
            if (i10 % 2 == 0) {
                String next = itKeys.next();
                map.put(next, cVar.mo504(jSONObject, next));
                f2933 = (f2931 + 69) % 128;
            } else {
                String next2 = itKeys.next();
                map.put(next2, cVar.mo504(jSONObject, next2));
                throw null;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2754(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2932;
                int i11 = f2934;
                if (f2936) {
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
                if (f2935) {
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
