package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@u1
public final class t extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f85517c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@oy.l e0 writer, boolean z10) {
        super(writer);
        kotlin.jvm.internal.m0.p(writer, "writer");
        this.f85517c = z10;
    }

    @Override // fw.s
    public void n(@oy.l String value) {
        kotlin.jvm.internal.m0.p(value, "value");
        if (this.f85517c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
