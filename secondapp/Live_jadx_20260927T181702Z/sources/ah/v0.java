package ah;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class v0 implements w0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f5380d = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f5381e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f5382f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f5383g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f5384h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f5385i = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f5386j = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f5387k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f5388l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f5389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d<? extends e> f5390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IOException f5391c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T extends e> {
        void K(T t10, long j10, long j11);

        c P(T t10, long j10, long j11, IOException iOException, int i10);

        void r(T t10, long j10, long j11, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5393b;

        public boolean c() {
            int i10 = this.f5392a;
            return i10 == 0 || i10 == 1;
        }

        public c(int i10, long j10) {
            this.f5392a = i10;
            this.f5393b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f5394l = "LoadTask";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f5395m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f5396n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f5397o = 2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f5398p = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f5400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f5401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public b<T> f5402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public IOException f5403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Thread f5405h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f5406i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f5407j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f5400c = t10;
            this.f5402e = bVar;
            this.f5399b = i10;
            this.f5401d = j10;
        }

        public void a(boolean z10) {
            this.f5407j = z10;
            this.f5403f = null;
            if (hasMessages(0)) {
                this.f5406i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f5406i = true;
                        this.f5400c.cancelLoad();
                        Thread thread = this.f5405h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) eh.a.g(this.f5402e)).r(this.f5400c, jElapsedRealtime, jElapsedRealtime - this.f5401d, true);
                this.f5402e = null;
            }
        }

        public final void b() {
            this.f5403f = null;
            v0.this.f5389a.execute((Runnable) eh.a.g(v0.this.f5390b));
        }

        public final void c() {
            v0.this.f5390b = null;
        }

        public final long d() {
            return Math.min((this.f5404g - 1) * 1000, 5000);
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f5403f;
            if (iOException != null && this.f5404g > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            eh.a.i(v0.this.f5390b == null);
            v0.this.f5390b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f5407j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f5401d;
            b bVar = (b) eh.a.g(this.f5402e);
            if (this.f5406i) {
                bVar.r(this.f5400c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.K(this.f5400c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    eh.h0.e("LoadTask", "Unexpected exception handling load completed", e10);
                    v0.this.f5391c = new h(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f5403f = iOException;
            int i12 = this.f5404g + 1;
            this.f5404g = i12;
            c cVarP = bVar.P(this.f5400c, jElapsedRealtime, j10, iOException, i12);
            if (cVarP.f5392a == 3) {
                v0.this.f5391c = this.f5403f;
            } else if (cVarP.f5392a != 2) {
                if (cVarP.f5392a == 1) {
                    this.f5404g = 1;
                }
                f(cVarP.f5393b != -9223372036854775807L ? cVarP.f5393b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f5406i;
                    this.f5405h = Thread.currentThread();
                }
                if (!z10) {
                    eh.g1.a("load:" + this.f5400c.getClass().getSimpleName());
                    try {
                        this.f5400c.load();
                        eh.g1.c();
                    } catch (Throwable th2) {
                        eh.g1.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f5405h = null;
                    Thread.interrupted();
                }
                if (this.f5407j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f5407j) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f5407j) {
                    eh.h0.e("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f5407j) {
                    return;
                }
                eh.h0.e("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(2, new h(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f5407j) {
                    return;
                }
                eh.h0.e("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(2, new h(e13)).sendToTarget();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void cancelLoad();

        void load() throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void onLoaderReleased();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f5409b;

        public g(f fVar) {
            this.f5409b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5409b.onLoaderReleased();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends IOException {
        public h(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f5387k = new c(2, j10);
        f5388l = new c(3, j10);
    }

    public v0(String str) {
        this.f5389a = eh.o1.k1("ExoPlayer:Loader:" + str);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) eh.a.k(this.f5390b)).a(false);
    }

    public void f() {
        this.f5391c = null;
    }

    public boolean h() {
        return this.f5391c != null;
    }

    public boolean i() {
        return this.f5390b != null;
    }

    public void j() {
        k(null);
    }

    public void k(@Nullable f fVar) {
        d<? extends e> dVar = this.f5390b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f5389a.execute(new g(fVar));
        }
        this.f5389a.shutdown();
    }

    public <T extends e> long l(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) eh.a.k(Looper.myLooper());
        this.f5391c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    @Override // ah.w0
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    @Override // ah.w0
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.f5391c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f5390b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f5399b;
            }
            dVar.e(i10);
        }
    }
}
