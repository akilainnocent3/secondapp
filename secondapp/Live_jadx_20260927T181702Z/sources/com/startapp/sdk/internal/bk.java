package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class bk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f74607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk f74608b;

    public bk(dk dkVar, String str) {
        this.f74608b = dkVar;
        this.f74607a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f74608b.f74709d.a(this.f74607a);
    }
}
