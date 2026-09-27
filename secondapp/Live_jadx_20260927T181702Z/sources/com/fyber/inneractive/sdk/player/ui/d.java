package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f47351b;

    public d(e eVar, boolean z10) {
        this.f47351b = eVar;
        this.f47350a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f47350a == this.f47351b.hasWindowFocus()) {
            this.f47351b.e();
        }
    }
}
