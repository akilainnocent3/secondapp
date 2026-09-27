package bm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class b<T> implements f<T>, am.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f21810c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f21811d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile f<T> f21812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f21813b = f21810c;

    public b(f<T> fVar) {
        this.f21812a = fVar;
    }

    public static <P extends f<T>, T> am.d<T> a(P p10) {
        return p10 instanceof am.d ? (am.d) p10 : new b((f) e.b(p10));
    }

    public static <P extends cr.c<T>, T> am.d<T> b(P p10) {
        return a(g.a(p10));
    }

    public static <P extends f<T>, T> f<T> c(P p10) {
        e.b(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    @Deprecated
    public static <P extends cr.c<T>, T> cr.c<T> d(P p10) {
        return c(g.a(p10));
    }

    private static Object e(Object obj, Object obj2) {
        if (obj == f21810c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // cr.c, am.d
    public T get() {
        T t10;
        T t11 = (T) this.f21813b;
        Object obj = f21810c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f21813b;
                if (t10 == obj) {
                    t10 = this.f21812a.get();
                    this.f21813b = e(this.f21813b, t10);
                    this.f21812a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
