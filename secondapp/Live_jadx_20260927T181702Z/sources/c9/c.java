package c9;

import a9.p2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface c extends AutoCloseable {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Throwable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final Object f22686b;

        public a(@oy.m Object obj) {
            this.f22686b = obj;
        }

        @oy.m
        public final Object d() {
            return this.f22686b;
        }
    }

    @oy.m
    <R> Object V(boolean z10, @oy.l ds.p<? super p2, ? super or.f<? super R>, ? extends Object> pVar, @oy.l or.f<? super R> fVar);

    @Override // java.lang.AutoCloseable
    void close();
}
