package ou;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface b1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ c1 a(b1 b1Var, xs.g gVar, g1 g1Var, ws.m mVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toAttributes");
            }
            if ((i10 & 2) != 0) {
                g1Var = null;
            }
            if ((i10 & 4) != 0) {
                mVar = null;
            }
            return b1Var.a(gVar, g1Var, mVar);
        }
    }

    @oy.l
    c1 a(@oy.l xs.g gVar, @oy.m g1 g1Var, @oy.m ws.m mVar);
}
