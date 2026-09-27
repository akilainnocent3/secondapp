package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4481r0 implements InterfaceC4305h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4285g0 f63434a;

    public C4481r0(@oy.l C4285g0 adProperties) {
        kotlin.jvm.internal.m0.p(adProperties, "adProperties");
        this.f63434a = adProperties;
    }

    @Override // com.ironsource.InterfaceC4305h2
    public void a(@oy.l com.ironsource.mediationsdk.i auctionRequestParams) {
        kotlin.jvm.internal.m0.p(auctionRequestParams, "auctionRequestParams");
        auctionRequestParams.b(this.f63434a.c());
        auctionRequestParams.a(this.f63434a.a().toString());
        auctionRequestParams.a(Boolean.TRUE);
    }
}
