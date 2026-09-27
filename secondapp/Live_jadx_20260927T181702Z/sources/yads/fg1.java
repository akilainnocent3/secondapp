package yads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fg1 implements gg1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final zf1 f149101d = new zf1(2, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final zf1 f149102e = new zf1(3, -9223372036854775807L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f149103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ag1 f149104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f149105c;

    public fg1(String str) {
        this.f149103a = ib3.d("ExoPlayer:Loader:".concat(str));
    }

    @Override // yads.gg1
    public final void a() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public final boolean b() {
        return this.f149104b != null;
    }

    public final void a(int i10) throws IOException {
        IOException iOException = this.f149105c;
        if (iOException != null) {
            throw iOException;
        }
        ag1 ag1Var = this.f149104b;
        if (ag1Var != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = ag1Var.f146789b;
            }
            IOException iOException2 = ag1Var.f146793f;
            if (iOException2 != null && ag1Var.f146794g > i10) {
                throw iOException2;
            }
        }
    }

    public final void a(cg1 cg1Var) {
        ag1 ag1Var = this.f149104b;
        if (ag1Var != null) {
            ag1Var.a(true);
        }
        if (cg1Var != null) {
            this.f149103a.execute(new dg1(cg1Var));
        }
        this.f149103a.shutdown();
    }

    public final long a(bg1 bg1Var, yf1 yf1Var, int i10) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.f149105c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ag1 ag1Var = new ag1(this, looperMyLooper, bg1Var, yf1Var, i10, jElapsedRealtime);
            if (this.f149104b == null) {
                this.f149104b = ag1Var;
                ag1Var.f146793f = null;
                this.f149103a.execute(ag1Var);
                return jElapsedRealtime;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }
}
