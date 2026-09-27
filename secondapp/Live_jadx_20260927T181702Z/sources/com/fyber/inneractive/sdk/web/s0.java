package com.fyber.inneractive.sdk.web;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f48041a;

    public s0(v0 v0Var) {
        this.f48041a = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f48041a.f48066u.compareAndSet(false, true)) {
            this.f48041a.d("onCancelResult(true);");
            this.f48041a.f48067v.set(false);
        }
    }
}
