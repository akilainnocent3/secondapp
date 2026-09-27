package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class id implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f74987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f74988b;

    public id(ld ldVar, String str) {
        this.f74988b = ldVar;
        this.f74987a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f74988b;
        String str = this.f74987a;
        ldVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f10 = (jCurrentTimeMillis - ldVar.f75138r) / 1000.0f;
        ldVar.f75138r = jCurrentTimeMillis;
        ldVar.f75137q.put(ldVar.f75125e, Float.valueOf(f10));
        ldVar.f75137q.put(str, Float.valueOf(-1.0f));
        ldVar.f75125e = str;
    }
}
