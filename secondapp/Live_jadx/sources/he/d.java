package he;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d<T> implements c<T>, ge.d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d<Object> f88177b = new d<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f88178a;

    public d(T t10) {
        this.f88178a = t10;
    }

    public static <T> c<T> a(T t10) {
        return new d(e.c(t10, "instance cannot be null"));
    }

    public static <T> c<T> b(T t10) {
        return t10 == null ? c() : new d(t10);
    }

    public static <T> d<T> c() {
        return (d<T>) f88177b;
    }

    @Override // cr.c, am.d
    public T get() {
        return this.f88178a;
    }
}
