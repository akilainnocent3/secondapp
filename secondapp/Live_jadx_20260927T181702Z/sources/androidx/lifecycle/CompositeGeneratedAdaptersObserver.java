package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final n[] f13208b;

    public CompositeGeneratedAdaptersObserver(@oy.l n[] generatedAdapters) {
        kotlin.jvm.internal.m0.p(generatedAdapters, "generatedAdapters");
        this.f13208b = generatedAdapters;
    }

    @Override // androidx.lifecycle.x
    public void onStateChanged(@oy.l b0 source, @oy.l r.a event) {
        kotlin.jvm.internal.m0.p(source, "source");
        kotlin.jvm.internal.m0.p(event, "event");
        k0 k0Var = new k0();
        for (n nVar : this.f13208b) {
            nVar.a(source, event, false, k0Var);
        }
        for (n nVar2 : this.f13208b) {
            nVar2.a(source, event, true, k0Var);
        }
    }
}
