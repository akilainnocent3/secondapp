package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.vd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4065vd extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f57925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4090wd f57927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4065vd(C4090wd c4090wd, or.f fVar) {
        super(fVar);
        this.f57927c = c4090wd;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f57925a = obj;
        this.f57926b |= Integer.MIN_VALUE;
        return this.f57927c.emit(null, this);
    }
}
