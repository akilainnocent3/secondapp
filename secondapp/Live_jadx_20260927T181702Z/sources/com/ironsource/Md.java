package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Md implements InterfaceC4421n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final C4214c1 f59488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final Zd f59489b;

    public Md(@oy.l C4214c1 adapterConfig, @oy.l Zd adFormatConfigurations) {
        kotlin.jvm.internal.m0.p(adapterConfig, "adapterConfig");
        kotlin.jvm.internal.m0.p(adFormatConfigurations, "adFormatConfigurations");
        this.f59488a = adapterConfig;
        this.f59489b = adFormatConfigurations;
    }

    @Override // com.ironsource.InterfaceC4232d1
    public boolean a() {
        return true;
    }

    @Override // com.ironsource.InterfaceC4514t
    public long b() {
        return this.f59489b.i();
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public String c() {
        String strF = this.f59488a.f();
        kotlin.jvm.internal.m0.o(strF, "adapterConfig.providerName");
        return strF;
    }

    @Override // com.ironsource.InterfaceC4232d1
    public boolean d() {
        return !this.f59488a.j();
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public String e() {
        String strA = this.f59488a.a();
        kotlin.jvm.internal.m0.o(strA, "adapterConfig.adSourceNameForEvents");
        return strA;
    }

    @Override // com.ironsource.InterfaceC4232d1
    @oy.l
    public EnumC4457p9 f() {
        return EnumC4457p9.f63311b.a(this.f59488a.d());
    }
}
