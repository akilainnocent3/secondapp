package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4943be f96355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5543z7 f96356b;

    public Q1(S1 s10, C5543z7 c5543z7) {
        this.f96355a = s10;
        this.f96356b = c5543z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f96355a.consume(this.f96356b);
    }
}
