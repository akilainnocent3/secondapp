package pc;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile T f120681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f120682b;

        public a(b bVar) {
            this.f120682b = bVar;
        }

        @Override // pc.h.b
        public T get() {
            if (this.f120681a == null) {
                synchronized (this) {
                    try {
                        if (this.f120681a == null) {
                            this.f120681a = (T) m.e(this.f120682b.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f120681a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
