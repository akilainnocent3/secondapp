package yads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f152036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioTimestamp f152037b = new AudioTimestamp();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f152038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f152039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f152040e;

    public ll(AudioTrack audioTrack) {
        this.f152036a = audioTrack;
    }

    public final long a() {
        return this.f152037b.nanoTime / 1000;
    }

    public final boolean b() {
        boolean timestamp = this.f152036a.getTimestamp(this.f152037b);
        if (timestamp) {
            long j10 = this.f152037b.framePosition;
            if (this.f152039d > j10) {
                this.f152038c++;
            }
            this.f152039d = j10;
            this.f152040e = j10 + (this.f152038c << 32);
        }
        return timestamp;
    }
}
