package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class T0 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f55528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(U0 u10, rr.d dVar) {
        super(dVar);
        this.f55528b = u10;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f55527a = obj;
        this.f55529c |= Integer.MIN_VALUE;
        return this.f55528b.a(null, this);
    }
}
