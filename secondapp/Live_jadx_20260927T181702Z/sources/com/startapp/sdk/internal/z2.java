package com.startapp.sdk.internal;

import android.content.Context;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f75947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class[] f75948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f75949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f75950f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient SoftReference f75951g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f75952h = new ConcurrentHashMap();

    public z2(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f75945a = str;
        this.f75946b = str2;
        this.f75947c = strArr;
        this.f75948d = clsArr;
        this.f75949e = objArr;
        this.f75950f = strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final JSONArray a(Context context, int[] iArr, Integer num) {
        Iterator x2Var;
        Comparator c6Var;
        try {
            b3 b3VarA = a(context);
            Object objInvoke = b3VarA.f74581b.invoke(b3VarA.f74580a, this.f75949e);
            if (objInvoke == null) {
                x2Var = y2.f75886a;
            } else if (objInvoke instanceof Collection) {
                x2Var = ((Collection) objInvoke).iterator();
            } else {
                x2Var = objInvoke.getClass().isArray() ? new x2(Array.getLength(objInvoke), objInvoke) : Collections.singleton(objInvoke).iterator();
            }
            ?? arrayList = new ArrayList();
            while (true) {
                c6Var = null;
                if (!x2Var.hasNext()) {
                    break;
                }
                Object next = x2Var.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    Class<?> cls = next.getClass();
                    SoftReference softReference = (SoftReference) this.f75952h.get(cls.getName());
                    Map mapA = softReference != null ? (Map) softReference.get() : null;
                    if (mapA == null) {
                        mapA = a(cls, this.f75950f);
                        this.f75952h.put(cls.getName(), new SoftReference(mapA));
                    }
                    if (mapA.isEmpty()) {
                        try {
                            jSONObject.put("", next.toString());
                        } catch (Throwable unused) {
                        }
                    } else {
                        for (Map.Entry entry : mapA.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            try {
                                if (value instanceof Field) {
                                    jSONObject.put(str, a(((Field) value).get(next)));
                                } else if (value instanceof Method) {
                                    jSONObject.put(str, a(((Method) value).invoke(next, null)));
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    arrayList.add(jSONObject);
                }
            }
            if (iArr != null && iArr.length > 0) {
                int length = this.f75950f.length;
                for (int i10 : iArr) {
                    if (i10 != 0 && Math.abs(i10) <= length) {
                        Comparator xaVar = new xa(this.f75950f[Math.abs(i10) - 1]);
                        if (i10 < 0) {
                            xaVar = Collections.reverseOrder(xaVar);
                        }
                        c6Var = c6Var == null ? xaVar : new c6(c6Var, xaVar);
                    }
                }
                if (c6Var != null) {
                    Collections.sort(arrayList, c6Var);
                }
            }
            if (num != null && num.intValue() > 0) {
                arrayList = arrayList.subList(0, Math.min(num.intValue(), arrayList.size()));
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONArray.put((JSONObject) it.next());
            }
            return jSONArray;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(String.valueOf(5), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(String.valueOf(5), e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z2.class == obj.getClass()) {
            z2 z2Var = (z2) obj;
            if (si.a((Object) this.f75945a, (Object) z2Var.f75945a) && si.a((Object) this.f75946b, (Object) z2Var.f75946b) && Arrays.equals(this.f75947c, z2Var.f75947c) && Arrays.equals(this.f75949e, z2Var.f75949e) && Arrays.equals(this.f75950f, z2Var.f75950f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f75945a, this.f75946b, this.f75947c, this.f75949e, this.f75950f};
        WeakHashMap weakHashMap = si.f75514a;
        return Arrays.deepHashCode(objArr);
    }

    public static Object a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final b3 a(Context context) {
        Object objInvoke;
        SoftReference softReference = this.f75951g;
        b3 b3Var = softReference != null ? (b3) softReference.get() : null;
        if (b3Var != null) {
            return b3Var;
        }
        Object systemService = context.getSystemService(this.f75945a);
        if (systemService == null) {
            try {
                Object obj = a(Context.class, new String[]{this.f75945a}).get(this.f75945a);
                if (obj instanceof Method) {
                    objInvoke = ((Method) obj).invoke(context, null);
                } else if (obj instanceof Field) {
                    objInvoke = ((Field) obj).get(context);
                }
                systemService = objInvoke;
            } catch (Throwable unused) {
            }
        }
        if (systemService != null) {
            try {
                Method methodA = a(systemService.getClass(), this.f75946b, this.f75948d);
                if (!methodA.isAccessible()) {
                    try {
                        methodA.setAccessible(true);
                    } catch (SecurityException e10) {
                        throw new RuntimeException(String.valueOf(4), e10);
                    }
                }
                b3 b3Var2 = new b3(systemService, methodA);
                this.f75951g = new SoftReference(b3Var2);
                return b3Var2;
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(String.valueOf(3), e11);
            }
        }
        throw new RuntimeException(String.valueOf(1));
    }

    public static Method a(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        NoSuchMethodException noSuchMethodException = null;
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e10) {
                if (noSuchMethodException == null) {
                    noSuchMethodException = e10;
                }
                cls = cls.getSuperclass();
            }
        }
        throw noSuchMethodException;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[Catch: NoSuchMethodException -> 0x0070, NoSuchMethodException | SecurityException -> 0x0094, TryCatch #1 {NoSuchMethodException -> 0x0070, blocks: (B:22:0x004c, B:24:0x0069, B:25:0x006c), top: B:37:0x004c, outer: #3 }] */
    public static LinkedHashMap a(Class cls, String[] strArr) {
        Object e10;
        String str;
        Method methodA;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : strArr) {
            NoSuchFieldException noSuchFieldException = null;
            Class superclass = cls;
            while (true) {
                if (superclass != null) {
                    try {
                        try {
                            Field declaredField = superclass.getDeclaredField(str2);
                            try {
                                if (!declaredField.isAccessible()) {
                                    declaredField.setAccessible(true);
                                }
                                linkedHashMap.put(str2, declaredField);
                                break;
                            } catch (NoSuchFieldException e11) {
                                e10 = e11;
                                str = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                                try {
                                    methodA = a(cls, "get" + str, new Class[0]);
                                    if (!methodA.isAccessible()) {
                                        methodA.setAccessible(true);
                                    }
                                    linkedHashMap.put(str2, methodA);
                                } catch (NoSuchMethodException unused) {
                                    Method methodA2 = a(cls, "is" + str, new Class[0]);
                                    if (!methodA2.isAccessible()) {
                                        methodA2.setAccessible(true);
                                    }
                                    linkedHashMap.put(str2, methodA2);
                                }
                            }
                        } catch (NoSuchFieldException e12) {
                            if (noSuchFieldException == null) {
                                noSuchFieldException = e12;
                            }
                            superclass = superclass.getSuperclass();
                        }
                    } catch (SecurityException e13) {
                        e10 = e13;
                        str = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                        methodA = a(cls, "get" + str, new Class[0]);
                        if (!methodA.isAccessible()) {
                            methodA.setAccessible(true);
                        }
                        linkedHashMap.put(str2, methodA);
                    }
                } else {
                    throw noSuchFieldException;
                }
                e10 = e11;
                str = Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
                try {
                    methodA = a(cls, "get" + str, new Class[0]);
                    if (!methodA.isAccessible()) {
                        methodA.setAccessible(true);
                    }
                    linkedHashMap.put(str2, methodA);
                } catch (NoSuchMethodException | SecurityException unused2) {
                    linkedHashMap.put(str2, e10);
                }
            }
        }
        return linkedHashMap;
    }
}
