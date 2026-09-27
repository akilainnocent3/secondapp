package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class P0 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ds.l f55289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ R0 f55291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(R0 r10, rr.d dVar) {
        super(dVar);
        this.f55291c = r10;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f55290b = obj;
        this.f55292d |= Integer.MIN_VALUE;
        return this.f55291c.a((ds.l) null, this);
    }
}
