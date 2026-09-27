package ee;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@he.a
@he.g("javax.inject.Singleton")
@he.f
public final class l implements he.c<Executor> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f80803a = new l();
    }

    public static l a() {
        return a.f80803a;
    }

    public static Executor b() {
        return (Executor) he.e.f(k.a());
    }

    @Override // cr.c, am.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
