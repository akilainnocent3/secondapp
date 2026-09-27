package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47107d;

    public f(byte[] bArr) {
        m mVar = new m(bArr);
        mVar.b(136);
        mVar.a(16);
        mVar.a(16);
        mVar.a(24);
        mVar.a(24);
        this.f47104a = mVar.a(20);
        this.f47105b = mVar.a(3) + 1;
        this.f47106c = mVar.a(5) + 1;
        this.f47107d = ((((long) mVar.a(4)) & 15) << 32) | (((long) mVar.a(32)) & 4294967295L);
    }
}
