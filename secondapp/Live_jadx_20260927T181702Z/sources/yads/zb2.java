package yads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zb2 implements wb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f158717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f158718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb2 f158719c = yb2.f158218b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ac2 f158720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w63 f158721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f158722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f158723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f158724h;

    public zb2(boolean z10, Handler handler) {
        this.f158717a = z10;
        this.f158718b = handler;
    }

    public final void a(l91 l91Var) {
        this.f158721e = l91Var;
    }

    public final void b() {
        if (yb2.f158219c == this.f158719c) {
            this.f158719c = yb2.f158220d;
            this.f158718b.removeCallbacksAndMessages(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f158724h;
            this.f158724h = jElapsedRealtime;
            long j11 = this.f158722f - j10;
            this.f158722f = j11;
            long jMax = (long) Math.max(0.0d, j11);
            w63 w63Var = this.f158721e;
            if (w63Var != null) {
                w63Var.a(jMax, this.f158723g - jMax);
            }
        }
    }

    public final void c() {
        this.f158719c = yb2.f158219c;
        this.f158724h = SystemClock.elapsedRealtime();
        long jMin = (long) Math.min(200.0d, this.f158722f);
        if (jMin > 0) {
            this.f158718b.postDelayed(new xb2(this), jMin);
            return;
        }
        ac2 ac2Var = this.f158720d;
        if (ac2Var != null) {
            ac2Var.a();
        }
        a();
    }

    public final void d() {
        if (yb2.f158220d == this.f158719c) {
            c();
        }
    }

    public final void a(long j10, ac2 ac2Var) {
        a();
        this.f158720d = ac2Var;
        this.f158722f = j10;
        this.f158723g = j10;
        if (this.f158717a) {
            this.f158718b.post(new Runnable() { // from class: yads.ue4
                @Override // java.lang.Runnable
                public final void run() {
                    zb2.a(this.f156403b);
                }
            });
        } else {
            c();
        }
    }

    public static final void a(zb2 zb2Var) {
        zb2Var.c();
    }

    public final void a() {
        yb2 yb2Var = yb2.f158218b;
        if (yb2Var == this.f158719c) {
            return;
        }
        this.f158719c = yb2Var;
        this.f158720d = null;
        this.f158718b.removeCallbacksAndMessages(null);
    }
}
