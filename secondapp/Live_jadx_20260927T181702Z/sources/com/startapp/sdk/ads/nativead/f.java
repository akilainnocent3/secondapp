package com.startapp.sdk.ads.nativead;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f74140a;

    public f(NativeAdDetails nativeAdDetails) {
        this.f74140a = nativeAdDetails;
    }

    public final void a() {
        if (this.f74140a.displayListener == null || this.f74140a.hiddenSent) {
            return;
        }
        this.f74140a.displayListener.adHidden(this.f74140a);
        this.f74140a.hiddenSent = true;
    }
}
