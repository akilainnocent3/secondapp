package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Z2 implements InterfaceC4421n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4214c1 f60403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final U2 f60404b;

    public Z2(@oy.l C4214c1 adapterConfig, @oy.l U2 adFormatConfigurations) {
        kotlin.jvm.internal.m0.p(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.m0.p(adFormatConfigurations, "adFormatConfigurations");
        this.f60403a = adapterConfig;
        this.f60404b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4232d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4514t
    public long b() {
        return this.f60404b.b();
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public String c() {
        String strF = this.f60403a.f();
        kotlin.jvm.internal.m0.o(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC4232d1
    public boolean d() {
        return !this.f60403a.j();
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public String e() {
        String strA = this.f60403a.a();
        kotlin.jvm.internal.m0.o(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public EnumC4457p9 f() {
        return EnumC4457p9.f63311b.a(this.f60403a.d());
    }
}
