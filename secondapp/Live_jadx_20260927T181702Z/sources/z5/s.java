package z5;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import x4.b2;
import x4.d0;
import x4.k1;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class s implements u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f160495d = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f160496e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f160497f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f160498g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f160499h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f160500i = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f160501j = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f160502k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f160503l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6.d f160504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d<? extends e> f160505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IOException f160506c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T extends e> {
        void n(T t10, long j10, long j11, int i10);

        void o(T t10, long j10, long j11);

        void q(T t10, long j10, long j11, boolean z10);

        c r(T t10, long j10, long j11, IOException iOException, int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f160507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f160508b;

        public boolean c() {
            int i10 = this.f160507a;
            return i10 == 0 || i10 == 1;
        }

        public c(int i10, long j10) {
            this.f160507a = i10;
            this.f160508b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f160509l = "LoadTask";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f160510m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f160511n = 2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final int f160512o = 3;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f160513p = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f160514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f160515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f160516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public b<T> f160517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public IOException f160518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f160519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Thread f160520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f160521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f160522j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f160515c = t10;
            this.f160517e = bVar;
            this.f160514b = i10;
            this.f160516d = j10;
        }

        public void a(boolean z10) {
            this.f160522j = z10;
            this.f160518f = null;
            if (hasMessages(1)) {
                this.f160521i = true;
                removeMessages(1);
                if (!z10) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f160521i = true;
                        this.f160515c.cancelLoad();
                        Thread thread = this.f160520h;
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
                ((b) l0.E(this.f160517e)).q(this.f160515c, jElapsedRealtime, jElapsedRealtime - this.f160516d, true);
                this.f160517e = null;
            }
        }

        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ((b) l0.E(this.f160517e)).n(this.f160515c, jElapsedRealtime, jElapsedRealtime - this.f160516d, this.f160519g);
            this.f160518f = null;
            s.this.f160504a.execute((Runnable) l0.E(s.this.f160505b));
        }

        public final void c() {
            s.this.f160505b = null;
        }

        public final long d() {
            return Math.min((this.f160519g - 1) * 1000, 5000);
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f160518f;
            if (iOException != null && this.f160519g > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            l0.g0(s.this.f160505b == null);
            s.this.f160505b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(1, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f160522j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                b();
                return;
            }
            if (i10 == 4) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f160516d;
            b bVar = (b) l0.E(this.f160517e);
            if (this.f160521i) {
                bVar.q(this.f160515c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 2) {
                try {
                    bVar.o(this.f160515c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    d0.e("LoadTask", "Unexpected exception handling load completed", e10);
                    s.this.f160506c = new h(e10);
                    return;
                }
            }
            if (i11 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f160518f = iOException;
            int i12 = this.f160519g + 1;
            this.f160519g = i12;
            c cVarR = bVar.r(this.f160515c, jElapsedRealtime, j10, iOException, i12);
            if (cVarR.f160507a == 3) {
                s.this.f160506c = this.f160518f;
            } else if (cVarR.f160507a != 2) {
                if (cVarR.f160507a == 1) {
                    this.f160519g = 1;
                }
                f(cVarR.f160508b != -9223372036854775807L ? cVarR.f160508b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = this.f160521i;
                    this.f160520h = Thread.currentThread();
                }
                if (!z10) {
                    k1.a("load:" + this.f160515c.getClass().getSimpleName());
                    try {
                        this.f160515c.load();
                        k1.b();
                    } catch (Throwable th2) {
                        k1.b();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f160520h = null;
                    Thread.interrupted();
                }
                if (this.f160522j) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e10) {
                if (this.f160522j) {
                    return;
                }
                obtainMessage(3, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f160522j) {
                    d0.e("LoadTask", "Unexpected error loading stream", e11);
                    obtainMessage(4, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f160522j) {
                    return;
                }
                d0.e("LoadTask", "Unexpected exception loading stream", e12);
                obtainMessage(3, new h(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f160522j) {
                    return;
                }
                d0.e("LoadTask", "OutOfMemory error loading stream", e13);
                obtainMessage(3, new h(e13)).sendToTarget();
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
        public final f f160524b;

        public g(f fVar) {
            this.f160524b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f160524b.onLoaderReleased();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends IOException {
        public h(Throwable th2) {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
            super(sb2.toString(), th2);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f160502k = new c(2, j10);
        f160503l = new c(3, j10);
    }

    public s(String str) {
        this(c6.c.a(b2.O1("ExoPlayer:Loader:" + str), new x4.q() { // from class: z5.r
            @Override // x4.q
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) l0.E(this.f160505b)).a(false);
    }

    public void f() {
        this.f160506c = null;
    }

    public boolean h() {
        return this.f160506c != null;
    }

    public boolean i() {
        return this.f160505b != null;
    }

    public void j() {
        k(null);
    }

    public void k(@Nullable f fVar) {
        d<? extends e> dVar = this.f160505b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f160504a.execute(new g(fVar));
        }
        this.f160504a.release();
    }

    public <T extends e> long l(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) l0.E(Looper.myLooper());
        this.f160506c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }

    @Override // z5.u
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    @Override // z5.u
    public void maybeThrowError(int i10) throws IOException {
        IOException iOException = this.f160506c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f160505b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f160514b;
            }
            dVar.e(i10);
        }
    }

    public s(c6.d dVar) {
        this.f160504a = dVar;
    }
}
