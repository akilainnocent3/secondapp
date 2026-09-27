package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements h, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f46320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f46321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f46322c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46323d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f46324e;

    public c(d dVar) {
        this.f46324e = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j10) {
        long j11 = (((long) this.f46324e.f46354i) * j10) / 1000000;
        this.f46323d = this.f46320a[z.a(this.f46320a, j11, true)];
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j10 = this.f46323d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f46323d = -1L;
        return j11;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        return this.f46322c + this.f46321b[z.a(this.f46320a, (((long) this.f46324e.f46354i) * j10) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f46324e.f46325n;
        return (fVar.f47107d * 1000000) / ((long) fVar.f47104a);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        return this;
    }
}
