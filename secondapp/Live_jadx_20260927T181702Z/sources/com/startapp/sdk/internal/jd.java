package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class jd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f75052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f75053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f75054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f75055d;

    public jd(ld ldVar, String str, boolean z10, String str2) {
        this.f75055d = ldVar;
        this.f75052a = str;
        this.f75053b = z10;
        this.f75054c = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75055d.a(this.f75052a, this.f75054c, this.f75053b);
    }
}
