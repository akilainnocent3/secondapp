package nu;

import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f117640a = a.f117641a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f117641a = new a();

        @oy.l
        public final d a(@oy.m Runnable runnable, @oy.m ds.l<? super InterruptedException, w2> lVar) {
            return (runnable == null || lVar == null) ? new d(null, 1, null) : new c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
