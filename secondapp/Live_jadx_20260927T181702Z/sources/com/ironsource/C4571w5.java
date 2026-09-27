package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.w5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4571w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final InterfaceC4466q1 f64376a;

    public C4571w5(@oy.l InterfaceC4466q1 analytics, @oy.l String adRequestAdId, @oy.l InterfaceC4562vd adRequestProviderName) {
        kotlin.jvm.internal.m0.p(analytics, "analytics");
        kotlin.jvm.internal.m0.p(adRequestAdId, "adRequestAdId");
        kotlin.jvm.internal.m0.p(adRequestProviderName, "adRequestProviderName");
        this.f64376a = analytics;
        analytics.a(new C4393m1.s(adRequestProviderName.value()), new C4393m1.b(adRequestAdId));
    }

    public final void a() {
        InterfaceC4339j1.c.f62061a.a().a(this.f64376a);
    }

    public final void a(@oy.l IronSourceError error) {
        kotlin.jvm.internal.m0.p(error, "error");
        InterfaceC4339j1.c.f62061a.a(new C4393m1.j(error.getErrorCode()), new C4393m1.k(error.getErrorMessage()), new C4393m1.f(0L)).a(this.f64376a);
    }
}
