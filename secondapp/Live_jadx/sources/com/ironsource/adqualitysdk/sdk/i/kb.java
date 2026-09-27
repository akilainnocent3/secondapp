package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class kb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2952 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2953;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2954;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<a, Method> f2955;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2956;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2957 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2958 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2959 = 5943164199102125346L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2960;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f2961;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private List<Class> f2962;

        public a(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f2960 = (Class) obj;
            } else {
                this.f2960 = obj.getClass();
            }
            this.f2961 = str;
            this.f2962 = list;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2813(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                try {
                    char[] cArrM2198 = h.m2198(f2959, cArr, i10);
                    h.f2285 = 4;
                    while (true) {
                        int i11 = h.f2285;
                        if (i11 < cArrM2198.length) {
                            h.f2283 = i11 - 4;
                            int i12 = h.f2285;
                            cArrM2198[i12] = (char) (((long) (cArrM2198[i12] ^ cArrM2198[i12 % 4])) ^ (((long) h.f2283) * f2959));
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

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                f2958 = (f2957 + 63) % 128;
                if (a.class == obj.getClass()) {
                    a aVar = (a) obj;
                    if (!this.f2960.equals(aVar.f2960)) {
                        int i10 = f2957 + 7;
                        f2958 = i10 % 128;
                        return i10 % 2 != 0;
                    }
                    if (this.f2961.equals(aVar.f2961)) {
                        return this.f2962.equals(aVar.f2962);
                    }
                    f2957 = (f2958 + 89) % 128;
                    return false;
                }
            }
            return false;
        }

        public final int hashCode() {
            f2958 = (f2957 + 39) % 128;
            int iHashCode = (((this.f2960.hashCode() * 31) + this.f2961.hashCode()) * 31) + this.f2962.hashCode();
            int i10 = f2958 + 35;
            f2957 = i10 % 128;
            if (i10 % 2 != 0) {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(m2813("\udd4c\udd01馏\ue908姛賈쌸曕覫\uf041鞀쩐琺⟔㨲뇄₠譜캻敋輗", ViewConfiguration.getTouchSlop() >> 8).intern());
            sb2.append(m2813("텒턿四捵寨䎶䥓擤薿㼒᷍졅砮\ue888끒돭\u2cf7", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern());
            sb2.append(this.f2960);
            sb2.append(m2813("笀第럺᭜膧ꋸㅵ뺌\u2fed\ude24旸ሦ퉴আ졩榼蛽ꕽ㲧", Process.getGidForName("") + 1).intern());
            sb2.append(this.f2961);
            sb2.append('\'');
            sb2.append(m2813("ᦴᦘ朩昿厴爫䰖沓䵎\u0ee4ᢰ쀶냅\ud968딘뮧\ue45f疮", ViewConfiguration.getWindowTouchSlop() >> 8).intern());
            sb2.append(this.f2962);
            sb2.append(fw.b.f85383j);
            String string = sb2.toString();
            f2957 = (f2958 + 69) % 128;
            return string;
        }
    }

    static {
        m2807();
        f2955 = new ConcurrentHashMap();
        int i10 = f2954 + 123;
        f2952 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m2795(Object obj, String str, List<Object> list) {
        int i10 = f2952 + 59;
        f2954 = i10 % 128;
        return m2794(obj.getClass(), str, list, i10 % 2 != 0);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Method m2798(Object obj, String str, List<Object> list) {
        Method methodM2795;
        a aVar = new a(obj, str, m2799(list));
        Method method = f2955.get(aVar);
        if (method != null) {
            if (m2797(method.getParameterTypes(), list)) {
                f2954 = (f2952 + 7) % 128;
                return method;
            }
            String strIntern = m2806(ViewConfiguration.getLongPressTimeout() >> 16, (char) (View.MeasureSpec.getMode(0) + 48731), TextUtils.getTrimmedLength("") + 15).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2806((Process.myTid() >> 22) + 31, (char) (ExpandableListView.getPackedPositionType(0L) + 58399), MotionEvent.axisFromString("") + 29).intern());
            sb2.append(aVar);
            co.m1578(strIntern, sb2.toString(), null);
            f2954 = (f2952 + 81) % 128;
        }
        if (obj instanceof Class) {
            f2952 = (f2954 + 41) % 128;
            methodM2795 = m2794((Class) obj, str, list, true);
            if (methodM2795 == null) {
                f2954 = (f2952 + 55) % 128;
                methodM2795 = m2795(Class.class, str, list);
            }
        } else {
            methodM2795 = m2795(obj, str, list);
        }
        if (methodM2795 != null) {
            int i10 = f2952 + 9;
            f2954 = i10 % 128;
            if (i10 % 2 != 0) {
                f2955.put(aVar, methodM2795);
                int i11 = 86 / 0;
                return methodM2795;
            }
            f2955.put(aVar, methodM2795);
        }
        return methodM2795;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m2803(String str, boolean z10) {
        try {
            Class<?> cls = Class.forName(str);
            f2952 = (f2954 + 81) % 128;
            return cls;
        } catch (Throwable th2) {
            if (z10) {
                String strIntern = m2806(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (48731 - (ViewConfiguration.getTouchSlop() >> 8)), 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2806(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33366 - Gravity.getAbsoluteGravity(0, 0)), 6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb2.append(str);
                sb2.append(m2806(21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9).intern());
                co.m1578(strIntern, sb2.toString(), th2);
            }
            f2954 = (f2952 + 69) % 128;
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2807() {
        f2956 = new char[]{48649, 6069, 60715, 17046, 6162, 61839, 18285, 7423, 62060, 19414, 8544, 63190, 19638, 8760, 64434, 33301, 11185, 53537, 32388, 9225, 52673, ' ', 43493, 21369, 64725, 42508, 20433, 63789, 41656, 19510, 62855, 58458, 19942, 46971, 6353, 16961, 43912, 7482, 18103, 43059, 4488, 31512, 44168, 5884, 30768, 41446, 2907, 31948, 42572, 4028, 28970, 56035, 3093, 30088, 57110, 383, 27363, 56421, 1430, 26230, 53212, 13582, 39614, 60633, 17749, 49029, 4154, 19110, 41761, 5587, 20055, 41094, 6523, 29695, 42098, 7700, 28821, 43332, 957, 29729, 44727, 1816, 'c', 43492, 21371, 64655, 42565, 20421, 63789, 41635, 19499, 62860, 40731, 18571, 62183, 40042, 17844, 61252, 39124, 16970, 60339, 38192, 16048, 59406, 37254, 15108};
        f2953 = -4185486480735295093L;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2811(Class cls, List<Object> list, Class... clsArr) throws Exception {
        f2952 = (f2954 + 83) % 128;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        f2952 = (f2954 + 19) % 128;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m2794(Class cls, String str, List<Object> list, boolean z10) {
        f2954 = (f2952 + 71) % 128;
        Method[] methods = cls.getMethods();
        f2954 = (f2952 + 9) % 128;
        for (Method method : methods) {
            if (method.getName().equals(str)) {
                f2952 = (f2954 + 95) % 128;
                if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z10) {
                    int i10 = f2954 + 123;
                    f2952 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 35 / 0;
                        if (m2808(method, list)) {
                            f2954 = (f2952 + 49) % 128;
                            return method;
                        }
                    } else if (m2808(method, list)) {
                        f2954 = (f2952 + 49) % 128;
                        return method;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2808(Method method, List<Object> list) {
        f2954 = (f2952 + 85) % 128;
        boolean zM2797 = m2797(method.getParameterTypes(), list);
        int i10 = f2954 + 109;
        f2952 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 40 / 0;
        }
        return zM2797;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Constructor m2812(Class cls, List<Object> list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            f2954 = (f2952 + 67) % 128;
            if (constructor.getParameterTypes().length == list.size()) {
                int i10 = f2954 + 3;
                f2952 = i10 % 128;
                if (i10 % 2 == 0) {
                    m2801(constructor, list);
                    throw null;
                }
                if (m2801(constructor, list)) {
                    return constructor;
                }
            }
        }
        f2954 = (f2952 + 21) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method[] m2810(Method[] methodArr, Method[] methodArr2) {
        f2954 = (f2952 + 109) % 128;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        int i10 = f2954 + 65;
        f2952 = i10 % 128;
        if (i10 % 2 != 0) {
            return methodArr3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m2804(Class cls, List<Object> list) throws Exception {
        int i10 = f2952 + 23;
        f2954 = i10 % 128;
        int i11 = i10 % 2;
        Constructor constructorM2812 = m2812(cls, list);
        Object[] array = list.toArray();
        if (i11 != 0) {
            constructorM2812.newInstance(array);
            throw null;
        }
        Object objNewInstance = constructorM2812.newInstance(array);
        f2954 = (f2952 + 23) % 128;
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Method m2805(Object obj, String str, List<Class> list) {
        int i10 = f2952 + 31;
        f2954 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                Class<?>[] clsArrM2809 = m2809(list);
                if (obj instanceof Class) {
                    try {
                        obj = ((Class) obj).getMethod(str, clsArrM2809);
                        int i11 = f2952 + 111;
                        f2954 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return obj;
                        }
                        throw null;
                    } catch (NoSuchMethodException unused) {
                        return Class.class.getMethod(str, clsArrM2809);
                    }
                }
                Method method = obj.getClass().getMethod(str, clsArrM2809);
                f2954 = (f2952 + 1) % 128;
                return method;
            }
            m2809(list);
            throw null;
        } catch (NoSuchMethodException e10) {
            String strIntern = m2806(TextUtils.lastIndexOf("", '0') + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 48732), 15 - KeyEvent.keyCodeFromString("")).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2806((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26168), TextUtils.indexOf("", "", 0) + 4).intern());
            sb2.append(str);
            sb2.append(m2806((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60671), TextUtils.getTrimmedLength("") + 19).intern());
            sb2.append(obj);
            co.m1578(strIntern, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class[] m2809(List<Class> list) {
        Class[] clsArr;
        int i10;
        int i11 = f2952 + 51;
        f2954 = i11 % 128;
        if (i11 % 2 != 0) {
            clsArr = new Class[list.size()];
            i10 = 1;
        } else {
            clsArr = new Class[list.size()];
            i10 = 0;
        }
        while (i10 < list.size()) {
            f2952 = (f2954 + 49) % 128;
            clsArr[i10] = list.get(i10);
            i10++;
            f2954 = (f2952 + 91) % 128;
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2797(Class[] clsArr, List<Object> list) {
        int i10 = f2952 + 61;
        f2954 = i10 % 128;
        for (int i11 = i10 % 2 != 0 ? 1 : 0; i11 < clsArr.length; i11++) {
            Object obj = list.get(i11);
            if ((obj == null && !Object.class.isAssignableFrom(clsArr[i11])) || (obj != null && !m2796(clsArr[i11], obj))) {
                return false;
            }
        }
        f2952 = (f2954 + 37) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m2799(List<Object> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            int i10 = f2952 + 33;
            f2954 = i10 % 128;
            if (i10 % 2 != 0) {
                next = it.next();
                int i11 = 68 / 0;
                if (next != null) {
                    arrayList.add(next.getClass());
                    f2952 = (f2954 + 93) % 128;
                } else {
                    arrayList.add(Object.class);
                }
            } else {
                next = it.next();
                if (next != null) {
                    arrayList.add(next.getClass());
                    f2952 = (f2954 + 93) % 128;
                } else {
                    arrayList.add(Object.class);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2806(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            try {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f2956[i10 + i12]) ^ (((long) i12) * f2953)) ^ ((long) c10));
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

    /* JADX WARN: Code duplicated, block: B:101:0x0172  */
    /* JADX WARN: Code duplicated, block: B:103:0x017a  */
    /* JADX WARN: Code duplicated, block: B:108:0x018f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0195  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:75:0x0101  */
    /* JADX WARN: Code duplicated, block: B:77:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0117  */
    /* JADX WARN: Code duplicated, block: B:81:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x0151  */
    /* JADX WARN: Code duplicated, block: B:97:0x015e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0164  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:114:0x01a3
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2796(java.lang.Class r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m2796(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2801(Constructor constructor, List<Object> list) {
        int i10 = f2954 + 125;
        f2952 = i10 % 128;
        int i11 = i10 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i11 != 0) {
            return m2797(parameterTypes, list);
        }
        boolean zM2797 = m2797(parameterTypes, list);
        int i12 = 30 / 0;
        return zM2797;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field[] m2802(Field[] fieldArr, Field[] fieldArr2) {
        f2954 = (f2952 + 119) % 128;
        int length = fieldArr.length;
        int length2 = fieldArr2.length;
        Field[] fieldArr3 = new Field[length + length2];
        System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
        System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
        int i10 = f2954 + 71;
        f2952 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 28 / 0;
        }
        return fieldArr3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2800(Class cls, List<String> list) {
        if (cls != null) {
            f2954 = (f2952 + 43) % 128;
            if (list == null || list.isEmpty()) {
                return true;
            }
            for (String str : list) {
                if ((str.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                    return true;
                }
            }
            if (!kb.class.getName().startsWith(m2806(82 - KeyEvent.normalizeMetaState(0), (char) View.resolveSizeAndState(0, 0, 0), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                if (kb.class.getPackage() == null) {
                    f2954 = (f2952 + 3) % 128;
                    if (cls.getPackage() != null) {
                        if (kb.class.getPackage() != null) {
                            f2954 = (f2952 + 99) % 128;
                            if (kb.class.getPackage().equals(cls.getPackage())) {
                            }
                        }
                        return false;
                    }
                } else {
                    if (kb.class.getPackage() != null) {
                        f2954 = (f2952 + 99) % 128;
                        if (kb.class.getPackage().equals(cls.getPackage())) {
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
