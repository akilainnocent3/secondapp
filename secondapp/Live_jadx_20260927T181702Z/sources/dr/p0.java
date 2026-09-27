package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class p0 extends Error {
    /* JADX WARN: Multi-variable type inference failed */
    public p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(@oy.l String message) {
        super(message);
        kotlin.jvm.internal.m0.p(message, "message");
    }

    public /* synthetic */ p0(String str, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? "An operation is not implemented." : str);
    }
}
