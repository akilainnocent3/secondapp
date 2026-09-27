package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import com.vungle.ads.internal.signals.SignalKey;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class hz {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2440 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2441 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2442 = 200;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2444 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2445 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Map<hy.a, ht> f2446;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2443 = {279, 298, 306, 301, 299, 316, 270, 305, 310, 300, 314, 232, 321, 312, 302, 311, 309, 315, 244, 269, 303, 308, 297, 304, 320, 267, 277, 318};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2439 = {1026070196, -1497733472, 1007237320, 748579486, 709667319, 1802634736, 1645467311, 2040079237, 902973595, 162566763, 917144358, 78795934, 1736430505, -1215225542, 1366241589, -1802646025, -217124763, 1964028701};

    public hz() {
        m2401((String) null, Gravity.getAbsoluteGravity(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        this.f2446 = new HashMap();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2387(Object obj, List<String> list) {
        if (obj == null) {
            return false;
        }
        f2441 = (f2440 + 47) % 128;
        boolean zM2800 = kb.m2800(obj.getClass(), list);
        f2441 = (f2440 + 83) % 128;
        return zM2800;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static <T> T m2399(Class cls, Object obj, ho hoVar, T t10) {
        f2441 = (f2440 + 113) % 128;
        try {
            Field fieldM2254 = hu.m2304().m2307().m2254(cls, hoVar);
            if (fieldM2254 == null) {
                return t10;
            }
            T t11 = (T) fieldM2254.get(obj);
            int i10 = f2441 + 41;
            f2440 = i10 % 128;
            if (i10 % 2 == 0) {
                return t11;
            }
            throw null;
        } catch (Throwable unused) {
            String strIntern = m2401((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2392(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, 14 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
            sb2.append(hoVar.m2230());
            sb2.append(m2401((String) null, (ViewConfiguration.getEdgeSlop() >> 16) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m2392(new int[]{-1227658563, -1190981675, 49833950, 35684323}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            k.m2765(strIntern, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static void m2404(hv hvVar, Object obj, String str) {
        int i10 = f2441 + 91;
        f2440 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (hvVar == null) {
            String strIntern = m2401((String) null, Color.alpha(0) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(m2392(new int[]{1984592391, 1232721020}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
            sb2.append(str);
            k.m2764(strIntern, sb2.toString());
            return;
        }
        String strIntern2 = m2401((String) null, TextUtils.indexOf((CharSequence) "", '0') + 128, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(m2392(new int[]{1984592391, 1232721020}, 2 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
        sb3.append(str);
        sb3.append(m2392(new int[]{545079718, -884987865, -272923517, 535263954}, (ViewConfiguration.getLongPressTimeout() >> 16) + 8).intern());
        sb3.append(hvVar.mo2309());
        k.m2764(strIntern2, sb3.toString());
        int i11 = f2440 + 101;
        f2441 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (m2403(r15.m2334(), r3) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        r15 = new java.lang.StringBuilder();
        r15.append(m2392(new int[]{1857419887, -1178320534, -2102558973, 301600277, 1729643396, -1474478369, -853871098, -1916766595, 1862184034, 486974620}, android.graphics.Color.rgb(0, 0, 0) + 16777235).intern());
        r15.append(java.lang.System.currentTimeMillis() - r0);
        r15.append(m2392(new int[]{191332316, 1435805943}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 2).intern());
        m2404(r3, r14, r15.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008e, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (m2403(r15.m2334(), r3) != false) goto L13;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.ironsource.adqualitysdk.sdk.i.hv<T> m2405(java.lang.Object r14, com.ironsource.adqualitysdk.sdk.i.hy r15) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hz.m2405(java.lang.Object, com.ironsource.adqualitysdk.sdk.i.hy):com.ironsource.adqualitysdk.sdk.i.hv");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2410(Object obj, String str) {
        int i10 = f2441 + 63;
        f2440 = i10 % 128;
        if (i10 % 2 != 0) {
            m2400(obj, obj.getClass(), str);
            throw null;
        }
        String strM2400 = m2400(obj, obj.getClass(), str);
        f2441 = (f2440 + 69) % 128;
        return strM2400;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2411(Object obj, JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int i10 = (f2441 + 89) % 128;
        f2440 = i10;
        f2441 = (i10 + 83) % 128;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            String strM2410 = m2410(obj, jSONArray.optString(i11));
            if (strM2410 != null) {
                return strM2410;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2389(Class cls, int i10) {
        Field[] declaredFields = cls.getDeclaredFields();
        for (int i11 = 0; cls != null && i11 != i10; i11++) {
            int i12 = f2440 + 35;
            f2441 = i12 % 128;
            if (i12 % 2 != 0) {
                cls = cls.getSuperclass();
                if (cls != null) {
                    declaredFields = kb.m2802(declaredFields, cls.getDeclaredFields());
                    f2441 = (f2440 + 77) % 128;
                }
            } else {
                cls.getSuperclass();
                throw null;
            }
        }
        return declaredFields;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static List<Object> m2402(Class cls, Object obj, ho hoVar) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Field> it = hu.m2304().m2307().m2256(cls, hoVar).iterator();
            f2440 = (f2441 + 87) % 128;
            while (it.hasNext()) {
                f2440 = (f2441 + 5) % 128;
                arrayList.add(it.next().get(obj));
            }
            return arrayList;
        } catch (Throwable unused) {
            String strIntern = m2401((String) null, 127 - TextUtils.indexOf("", "", 0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2392(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1597475101, -188208045}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14).intern());
            sb2.append(hoVar.m2230());
            sb2.append(m2401((String) null, View.getDefaultSize(0, 0) + 127, (int[]) null, "\u008c\u0091\u0090\u008b\u008f\u008c\u0084\u008e\u008d\u0086\u008c").intern());
            sb2.append(cls);
            sb2.append(m2392(new int[]{-1227658563, -1190981675, 49833950, 35684323}, MotionEvent.axisFromString("") + 7).intern());
            k.m2765(strIntern, sb2.toString());
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List m2386(Object obj, hy hyVar, int i10) {
        int i11 = f2440 + 67;
        f2441 = i11 % 128;
        if (i11 % 2 == 0) {
            m2394(obj, hyVar.m2333(i10), hyVar.m2335(i10), hyVar.m2339(i10));
            throw null;
        }
        List listM2394 = m2394(obj, hyVar.m2333(i10), hyVar.m2335(i10), hyVar.m2339(i10));
        f2440 = (f2441 + 101) % 128;
        return listM2394;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m2385(Object obj, Object obj2, hv hvVar) {
        if (obj != null) {
            int i10 = f2441 + 117;
            f2440 = i10 % 128;
            if (i10 % 2 == 0) {
                if (obj instanceof Collection) {
                    return new hx((Collection) obj, obj2, hvVar);
                }
                if (obj instanceof Map) {
                    return new hx((Map) obj, obj2, hvVar);
                }
                if (obj.getClass().isArray()) {
                    hx hxVar = new hx(new ArrayList(Arrays.asList(obj)), obj2, hvVar);
                    f2441 = (f2440 + 101) % 128;
                    return hxVar;
                }
            } else {
                throw null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final <T> hv<T> m2407(Object obj, ia iaVar, hm hmVar, List<String> list, int i10) {
        hv<T> hvVarM2405 = m2405(obj, new hy.c().m2382(true).m2375(iaVar, hmVar, list, i10));
        f2440 = (f2441 + 45) % 128;
        return hvVarM2405;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<hv> m2408(Object obj, hy hyVar) {
        hw hwVar = new hw(hyVar);
        hwVar.m2312();
        m2397(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m2310());
        f2441 = (f2440 + 55) % 128;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private <T> hv<T> m2390(Object obj, ht htVar) {
        f2440 = (f2441 + SignalKey.EVENT_ID) % 128;
        try {
            hv<T> hvVarM2395 = m2395(m2398(obj, htVar.m2299().get(0), (hv) null), htVar, 1);
            f2440 = (f2441 + 115) % 128;
            return hvVarM2395;
        } catch (Exception e10) {
            k.m2785(m2401((String) null, (ViewConfiguration.getTapTimeout() >> 16) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2401((String) null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), (int[]) null, "\u0098\u0086\u0097\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0096\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0095\u0089\u0088\u0086\u0086\u0084\u0095\u008c\u008b\u0090\u008b\u008b\u0094").intern(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m2395(hv hvVar, ht htVar, int i10) {
        if (i10 >= htVar.m2299().size()) {
            return hvVar;
        }
        List<Field> list = htVar.m2299().get(i10);
        Object objMo2309 = hvVar.mo2309();
        List listM2393 = m2393(objMo2309);
        if (listM2393 == null) {
            String strIntern = m2401((String) null, 127 - Color.alpha(0), (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2401((String) null, TextUtils.lastIndexOf("", '0') + 128, (int[]) null, "\u008c\u008a\u0084\u009c\u0088\u0084\u0085\u0084\u008b\u008c\u0093\u008e\u0097\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0096\u0096\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0094").intern());
            sb2.append(objMo2309.getClass());
            k.m2765(strIntern, sb2.toString());
            return null;
        }
        for (Object obj : listM2393) {
            f2441 = (f2440 + SignalKey.EVENT_ID) % 128;
            try {
                hv hvVarM2398 = m2398(obj, list, m2385(objMo2309, obj, hvVar));
                if (hvVarM2398 != null) {
                    return m2395(hvVarM2398, htVar, i10 + 1);
                }
                f2441 = (f2440 + 19) % 128;
            } catch (Exception unused) {
            }
        }
        int i11 = f2440 + 99;
        f2441 = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field[] m2388(Class cls) {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = f2441 + 47;
            f2440 = i11 % 128;
            if (i11 % 2 == 0) {
                Field field = declaredFields[i10];
                if (field.getType().equals(String.class)) {
                    int i12 = f2440 + 85;
                    f2441 = i12 % 128;
                    if (i12 % 2 == 0) {
                        arrayList.add(field);
                        throw null;
                    }
                    arrayList.add(field);
                }
            } else {
                declaredFields[i10].getType().equals(String.class);
                throw null;
            }
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m2393(Object obj) {
        int i10 = f2440 + 125;
        f2441 = i10 % 128;
        List listM2394 = i10 % 2 == 0 ? m2394(obj, false, true, true) : m2394(obj, true, true, true);
        int i11 = f2441 + 87;
        f2440 = i11 % 128;
        if (i11 % 2 == 0) {
            return listM2394;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List m2394(Object obj, boolean z10, boolean z11, boolean z12) {
        ArrayList arrayList;
        int i10;
        int i11 = (f2440 + 7) % 128;
        f2441 = i11;
        if (obj != null) {
            f2440 = (i11 + 103) % 128;
            if ((obj instanceof Collection) && z10) {
                arrayList = new ArrayList((Collection) obj);
                i10 = f2440 + 121;
            } else if (obj.getClass().isArray() && z12) {
                arrayList = new ArrayList(Arrays.asList(obj));
            } else if ((obj instanceof Map) && z11) {
                Map map = (Map) obj;
                arrayList = new ArrayList(map.values());
                arrayList.addAll(map.keySet());
                i10 = f2440 + 67;
            } else {
                arrayList = null;
            }
            f2441 = i10 % 128;
        } else {
            arrayList = null;
        }
        int i12 = f2441 + 25;
        f2440 = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m2398(Object obj, List<Field> list, hv hvVar) throws IllegalAccessException {
        Object obj2;
        int i10 = f2441 + 69;
        f2440 = i10 % 128;
        if (i10 % 2 != 0) {
            list.iterator();
            throw null;
        }
        f2440 = (f2441 + 51) % 128;
        for (Field field : list) {
            if (WeakReference.class.isAssignableFrom(field.getType())) {
                f2440 = (f2441 + 47) % 128;
                obj2 = ((WeakReference) field.get(obj)).get();
            } else {
                obj2 = field.get(obj);
            }
            hvVar = m2391(field, obj, hvVar);
            obj = obj2;
        }
        int i11 = f2441 + 113;
        f2440 = i11 % 128;
        if (i11 % 2 == 0) {
            return hvVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m2391(Field field, Object obj, hv hvVar) {
        hx hxVar = new hx(field, obj, hvVar);
        f2441 = (f2440 + 77) % 128;
        return hxVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m2406(Class cls, String str) {
        int i10 = f2440 + 93;
        f2441 = i10 % 128;
        if (i10 % 2 != 0) {
            return m2400((Object) null, cls, str);
        }
        m2400((Object) null, cls, str);
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2392(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2439.clone();
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private <T> hv<T> m2397(Object obj, hw<T> hwVar, int i10, hv hvVar) {
        Field[] fieldArrM2389;
        int i11 = f2441 + 91;
        f2440 = i11 % 128;
        if (i11 % 2 == 0) {
            if (i10 != hwVar.m2318().m2340()) {
                int i12 = f2440;
                f2441 = (i12 + 17) % 128;
                if (obj != null) {
                    f2441 = (i12 + 39) % 128;
                    if (!hwVar.m2317().contains(obj)) {
                        f2440 = (f2441 + 15) % 128;
                        if (i10 <= 0 || !(obj instanceof Activity)) {
                            hwVar.m2317().add(obj);
                            try {
                                if (hwVar.m2318().m2343() != null) {
                                    fieldArrM2389 = hwVar.m2318().m2343().mo2219(obj);
                                } else {
                                    fieldArrM2389 = m2389(obj.getClass(), hwVar.m2318().m2336(i10));
                                }
                                ht htVarM2315 = hwVar.m2315();
                                for (Field field : fieldArrM2389) {
                                    field.setAccessible(true);
                                    htVarM2315.m2302(field);
                                    hv<T> hvVarM2396 = m2396(m2391(field, obj, hvVar), hwVar, i10);
                                    if (hvVarM2396 != null && !hwVar.m2316()) {
                                        return hvVarM2396;
                                    }
                                    htVarM2315.m2300(field);
                                }
                                f2441 = (f2440 + 1) % 128;
                            } catch (Throwable th2) {
                                k.m2785(m2401((String) null, (ViewConfiguration.getScrollBarSize() >> 8) + 127, (int[]) null, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m2392(new int[]{1021459676, 1316833329, 957014191, 687155372, 367715111, -1346472520, -1082011640, 1374541143, 437445677, -1579277629, -1379548377, -2010087012, -1753696167, 1477608565}, ExpandableListView.getPackedPositionChild(0L) + 26).intern(), th2);
                            }
                        }
                    }
                }
            }
            return null;
        }
        hwVar.m2318().m2340();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private hv m2396(hv hvVar, hw hwVar, int i10) {
        Object objMo2309 = hvVar.mo2309();
        if (!hwVar.m2317().contains(objMo2309) && !hwVar.m2311().contains(objMo2309)) {
            if (hwVar.m2318().m2342(i10) && m2403(hwVar.m2318().m2334(), hvVar)) {
                f2440 = (f2441 + 65) % 128;
                if (hwVar.m2316()) {
                    f2440 = (f2441 + 13) % 128;
                    hwVar.m2313(hvVar);
                    hwVar.m2314(objMo2309);
                }
                return hvVar;
            }
            if (objMo2309 instanceof WeakReference) {
                WeakReference weakReference = (WeakReference) objMo2309;
                if (weakReference.get() != null && hwVar.m2318().m2344(i10)) {
                    f2441 = (f2440 + 33) % 128;
                    if (m2387(weakReference.get(), hwVar.m2318().m2338())) {
                        f2440 = (f2441 + 77) % 128;
                        return m2397(weakReference.get(), hwVar, i10 + 1, hvVar);
                    }
                }
            }
            if (m2387(objMo2309, hwVar.m2318().m2338())) {
                return m2397(objMo2309, hwVar, i10 + 1, hvVar);
            }
            if (hwVar.m2318().m2337()) {
                int i11 = f2441;
                f2440 = (i11 + 13) % 128;
                if (objMo2309 != null) {
                    int i12 = i11 + 25;
                    f2440 = i12 % 128;
                    if (i12 % 2 != 0) {
                        hwVar.m2317().add(objMo2309);
                        throw null;
                    }
                    hwVar.m2317().add(objMo2309);
                }
            }
            List listM2386 = m2386(objMo2309, hwVar.m2318(), i10);
            ht htVarM2315 = hwVar.m2315();
            if (listM2386 != null) {
                Iterator it = listM2386.iterator();
                hv hvVarM2396 = null;
                while (it.hasNext()) {
                    hv hvVarM2385 = m2385(objMo2309, it.next(), hvVar);
                    htVarM2315.m2301();
                    hvVarM2396 = m2396(hvVarM2385, hwVar, i10);
                    if (hvVarM2396 != null) {
                        int i13 = f2440 + 59;
                        f2441 = i13 % 128;
                        if (i13 % 2 == 0) {
                            hwVar.m2316();
                            throw null;
                        }
                        if (!hwVar.m2316()) {
                            f2441 = (f2440 + 11) % 128;
                            return hvVarM2396;
                        }
                    }
                    htVarM2315.m2303();
                }
                return hvVarM2396;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final List<String> m2409(Object obj, List<String> list, int i10) {
        hw hwVar = new hw(new hy.c().m2379(true).m2384(true).m2377(true).m2372(-1).m2380(new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.hz.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1821(hv hvVar) {
                return hvVar.mo2309() instanceof String;
            }
        }, list, i10));
        hwVar.m2312();
        m2397(obj, hwVar, 0, (hv) null);
        ArrayList arrayList = new ArrayList(hwVar.m2311());
        int i11 = f2440 + 117;
        f2441 = i11 % 128;
        if (i11 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m2403(ia iaVar, hv hvVar) {
        int i10 = f2441 + 95;
        f2440 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                boolean zMo1821 = iaVar.mo1821(hvVar);
                int i11 = f2440 + 65;
                f2441 = i11 % 128;
                if (i11 % 2 != 0) {
                    return zMo1821;
                }
                throw null;
            }
            iaVar.mo1821(hvVar);
            throw null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2400(Object obj, Class cls, String str) {
        while (cls != null && !cls.equals(Object.class)) {
            Field[] fieldArrM2388 = m2388(cls);
            int length = fieldArrM2388.length;
            int i10 = 0;
            while (i10 < length) {
                Field field = fieldArrM2388[i10];
                field.setAccessible(true);
                try {
                    String str2 = (String) field.get(obj);
                    if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                        int i11 = (f2440 + 29) % 128;
                        f2441 = i11;
                        int i12 = i11 + 25;
                        f2440 = i12 % 128;
                        if (i12 % 2 == 0) {
                            return str2;
                        }
                        throw null;
                    }
                    i10++;
                    f2441 = (f2440 + 63) % 128;
                } catch (Exception unused) {
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2401(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2443;
                int i11 = f2442;
                if (f2444) {
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
                if (f2445) {
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
