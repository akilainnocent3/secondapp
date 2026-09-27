package or;

import dr.l1;
import ds.p;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.3")
public interface j {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @oy.l
        public static j b(@oy.l j jVar, @oy.l j context) {
            m0.p(context, "context");
            return context == l.f119535b ? jVar : (j) context.fold(jVar, new p() { // from class: or.i
                @Override // ds.p
                public final Object invoke(Object obj, Object obj2) {
                    return j.a.c((j) obj, (j.b) obj2);
                }
            });
        }

        public static j c(j acc, b element) {
            m0.p(acc, "acc");
            m0.p(element, "element");
            j jVarMinusKey = acc.minusKey(element.getKey());
            l lVar = l.f119535b;
            if (jVarMinusKey == lVar) {
                return element;
            }
            g.b bVar = g.Aa;
            g gVar = (g) jVarMinusKey.get(bVar);
            if (gVar == null) {
                return new e(jVarMinusKey, element);
            }
            j jVarMinusKey2 = jVarMinusKey.minusKey(bVar);
            return jVarMinusKey2 == lVar ? new e(element, gVar) : new e(new e(jVarMinusKey2, element), gVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b extends j {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public static <R> R a(@oy.l b bVar, R r10, @oy.l p<? super R, ? super b, ? extends R> operation) {
                m0.p(operation, "operation");
                return operation.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @oy.m
            public static <E extends b> E b(@oy.l b bVar, @oy.l c<E> key) {
                m0.p(key, "key");
                if (!m0.g(bVar.getKey(), key)) {
                    return null;
                }
                m0.n(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            @oy.l
            public static j c(@oy.l b bVar, @oy.l c<?> key) {
                m0.p(key, "key");
                return m0.g(bVar.getKey(), key) ? l.f119535b : bVar;
            }

            @oy.l
            public static j d(@oy.l b bVar, @oy.l j context) {
                m0.p(context, "context");
                return a.b(bVar, context);
            }
        }

        @Override // or.j
        <R> R fold(R r10, @oy.l p<? super R, ? super b, ? extends R> pVar);

        @Override // or.j
        @oy.m
        <E extends b> E get(@oy.l c<E> cVar);

        @oy.l
        c<?> getKey();

        @Override // or.j
        @oy.l
        j minusKey(@oy.l c<?> cVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, @oy.l p<? super R, ? super b, ? extends R> pVar);

    @oy.m
    <E extends b> E get(@oy.l c<E> cVar);

    @oy.l
    j minusKey(@oy.l c<?> cVar);

    @oy.l
    j plus(@oy.l j jVar);
}
