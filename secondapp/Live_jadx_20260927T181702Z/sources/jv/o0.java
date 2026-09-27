package jv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface o0 extends or.j.b {

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    @oy.l
    public static final b f100846ga = b.f100847b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static <R> R a(@oy.l o0 o0Var, R r10, @oy.l ds.p<? super R, ? super or.j.b, ? extends R> pVar) {
            return (R) or.j.b.a.a(o0Var, r10, pVar);
        }

        @oy.m
        public static <E extends or.j.b> E b(@oy.l o0 o0Var, @oy.l or.j.c<E> cVar) {
            return (E) or.j.b.a.b(o0Var, cVar);
        }

        @oy.l
        public static or.j c(@oy.l o0 o0Var, @oy.l or.j.c<?> cVar) {
            return or.j.b.a.c(o0Var, cVar);
        }

        @oy.l
        public static or.j d(@oy.l o0 o0Var, @oy.l or.j jVar) {
            return or.j.b.a.d(o0Var, jVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements or.j.c<o0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f100847b = new b();
    }

    void handleException(@oy.l or.j jVar, @oy.l Throwable th2);
}
