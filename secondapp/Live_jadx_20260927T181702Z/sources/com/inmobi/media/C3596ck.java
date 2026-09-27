package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ck, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3596ck extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f56216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3622dk f56217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3596ck(C3622dk c3622dk, rr.d dVar) {
        super(dVar);
        this.f56217b = c3622dk;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f56216a = obj;
        this.f56218c |= Integer.MIN_VALUE;
        return this.f56217b.b(0, this);
    }
}
