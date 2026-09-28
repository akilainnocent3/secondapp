package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class nxs {
    public static final b d = new b(0, -9223372036854775807L);
    public static final b e = new b(2, -9223372036854775807L);
    public static final b f = new b(3, -9223372036854775807L);
    public final t250 a;
    public c<? extends d> b;
    public IOException c;

    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }
    }

    public final class c<T extends d> extends Handler implements Runnable {
        public final int a;
        public final T b;
        public final long c;
        public a<T> d;
        public IOException e;
        public int f;
        public Thread i;
        public boolean v;
        public volatile boolean w;

        public c(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.b = t;
            this.d = aVar;
            this.a = i;
            this.c = j;
        }

        public final void a(boolean z) {
            this.w = z;
            this.e = null;
            if (hasMessages(1)) {
                this.v = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.v = true;
                        this.b.b();
                        Thread thread = this.i;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                nxs.this.b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.d;
                aVar.getClass();
                aVar.p(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        public final void b() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.c;
            a<T> aVar = this.d;
            aVar.getClass();
            aVar.g(this.b, jElapsedRealtime, j, this.f);
            this.e = null;
            nxs nxsVar = nxs.this;
            t250 t250Var = nxsVar.a;
            c<? extends d> cVar = nxsVar.b;
            cVar.getClass();
            t250Var.execute(cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.w) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                b();
                return;
            }
            if (i == 4) {
                throw ((Error) message.obj);
            }
            nxs.this.b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.c;
            a<T> aVar = this.d;
            aVar.getClass();
            if (this.v) {
                aVar.p(this.b, jElapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    aVar.e(this.b, jElapsedRealtime, j);
                    return;
                } catch (RuntimeException e) {
                    cft.d("LoadTask", "Unexpected exception handling load completed", e);
                    nxs.this.c = new g(e);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.e = iOException;
            int i3 = this.f + 1;
            this.f = i3;
            b bVarI = aVar.i(this.b, jElapsedRealtime, j, iOException, i3);
            int i4 = bVarI.a;
            if (i4 == 3) {
                nxs.this.c = this.e;
                return;
            }
            if (i4 != 2) {
                if (i4 == 1) {
                    this.f = 1;
                }
                long jMin = bVarI.b;
                if (jMin == -9223372036854775807L) {
                    jMin = Math.min((this.f - 1) * 1000, 5000);
                }
                nxs nxsVar = nxs.this;
                ly0.f(nxsVar.b == null);
                nxsVar.b = this;
                if (jMin > 0) {
                    sendEmptyMessageDelayed(1, jMin);
                } else {
                    b();
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.v;
                    this.i = Thread.currentThread();
                }
                if (!z) {
                    Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                    try {
                        this.b.a();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.i = null;
                    Thread.interrupted();
                }
                if (this.w) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.w) {
                    return;
                }
                obtainMessage(3, e).sendToTarget();
            } catch (Exception e2) {
                if (this.w) {
                    return;
                }
                cft.d("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(3, new g(e2)).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.w) {
                    return;
                }
                cft.d("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(3, new g(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.w) {
                    cft.d("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    public interface d {
        void a();

        void b();
    }

    public interface e {
        void l();
    }

    public static final class f implements Runnable {
        public final e a;

        public f(e eVar) {
            this.a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.l();
        }
    }

    public static final class g extends IOException {
        public g(Throwable th) {
            String str;
            StringBuilder sb = new StringBuilder("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            if (th.getMessage() != null) {
                str = ": " + th.getMessage();
            } else {
                str = "";
            }
            sb.append(str);
            super(sb.toString(), th);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nxs(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = jrh0.a;
        this(new t250(Executors.newSingleThreadExecutor(new arh0(strConcat)), new fu5()));
    }

    public final void a() {
        c<? extends d> cVar = this.b;
        ly0.g(cVar);
        cVar.a(false);
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void c(e eVar) {
        c<? extends d> cVar = this.b;
        if (cVar != null) {
            cVar.a(true);
        }
        t250 t250Var = this.a;
        if (eVar != null) {
            t250Var.execute(new f(eVar));
        }
        t250Var.b.accept(t250Var.a);
    }

    public final void d(d dVar, a aVar, int i) {
        Looper looperMyLooper = Looper.myLooper();
        ly0.g(looperMyLooper);
        this.c = null;
        c<? extends d> cVar = new c<>(looperMyLooper, dVar, aVar, i, SystemClock.elapsedRealtime());
        ly0.f(this.b == null);
        this.b = cVar;
        cVar.b();
    }

    public nxs(t250 t250Var) {
        this.a = t250Var;
    }

    public interface a<T extends d> {
        void e(T t, long j, long j2);

        b i(T t, long j, long j2, IOException iOException, int i);

        void p(T t, long j, long j2, boolean z);

        default void g(T t, long j, long j2, int i) {
        }
    }
}
