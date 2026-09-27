package yads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ll f152524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f152525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f152526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f152527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f152528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f152529f;

    public ml(AudioTrack audioTrack) {
        if (ib3.f150516a >= 19) {
            this.f152524a = new ll(audioTrack);
            a();
        } else {
            this.f152524a = null;
            a(3);
        }
    }

    public final void a() {
        if (this.f152524a != null) {
            a(0);
        }
    }

    public final void a(int i10) {
        this.f152525b = i10;
        if (i10 == 0) {
            this.f152528e = 0L;
            this.f152529f = -1L;
            this.f152526c = System.nanoTime() / 1000;
            this.f152527d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f152527d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f152527d = 10000000L;
        } else {
            if (i10 == 4) {
                this.f152527d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
