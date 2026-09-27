package sg.bigo.ads.core.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f134587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f134588b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    public static class a extends AbstractRunnableC1372b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f134590c;

        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.b.c.b.AbstractRunnableC1372b
        public final void a() {
            Runnable runnable = this.f134591a;
            if (runnable != null) {
                this.f134590c = b.a(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.b.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC1372b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f134591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicBoolean f134592b = new AtomicBoolean(false);

        public AbstractRunnableC1372b(Runnable runnable) {
            this.f134591a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f134592b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f134587a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return f134588b.submit(new Runnable() { // from class: sg.bigo.ads.core.b.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("callback thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("callback thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                }
            }
        });
    }

    public static AbstractRunnableC1372b a(Runnable runnable, long j10) {
        a aVar = new a(runnable);
        f134587a.postDelayed(aVar, j10);
        return aVar;
    }

    public static void a(AbstractRunnableC1372b abstractRunnableC1372b) {
        Future future;
        if (abstractRunnableC1372b != null) {
            abstractRunnableC1372b.f134592b.set(true);
            if (abstractRunnableC1372b instanceof a) {
                a aVar = (a) abstractRunnableC1372b;
                if (aVar.f134590c != null && (future = aVar.f134590c) != null && !future.isCancelled() && !future.isDone()) {
                    future.cancel(true);
                }
            }
            f134587a.removeCallbacks(abstractRunnableC1372b);
        }
    }
}
