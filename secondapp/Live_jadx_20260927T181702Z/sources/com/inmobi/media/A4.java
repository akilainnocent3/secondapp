package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class A4 extends rr.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f54325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4 f54326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f54327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A4(C4 c10, rr.d dVar) {
        super(dVar);
        this.f54326b = c10;
    }

    @Override // rr.a
    public final Object invokeSuspend(Object obj) {
        this.f54325a = obj;
        this.f54327c |= Integer.MIN_VALUE;
        return this.f54326b.a(this);
    }
}
