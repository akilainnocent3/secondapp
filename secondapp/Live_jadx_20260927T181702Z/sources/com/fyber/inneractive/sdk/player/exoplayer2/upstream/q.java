package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f47075c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f47073a = new w();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47076d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47077e = 2000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f47078f = true;

    public q(String str, m mVar) {
        this.f47074b = str;
        this.f47075c = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public final h a() {
        return new p(this.f47074b, this.f47075c, this.f47076d, this.f47077e, this.f47078f, this.f47073a);
    }
}
