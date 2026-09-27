package gm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.f<?>> f87181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f87182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<com.google.gson.v> f87183c;

    public v(Map<Type, com.google.gson.f<?>> map, boolean z10, List<com.google.gson.v> list) {
        this.f87181a = map;
        this.f87182b = z10;
        this.f87183c = list;
    }

    public static <T> f0<T> A(Class<? super T> cls, com.google.gson.v.e eVar) {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            com.google.gson.v.e eVar2 = com.google.gson.v.e.ALLOW;
            if (eVar == eVar2 || (i0.a(declaredConstructor, null) && (eVar != com.google.gson.v.e.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (eVar != eVar2 || (strP = im.a.p(declaredConstructor)) == null) ? new f0() { // from class: gm.m
                    @Override // gm.f0
                    public final Object a() {
                        return v.s(declaredConstructor);
                    }
                } : new f0() { // from class: gm.k
                    @Override // gm.f0
                    public final Object a() {
                        return v.k(strP);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new f0() { // from class: gm.j
                @Override // gm.f0
                public final Object a() {
                    return v.n(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static <T> f0<T> B(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (f0<T>) z(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (f0<T>) C(type, cls);
        }
        return null;
    }

    public static f0<? extends Map<? extends Object, Object>> C(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(c0.class) && y(type)) {
            return new f0() { // from class: gm.e
                @Override // gm.f0
                public final Object a() {
                    return v.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new f0() { // from class: gm.f
                @Override // gm.f0
                public final Object a() {
                    return v.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new f0() { // from class: gm.g
                @Override // gm.f0
                public final Object a() {
                    return v.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new f0() { // from class: gm.h
                @Override // gm.f0
                public final Object a() {
                    return v.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new f0() { // from class: gm.i
                @Override // gm.f0
                public final Object a() {
                    return v.h();
                }
            };
        }
        return null;
    }

    public static <T> f0<T> D(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new f0() { // from class: gm.c
                @Override // gm.f0
                public final Object a() {
                    return v.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new f0() { // from class: gm.d
                @Override // gm.f0
                public final Object a() {
                    return v.f(type);
                }
            };
        }
        return null;
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new com.google.gson.k(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return l0.f87170a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.k("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new com.google.gson.k("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new com.google.gson.k(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new com.google.gson.k("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new com.google.gson.k("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new com.google.gson.k(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new com.google.gson.k(str);
    }

    public static /* synthetic */ Map p() {
        return new c0();
    }

    public static /* synthetic */ Object q(String str) {
        throw new com.google.gson.k(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw im.a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + im.a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + im.a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new com.google.gson.k(str);
    }

    public static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + k0.a("r8-abstract-class");
    }

    public static boolean y(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && y.k(actualTypeArguments[0]) == String.class;
    }

    public static f0<? extends Collection<? extends Object>> z(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new f0() { // from class: gm.q
                @Override // gm.f0
                public final Object a() {
                    return v.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new f0() { // from class: gm.r
                @Override // gm.f0
                public final Object a() {
                    return v.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new f0() { // from class: gm.s
                @Override // gm.f0
                public final Object a() {
                    return v.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new f0() { // from class: gm.t
                @Override // gm.f0
                public final Object a() {
                    return v.t();
                }
            };
        }
        return null;
    }

    public final <T> f0<T> E(final Class<? super T> cls) {
        if (this.f87182b) {
            return new f0() { // from class: gm.u
                @Override // gm.f0
                public final Object a() {
                    return v.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new f0() { // from class: gm.b
            @Override // gm.f0
            public final Object a() {
                return v.o(str);
            }
        };
    }

    public String toString() {
        return this.f87181a.toString();
    }

    public <T> f0<T> w(jm.a<T> aVar) {
        return x(aVar, true);
    }

    public <T> f0<T> x(jm.a<T> aVar, boolean z10) {
        final Type typeG = aVar.g();
        Class<? super T> clsF = aVar.f();
        final com.google.gson.f<?> fVar = this.f87181a.get(typeG);
        if (fVar != null) {
            return new f0() { // from class: gm.a
                @Override // gm.f0
                public final Object a() {
                    return fVar.a(typeG);
                }
            };
        }
        final com.google.gson.f<?> fVar2 = this.f87181a.get(clsF);
        if (fVar2 != null) {
            return new f0() { // from class: gm.l
                @Override // gm.f0
                public final Object a() {
                    return fVar2.a(typeG);
                }
            };
        }
        f0<T> f0VarD = D(typeG, clsF);
        if (f0VarD != null) {
            return f0VarD;
        }
        com.google.gson.v.e eVarB = i0.b(this.f87183c, clsF);
        f0<T> f0VarA = A(clsF, eVarB);
        if (f0VarA != null) {
            return f0VarA;
        }
        f0<T> f0VarB = B(typeG, clsF);
        if (f0VarB != null) {
            return f0VarB;
        }
        final String strV = v(clsF);
        if (strV != null) {
            return new f0() { // from class: gm.n
                @Override // gm.f0
                public final Object a() {
                    return v.q(strV);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + clsF + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new f0() { // from class: gm.o
                @Override // gm.f0
                public final Object a() {
                    return v.d(str);
                }
            };
        }
        if (eVarB == com.google.gson.v.e.ALLOW) {
            return E(clsF);
        }
        final String str2 = "Unable to create instance of " + clsF + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new f0() { // from class: gm.p
            @Override // gm.f0
            public final Object a() {
                return v.u(str2);
            }
        };
    }
}
