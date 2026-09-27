package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.v7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4059v7 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f57896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4084w7 f57898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4059v7(C4084w7 c4084w7, or.f fVar) {
        super(fVar);
        this.f57898c = c4084w7;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f57896a = obj;
        this.f57897b |= Integer.MIN_VALUE;
        return this.f57898c.emit(null, this);
    }
}
