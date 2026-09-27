package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC5237n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5287p0 f97930a;

    public RunnableC5237n0(C5287p0 c5287p0) {
        this.f97930a = c5287p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5287p0 c5287p0 = this.f97930a;
        synchronized (c5287p0) {
            if (c5287p0.f98091a != null && c5287p0.a()) {
                try {
                    c5287p0.f98094d = null;
                    c5287p0.f98091a.unbindService(c5287p0.f98100j);
                } catch (Throwable unused) {
                }
            }
            c5287p0.f98094d = null;
        }
    }
}
