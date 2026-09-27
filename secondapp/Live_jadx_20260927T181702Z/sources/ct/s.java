package ct;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class s extends f implements nt.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Object f77111c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(@oy.m wt.f fVar, @oy.l Object value) {
        super(fVar, null);
        m0.p(value, "value");
        this.f77111c = value;
    }

    @Override // nt.o
    @oy.l
    public Object getValue() {
        return this.f77111c;
    }
}
