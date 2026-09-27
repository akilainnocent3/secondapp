package yads;

import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f150134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ni3 f150135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fh3 f150136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f150137d;

    public hh3(g6 g6Var, ni3 ni3Var, fh3 fh3Var) {
        this.f150134a = g6Var;
        this.f150135b = ni3Var;
        this.f150136c = fh3Var;
    }

    public final void a() {
        if (this.f150137d) {
            return;
        }
        this.f150137d = true;
        AdPlaybackState adPlaybackStateE = this.f150134a.f149407b;
        int i10 = adPlaybackStateE.f48680c;
        for (int i11 = 0; i11 < i10; i11++) {
            AdPlaybackState.b bVarF = adPlaybackStateE.f(i11);
            if (bVarF.f48694b != Long.MIN_VALUE) {
                if (bVarF.f48695c < 0) {
                    adPlaybackStateE = adPlaybackStateE.l(i11, 1);
                }
                adPlaybackStateE = adPlaybackStateE.E(i11);
                this.f150134a.a(adPlaybackStateE);
            }
        }
        this.f150135b.onVideoCompleted();
    }

    public final void b() {
        fh3 fh3Var = this.f150136c;
        long j10 = fh3Var.f149118a.f151540a;
        if (j10 != -9223372036854775807L) {
            df2 df2Var = fh3Var.f149119b.f151979b;
            if ((df2Var != null ? df2Var.a() : -1L) + 1000 >= j10) {
                a();
            }
        }
    }
}
