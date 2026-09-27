package com.ironsource;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Jc implements Ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private A2 f59329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private WeakReference<C2> f59330b = new WeakReference<>(null);

    public final void a(@oy.l A2 loadListener) {
        kotlin.jvm.internal.m0.p(loadListener, "loadListener");
        this.f59329a = loadListener;
    }

    @Override // com.ironsource.Ic
    public void onBannerClick() {
        C2 c10 = this.f59330b.get();
        if (c10 != null) {
            c10.onBannerClick();
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadFail(@oy.l String description) {
        kotlin.jvm.internal.m0.p(description, "description");
        A2 a10 = this.f59329a;
        if (a10 != null) {
            a10.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerLoadSuccess(@oy.l O9 adInstance, @oy.l C4364k8 adContainer) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        kotlin.jvm.internal.m0.p(adContainer, "adContainer");
        A2 a10 = this.f59329a;
        if (a10 != null) {
            a10.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.Ic
    public void onBannerShowSuccess() {
        C2 c10 = this.f59330b.get();
        if (c10 != null) {
            c10.onBannerShowSuccess();
        }
    }

    public final void a(@oy.l C2 showListener) {
        kotlin.jvm.internal.m0.p(showListener, "showListener");
        this.f59330b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.Ic
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.Ic
    public void onBannerInitFailed(@oy.m String str) {
    }
}
