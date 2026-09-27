package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5217m5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4943be f97873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5242n5 f97874b;

    public RunnableC5217m5(C5242n5 c5242n5, InterfaceC4943be interfaceC4943be) {
        this.f97874b = c5242n5;
        this.f97873a = interfaceC4943be;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f97874b) {
            try {
                C5242n5 c5242n5 = this.f97874b;
                Object obj = c5242n5.f97939a;
                if (obj == null) {
                    c5242n5.f97940b.add(this.f97873a);
                } else {
                    this.f97873a.consume(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
