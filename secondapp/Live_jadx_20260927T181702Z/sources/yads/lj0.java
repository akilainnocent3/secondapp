package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lj0 extends Thread implements qj0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pj0 f152007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rj0 f152008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nj0 f152009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f152010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f152011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile jj0 f152012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f152013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Exception f152014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f152015j = -1;

    public lj0(pj0 pj0Var, rj0 rj0Var, nj0 nj0Var, boolean z10, int i10, jj0 jj0Var) {
        this.f152007b = pj0Var;
        this.f152008c = rj0Var;
        this.f152009d = nj0Var;
        this.f152010e = z10;
        this.f152011f = i10;
        this.f152012g = jj0Var;
    }

    public final void a(boolean z10) {
        if (z10) {
            this.f152012g = null;
        }
        if (this.f152013h) {
            return;
        }
        this.f152013h = true;
        this.f152008c.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f152010e) {
                this.f152008c.remove();
            } else {
                long j10 = -1;
                int i10 = 0;
                while (!this.f152013h) {
                    try {
                        this.f152008c.a(this);
                        break;
                    } catch (IOException e10) {
                        if (!this.f152013h) {
                            long j11 = this.f152009d.f153056a;
                            if (j11 != j10) {
                                i10 = 0;
                                j10 = j11;
                            }
                            int i11 = i10 + 1;
                            if (i11 > this.f152011f) {
                                throw e10;
                            }
                            Thread.sleep(Math.min(i10 * 1000, 5000));
                            i10 = i11;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e11) {
            this.f152014i = e11;
        }
        jj0 jj0Var = this.f152012g;
        if (jj0Var != null) {
            jj0Var.obtainMessage(9, this).sendToTarget();
        }
    }

    public final void a(long j10, long j11, float f10) {
        this.f152009d.f153056a = j11;
        this.f152009d.f153057b = f10;
        if (j10 != this.f152015j) {
            this.f152015j = j10;
            jj0 jj0Var = this.f152012g;
            if (jj0Var != null) {
                jj0Var.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
            }
        }
    }
}
