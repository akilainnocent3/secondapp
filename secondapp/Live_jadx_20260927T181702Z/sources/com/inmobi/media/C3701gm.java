package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3701gm extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f56531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3726hm f56533c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701gm(C3726hm c3726hm, or.f fVar) {
        super(fVar);
        this.f56533c = c3726hm;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f56531a = obj;
        this.f56532b |= Integer.MIN_VALUE;
        return this.f56533c.emit(null, this);
    }
}
