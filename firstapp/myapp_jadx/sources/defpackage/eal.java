package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes4.dex */
public final class eal {
    public static final zti l = zti.d;
    public static final jjh.a m = jjh.a;
    public static final pyf0.a n = pyf0.a;
    public static final pyf0.b o = pyf0.b;
    public final ThreadLocal<Map<TypeToken<?>, w8h0<?>>> a;
    public final ConcurrentHashMap b;
    public final kya c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List<x8h0> e;
    public final Map<Type, vnn<?>> f;
    public final boolean g;
    public final zti h;
    public final List<x8h0> i;
    public final List<x8h0> j;
    public final List<kq40> k;

    public static class a<T> extends de80<T> {
        public w8h0<T> a = null;

        @Override // defpackage.de80
        public final w8h0<T> a() {
            w8h0<T> w8h0Var = this.a;
            if (w8h0Var != null) {
                return w8h0Var;
            }
            ib5.a("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }

        @Override // defpackage.w8h0
        public final T read(JsonReader jsonReader) {
            w8h0<T> w8h0Var = this.a;
            if (w8h0Var != null) {
                return w8h0Var.read(jsonReader);
            }
            ib5.a("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }

        @Override // defpackage.w8h0
        public final void write(JsonWriter jsonWriter, T t) {
            w8h0<T> w8h0Var = this.a;
            if (w8h0Var != null) {
                w8h0Var.write(jsonWriter, t);
            } else {
                ib5.a("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
        }
    }

    public eal(Excluder excluder, kjh kjhVar, Map map, zti ztiVar, List list, List list2, List list3, qyf0 qyf0Var, qyf0 qyf0Var2, List list4) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = map;
        kya kyaVar = new kya(map, list4);
        this.c = kyaVar;
        this.g = true;
        this.h = ztiVar;
        this.i = list;
        this.j = list2;
        this.k = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.A);
        arrayList.add(com.google.gson.internal.bind.a.a(qyf0Var));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.p);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.d);
        arrayList.add(TypeAdapters.e);
        arrayList.add(TypeAdapters.f);
        TypeAdapters.b bVar = TypeAdapters.k;
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, bVar));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, new aal()));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, new bal()));
        arrayList.add(qyf0Var2 == pyf0.b ? NumberTypeAdapter.b : NumberTypeAdapter.a(qyf0Var2));
        arrayList.add(TypeAdapters.h);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new cal(bVar).nullSafe()));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new dal(bVar).nullSafe()));
        arrayList.add(TypeAdapters.j);
        arrayList.add(TypeAdapters.l);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.r);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.m));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.n));
        arrayList.add(TypeAdapters.a(rtr.class, TypeAdapters.o));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.t);
        arrayList.add(TypeAdapters.v);
        arrayList.add(TypeAdapters.w);
        arrayList.add(TypeAdapters.y);
        arrayList.add(TypeAdapters.u);
        arrayList.add(TypeAdapters.b);
        arrayList.add(DefaultDateTypeAdapter.c);
        arrayList.add(TypeAdapters.x);
        if (mkd0.a) {
            arrayList.add(mkd0.c);
            arrayList.add(mkd0.b);
            arrayList.add(mkd0.d);
        }
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.a);
        arrayList.add(new CollectionTypeAdapterFactory(kyaVar));
        arrayList.add(new MapTypeAdapterFactory(kyaVar));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(kyaVar);
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(kyaVar, kjhVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final <T> T b(tcp tcpVar, Class<T> cls) {
        TypeToken<T> typeToken = TypeToken.get((Class) cls);
        if (tcpVar == null) {
            return null;
        }
        return (T) c(new yep(tcpVar), typeToken);
    }

    public final <T> T c(JsonReader jsonReader, TypeToken<T> typeToken) {
        boolean z;
        d9e0 strictness = jsonReader.getStrictness();
        if (jsonReader.getStrictness() == d9e0.b) {
            jsonReader.setStrictness(d9e0.a);
        }
        try {
            try {
                try {
                    try {
                        try {
                            jsonReader.peek();
                            z = false;
                            try {
                                w8h0<T> w8h0VarG = g(typeToken);
                                T t = w8h0VarG.read(jsonReader);
                                Class clsA = wyf.a(typeToken.getRawType());
                                if (t != null && !clsA.isInstance(t)) {
                                    throw new ClassCastException("Type adapter '" + w8h0VarG + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + t.getClass() + "\nVerify that the adapter was registered for the correct type.");
                                }
                                jsonReader.setStrictness(strictness);
                                return t;
                            } catch (EOFException e) {
                                e = e;
                                if (!z) {
                                    throw new qep(e);
                                }
                                jsonReader.setStrictness(strictness);
                                return null;
                            }
                        } catch (Throwable th) {
                            jsonReader.setStrictness(strictness);
                            throw th;
                        }
                    } catch (EOFException e2) {
                        e = e2;
                        z = true;
                    }
                } catch (IOException e3) {
                    throw new qep(e3);
                }
            } catch (IllegalStateException e4) {
                throw new qep(e4);
            }
        } catch (AssertionError e5) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e5.getMessage(), e5);
        }
    }

    public final <T> T e(String str, Class<T> cls) {
        TypeToken<T> typeToken = TypeToken.get((Class) cls);
        if (str == null) {
            return null;
        }
        return (T) d(new StringReader(str), typeToken);
    }

    public final <T> T f(String str, Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        if (str == null) {
            return null;
        }
        return (T) d(new StringReader(str), typeToken);
    }

    public final <T> w8h0<T> g(TypeToken<T> typeToken) {
        boolean z;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.b;
        w8h0<T> w8h0Var = (w8h0) concurrentHashMap.get(typeToken);
        if (w8h0Var != null) {
            return w8h0Var;
        }
        ThreadLocal<Map<TypeToken<?>, w8h0<?>>> threadLocal = this.a;
        Map map = threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set((Map<TypeToken<?>, w8h0<?>>) map);
            z = true;
        } else {
            w8h0<T> w8h0Var2 = (w8h0) map.get(typeToken);
            if (w8h0Var2 != null) {
                return w8h0Var2;
            }
            z = false;
        }
        try {
            a aVar = new a();
            map.put(typeToken, aVar);
            Iterator<x8h0> it = this.e.iterator();
            w8h0<T> w8h0VarCreate = null;
            while (it.hasNext()) {
                w8h0VarCreate = it.next().create(this, typeToken);
                if (w8h0VarCreate != null) {
                    if (aVar.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    aVar.a = w8h0VarCreate;
                    map.put(typeToken, w8h0VarCreate);
                    break;
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (w8h0VarCreate == null) {
                z9l.a(typeToken, "GSON (2.13.2) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return w8h0VarCreate;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    public final <T> w8h0<T> h(x8h0 x8h0Var, TypeToken<T> typeToken) {
        Objects.requireNonNull(x8h0Var, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = this.d;
        jsonAdapterAnnotationTypeAdapterFactory.getClass();
        ConcurrentHashMap concurrentHashMap = jsonAdapterAnnotationTypeAdapterFactory.b;
        if (x8h0Var == JsonAdapterAnnotationTypeAdapterFactory.c) {
            x8h0Var = jsonAdapterAnnotationTypeAdapterFactory;
        } else {
            Class<? super T> rawType = typeToken.getRawType();
            x8h0 x8h0Var2 = (x8h0) concurrentHashMap.get(rawType);
            if (x8h0Var2 == null) {
                zbp zbpVar = (zbp) rawType.getAnnotation(zbp.class);
                if (zbpVar != null) {
                    Class<?> clsValue = zbpVar.value();
                    if (x8h0.class.isAssignableFrom(clsValue)) {
                        x8h0 x8h0Var3 = (x8h0) jsonAdapterAnnotationTypeAdapterFactory.a.b(TypeToken.get((Class) clsValue), true).a();
                        x8h0 x8h0Var4 = (x8h0) concurrentHashMap.putIfAbsent(rawType, x8h0Var3);
                        if (x8h0Var4 != null) {
                            x8h0Var3 = x8h0Var4;
                        }
                        if (x8h0Var3 == x8h0Var) {
                            x8h0Var = jsonAdapterAnnotationTypeAdapterFactory;
                        }
                    }
                }
            } else if (x8h0Var2 == x8h0Var) {
                x8h0Var = jsonAdapterAnnotationTypeAdapterFactory;
            }
        }
        boolean z = false;
        for (x8h0 x8h0Var5 : this.e) {
            if (z) {
                w8h0<T> w8h0VarCreate = x8h0Var5.create(this, typeToken);
                if (w8h0VarCreate != null) {
                    return w8h0VarCreate;
                }
            } else if (x8h0Var5 == x8h0Var) {
                z = true;
            }
        }
        if (!z) {
            return g(typeToken);
        }
        z9l.a(typeToken, "GSON cannot serialize or deserialize ");
        return null;
    }

    public final JsonWriter i(Writer writer) {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.h);
        jsonWriter.setHtmlSafe(this.g);
        jsonWriter.setStrictness(d9e0.b);
        jsonWriter.setSerializeNulls(false);
        return jsonWriter;
    }

    public final String j(Object obj) {
        if (obj == null) {
            tdp tdpVar = tdp.a;
            StringBuilder sb = new StringBuilder();
            try {
                k(tdpVar, i(w8e0.b(sb)));
                return sb.toString();
            } catch (IOException e) {
                throw new kdp(e);
            }
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb2 = new StringBuilder();
        try {
            l(obj, cls, i(w8e0.b(sb2)));
            return sb2.toString();
        } catch (IOException e2) {
            throw new kdp(e2);
        }
    }

    public final void k(tcp tcpVar, JsonWriter jsonWriter) {
        d9e0 strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.g);
        jsonWriter.setSerializeNulls(false);
        if (jsonWriter.getStrictness() == d9e0.b) {
            jsonWriter.setStrictness(d9e0.a);
        }
        try {
            try {
                TypeAdapters.z.getClass();
                ddp.c(tcpVar, jsonWriter);
                jsonWriter.setStrictness(strictness);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new kdp(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final void l(Object obj, Class cls, JsonWriter jsonWriter) {
        w8h0 w8h0VarG = g(TypeToken.get((Type) cls));
        d9e0 strictness = jsonWriter.getStrictness();
        if (jsonWriter.getStrictness() == d9e0.b) {
            jsonWriter.setStrictness(d9e0.a);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.g);
        jsonWriter.setSerializeNulls(false);
        try {
            try {
                w8h0VarG.write(jsonWriter, obj);
                jsonWriter.setStrictness(strictness);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e) {
                throw new kdp(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public final <T> T d(Reader reader, TypeToken<T> typeToken) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setStrictness(d9e0.b);
        T t = (T) c(jsonReader, typeToken);
        if (t != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new qep(xOgHBQVl.JfaXrNgqdB);
                }
            } catch (MalformedJsonException e) {
                throw new qep(e);
            } catch (IOException e2) {
                throw new kdp(e2);
            }
        }
        return t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eal() {
        Excluder excluder = Excluder.c;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(excluder, m, map, l, list, list, list, n, o, list);
    }
}
