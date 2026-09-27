package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f46156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46160e;

    public h(b bVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = bVar.P0;
        this.f46156a = nVar;
        nVar.e(12);
        this.f46158c = nVar.m() & 255;
        this.f46157b = nVar.m();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int a() {
        return this.f46157b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final int b() {
        int i10 = this.f46158c;
        if (i10 == 8) {
            return this.f46156a.j();
        }
        if (i10 == 16) {
            return this.f46156a.o();
        }
        int i11 = this.f46159d;
        this.f46159d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f46160e & 15;
        }
        int iJ = this.f46156a.j();
        this.f46160e = iJ;
        return (iJ & 240) >> 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.e
    public final boolean c() {
        return false;
    }
}
