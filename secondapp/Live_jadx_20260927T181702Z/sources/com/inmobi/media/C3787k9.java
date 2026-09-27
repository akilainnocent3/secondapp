package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3787k9 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C3812l9 f56804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f56805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3812l9 f56806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3787k9(C3812l9 c3812l9, rr.d dVar) {
        super(dVar);
        this.f56806c = c3812l9;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f56805b = obj;
        this.f56807d |= Integer.MIN_VALUE;
        return this.f56806c.a(this);
    }
}
