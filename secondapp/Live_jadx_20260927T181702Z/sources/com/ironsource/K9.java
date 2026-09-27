package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class K9 implements InterfaceC4421n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4214c1 f59373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final H9 f59374b;

    public K9(@oy.l C4214c1 adapterConfig, @oy.l H9 adFormatConfigurations) {
        kotlin.jvm.internal.m0.p(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.m0.p(adFormatConfigurations, "adFormatConfigurations");
        this.f59373a = adapterConfig;
        this.f59374b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4232d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4514t
    public long b() {
        return this.f59374b.e();
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public String c() {
        String strF = this.f59373a.f();
        kotlin.jvm.internal.m0.o(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC4232d1
    public boolean d() {
        return !this.f59373a.j();
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public String e() {
        String strA = this.f59373a.a();
        kotlin.jvm.internal.m0.o(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public EnumC4457p9 f() {
        return EnumC4457p9.f63311b.a(this.f59373a.d());
    }
}
