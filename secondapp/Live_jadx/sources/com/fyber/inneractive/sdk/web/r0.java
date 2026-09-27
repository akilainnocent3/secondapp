package com.fyber.inneractive.sdk.web;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f48033a;

    public r0(v0 v0Var) {
        this.f48033a = v0Var;
    }

    public final void a(boolean z10) {
        if (this.f48033a.f48066u.compareAndSet(false, true)) {
            this.f48033a.d("onCancelResult(" + z10 + ");");
            this.f48033a.f48067v.set(false);
        }
    }
}
