package androidx.lifecycle;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c f13302c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13303d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13304e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f13305f = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, a> f13306a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f13307b = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<r.a, List<b>> f13308a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<b, r.a> f13309b;

        public a(Map<b, r.a> map) {
            this.f13309b = map;
            for (Map.Entry<b, r.a> entry : map.entrySet()) {
                r.a value = entry.getValue();
                List<b> arrayList = this.f13308a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f13308a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void b(List<b> list, b0 b0Var, r.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(b0Var, aVar, obj);
                }
            }
        }

        public void a(b0 b0Var, r.a aVar, Object obj) {
            b(this.f13308a.get(aVar), b0Var, aVar, obj);
            b(this.f13308a.get(r.a.ON_ANY), b0Var, aVar, obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f13311b;

        public b(int i10, Method method) {
            this.f13310a = i10;
            this.f13311b = method;
            method.setAccessible(true);
        }

        public void a(b0 b0Var, r.a aVar, Object obj) {
            try {
                int i10 = this.f13310a;
                if (i10 == 0) {
                    this.f13311b.invoke(obj, null);
                } else if (i10 == 1) {
                    this.f13311b.invoke(obj, b0Var);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f13311b.invoke(obj, b0Var, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f13310a == bVar.f13310a && this.f13311b.getName().equals(bVar.f13311b.getName());
        }

        public int hashCode() {
            return (this.f13310a * 31) + this.f13311b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, @Nullable Method[] methodArr) {
        int i10;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f13309b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, r.a> entry : c(cls2).f13309b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            n0 n0Var = (n0) method.getAnnotation(n0.class);
            if (n0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!b0.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                r.a aVarValue = n0Var.value();
                if (parameterTypes.length > 1) {
                    if (!r.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != r.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i10, method), aVarValue, cls);
                z10 = true;
            }
        }
        a aVar = new a(map);
        this.f13306a.put(cls, aVar);
        this.f13307b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f13306a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f13307b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((n0) method.getAnnotation(n0.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f13307b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, r.a> map, b bVar, r.a aVar, Class<?> cls) {
        r.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f13311b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
