package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4388le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4546ue f62271a;

    public C4388le(@oy.l C4546ue sdkInitResponse) {
        kotlin.jvm.internal.m0.p(sdkInitResponse, "sdkInitResponse");
        this.f62271a = sdkInitResponse;
    }

    @oy.l
    public final K1 a() {
        return this.f62271a.a().b().d();
    }

    @oy.l
    public final D1 b() {
        return this.f62271a.a().b().b();
    }

    @oy.l
    public final Q5 c() {
        return this.f62271a.b();
    }

    @oy.l
    public final Ne d() {
        return this.f62271a.c();
    }

    @oy.l
    public final Hb e() {
        return this.f62271a.a().b().f();
    }

    @oy.l
    public final Ne.a f() {
        Ne.a aVarI = this.f62271a.c().i();
        kotlin.jvm.internal.m0.o(aVarI, "sdkInitResponse.fullResponse.origin");
        return aVarI;
    }

    @oy.l
    public final C4546ue g() {
        return this.f62271a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4388le(@oy.l C4388le sdkConfig) {
        this(sdkConfig.f62271a);
        kotlin.jvm.internal.m0.p(sdkConfig, "sdkConfig");
    }
}
