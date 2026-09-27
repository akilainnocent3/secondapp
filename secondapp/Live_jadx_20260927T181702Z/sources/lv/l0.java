package lv;

import dr.g1;
import jv.s0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface l0<E> extends s0, o0<E> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @dr.o(level = dr.q.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @g1(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean a(@oy.l l0<? super E> l0Var, E e10) {
            return o0.a.c(l0Var, e10);
        }
    }

    @oy.l
    o0<E> d();
}
