package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class k9 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t9 f75083a;

    public k9(t9 t9Var) {
        this.f75083a = t9Var;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        try {
            t9 t9Var = this.f75083a;
            k8 k8Var = t9Var.f75546b;
            k8Var.f75082a.post(new r9(t9Var));
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
