package or;

import androidx.activity.k0;
import dr.l1;
import ds.p;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public interface g extends j.b {

    @oy.l
    public static final b Aa = b.f119532b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static <R> R a(@oy.l g gVar, R r10, @oy.l p<? super R, ? super j.b, ? extends R> operation) {
            m0.p(operation, "operation");
            return (R) j.b.a.a(gVar, r10, operation);
        }

        @oy.m
        public static <E extends j.b> E b(@oy.l g gVar, @oy.l j.c<E> key) {
            m0.p(key, "key");
            if (!(key instanceof or.b)) {
                if (g.Aa != key) {
                    return null;
                }
                m0.n(gVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return gVar;
            }
            or.b bVar = (or.b) key;
            if (bVar.a(gVar.getKey())) {
                E e10 = (E) bVar.b(gVar);
                if (k0.a(e10)) {
                    return e10;
                }
            }
            return null;
        }

        @oy.l
        public static j c(@oy.l g gVar, @oy.l j.c<?> key) {
            m0.p(key, "key");
            if (!(key instanceof or.b)) {
                return g.Aa == key ? l.f119535b : gVar;
            }
            or.b bVar = (or.b) key;
            return (!bVar.a(gVar.getKey()) || bVar.b(gVar) == null) ? gVar : l.f119535b;
        }

        @oy.l
        public static j d(@oy.l g gVar, @oy.l j context) {
            m0.p(context, "context");
            return j.b.a.d(gVar, context);
        }

        public static void e(@oy.l g gVar, @oy.l f<?> continuation) {
            m0.p(continuation, "continuation");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements j.c<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f119532b = new b();
    }

    @oy.l
    <T> f<T> L(@oy.l f<? super T> fVar);

    @Override // or.j.b, or.j
    @oy.m
    <E extends j.b> E get(@oy.l j.c<E> cVar);

    void i(@oy.l f<?> fVar);

    @Override // or.j.b, or.j
    @oy.l
    j minusKey(@oy.l j.c<?> cVar);
}
