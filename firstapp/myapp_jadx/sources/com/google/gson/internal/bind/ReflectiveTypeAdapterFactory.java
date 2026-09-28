package com.google.gson.internal.bind;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.eal;
import defpackage.ial;
import defpackage.jk40;
import defpackage.kdp;
import defpackage.kjh;
import defpackage.kq40;
import defpackage.kya;
import defpackage.lq40;
import defpackage.nq40;
import defpackage.qep;
import defpackage.tby;
import defpackage.tug;
import defpackage.utg;
import defpackage.w8h0;
import defpackage.x8h0;
import defpackage.zbp;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ReflectiveTypeAdapterFactory implements x8h0 {
    public final kya a;
    public final kjh b;
    public final Excluder c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List<kq40> e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends w8h0<T> {
        @Override // defpackage.w8h0
        public final T read(JsonReader jsonReader) throws IOException {
            jsonReader.skipValue();
            return null;
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }

        @Override // defpackage.w8h0
        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            jsonWriter.nullValue();
        }
    }

    public static abstract class b<T, A> extends w8h0<T> {
        public final e a;

        public b(e eVar) {
            this.a = eVar;
        }

        public abstract A a();

        public abstract T b(A a);

        public abstract void c(A a, JsonReader jsonReader, c cVar);

        @Override // defpackage.w8h0
        public final T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            A a = a();
            Map<String, c> map = this.a.a;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c cVar = map.get(jsonReader.nextName());
                    if (cVar == null) {
                        jsonReader.skipValue();
                    } else {
                        c(a, jsonReader, cVar);
                    }
                }
                jsonReader.endObject();
                return b(a);
            } catch (IllegalAccessException e) {
                nq40.a aVar = nq40.a;
                jk40.a("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                return null;
            } catch (IllegalStateException e2) {
                throw new qep(e2);
            }
        }

        @Override // defpackage.w8h0
        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator<c> it = this.a.b.iterator();
                while (it.hasNext()) {
                    it.next().c(jsonWriter, t);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                nq40.a aVar = nq40.a;
                jk40.a("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }
    }

    public static abstract class c {
        public final String a;
        public final Field b;
        public final String c;

        public c(String str, Field field) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
        }

        public abstract void a(JsonReader jsonReader, int i, Object[] objArr);

        public abstract void b(JsonReader jsonReader, Object obj);

        public abstract void c(JsonWriter jsonWriter, Object obj);
    }

    public static final class d<T> extends b<T, T> {
        public final tby<T> b;

        public d(tby<T> tbyVar, e eVar) {
            super(eVar);
            this.b = tbyVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public final T a() {
            return this.b.a();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public final T b(T t) {
            return t;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public final void c(T t, JsonReader jsonReader, c cVar) {
            cVar.b(jsonReader, t);
        }
    }

    public static class e {
        public static final e c = new e(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        public final Map<String, c> a;
        public final List<c> b;

        public e(Map<String, c> map, List<c> list) {
            this.a = map;
            this.b = list;
        }
    }

    public static final class f<T> extends b<T, Object[]> {
        public static final HashMap e;
        public final Constructor<T> b;
        public final Object[] c;
        public final HashMap d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            e = map;
        }

        public f(Class<T> cls, e eVar, boolean z) {
            super(eVar);
            this.d = new HashMap();
            nq40.a aVar = nq40.a;
            Constructor<T> constructorB = aVar.b(cls);
            this.b = constructorB;
            if (z) {
                ReflectiveTypeAdapterFactory.a(null, constructorB);
            } else {
                nq40.f(constructorB);
            }
            String[] strArrC = aVar.c(cls);
            for (int i = 0; i < strArrC.length; i++) {
                this.d.put(strArrC[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public final Object[] a() {
            return (Object[]) this.c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public final Object b(Object[] objArr) {
            Object[] objArr2 = objArr;
            Constructor<T> constructor = this.b;
            try {
                return constructor.newInstance(objArr2);
            } catch (IllegalAccessException e2) {
                nq40.a aVar = nq40.a;
                jk40.a("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                return null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + nq40.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + nq40.b(constructor) + "' with args " + Arrays.toString(objArr2), e);
            } catch (InvocationTargetException e5) {
                jk40.a("Failed to invoke constructor '" + nq40.b(constructor) + "' with args " + Arrays.toString(objArr2), e5.getCause());
                return null;
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public final void c(Object[] objArr, JsonReader jsonReader, c cVar) {
            Object[] objArr2 = objArr;
            String str = cVar.c;
            Integer num = (Integer) this.d.get(str);
            if (num != null) {
                cVar.a(jsonReader, num.intValue(), objArr2);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + nq40.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public ReflectiveTypeAdapterFactory(kya kyaVar, kjh kjhVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<kq40> list) {
        this.a = kyaVar;
        this.b = kjhVar;
        this.c = excluder;
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        this.e = list;
    }

    public static <M extends AccessibleObject & Member> void a(Object obj, M m) {
        if (Modifier.isStatic(m.getModifiers())) {
            obj = null;
        }
        if (!lq40.a.a.a(obj, m)) {
            throw new kdp(nq40.d(m, true).concat(" is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public static void b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + nq40.c(field) + " and " + nq40.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[LOOP:2: B:88:0x01a7->B:115:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:75:0x0179  */
    /* JADX WARN: Code duplicated, block: B:77:0x017c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0184  */
    /* JADX WARN: Code duplicated, block: B:81:0x0186  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ad  */
    public final e c(eal ealVar, TypeToken<?> typeToken, Class<?> cls, boolean z, boolean z2) {
        boolean z3;
        Method method;
        SerializedName serializedName;
        List listAsList;
        String strA;
        List<String> listSingletonList;
        TypeToken<?> typeToken2;
        Class<? super Object> rawType;
        boolean z4;
        int modifiers;
        boolean z5;
        zbp zbpVar;
        eal ealVar2;
        int i;
        w8h0<?> w8h0VarG;
        boolean z6;
        w8h0<?> w8h0Var;
        int i2;
        com.google.gson.internal.bind.b bVar;
        c cVar;
        c cVar2;
        w8h0<?> cVar3;
        if (cls.isInterface()) {
            return e.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken<?> typeToken3 = typeToken;
        boolean z7 = z;
        Class<?> rawType2 = cls;
        while (rawType2 != Object.class) {
            Field[] declaredFields = rawType2.getDeclaredFields();
            boolean z8 = true;
            if (rawType2 != cls && declaredFields.length > 0) {
                kq40.a aVarA = lq40.a(rawType2, this.e);
                if (aVarA == kq40.a.d) {
                    throw new kdp("ReflectionAccessFilter does not permit using reflection for " + rawType2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z7 = aVarA == kq40.a.c;
            }
            boolean z9 = z7;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                boolean zD = d(field, z8);
                boolean zD2 = d(field, false);
                if (zD || zD2) {
                    if (z2) {
                        if (Modifier.isStatic(field.getModifiers())) {
                            z3 = false;
                        } else {
                            Method methodA = nq40.a.a(rawType2, field);
                            if (!z9) {
                                nq40.f(methodA);
                            }
                            if (methodA.getAnnotation(SerializedName.class) != null && field.getAnnotation(SerializedName.class) == null) {
                                throw new kdp(tug.a("@SerializedName on ", nq40.d(methodA, false), " is not supported"));
                            }
                            z3 = zD2;
                            method = methodA;
                        }
                        if (!z9 && method == null) {
                            nq40.f(field);
                        }
                        Type typeG = ial.g(typeToken3.getType(), rawType2, field.getGenericType(), new HashMap());
                        serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        if (serializedName == null) {
                            strA = this.b.a(field);
                            listAsList = Collections.EMPTY_LIST;
                        } else {
                            String strValue = serializedName.value();
                            listAsList = Arrays.asList(serializedName.alternate());
                            strA = strValue;
                        }
                        if (listAsList.isEmpty()) {
                            listSingletonList = Collections.singletonList(strA);
                        } else {
                            ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                            arrayList.add(strA);
                            arrayList.addAll(listAsList);
                            listSingletonList = arrayList;
                        }
                        String str = (String) listSingletonList.get(0);
                        typeToken2 = TypeToken.get(typeG);
                        rawType = typeToken2.getRawType();
                        if (rawType == null && rawType.isPrimitive()) {
                            z4 = z8;
                        } else {
                            z4 = false;
                        }
                        modifiers = field.getModifiers();
                        if (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) {
                            z5 = false;
                        } else {
                            z5 = z8;
                        }
                        zbpVar = (zbp) field.getAnnotation(zbp.class);
                        if (zbpVar != null) {
                            i = i3;
                            ealVar2 = ealVar;
                            w8h0VarG = this.d.a(this.a, ealVar2, typeToken2, zbpVar, false);
                        } else {
                            ealVar2 = ealVar;
                            i = i3;
                            w8h0VarG = null;
                        }
                        if (w8h0VarG != null) {
                            z6 = z8;
                        } else {
                            z6 = false;
                        }
                        if (w8h0VarG == null) {
                            w8h0VarG = ealVar2.g(typeToken2);
                        }
                        if (zD) {
                            if (z6) {
                                cVar3 = w8h0VarG;
                            } else {
                                cVar3 = new com.google.gson.internal.bind.c<>(ealVar2, w8h0VarG, typeToken2.getType());
                            }
                            w8h0Var = cVar3;
                        } else {
                            w8h0Var = w8h0VarG;
                        }
                        i2 = length;
                        bVar = new com.google.gson.internal.bind.b(str, field, z9, method, w8h0Var, w8h0VarG, z4, z5);
                        if (z3) {
                            for (String str2 : listSingletonList) {
                                cVar2 = (c) linkedHashMap.put(str2, bVar);
                                if (cVar2 == null) {
                                    b(cls, str2, cVar2.b, field);
                                    throw null;
                                }
                            }
                        }
                        if (zD && (cVar = (c) linkedHashMap2.put(str, bVar)) != null) {
                            b(cls, str, cVar.b, field);
                            throw null;
                        }
                    } else {
                        z3 = zD2;
                    }
                    method = null;
                    if (!z9) {
                        nq40.f(field);
                    }
                    Type typeG2 = ial.g(typeToken3.getType(), rawType2, field.getGenericType(), new HashMap());
                    serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                    if (serializedName == null) {
                        strA = this.b.a(field);
                        listAsList = Collections.EMPTY_LIST;
                    } else {
                        String strValue2 = serializedName.value();
                        listAsList = Arrays.asList(serializedName.alternate());
                        strA = strValue2;
                    }
                    if (listAsList.isEmpty()) {
                        listSingletonList = Collections.singletonList(strA);
                    } else {
                        ArrayList arrayList2 = new ArrayList(listAsList.size() + 1);
                        arrayList2.add(strA);
                        arrayList2.addAll(listAsList);
                        listSingletonList = arrayList2;
                    }
                    String str3 = (String) listSingletonList.get(0);
                    typeToken2 = TypeToken.get(typeG2);
                    rawType = typeToken2.getRawType();
                    if (rawType == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers)) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    zbpVar = (zbp) field.getAnnotation(zbp.class);
                    if (zbpVar != null) {
                        i = i3;
                        ealVar2 = ealVar;
                        w8h0VarG = this.d.a(this.a, ealVar2, typeToken2, zbpVar, false);
                    } else {
                        ealVar2 = ealVar;
                        i = i3;
                        w8h0VarG = null;
                    }
                    if (w8h0VarG != null) {
                        z6 = z8;
                    } else {
                        z6 = false;
                    }
                    if (w8h0VarG == null) {
                        w8h0VarG = ealVar2.g(typeToken2);
                    }
                    if (zD) {
                        if (z6) {
                            cVar3 = w8h0VarG;
                        } else {
                            cVar3 = new com.google.gson.internal.bind.c<>(ealVar2, w8h0VarG, typeToken2.getType());
                        }
                        w8h0Var = cVar3;
                    } else {
                        w8h0Var = w8h0VarG;
                    }
                    i2 = length;
                    bVar = new com.google.gson.internal.bind.b(str3, field, z9, method, w8h0Var, w8h0VarG, z4, z5);
                    if (z3) {
                        while (r5.hasNext()) {
                            cVar2 = (c) linkedHashMap.put(str2, bVar);
                            if (cVar2 == null) {
                                b(cls, str2, cVar2.b, field);
                                throw null;
                            }
                        }
                    }
                    if (zD) {
                        continue;
                    }
                } else {
                    i = i3;
                    z8 = z8;
                    i2 = length;
                }
                i3 = i + 1;
                z8 = z8;
                length = i2;
            }
            typeToken3 = TypeToken.get(ial.g(typeToken3.getType(), rawType2, rawType2.getGenericSuperclass(), new HashMap()));
            rawType2 = typeToken3.getRawType();
            z7 = z9;
        }
        return new e(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    @Override // defpackage.x8h0
    public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        nq40.a aVar = nq40.a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new a();
        }
        kq40.a aVarA = lq40.a(rawType, this.e);
        if (aVarA != kq40.a.d) {
            boolean z = aVarA == kq40.a.c;
            return nq40.a.d(rawType) ? new f(rawType, c(ealVar, typeToken, rawType, z, true), z) : new d(this.a.b(typeToken, true), c(ealVar, typeToken, rawType, z, false));
        }
        throw new kdp("ReflectionAccessFilter does not permit using reflection for " + rawType + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.c;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.a(field.getType(), z)) {
            z2 = true;
        } else {
            List<utg> list = z ? excluder.a : excluder.b;
            if (!list.isEmpty()) {
                Iterator<utg> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().b()) {
                            z2 = true;
                        }
                    }
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
