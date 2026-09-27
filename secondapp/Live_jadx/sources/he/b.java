package he;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b<T> implements cr.c<T>, ge.d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f88173c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f88174d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile cr.c<T> f88175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f88176b = f88173c;

    public b(cr.c<T> cVar) {
        this.f88175a = cVar;
    }

    public static <P extends cr.c<T>, T> ge.d<T> a(P p10) {
        return p10 instanceof ge.d ? (ge.d) p10 : new b((cr.c) e.b(p10));
    }

    public static <P extends cr.c<T>, T> cr.c<T> b(P p10) {
        e.b(p10);
        return p10 instanceof b ? p10 : new b(p10);
    }

    public static Object c(Object obj, Object obj2) {
        if (obj == f88173c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // cr.c, am.d
    public T get() {
        T t10;
        T t11 = (T) this.f88176b;
        Object obj = f88173c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f88176b;
                if (t10 == obj) {
                    t10 = this.f88175a.get();
                    this.f88176b = c(this.f88176b, t10);
                    this.f88175a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }
}
