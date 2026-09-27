package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Sf extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uf f55504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55505c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sf(Uf uf2, rr.d dVar) {
        super(dVar);
        this.f55504b = uf2;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f55503a = obj;
        this.f55505c |= Integer.MIN_VALUE;
        return this.f55504b.a(this);
    }
}
