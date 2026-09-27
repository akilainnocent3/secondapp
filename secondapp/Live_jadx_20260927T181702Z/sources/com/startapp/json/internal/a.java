package com.startapp.json.internal;

import androidx.media3.session.fe;
import com.startapp.json.JsonException;
import com.startapp.json.TypeClassInfo;
import com.startapp.json.TypeInfo;
import com.startapp.json.TypeParser;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f73965a;

    static {
        HashMap map = new HashMap();
        f73965a = map;
        map.put("int[]", Integer.class);
        map.put("long[]", Long.class);
        map.put("double[]", Double.class);
        map.put("float[]", Float.class);
        map.put("bool[]", Boolean.class);
        map.put("char[]", Character.class);
        map.put("byte[]", Byte.class);
        map.put("void[]", Void.class);
        map.put("short[]", Short.class);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    public static <T> T a(Class<T> cls, JSONObject jSONObject) throws JsonException {
        T tNewInstance;
        Class<?> cls2;
        boolean z10;
        Class<?> cls3;
        Class<?> cls4;
        Class<?> clsType;
        Class<?> clsKey;
        Class<? extends TypeParser> rVar;
        ?? r17;
        Object objA;
        Object objB;
        Class<?> type;
        try {
            TypeClassInfo typeClassInfo = (TypeClassInfo) cls.getAnnotation(TypeClassInfo.class);
            boolean z11 = true;
            char c10 = 0;
            Class<?> cls5 = null;
            if (cls.equals(HttpCookie.class)) {
                Constructor<?> constructor = cls.getDeclaredConstructors()[0];
                constructor.setAccessible(true);
                tNewInstance = (T) constructor.newInstance("name", "value");
            } else {
                if (cls.isPrimitive()) {
                    return cls.newInstance();
                }
                if (cls.getAnnotation(TypeClassInfo.class) == null || typeClassInfo.extendsClass()) {
                    Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    tNewInstance = declaredConstructor.newInstance(null);
                } else {
                    if (!typeClassInfo.extendsClass()) {
                        try {
                            String string = jSONObject.getString(typeClassInfo.decider());
                            return (T) a(Class.forName(typeClassInfo.packageName() + fe.F + string), jSONObject);
                        } catch (ClassNotFoundException e10) {
                            throw new JsonException(e10);
                        } catch (JSONException e11) {
                            throw new JsonException(e11);
                        }
                    }
                    tNewInstance = null;
                }
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (typeClassInfo != null && typeClassInfo.extendsClass()) {
                int length = declaredFields.length;
                Field[] declaredFields2 = cls.getSuperclass().getDeclaredFields();
                int length2 = declaredFields2.length;
                Field[] fieldArr = new Field[length + length2];
                System.arraycopy(declaredFields, 0, fieldArr, 0, length);
                System.arraycopy(declaredFields2, 0, fieldArr, length, length2);
                declaredFields = fieldArr;
            }
            int length3 = declaredFields.length;
            int i10 = 0;
            while (i10 < length3) {
                Field field = declaredFields[i10];
                int modifiers = field.getModifiers();
                if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers)) {
                    cls2 = cls5;
                } else {
                    String strA = a(field);
                    try {
                        try {
                            if (jSONObject.has(strA)) {
                                field.setAccessible(z11);
                                if (field.getDeclaredAnnotations().length > 0) {
                                    Annotation annotation = field.getDeclaredAnnotations()[c10];
                                    if (annotation.annotationType().equals(TypeInfo.class)) {
                                        TypeInfo typeInfo = (TypeInfo) annotation;
                                        clsType = typeInfo.type();
                                        clsKey = typeInfo.key();
                                        Class<?> clsValue = typeInfo.value();
                                        boolean zComplex = typeInfo.complex();
                                        Class<?> clsInnerValue = typeInfo.innerValue();
                                        rVar = typeInfo.parser();
                                        z10 = z11;
                                        cls3 = clsValue;
                                        cls4 = clsInnerValue;
                                        r17 = zComplex;
                                    } else {
                                        char c11 = c10;
                                        z10 = c11 == true ? 1 : 0;
                                        cls3 = cls5;
                                        cls4 = cls3;
                                        clsType = cls4;
                                        clsKey = clsType;
                                        rVar = TypeParser.class;
                                        r17 = c11;
                                    }
                                } else {
                                    char c12 = c10;
                                    z10 = c12 == true ? 1 : 0;
                                    cls3 = cls5;
                                    cls4 = cls3;
                                    clsType = cls4;
                                    clsKey = clsType;
                                    rVar = TypeParser.class;
                                    r17 = c12;
                                }
                                try {
                                    try {
                                        if (field.getType().getAnnotation(TypeClassInfo.class) != null) {
                                            TypeClassInfo typeClassInfo2 = (TypeClassInfo) field.getType().getAnnotation(TypeClassInfo.class);
                                            String string2 = jSONObject.getJSONObject(strA).getString(typeClassInfo2.decider());
                                            type = Class.forName(typeClassInfo2.packageName() + fe.F + string2);
                                        } else {
                                            if (rVar != TypeParser.class) {
                                                objA = rVar.newInstance().parse(field.getType(), jSONObject.opt(strA));
                                            } else if (r17 != 0) {
                                                type = field.getType();
                                            } else {
                                                if (z10 && (Map.class.isAssignableFrom(clsType) || Collection.class.isAssignableFrom(clsType))) {
                                                    if (clsType.equals(HashMap.class)) {
                                                        JSONObject jSONObject2 = jSONObject.getJSONObject(strA);
                                                        objB = a(clsKey, cls3, cls4, jSONObject2, jSONObject2.keys());
                                                    } else if (clsType.equals(ArrayList.class)) {
                                                        objB = a(cls3, jSONObject.getJSONArray(strA));
                                                    } else if (clsType.equals(HashSet.class)) {
                                                        objB = b(cls3, jSONObject.getJSONArray(strA));
                                                    } else if (clsType.equals(EnumSet.class)) {
                                                        JSONArray jSONArray = jSONObject.getJSONArray(strA);
                                                        HashSet hashSet = new HashSet();
                                                        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                                            hashSet.add(Enum.valueOf(cls3, jSONArray.getString(i11)));
                                                        }
                                                        field.set(tNewInstance, hashSet);
                                                    }
                                                    field.set(tNewInstance, objB);
                                                } else if (field.getType().isEnum()) {
                                                    field.set(tNewInstance, Enum.valueOf(clsType, (String) jSONObject.get(strA)));
                                                } else if (field.getType().isPrimitive()) {
                                                    objA = a(jSONObject, field, jSONObject.get(strA), field.getType());
                                                } else if (field.getType().isArray()) {
                                                    objA = a(jSONObject, clsType, field);
                                                } else {
                                                    objA = a(jSONObject.get(strA), field.getType());
                                                    cls2 = null;
                                                    if (objA.equals(null)) {
                                                        field.set(tNewInstance, null);
                                                    } else {
                                                        field.set(tNewInstance, objA);
                                                    }
                                                }
                                                cls2 = null;
                                            }
                                            cls2 = null;
                                            field.set(tNewInstance, objA);
                                        }
                                        field.set(tNewInstance, objA);
                                    } catch (Exception unused) {
                                    }
                                    objA = a(type, jSONObject.getJSONObject(strA));
                                    cls2 = null;
                                } catch (Exception unused2) {
                                }
                            } else {
                                cls2 = cls5;
                            }
                        } catch (Throwable th2) {
                            throw new JsonException(th2);
                        }
                    } catch (Exception unused3) {
                    }
                }
                i10++;
                cls5 = cls2;
                z11 = true;
                c10 = 0;
            }
            return tNewInstance;
        } catch (Exception e12) {
            throw new JsonException(e12);
        }
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            hashSet.add(jSONObjectOptJSONObject == null ? jSONArray.get(i10) : a(cls, jSONObjectOptJSONObject));
        }
        return hashSet;
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (annotation.annotationType().equals(TypeInfo.class)) {
            return ((TypeInfo) annotation).complex();
        }
        return false;
    }

    public static Object a(Object obj, Class<?> cls) {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (!cls.equals(Integer.class)) {
            return (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
        }
        if (obj.getClass().equals(Double.class)) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        return obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (!obj.getClass().equals(cls)) {
            boolean zEquals = obj.getClass().equals(String.class);
            Class cls2 = Integer.TYPE;
            if (zEquals) {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(jSONObject.getInt(a(field)));
                }
            } else {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (cls.equals(Long.TYPE)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
            }
        }
        return obj;
    }

    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(TypeInfo.class)) {
                TypeInfo typeInfo = (TypeInfo) annotation;
                if (!"".equals(typeInfo.name())) {
                    return typeInfo.name();
                }
            }
        }
        return field.getName();
    }

    public static <V> List<V> a(Class<V> cls, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            arrayList.add(jSONObjectOptJSONObject == null ? jSONArray.get(i10) : a(cls, jSONObjectOptJSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) throws JSONException, NoSuchMethodException {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(a(field));
            int length = jSONArray.length();
            Object objNewInstance = Array.newInstance((Class<?>) cls, length);
            for (int i10 = 0; i10 < length; i10++) {
                Array.set(objNewInstance, i10, a(cls, jSONArray.getJSONObject(i10)));
            }
            return (Object[]) objNewInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f73965a.get(field.getType().getSimpleName());
        Object objNewInstance2 = Array.newInstance((Class<?>) cls2.getField("TYPE").get(null), length2);
        for (int i11 = 0; i11 < length2; i11++) {
            String string = jSONArray2.getString(i11);
            Constructor<T> constructor = cls2.getConstructor(cls2.equals(Character.class) ? Character.TYPE : String.class);
            Array.set(objNewInstance2, i11, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return objNewInstance2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) throws JsonException {
        Object objA;
        HashMap map = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object objCast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                objCast = Enum.valueOf(cls, objCast.toString());
            }
            String str = (String) next;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    objA = cls2.isEnum() ? Enum.valueOf(cls2, (String) jSONObject.get(str)) : jSONObject.get(str);
                } else {
                    objA = a(cls3, jSONArrayOptJSONArray);
                }
            } else {
                objA = a((Class<Object>) cls2, jSONObjectOptJSONObject);
            }
            map.put(objCast, objA);
        }
        return map;
    }
}
