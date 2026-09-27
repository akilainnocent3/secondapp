package ak;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f5451e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f5452a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f5455d;

    public b(String str, int i10, @zq.h StrictMode.ThreadPolicy threadPolicy) {
        this.f5453b = str;
        this.f5454c = i10;
        this.f5455d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f5454c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f5455d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f5451e.newThread(new Runnable() { // from class: ak.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f5447b, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f5453b, Long.valueOf(this.f5452a.getAndIncrement())));
        return threadNewThread;
    }
}
