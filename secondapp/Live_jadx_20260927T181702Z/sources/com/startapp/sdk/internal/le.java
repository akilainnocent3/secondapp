package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class le implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe f75144b;

    public le(oe oeVar, int i10) {
        this.f75144b = oeVar;
        this.f75143a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xj xjVar = this.f75144b.f75320b;
        if (xjVar != null) {
            xjVar.a(this.f75143a);
        }
    }
}
