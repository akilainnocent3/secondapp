package com.yandex.mobile.ads.nativeads;

import yads.r20;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements CustomClickHandlerEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r20 f76948a;

    public c(r20 r20Var) {
        this.f76948a = r20Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onLeftApplication() {
        this.f76948a.f154719a.f155233b.a(19, null);
    }

    @Override // com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
    public final void onReturnedToApplication() {
        this.f76948a.f154719a.f155233b.a(20, null);
    }
}
