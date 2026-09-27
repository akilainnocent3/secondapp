package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3844mg extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f57017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3894og f57018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f57019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3844mg(C3894og c3894og, rr.d dVar) {
        super(dVar);
        this.f57018b = c3894og;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f57017a = obj;
        this.f57019c |= Integer.MIN_VALUE;
        return this.f57018b.b(null, null, this);
    }
}
