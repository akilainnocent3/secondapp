package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Tm extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f55573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Um f55575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tm(Um um2, or.f fVar) {
        super(fVar);
        this.f55575c = um2;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f55573a = obj;
        this.f55574b |= Integer.MIN_VALUE;
        return this.f55575c.emit(null, this);
    }
}
