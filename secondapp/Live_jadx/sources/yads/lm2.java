package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lm2 implements js.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f152056a;

    public lm2(Object obj) {
        this.f152056a = new WeakReference(obj);
    }

    @Override // js.f, js.e
    public final Object getValue(Object obj, ns.o oVar) {
        return this.f152056a.get();
    }

    @Override // js.f
    public final void setValue(Object obj, ns.o oVar, Object obj2) {
        this.f152056a = new WeakReference(obj2);
    }
}
