package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f75249a;

    public n9(t9 t9Var) {
        this.f75249a = t9Var;
    }

    public final void a(d9 d9Var, int i10) {
        try {
            t9 t9Var = this.f75249a;
            t9Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            k8 k8Var = t9Var.f75546b;
            k8Var.f75082a.post(new o9(t9Var, d9Var, i10, jCurrentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}
