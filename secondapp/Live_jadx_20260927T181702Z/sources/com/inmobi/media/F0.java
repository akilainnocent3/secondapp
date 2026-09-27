package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class F0 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H0 f54599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(H0 h10, rr.d dVar) {
        super(dVar);
        this.f54599b = h10;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f54598a = obj;
        this.f54600c |= Integer.MIN_VALUE;
        return this.f54599b.a(this);
    }
}
