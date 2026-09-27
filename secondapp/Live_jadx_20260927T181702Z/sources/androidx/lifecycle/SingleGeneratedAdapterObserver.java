package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final n f13275b;

    public SingleGeneratedAdapterObserver(@oy.l n generatedAdapter) {
        kotlin.jvm.internal.m0.p(generatedAdapter, "generatedAdapter");
        this.f13275b = generatedAdapter;
    }

    @Override // androidx.lifecycle.x
    public void onStateChanged(@oy.l b0 source, @oy.l r.a event) {
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(event, "event");
        this.f13275b.a(source, event, false, null);
        this.f13275b.a(source, event, true, null);
    }
}
