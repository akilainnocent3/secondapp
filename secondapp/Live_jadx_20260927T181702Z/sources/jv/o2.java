package jv;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@dr.p1(markerClass = {k2.class})
public interface o2 extends or.j.b {

    /* JADX INFO: renamed from: ja, reason: collision with root package name */
    @oy.l
    public static final b f100848ja = b.f100849b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements or.j.c<o2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f100849b = new b();
    }

    @oy.m
    Object D(@oy.l or.f<? super dr.w2> fVar);

    @oy.l
    tv.f E();

    @oy.l
    @dr.o(level = dr.q.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    o2 G(@oy.l o2 o2Var);

    @oy.l
    @j2
    CancellationException O();

    @oy.l
    @j2
    u W(@oy.l w wVar);

    @dr.o(level = dr.q.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(Throwable th2);

    void b(@oy.m CancellationException cancellationException);

    @dr.o(level = dr.q.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @oy.m
    o2 getParent();

    @oy.l
    zu.m<o2> h();

    boolean isActive();

    boolean isCancelled();

    boolean k();

    @oy.l
    @j2
    o1 l0(boolean z10, boolean z11, @oy.l ds.l<? super Throwable, dr.w2> lVar);

    boolean start();

    @oy.l
    o1 t(@oy.l ds.l<? super Throwable, dr.w2> lVar);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ void b(o2 o2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            o2Var.b(cancellationException);
        }

        public static /* synthetic */ boolean c(o2 o2Var, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return o2Var.a(th2);
        }

        public static <R> R d(@oy.l o2 o2Var, R r10, @oy.l ds.p<? super R, ? super or.j.b, ? extends R> pVar) {
            return (R) or.j.b.a.a(o2Var, r10, pVar);
        }

        @oy.m
        public static <E extends or.j.b> E e(@oy.l o2 o2Var, @oy.l or.j.c<E> cVar) {
            return (E) or.j.b.a.b(o2Var, cVar);
        }

        public static /* synthetic */ o1 g(o2 o2Var, boolean z10, boolean z11, ds.l lVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            }
            return o2Var.l0(z10, z11, lVar);
        }

        @oy.l
        public static or.j h(@oy.l o2 o2Var, @oy.l or.j.c<?> cVar) {
            return or.j.b.a.c(o2Var, cVar);
        }

        @oy.l
        public static or.j j(@oy.l o2 o2Var, @oy.l or.j jVar) {
            return or.j.b.a.d(o2Var, jVar);
        }

        @c2
        public static /* synthetic */ void f() {
        }

        @oy.l
        @dr.o(level = dr.q.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public static o2 i(@oy.l o2 o2Var, @oy.l o2 o2Var2) {
            return o2Var2;
        }
    }
}
