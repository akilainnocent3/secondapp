package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ke implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gj f75088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f75089b;

    public ke(gj gjVar, String str) {
        this.f75088a = gjVar;
        this.f75089b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gj gjVar = this.f75088a;
        String str = this.f75089b;
        me meVar = gjVar.f74913a;
        if (meVar != null) {
            meVar.a(str);
        }
    }
}
