package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class kg implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f75091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg f75092b;

    public kg(lg lgVar, Runnable runnable) {
        this.f75092b = lgVar;
        this.f75091a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f75091a.run();
        } finally {
            this.f75092b.a();
        }
    }
}
