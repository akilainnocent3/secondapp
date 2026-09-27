package yk;

import zj.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f159536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f159537b;

    public a(Class<T> cls, T t10) {
        this.f159536a = (Class) j0.b(cls);
        this.f159537b = (T) j0.b(t10);
    }

    public T a() {
        return this.f159537b;
    }

    public Class<T> b() {
        return this.f159536a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f159536a, this.f159537b);
    }
}
