package bm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cr.c f21816a;

        public a(cr.c cVar) {
            this.f21816a = cVar;
        }

        @Override // cr.c, am.d
        public T get() {
            return (T) this.f21816a.get();
        }
    }

    public static <T> f<T> a(cr.c<T> cVar) {
        e.b(cVar);
        return new a(cVar);
    }
}
