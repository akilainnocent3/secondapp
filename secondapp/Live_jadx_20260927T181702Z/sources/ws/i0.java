package ws;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface i0 extends m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @oy.m
        public static <R, D> R a(@oy.l i0 i0Var, @oy.l o<R, D> visitor, D d10) {
            kotlin.jvm.internal.m0.p(visitor, "visitor");
            return visitor.i(i0Var, d10);
        }

        @oy.m
        public static m b(@oy.l i0 i0Var) {
            return null;
        }
    }

    @oy.m
    <T> T D0(@oy.l h0<T> h0Var);

    @oy.l
    List<i0> Q();

    boolean e0(@oy.l i0 i0Var);

    @oy.l
    Collection<wt.c> i(@oy.l wt.c cVar, @oy.l ds.l<? super wt.f, Boolean> lVar);

    @oy.l
    ts.h r();

    @oy.l
    r0 z(@oy.l wt.c cVar);
}
