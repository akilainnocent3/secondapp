package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Z6 implements InterfaceC4184a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f60418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final EnumC4238d7 f60419b;

    public Z6(long j10, @oy.l EnumC4238d7 recoveryStrategy) {
        kotlin.jvm.internal.m0.p(recoveryStrategy, "recoveryStrategy");
        this.f60418a = j10;
        this.f60419b = recoveryStrategy;
    }

    @Override // com.ironsource.InterfaceC4184a7
    public long a() {
        return this.f60418a;
    }

    @Override // com.ironsource.InterfaceC4184a7
    @oy.l
    public EnumC4238d7 b() {
        return this.f60419b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Z6(@oy.l C4220c7 feature) {
        this(feature.a(), feature.c());
        kotlin.jvm.internal.m0.p(feature, "feature");
    }
}
