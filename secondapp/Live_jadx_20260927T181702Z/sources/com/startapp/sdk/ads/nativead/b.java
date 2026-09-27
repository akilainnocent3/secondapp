package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.internal.wf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f74134a;

    public b(NativeAdDetails nativeAdDetails) {
        this.f74134a = nativeAdDetails;
    }

    @Override // com.startapp.sdk.internal.wf
    public final void a(String str) {
        this.f74134a.onImpressionSent(str);
    }
}
