package jv;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 {
    @oy.l
    public static final o2 A(@oy.l or.j jVar) {
        return t2.z(jVar);
    }

    @oy.l
    public static final o1 B(@oy.l o2 o2Var, boolean z10, @oy.l u2 u2Var) {
        return t2.A(o2Var, z10, u2Var);
    }

    public static final boolean D(@oy.l or.j jVar) {
        return t2.C(jVar);
    }

    @oy.l
    public static final a0 a(@oy.m o2 o2Var) {
        return t2.a(o2Var);
    }

    public static final void e(@oy.l o2 o2Var, @oy.l String str, @oy.m Throwable th2) {
        t2.e(o2Var, str, th2);
    }

    public static final void g(@oy.l or.j jVar, @oy.m CancellationException cancellationException) {
        t2.g(jVar, cancellationException);
    }

    @oy.m
    public static final Object l(@oy.l o2 o2Var, @oy.l or.f<? super dr.w2> fVar) {
        return t2.l(o2Var, fVar);
    }

    public static final void o(@oy.l o2 o2Var, @oy.m CancellationException cancellationException) {
        t2.o(o2Var, cancellationException);
    }

    public static final void r(@oy.l or.j jVar, @oy.m CancellationException cancellationException) {
        t2.r(jVar, cancellationException);
    }

    @dr.o(level = dr.q.WARNING, message = "This function does not do what its name implies: it will not cancel the future if just cancel() was called.", replaceWith = @dr.g1(expression = "this.invokeOnCancellation { future.cancel(false) }", imports = {}))
    public static final void w(@oy.l n<?> nVar, @oy.l Future<?> future) {
        s2.a(nVar, future);
    }

    @oy.l
    public static final o1 x(@oy.l o2 o2Var, @oy.l o1 o1Var) {
        return t2.w(o2Var, o1Var);
    }

    public static final void y(@oy.l o2 o2Var) {
        t2.x(o2Var);
    }

    public static final void z(@oy.l or.j jVar) {
        t2.y(jVar);
    }
}
