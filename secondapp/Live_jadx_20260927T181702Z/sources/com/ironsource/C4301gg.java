package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.gg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4301gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final InterfaceC4519t4 f61894a;

    public C4301gg(@oy.l InterfaceC4519t4 currentTimeProvider) {
        kotlin.jvm.internal.m0.p(currentTimeProvider, "currentTimeProvider");
        this.f61894a = currentTimeProvider;
    }

    public final boolean a(long j10, long j11) {
        long jA = this.f61894a.a();
        return j11 <= 0 || j10 <= 0 || jA < j10 || jA - j10 > j11;
    }
}
