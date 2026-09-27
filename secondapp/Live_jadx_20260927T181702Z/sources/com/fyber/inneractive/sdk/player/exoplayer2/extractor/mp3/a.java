package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f46063c;

    public a(int i10, long j10, long j11) {
        this.f46061a = j10;
        this.f46062b = i10;
        this.f46063c = j11 == -1 ? -9223372036854775807L : b(j11);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f46063c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j10) {
        return (Math.max(0L, j10 - this.f46061a) * 8000000) / ((long) this.f46062b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f46063c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j10) {
        long j11 = this.f46063c;
        if (j11 == -9223372036854775807L) {
            return 0L;
        }
        int i10 = z.f47158a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        return ((jMax * ((long) this.f46062b)) / 8000000) + this.f46061a;
    }
}
