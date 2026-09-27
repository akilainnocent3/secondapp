package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Z3 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3528a4 f55870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55871c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(C3528a4 c3528a4, rr.d dVar) {
        super(dVar);
        this.f55870b = c3528a4;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f55869a = obj;
        this.f55871c |= Integer.MIN_VALUE;
        return this.f55870b.a(this);
    }
}
