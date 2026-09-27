package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioTimestamp f45610j = new AudioTimestamp();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f45611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f45612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45613m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(AudioTrack audioTrack, boolean z10) {
        super.a(audioTrack, z10);
        this.f45611k = 0L;
        this.f45612l = 0L;
        this.f45613m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.f45613m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.f45610j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f45601a.getTimestamp(this.f45610j);
        if (timestamp) {
            long j10 = this.f45610j.framePosition;
            if (this.f45612l > j10) {
                this.f45611k++;
            }
            this.f45612l = j10;
            this.f45613m = j10 + (this.f45611k << 32);
        }
        return timestamp;
    }
}
