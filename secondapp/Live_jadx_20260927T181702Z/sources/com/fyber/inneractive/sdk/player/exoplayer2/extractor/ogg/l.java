package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f46346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r f46347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f46348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f46349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f46350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f46351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f46352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f46353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f46354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j f46355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f46356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46358m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(boolean z10) {
        if (z10) {
            this.f46355j = new j();
            this.f46351f = 0L;
            this.f46353h = 0;
        } else {
            this.f46353h = 1;
        }
        this.f46350e = -1L;
        this.f46352g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j10, j jVar);

    public void a(long j10) {
        this.f46352g = j10;
    }
}
