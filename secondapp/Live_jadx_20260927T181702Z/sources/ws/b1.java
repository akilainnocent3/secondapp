package ws;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f143733a = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements b1 {
        public static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // ws.b1
        @oy.l
        public c1 b() {
            c1 c1Var = c1.f143738a;
            if (c1Var == null) {
                d(0);
            }
            return c1Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    @oy.l
    c1 b();
}
