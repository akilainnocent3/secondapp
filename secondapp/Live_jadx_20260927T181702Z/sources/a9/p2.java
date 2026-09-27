package a9;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface p2 extends w0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        DEFERRED,
        IMMEDIATE,
        EXCLUSIVE;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ sr.a f4333f = sr.c.c(d());

        @oy.l
        public static sr.a<a> g() {
            return f4333f;
        }
    }

    @oy.m
    Object d(@oy.l or.f<? super Boolean> fVar);

    @oy.m
    <R> Object e(@oy.l a aVar, @oy.l ds.p<? super o2<R>, ? super or.f<? super R>, ? extends Object> pVar, @oy.l or.f<? super R> fVar);
}
