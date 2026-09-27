package ws;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum f0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final a f143748b = new a(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final f0 a(boolean z10, boolean z11, boolean z12) {
            if (z10) {
                return f0.SEALED;
            }
            if (z11) {
                return f0.ABSTRACT;
            }
            return z12 ? f0.OPEN : f0.FINAL;
        }

        public a() {
        }
    }
}
