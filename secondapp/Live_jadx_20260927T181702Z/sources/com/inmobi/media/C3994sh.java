package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.sh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3994sh extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC3907p4 f57637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f57638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4019th f57639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f57640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3994sh(C4019th c4019th, or.f fVar) {
        super(fVar);
        this.f57639c = c4019th;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f57638b = obj;
        this.f57640d |= Integer.MIN_VALUE;
        return this.f57639c.emit(null, this);
    }
}
