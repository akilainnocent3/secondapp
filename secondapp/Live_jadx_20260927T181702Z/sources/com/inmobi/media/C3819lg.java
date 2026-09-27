package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.lg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3819lg extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f56935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3894og f56936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3819lg(C3894og c3894og, rr.d dVar) {
        super(dVar);
        this.f56936b = c3894og;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f56935a = obj;
        this.f56937c |= Integer.MIN_VALUE;
        return this.f56936b.a(null, null, this);
    }
}
