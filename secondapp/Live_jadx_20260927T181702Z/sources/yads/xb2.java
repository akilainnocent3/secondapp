package yads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xb2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zb2 f157768b;

    public xb2(zb2 zb2Var) {
        this.f157768b = zb2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zb2 zb2Var = this.f157768b;
        zb2Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - zb2Var.f158724h;
        zb2Var.f158724h = jElapsedRealtime;
        long j11 = zb2Var.f158722f - j10;
        zb2Var.f158722f = j11;
        long jMax = (long) Math.max(0.0d, j11);
        w63 w63Var = zb2Var.f158721e;
        if (w63Var != null) {
            w63Var.a(jMax, zb2Var.f158723g - jMax);
        }
        this.f157768b.c();
    }
}
