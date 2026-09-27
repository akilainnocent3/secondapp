package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f46079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f46080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46081c;

    public d(long[] jArr, long[] jArr2, long j10) {
        this.f46079a = jArr;
        this.f46080b = jArr2;
        this.f46081c = j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return this.f46079a[z.a(this.f46080b, j10, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f46081c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f46080b[z.a(this.f46079a, j10, true)];
    }
}
