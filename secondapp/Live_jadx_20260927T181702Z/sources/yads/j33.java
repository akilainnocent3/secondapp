package yads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class j33 implements zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv f150921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f150922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f150923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f150924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ee2 f150925f = ee2.f148664e;

    public j33(f53 f53Var) {
        this.f150921b = f53Var;
    }

    @Override // yads.zj1
    public final long a() {
        long j10 = this.f150923d;
        if (!this.f150922c) {
            return j10;
        }
        ((f53) this.f150921b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f150924e;
        ee2 ee2Var = this.f150925f;
        return (ee2Var.f148665b == 1.0f ? ib3.a(jElapsedRealtime) : jElapsedRealtime * ((long) ee2Var.f148667d)) + j10;
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        return this.f150925f;
    }

    public final void a(long j10) {
        this.f150923d = j10;
        if (this.f150922c) {
            ((f53) this.f150921b).getClass();
            this.f150924e = SystemClock.elapsedRealtime();
        }
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        if (this.f150922c) {
            a(a());
        }
        this.f150925f = ee2Var;
    }
}
