package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class M9 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N9 f55135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M9(N9 n10, rr.d dVar) {
        super(dVar);
        this.f55135b = n10;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f55134a = obj;
        this.f55136c |= Integer.MIN_VALUE;
        return this.f55135b.b(0, this);
    }
}
