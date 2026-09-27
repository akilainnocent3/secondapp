package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f47150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f47151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f47152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f47153d = com.fyber.inneractive.sdk.player.exoplayer2.s.f46811d;

    public final void a(long j10) {
        this.f47151b = j10;
        if (this.f47150a) {
            this.f47152c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j10 = this.f47151b;
        if (!this.f47150a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f47152c;
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f47153d;
        if (sVar.f46812a != 1.0f) {
            return (jElapsedRealtime * ((long) sVar.f46814c)) + j10;
        }
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.b.f45699a;
        return (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L) + j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f47150a) {
            a(b());
        }
        this.f47153d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f47153d;
    }
}
