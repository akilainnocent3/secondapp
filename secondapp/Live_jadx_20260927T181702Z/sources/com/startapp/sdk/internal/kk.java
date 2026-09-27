package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class kk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mk f75100a;

    public kk(mk mkVar, long j10) {
        this.f75100a = mkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f75100a.f75210b.compareAndSet(false, true)) {
            mk mkVar = this.f75100a;
            mkVar.f75215g.a(mkVar.f75211c);
            mk mkVar2 = this.f75100a;
            qi qiVar = mkVar2.f75212d;
            mkVar2.f75213e.get();
            qiVar.a();
        }
    }
}
