package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ag1 extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f146789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg1 f146790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f146791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yf1 f146792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f146793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f146794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f146795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f146796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f146797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg1 f146798k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag1(fg1 fg1Var, Looper looper, bg1 bg1Var, yf1 yf1Var, int i10, long j10) {
        super(looper);
        this.f146798k = fg1Var;
        this.f146790c = bg1Var;
        this.f146792e = yf1Var;
        this.f146789b = i10;
        this.f146791d = j10;
    }

    public final void a(boolean z10) {
        this.f146797j = z10;
        this.f146793f = null;
        if (hasMessages(0)) {
            this.f146796i = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f146796i = true;
                    this.f146790c.b();
                    Thread thread = this.f146795h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f146798k.f149104b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yf1 yf1Var = this.f146792e;
            yf1Var.getClass();
            yf1Var.a(this.f146790c, jElapsedRealtime, jElapsedRealtime - this.f146791d, true);
            this.f146792e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f146797j) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f146793f = null;
            fg1 fg1Var = this.f146798k;
            ExecutorService executorService = fg1Var.f149103a;
            ag1 ag1Var = fg1Var.f149104b;
            ag1Var.getClass();
            executorService.execute(ag1Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f146798k.f149104b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f146791d;
        yf1 yf1Var = this.f146792e;
        yf1Var.getClass();
        if (this.f146796i) {
            yf1Var.a(this.f146790c, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                yf1Var.a(this.f146790c, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                ih1.b("LoadTask", ih1.a("Unexpected exception handling load completed", e10));
                this.f146798k.f149105c = new eg1(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f146793f = iOException;
        int i12 = this.f146794g + 1;
        this.f146794g = i12;
        zf1 zf1VarA = yf1Var.a(this.f146790c, jElapsedRealtime, j10, iOException, i12);
        int i13 = zf1VarA.f158798a;
        if (i13 == 3) {
            this.f146798k.f149105c = this.f146793f;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f146794g = 1;
            }
            long jMin = zf1VarA.f158799b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f146794g - 1) * 1000, 5000);
            }
            fg1 fg1Var2 = this.f146798k;
            if (fg1Var2.f149104b != null) {
                throw new IllegalStateException();
            }
            fg1Var2.f149104b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f146793f = null;
                fg1Var2.f149103a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f146796i;
                this.f146795h = Thread.currentThread();
            }
            if (!z10) {
                d73.a("load:".concat(this.f146790c.getClass().getSimpleName()));
                try {
                    this.f146790c.a();
                    d73.a();
                } catch (Throwable th2) {
                    d73.a();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f146795h = null;
                Thread.interrupted();
            }
            if (this.f146797j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.f146797j) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.f146797j) {
                return;
            }
            ih1.b("LoadTask", ih1.a("Unexpected exception loading stream", e11));
            obtainMessage(2, new eg1(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f146797j) {
                return;
            }
            ih1.b("LoadTask", ih1.a("OutOfMemory error loading stream", e12));
            obtainMessage(2, new eg1(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.f146797j) {
                ih1.b("LoadTask", ih1.a("Unexpected error loading stream", e13));
                obtainMessage(3, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
