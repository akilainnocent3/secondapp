package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46147h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46148i;

    public d(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2, boolean z10) {
        this.f46146g = nVar;
        this.f46145f = nVar2;
        this.f46144e = z10;
        nVar2.e(12);
        this.f46140a = nVar2.m();
        nVar.e(12);
        this.f46148i = nVar.m();
        if (!(nVar.b() == 1)) {
            throw new IllegalStateException("first_chunk must be 1");
        }
        this.f46141b = -1;
    }

    public final boolean a() {
        int i10 = this.f46141b + 1;
        this.f46141b = i10;
        if (i10 == this.f46140a) {
            return false;
        }
        this.f46143d = this.f46144e ? this.f46145f.n() : this.f46145f.k();
        if (this.f46141b == this.f46147h) {
            this.f46142c = this.f46146g.m();
            com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = this.f46146g;
            nVar.e(nVar.f47131b + 4);
            int i11 = this.f46148i - 1;
            this.f46148i = i11;
            this.f46147h = i11 > 0 ? this.f46146g.m() - 1 : -1;
        }
        return true;
    }
}
