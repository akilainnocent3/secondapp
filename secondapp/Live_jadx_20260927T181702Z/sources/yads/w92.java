package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w92 implements ld3, kotlin.jvm.internal.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x92 f157247a;

    public w92(x92 x92Var) {
        this.f157247a = x92Var;
    }

    @Override // yads.ld3
    public final void a() {
        x92 x92Var = this.f157247a;
        synchronized (x92Var.f157744a) {
            x92Var.f157749f = true;
            dr.w2 w2Var = dr.w2.f79517a;
        }
        x92Var.c();
        x92Var.f157747d.b();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ld3) && (obj instanceof kotlin.jvm.internal.e0)) {
            return kotlin.jvm.internal.m0.g(getFunctionDelegate(), ((kotlin.jvm.internal.e0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.e0
    public final dr.a0 getFunctionDelegate() {
        return new kotlin.jvm.internal.i0(0, this.f157247a, x92.class, "onOmSdkJsControllerLoaded", "onOmSdkJsControllerLoaded()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
