package com.inmobi.media;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3838ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f57005a = 0;

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getSimpleName();
            Class superclass = cls.getSuperclass();
            if (superclass == null || kotlin.jvm.internal.m0.g(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                kotlin.jvm.internal.m0.m(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator itA = kotlin.jvm.internal.i.a(cls.getDeclaredFields());
            while (itA.hasNext()) {
                Field field = (Field) itA.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                        kotlin.jvm.internal.m0.m(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !kotlin.jvm.internal.m0.g(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (kotlin.jvm.internal.m0.g(cls2, type) || kotlin.jvm.internal.m0.g(cls2, type) || kotlin.jvm.internal.m0.g(Integer.class, type)) {
                                Object obj2 = field.get(obj);
                                kotlin.jvm.internal.m0.n(obj2, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj2).intValue());
                            } else {
                                Class cls3 = Boolean.TYPE;
                                if (kotlin.jvm.internal.m0.g(cls3, type) || kotlin.jvm.internal.m0.g(cls3, type) || kotlin.jvm.internal.m0.g(Boolean.class, type)) {
                                    Object obj3 = field.get(obj);
                                    kotlin.jvm.internal.m0.n(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj3).booleanValue());
                                } else {
                                    Class cls4 = Double.TYPE;
                                    if (kotlin.jvm.internal.m0.g(cls4, type) || kotlin.jvm.internal.m0.g(cls4, type) || kotlin.jvm.internal.m0.g(Double.class, type)) {
                                        Object obj4 = field.get(obj);
                                        kotlin.jvm.internal.m0.n(obj4, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj4).doubleValue());
                                    } else {
                                        Class cls5 = Float.TYPE;
                                        if (kotlin.jvm.internal.m0.g(cls5, type) || kotlin.jvm.internal.m0.g(cls5, type) || kotlin.jvm.internal.m0.g(Float.class, type)) {
                                            Object obj5 = field.get(obj);
                                            kotlin.jvm.internal.m0.n(obj5, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj5);
                                        } else {
                                            Class cls6 = Long.TYPE;
                                            if (kotlin.jvm.internal.m0.g(cls6, type) || kotlin.jvm.internal.m0.g(cls6, type) || kotlin.jvm.internal.m0.g(Long.class, type)) {
                                                Object obj6 = field.get(obj);
                                                kotlin.jvm.internal.m0.n(obj6, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj6).longValue());
                                            } else {
                                                Class cls7 = Byte.TYPE;
                                                if (kotlin.jvm.internal.m0.g(cls7, type) || kotlin.jvm.internal.m0.g(cls7, type) || kotlin.jvm.internal.m0.g(Byte.class, type)) {
                                                    Object obj7 = field.get(obj);
                                                    kotlin.jvm.internal.m0.n(obj7, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj7);
                                                } else if (kotlin.jvm.internal.m0.g(String.class, type) || kotlin.jvm.internal.m0.g(JSONObject.class, type) || kotlin.jvm.internal.m0.g(JSONArray.class, type)) {
                                                    jSONObject.put(name, field.get(obj));
                                                } else {
                                                    Class cls8 = Short.TYPE;
                                                    if (kotlin.jvm.internal.m0.g(cls8, type) || kotlin.jvm.internal.m0.g(cls8, type) || kotlin.jvm.internal.m0.g(Short.class, type)) {
                                                        Object obj8 = field.get(obj);
                                                        kotlin.jvm.internal.m0.n(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (Short) obj8);
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        Object obj9 = field.get(obj);
                                                        if (obj9 != null) {
                                                            Map map = (Map) obj9;
                                                            for (Object obj10 : map.keySet()) {
                                                                Object objA = map.get(obj10);
                                                                if (objA != null) {
                                                                    if (!a(objA.getClass())) {
                                                                        objA = a(objA, objA.getClass());
                                                                    }
                                                                    jSONObject2.put(String.valueOf(obj10), objA);
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONObject2);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = new JSONArray();
                                                        Object obj11 = field.get(obj);
                                                        if (obj11 != null) {
                                                            for (Object obj12 : (List) obj11) {
                                                                if (obj12 != null) {
                                                                    Object objA2 = a(obj12.getClass()) ? obj12 : a(obj12, obj12.getClass());
                                                                    if (objA2 == null) {
                                                                        obj12.getClass().toString();
                                                                    } else {
                                                                        jSONArray.put(objA2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        Object obj13 = field.get(obj);
                                                        if (obj13 != null) {
                                                            int length = Array.getLength(obj13);
                                                            for (int i10 = 0; i10 < length; i10++) {
                                                                Object obj14 = Array.get(obj13, i10);
                                                                if (obj14 != null) {
                                                                    Object objA3 = a(obj14.getClass()) ? obj14 : a(obj14, obj14.getClass());
                                                                    if (objA3 == null) {
                                                                        obj14.getClass().toString();
                                                                    } else {
                                                                        jSONArray2.put(objA3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray2);
                                                    } else {
                                                        Object obj15 = field.get(obj);
                                                        if (obj15 != null) {
                                                            jSONObject.put(name, a(obj15, obj15.getClass()));
                                                        } else {
                                                            dr.w2 w2Var = dr.w2.f79517a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        double d10 = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d10);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f10 = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f10);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i10);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        long j10 = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j10);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s10 = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s10);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    /* JADX WARN: Code duplicated, block: B:156:0x0320  */
    /* JADX WARN: Code duplicated, block: B:159:0x032d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0351  */
    /* JADX WARN: Code duplicated, block: B:276:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v31 */
    public static Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) throws IllegalAccessException, JSONException {
        Constructor<?> constructor;
        Object objNewInstance;
        Object objValueOf;
        Object obj3;
        boolean z10;
        Iterator it;
        Class cls2;
        Class cls3;
        Object objValueOf2;
        ?? r10;
        ?? r11;
        List linkedList;
        cls.getSimpleName();
        cls.toString();
        Objects.toString(obj);
        Class cls4 = Boolean.TYPE;
        Class cls5 = Float.TYPE;
        Class cls6 = Double.TYPE;
        Class cls7 = Long.TYPE;
        Class cls8 = Integer.TYPE;
        int i10 = 0;
        Object obj4 = null;
        boolean z11 = true;
        if (obj2 == null) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                kotlin.jvm.internal.m0.m(declaredConstructors);
                if (declaredConstructors.length == 0) {
                    objNewInstance = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i11];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        kotlin.jvm.internal.m0.o(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i11++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        objNewInstance = constructor.newInstance(null);
                    } else {
                        Object[] objArr = new Object[length2];
                        Iterator itA = kotlin.jvm.internal.i.a(constructor.getParameterTypes());
                        int i12 = 0;
                        while (itA.hasNext()) {
                            Class cls9 = (Class) itA.next();
                            int i13 = i12 + 1;
                            kotlin.jvm.internal.m0.m(cls9);
                            if (!kotlin.jvm.internal.m0.g(cls8, cls9) && !kotlin.jvm.internal.m0.g(cls7, cls9)) {
                                if (kotlin.jvm.internal.m0.g(cls4, cls9)) {
                                    objValueOf = Boolean.FALSE;
                                } else {
                                    objValueOf = (kotlin.jvm.internal.m0.g(cls6, cls9) || kotlin.jvm.internal.m0.g(cls5, cls9)) ? Double.valueOf(0.0d) : null;
                                }
                            } else {
                                objValueOf = 0;
                            }
                            objArr[i12] = objValueOf;
                            i12 = i13;
                        }
                        objNewInstance = constructor.newInstance(Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (Exception e10) {
                e10.getMessage();
                cls.toString();
                return null;
            }
        } else {
            objNewInstance = obj2;
        }
        if (cls.getSuperclass() != null) {
            Class superclass = cls.getSuperclass();
            superclass.getSimpleName();
            kotlin.jvm.internal.m0.m(superclass);
            objNewInstance = a(jSONObject, superclass, obj, objNewInstance);
        }
        Iterator itA2 = kotlin.jvm.internal.i.a(cls.getDeclaredFields());
        while (itA2.hasNext()) {
            Field field = (Field) itA2.next();
            field.setAccessible(z11);
            String name = field.getName();
            if (!kotlin.jvm.internal.m0.g(name, "shadow$_klass_") && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                if (jSONObject.has(name) && !jSONObject.isNull(name)) {
                    Class<?> type = field.getType();
                    if (!kotlin.jvm.internal.m0.g(cls8, type) && !kotlin.jvm.internal.m0.g(cls8, type) && !kotlin.jvm.internal.m0.g(Integer.class, type)) {
                        if (!kotlin.jvm.internal.m0.g(cls4, type) && !kotlin.jvm.internal.m0.g(cls4, type) && !kotlin.jvm.internal.m0.g(Boolean.class, type)) {
                            if (!kotlin.jvm.internal.m0.g(cls6, type) && !kotlin.jvm.internal.m0.g(cls6, type) && !kotlin.jvm.internal.m0.g(Double.class, type)) {
                                if (!kotlin.jvm.internal.m0.g(cls5, type) && !kotlin.jvm.internal.m0.g(cls5, type) && !kotlin.jvm.internal.m0.g(Float.class, type)) {
                                    if (!kotlin.jvm.internal.m0.g(cls7, type) && !kotlin.jvm.internal.m0.g(cls7, type) && !kotlin.jvm.internal.m0.g(Long.class, type)) {
                                        Class cls10 = Byte.TYPE;
                                        if (!kotlin.jvm.internal.m0.g(cls10, type) && !kotlin.jvm.internal.m0.g(cls10, type) && !kotlin.jvm.internal.m0.g(Byte.class, type)) {
                                            if (kotlin.jvm.internal.m0.g(String.class, type)) {
                                                field.set(objNewInstance, jSONObject.getString(name));
                                            } else {
                                                Class cls11 = Short.TYPE;
                                                if (kotlin.jvm.internal.m0.g(cls11, type) || kotlin.jvm.internal.m0.g(cls11, type)) {
                                                    i10 = i10;
                                                    obj3 = obj4;
                                                    z10 = z11;
                                                    it = itA2;
                                                    kotlin.jvm.internal.m0.m(field);
                                                    f(field, objNewInstance, jSONObject);
                                                    itA2 = it;
                                                    obj4 = obj3;
                                                    z11 = z10;
                                                    i10 = i10;
                                                    cls4 = cls4;
                                                    cls5 = cls5;
                                                    cls6 = cls6;
                                                } else {
                                                    i10 = i10;
                                                    if (!kotlin.jvm.internal.m0.g(Short.class, type)) {
                                                        if (kotlin.jvm.internal.m0.g(JSONObject.class, type)) {
                                                            kotlin.jvm.internal.m0.m(field);
                                                            JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                                            JSONObject jSONObject3 = new JSONObject();
                                                            kotlin.jvm.internal.m0.p(field, "<this>");
                                                            if (jSONObject2 == null) {
                                                                jSONObject2 = jSONObject3;
                                                            }
                                                            field.set(objNewInstance, jSONObject2);
                                                        } else if (kotlin.jvm.internal.m0.g(JSONArray.class, type)) {
                                                            field.set(objNewInstance, jSONObject.getJSONArray(name));
                                                        } else {
                                                            ?? r18 = z11;
                                                            cls4 = cls4;
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                                                Objects.toString(jSONObject4);
                                                                HashMap map = new HashMap();
                                                                Iterator<String> itKeys = jSONObject4.keys();
                                                                while (itKeys.hasNext()) {
                                                                    Iterator it2 = itA2;
                                                                    String next = itKeys.next();
                                                                    kotlin.jvm.internal.m0.m(jSONObject4);
                                                                    kotlin.jvm.internal.m0.m(next);
                                                                    Iterator<String> it3 = itKeys;
                                                                    Type genericType = field.getGenericType();
                                                                    kotlin.jvm.internal.m0.n(genericType, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                    Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[r18];
                                                                    kotlin.jvm.internal.m0.n(type2, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                    Class cls12 = (Class) type2;
                                                                    if (kotlin.jvm.internal.m0.g(cls8, cls12)) {
                                                                        objValueOf2 = Integer.valueOf(jSONObject4.getInt(next));
                                                                    } else {
                                                                        if (kotlin.jvm.internal.m0.g(cls6, cls12)) {
                                                                            objValueOf2 = Double.valueOf(jSONObject4.getDouble(next));
                                                                        } else if (kotlin.jvm.internal.m0.g(cls5, cls12)) {
                                                                            cls2 = cls5;
                                                                            cls3 = cls6;
                                                                            objValueOf2 = Float.valueOf((float) jSONObject4.getDouble(next));
                                                                        } else {
                                                                            cls2 = cls5;
                                                                            cls3 = cls6;
                                                                            if (kotlin.jvm.internal.m0.g(cls7, cls12)) {
                                                                                objValueOf2 = Long.valueOf(jSONObject4.getLong(next));
                                                                            } else if (kotlin.jvm.internal.m0.g(cls10, cls12)) {
                                                                                objValueOf2 = Byte.valueOf((byte) jSONObject4.getInt(next));
                                                                            } else if (kotlin.jvm.internal.m0.g(cls11, cls12)) {
                                                                                objValueOf2 = Short.valueOf((short) jSONObject4.getInt(next));
                                                                            } else {
                                                                                objValueOf2 = jSONObject4.get(next);
                                                                            }
                                                                        }
                                                                        kotlin.jvm.internal.m0.m(objValueOf2);
                                                                        if (objValueOf2 != null) {
                                                                            r11 = r18;
                                                                            if (a(objValueOf2.getClass()) != r11) {
                                                                            }
                                                                            if (objValueOf2 != null) {
                                                                                map.put(next, objValueOf2);
                                                                            }
                                                                            itA2 = it2;
                                                                            itKeys = it3;
                                                                            cls5 = cls2;
                                                                            cls6 = cls3;
                                                                            r18 = 1;
                                                                        } else {
                                                                            r10 = r18;
                                                                        }
                                                                        r10 = r11;
                                                                        JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                                        kotlin.jvm.internal.m0.o(jSONObject5, "getJSONObject(...)");
                                                                        Type genericType2 = field.getGenericType();
                                                                        kotlin.jvm.internal.m0.n(genericType2, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                        Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[r10];
                                                                        kotlin.jvm.internal.m0.n(type3, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                        objValueOf2 = a(jSONObject5, (Class) type3, null, null);
                                                                        if (objValueOf2 != null) {
                                                                            map.put(next, objValueOf2);
                                                                        }
                                                                        itA2 = it2;
                                                                        itKeys = it3;
                                                                        cls5 = cls2;
                                                                        cls6 = cls3;
                                                                        r18 = 1;
                                                                    }
                                                                    cls2 = cls5;
                                                                    cls3 = cls6;
                                                                    kotlin.jvm.internal.m0.m(objValueOf2);
                                                                    if (objValueOf2 != null) {
                                                                        r11 = r18;
                                                                        if (a(objValueOf2.getClass()) != r11) {
                                                                        }
                                                                        if (objValueOf2 != null) {
                                                                            map.put(next, objValueOf2);
                                                                        }
                                                                        itA2 = it2;
                                                                        itKeys = it3;
                                                                        cls5 = cls2;
                                                                        cls6 = cls3;
                                                                        r18 = 1;
                                                                    } else {
                                                                        r10 = r18;
                                                                    }
                                                                    r10 = r11;
                                                                    JSONObject jSONObject6 = jSONObject4.getJSONObject(next);
                                                                    kotlin.jvm.internal.m0.o(jSONObject6, "getJSONObject(...)");
                                                                    Type genericType3 = field.getGenericType();
                                                                    kotlin.jvm.internal.m0.n(genericType3, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                    Type type4 = ((ParameterizedType) genericType3).getActualTypeArguments()[r10];
                                                                    kotlin.jvm.internal.m0.n(type4, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                    objValueOf2 = a(jSONObject6, (Class) type4, null, null);
                                                                    if (objValueOf2 != null) {
                                                                        map.put(next, objValueOf2);
                                                                    }
                                                                    itA2 = it2;
                                                                    itKeys = it3;
                                                                    cls5 = cls2;
                                                                    cls6 = cls3;
                                                                    r18 = 1;
                                                                }
                                                                field.set(objNewInstance, map);
                                                            } else {
                                                                cls5 = cls5;
                                                                cls6 = cls6;
                                                                it = itA2;
                                                                if (List.class.isAssignableFrom(type)) {
                                                                    JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                                    kotlin.jvm.internal.m0.m(field);
                                                                    if (!kotlin.jvm.internal.m0.g(field.getType(), LinkedList.class) && !kotlin.jvm.internal.m0.g(field.getType(), LinkedList.class)) {
                                                                        linkedList = new ArrayList();
                                                                    } else {
                                                                        linkedList = new LinkedList();
                                                                    }
                                                                    int length3 = jSONArray.length();
                                                                    for (int i14 = i10; i14 < length3; i14++) {
                                                                        kotlin.jvm.internal.m0.m(jSONArray);
                                                                        Type genericType4 = field.getGenericType();
                                                                        kotlin.jvm.internal.m0.n(genericType4, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                        Type type5 = ((ParameterizedType) genericType4).getActualTypeArguments()[i10];
                                                                        kotlin.jvm.internal.m0.n(type5, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                        Object objA = a(jSONArray, i14, (Class) type5);
                                                                        if (objA == null || !a(objA.getClass())) {
                                                                            JSONObject jSONObject7 = jSONArray.getJSONObject(i14);
                                                                            kotlin.jvm.internal.m0.o(jSONObject7, "getJSONObject(...)");
                                                                            Type genericType5 = field.getGenericType();
                                                                            kotlin.jvm.internal.m0.n(genericType5, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                                                                            Type type6 = ((ParameterizedType) genericType5).getActualTypeArguments()[i10];
                                                                            kotlin.jvm.internal.m0.n(type6, "null cannot be cast to non-null type java.lang.Class<*>");
                                                                            objA = a(jSONObject7, (Class) type6, null, null);
                                                                        }
                                                                        if (objA != null) {
                                                                            linkedList.add(objA);
                                                                        }
                                                                    }
                                                                    field.set(objNewInstance, linkedList);
                                                                    itA2 = it;
                                                                    cls5 = cls5;
                                                                    cls6 = cls6;
                                                                } else if (type.isArray()) {
                                                                    JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                                    Class<?> componentType = type.getComponentType();
                                                                    int length4 = jSONArray2.length();
                                                                    Object objNewInstance2 = Array.newInstance(componentType, length4);
                                                                    for (int i15 = i10; i15 < length4; i15++) {
                                                                        kotlin.jvm.internal.m0.m(jSONArray2);
                                                                        kotlin.jvm.internal.m0.m(componentType);
                                                                        Object objA2 = a(jSONArray2, i15, componentType);
                                                                        if (objA2 == null || !a(objA2.getClass())) {
                                                                            JSONObject jSONObject8 = jSONArray2.getJSONObject(i15);
                                                                            kotlin.jvm.internal.m0.o(jSONObject8, "getJSONObject(...)");
                                                                            objA2 = a(jSONObject8, componentType, null, null);
                                                                        }
                                                                        if (objA2 != null) {
                                                                            Array.set(objNewInstance2, i15, objA2);
                                                                        }
                                                                    }
                                                                    field.set(objNewInstance, objNewInstance2);
                                                                    itA2 = it;
                                                                    z11 = true;
                                                                    i10 = i10;
                                                                    cls4 = cls4;
                                                                    cls5 = cls5;
                                                                    cls6 = cls6;
                                                                    obj4 = null;
                                                                } else {
                                                                    z10 = true;
                                                                    JSONObject jSONObject9 = jSONObject.getJSONObject(name);
                                                                    Objects.toString(objNewInstance);
                                                                    kotlin.jvm.internal.m0.m(jSONObject9);
                                                                    kotlin.jvm.internal.m0.m(type);
                                                                    obj3 = null;
                                                                    field.set(objNewInstance, a(jSONObject9, type, objNewInstance, null));
                                                                    itA2 = it;
                                                                    obj4 = obj3;
                                                                    z11 = z10;
                                                                    i10 = i10;
                                                                    cls4 = cls4;
                                                                    cls5 = cls5;
                                                                    cls6 = cls6;
                                                                }
                                                            }
                                                            obj4 = null;
                                                            z11 = true;
                                                        }
                                                        i10 = i10;
                                                    } else {
                                                        obj3 = obj4;
                                                        z10 = z11;
                                                        it = itA2;
                                                        kotlin.jvm.internal.m0.m(field);
                                                        f(field, objNewInstance, jSONObject);
                                                        itA2 = it;
                                                        obj4 = obj3;
                                                        z11 = z10;
                                                        i10 = i10;
                                                        cls4 = cls4;
                                                        cls5 = cls5;
                                                        cls6 = cls6;
                                                    }
                                                }
                                            }
                                        } else {
                                            cls4 = cls4;
                                            cls5 = cls5;
                                            cls6 = cls6;
                                            i10 = i10;
                                            obj3 = obj4;
                                            z10 = z11;
                                            it = itA2;
                                            kotlin.jvm.internal.m0.m(field);
                                            a(field, objNewInstance, jSONObject);
                                            itA2 = it;
                                            obj4 = obj3;
                                            z11 = z10;
                                            i10 = i10;
                                            cls4 = cls4;
                                            cls5 = cls5;
                                            cls6 = cls6;
                                        }
                                    } else {
                                        cls4 = cls4;
                                        cls5 = cls5;
                                        cls6 = cls6;
                                        i10 = i10;
                                        obj3 = obj4;
                                        z10 = z11;
                                        it = itA2;
                                        kotlin.jvm.internal.m0.m(field);
                                        e(field, objNewInstance, jSONObject);
                                        itA2 = it;
                                        obj4 = obj3;
                                        z11 = z10;
                                        i10 = i10;
                                        cls4 = cls4;
                                        cls5 = cls5;
                                        cls6 = cls6;
                                    }
                                } else {
                                    cls4 = cls4;
                                    cls5 = cls5;
                                    cls6 = cls6;
                                    i10 = i10;
                                    obj3 = obj4;
                                    z10 = z11;
                                    it = itA2;
                                    kotlin.jvm.internal.m0.m(field);
                                    c(field, objNewInstance, jSONObject);
                                    itA2 = it;
                                    obj4 = obj3;
                                    z11 = z10;
                                    i10 = i10;
                                    cls4 = cls4;
                                    cls5 = cls5;
                                    cls6 = cls6;
                                }
                            } else {
                                cls4 = cls4;
                                cls5 = cls5;
                                cls6 = cls6;
                                i10 = i10;
                                obj3 = obj4;
                                z10 = z11;
                                it = itA2;
                                kotlin.jvm.internal.m0.m(field);
                                b(field, objNewInstance, jSONObject);
                                itA2 = it;
                                obj4 = obj3;
                                z11 = z10;
                                i10 = i10;
                                cls4 = cls4;
                                cls5 = cls5;
                                cls6 = cls6;
                            }
                        } else {
                            cls4 = cls4;
                            cls5 = cls5;
                            cls6 = cls6;
                            i10 = i10;
                            obj3 = obj4;
                            z10 = z11;
                            it = itA2;
                            kotlin.jvm.internal.m0.m(field);
                            a(field, objNewInstance, a(jSONObject, field));
                            itA2 = it;
                            obj4 = obj3;
                            z11 = z10;
                            i10 = i10;
                            cls4 = cls4;
                            cls5 = cls5;
                            cls6 = cls6;
                        }
                    } else {
                        cls4 = cls4;
                        cls5 = cls5;
                        cls6 = cls6;
                        i10 = i10;
                        obj3 = obj4;
                        z10 = z11;
                        it = itA2;
                        kotlin.jvm.internal.m0.m(field);
                        d(field, objNewInstance, jSONObject);
                        itA2 = it;
                        obj4 = obj3;
                        z11 = z10;
                        i10 = i10;
                        cls4 = cls4;
                        cls5 = cls5;
                        cls6 = cls6;
                    }
                } else {
                    cls4 = cls4;
                    cls5 = cls5;
                    cls6 = cls6;
                    i10 = i10;
                    obj3 = obj4;
                    z10 = z11;
                    it = itA2;
                    if (field.isAnnotationPresent(Ue.class)) {
                        throw new JSONException("NonNullable field " + name + " is not present or null in the JSONObject");
                    }
                    itA2 = it;
                    obj4 = obj3;
                    z11 = z10;
                    i10 = i10;
                    cls4 = cls4;
                    cls5 = cls5;
                    cls6 = cls6;
                }
            }
        }
        return objNewInstance;
    }

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z10;
        String name = field.getName();
        try {
            z10 = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z10 = jSONObject.getInt(name) != 0;
        }
        return Boolean.valueOf(z10);
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b10 = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b10);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (kotlin.jvm.internal.m0.g(cls2, cls) || kotlin.jvm.internal.m0.g(cls2, cls) || kotlin.jvm.internal.m0.g(Integer.class, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (kotlin.jvm.internal.m0.g(cls3, cls) || kotlin.jvm.internal.m0.g(cls3, cls) || kotlin.jvm.internal.m0.g(Boolean.class, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (kotlin.jvm.internal.m0.g(cls4, cls) || kotlin.jvm.internal.m0.g(cls4, cls) || kotlin.jvm.internal.m0.g(Double.class, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (kotlin.jvm.internal.m0.g(cls5, cls) || kotlin.jvm.internal.m0.g(cls5, cls) || kotlin.jvm.internal.m0.g(Float.class, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (kotlin.jvm.internal.m0.g(cls6, cls) || kotlin.jvm.internal.m0.g(cls6, cls) || kotlin.jvm.internal.m0.g(Long.class, cls) || kotlin.jvm.internal.m0.g(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (kotlin.jvm.internal.m0.g(cls7, cls) || kotlin.jvm.internal.m0.g(cls7, cls) || kotlin.jvm.internal.m0.g(Byte.class, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return kotlin.jvm.internal.m0.g(cls8, cls) || kotlin.jvm.internal.m0.g(cls8, cls) || kotlin.jvm.internal.m0.g(Short.class, cls);
    }

    public static Object a(JSONArray jSONArray, int i10, Class cls) throws JSONException {
        Object objValueOf;
        if (kotlin.jvm.internal.m0.g(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.m0.g(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.m0.g(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i10));
        } else if (kotlin.jvm.internal.m0.g(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i10));
        } else if (kotlin.jvm.internal.m0.g(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i10));
        } else if (kotlin.jvm.internal.m0.g(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i10));
        } else {
            objValueOf = jSONArray.get(i10);
        }
        kotlin.jvm.internal.m0.m(objValueOf);
        return objValueOf;
    }
}
