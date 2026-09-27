package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioTrack f45601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f45605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45609i;

    public void a(AudioTrack audioTrack, boolean z10) {
        this.f45601a = audioTrack;
        this.f45602b = z10;
        this.f45607g = -9223372036854775807L;
        this.f45604d = 0L;
        this.f45605e = 0L;
        this.f45606f = 0L;
        if (audioTrack != null) {
            this.f45603c = audioTrack.getSampleRate();
        }
    }

    public long b() {
        throw new UnsupportedOperationException();
    }

    public long c() {
        throw new UnsupportedOperationException();
    }

    public final void d() {
        if (this.f45607g != -9223372036854775807L) {
            return;
        }
        this.f45601a.pause();
    }

    public boolean e() {
        return false;
    }

    public final void a(long j10) {
        this.f45608h = a();
        this.f45607g = SystemClock.elapsedRealtime() * 1000;
        this.f45609i = j10;
        this.f45601a.stop();
    }

    public final long a() {
        if (this.f45607g != -9223372036854775807L) {
            return Math.min(this.f45609i, this.f45608h + ((((SystemClock.elapsedRealtime() * 1000) - this.f45607g) * ((long) this.f45603c)) / 1000000));
        }
        int playState = this.f45601a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f45601a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f45602b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f45606f = this.f45604d;
            }
            playbackHeadPosition += this.f45606f;
        }
        if (this.f45604d > playbackHeadPosition) {
            this.f45605e++;
        }
        this.f45604d = playbackHeadPosition;
        return playbackHeadPosition + (this.f45605e << 32);
    }
}
