package sg.bigo.ads.core.d.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f134659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f134660b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.c.a$a, reason: collision with other inner class name */
    public static class C1375a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f134662c;

        public C1375a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.d.c.a.b
        public final void a() {
            Runnable runnable = this.f134663a;
            if (runnable != null) {
                this.f134662c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f134663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f134664b = new AtomicBoolean(false);

        public b(Runnable runnable) {
            this.f134663a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f134664b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f134659a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return f134660b.submit(new Runnable() { // from class: sg.bigo.ads.core.d.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("stat thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("stat thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j10) {
        C1375a c1375a = new C1375a(runnable);
        f134659a.postDelayed(c1375a, j10);
        return c1375a;
    }

    public static void a(b bVar) {
        Future future;
        if (bVar != null) {
            bVar.f134664b.set(true);
            if (bVar instanceof C1375a) {
                C1375a c1375a = (C1375a) bVar;
                if (c1375a.f134662c != null && (future = c1375a.f134662c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f134659a.removeCallbacks(bVar);
        }
    }
}
