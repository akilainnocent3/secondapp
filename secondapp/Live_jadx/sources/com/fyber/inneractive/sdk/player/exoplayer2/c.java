package com.fyber.inneractive.sdk.player.exoplayer2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f45701a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f45702b = ((long) 15000) * 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45703c = ((long) 30000) * 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f45704d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f45705e = 5000000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f45707g;

    public final void a(boolean z10) {
        this.f45706f = 0;
        this.f45707g = false;
        if (z10) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f45701a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
