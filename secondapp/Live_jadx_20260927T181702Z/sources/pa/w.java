package pa;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import k.h1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public class w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f120596f = androidx.work.r.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f120597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f120598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, c> f120599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, b> f120600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f120601e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120602a = 0;

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable r10) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(r10);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f120602a);
            this.f120602a = this.f120602a + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP})
    public interface b {
        void b(@NonNull String workSpecId);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP})
    public static class c implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f120604d = "WrkTimerRunnable";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w f120605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f120606c;

        public c(@NonNull w workTimer, @NonNull String workSpecId) {
            this.f120605b = workTimer;
            this.f120606c = workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f120605b.f120601e) {
                try {
                    if (this.f120605b.f120599c.remove(this.f120606c) != null) {
                        b bVarRemove = this.f120605b.f120600d.remove(this.f120606c);
                        if (bVarRemove != null) {
                            bVarRemove.b(this.f120606c);
                        }
                    } else {
                        androidx.work.r.c().a(f120604d, String.format("Timer with %s is already marked as complete.", this.f120606c), new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public w() {
        a aVar = new a();
        this.f120597a = aVar;
        this.f120599c = new HashMap();
        this.f120600d = new HashMap();
        this.f120601e = new Object();
        this.f120598b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    @NonNull
    @h1
    public ScheduledExecutorService a() {
        return this.f120598b;
    }

    @NonNull
    @h1
    public synchronized Map<String, b> b() {
        return this.f120600d;
    }

    @NonNull
    @h1
    public synchronized Map<String, c> c() {
        return this.f120599c;
    }

    public void d() {
        if (this.f120598b.isShutdown()) {
            return;
        }
        this.f120598b.shutdownNow();
    }

    public void e(@NonNull final String workSpecId, long processingTimeMillis, @NonNull b listener) {
        synchronized (this.f120601e) {
            androidx.work.r.c().a(f120596f, String.format("Starting timer for %s", workSpecId), new Throwable[0]);
            f(workSpecId);
            c cVar = new c(this, workSpecId);
            this.f120599c.put(workSpecId, cVar);
            this.f120600d.put(workSpecId, listener);
            this.f120598b.schedule(cVar, processingTimeMillis, TimeUnit.MILLISECONDS);
        }
    }

    public void f(@NonNull final String workSpecId) {
        synchronized (this.f120601e) {
            try {
                if (this.f120599c.remove(workSpecId) != null) {
                    androidx.work.r.c().a(f120596f, String.format("Stopping timer for %s", workSpecId), new Throwable[0]);
                    this.f120600d.remove(workSpecId);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
