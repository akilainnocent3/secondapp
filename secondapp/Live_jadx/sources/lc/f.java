package lc;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103809b;

        a(boolean z10) {
            this.f103809b = z10;
        }

        public boolean g() {
            return this.f103809b;
        }
    }

    boolean a();

    void b(e eVar);

    boolean c(e eVar);

    boolean d(e eVar);

    void g(e eVar);

    f getRoot();

    boolean i(e eVar);
}
