package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.b9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3559b9 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ds.l f56054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f56055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3688g9 f56056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3559b9(C3688g9 c3688g9, or.f fVar) {
        super(fVar);
        this.f56056c = c3688g9;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f56055b = obj;
        this.f56057d |= Integer.MIN_VALUE;
        return this.f56056c.a((ds.l) null, this);
    }
}
