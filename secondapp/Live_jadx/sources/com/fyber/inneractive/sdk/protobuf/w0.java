package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1 f47602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j4 f47604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f47605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f47606e;

    public w0(e1 e1Var, int i10, j4 j4Var, boolean z10, boolean z11) {
        this.f47602a = e1Var;
        this.f47603b = i10;
        this.f47604c = j4Var;
        this.f47605d = z10;
        this.f47606e = z11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f47603b - ((w0) obj).f47603b;
    }
}
