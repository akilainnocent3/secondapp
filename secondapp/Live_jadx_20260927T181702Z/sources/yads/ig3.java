package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ig3 extends js.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jg3 f150629a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ig3(jg3 jg3Var) {
        hg3 hg3Var = hg3.f150116b;
        this.f150629a = jg3Var;
        super(hg3Var);
    }

    @Override // js.c
    public final void afterChange(ns.o property, Object obj, Object obj2) {
        kotlin.jvm.internal.m0.p(property, "property");
        this.f150629a.f151099a.add((hg3) obj2);
    }
}
