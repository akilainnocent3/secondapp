package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class hd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f74949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ld f74950b;

    public hd(ld ldVar, String str) {
        this.f74950b = ldVar;
        this.f74949a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ld ldVar = this.f74950b;
        String str = this.f74949a;
        if (!ldVar.f75128h) {
            ldVar.f75138r = System.currentTimeMillis();
            ldVar.f75137q.put(str, Float.valueOf(-1.0f));
            ldVar.f75124d.postDelayed(ldVar.f75139s, ldVar.f75129i);
            ldVar.f75128h = true;
        }
        ldVar.f75136p = false;
        ldVar.a();
    }
}
