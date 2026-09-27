package qy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f123232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.h
    public final Object f123233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f123234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<?> f123235d;

    public u(Class<?> cls, @zq.h Object obj, Method method, List<?> list) {
        this.f123232a = cls;
        this.f123233b = obj;
        this.f123234c = method;
        this.f123235d = Collections.unmodifiableList(list);
    }

    public static <T> u d(Class<T> cls, T t10, Method method, List<?> list) {
        Objects.requireNonNull(cls, "service == null");
        Objects.requireNonNull(t10, "instance == null");
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new u(cls, t10, method, new ArrayList(list));
    }

    @Deprecated
    public static u e(Method method, List<?> list) {
        Objects.requireNonNull(method, "method == null");
        Objects.requireNonNull(list, "arguments == null");
        return new u(method.getDeclaringClass(), null, method, new ArrayList(list));
    }

    public List<?> a() {
        return this.f123235d;
    }

    @zq.h
    public Object b() {
        return this.f123233b;
    }

    public Method c() {
        return this.f123234c;
    }

    public Class<?> f() {
        return this.f123232a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f123232a.getName(), this.f123234c.getName(), this.f123235d);
    }
}
