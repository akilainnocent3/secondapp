package com.fyber.inneractive.sdk.click;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f44276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f44277b;

    public n(r rVar, b bVar) {
        this.f44277b = rVar;
        this.f44276a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.f44277b.f44281d;
        if (oVar != null) {
            oVar.a(this.f44276a);
        }
    }
}
