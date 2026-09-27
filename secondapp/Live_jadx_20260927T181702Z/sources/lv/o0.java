package lv;

import dr.g1;
import dr.w2;
import jv.f1;
import qv.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface o0<E> {
    boolean R(@oy.m Throwable th2);

    @oy.l
    tv.j<E, o0<E>> e();

    @oy.m
    Object f(E e10, @oy.l or.f<? super w2> fVar);

    @oy.l
    Object j(E e10);

    @dr.o(level = dr.q.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @g1(expression = "trySend(element).isSuccess", imports = {}))
    boolean offer(E e10);

    void v(@oy.l ds.l<? super Throwable, w2> lVar);

    boolean z();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ boolean a(o0 o0Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return o0Var.R(th2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @dr.o(level = dr.q.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @g1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean c(@oy.l o0<? super E> o0Var, E e10) throws Throwable {
            Object objJ = o0Var.j(e10);
            if (t.m(objJ)) {
                return true;
            }
            Throwable thF = t.f(objJ);
            if (thF == null) {
                return false;
            }
            throw y0.m(thF);
        }

        @f1
        public static /* synthetic */ void b() {
        }
    }
}
