package sg.bigo.ads.common.n;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f133157e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f133158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f133159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f133160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f133161d;

    public c(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f133160c.newThread(runnable);
        threadNewThread.setName(this.f133158a + TokenBuilder.TOKEN_DELIMITER + this.f133159b.getAndIncrement());
        if (this.f133161d) {
            threadNewThread.setPriority(10);
        }
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.common.n.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
                if (c.f133157e != null) {
                    c.f133157e.a(th2);
                }
            }
        });
        return threadNewThread;
    }

    public c(String str, boolean z10) {
        this.f133158a = "BGAd-".concat(String.valueOf(str));
        this.f133159b = new AtomicInteger(1);
        this.f133160c = Executors.defaultThreadFactory();
        this.f133161d = z10;
    }

    public static void a(a aVar) {
        f133157e = aVar;
    }
}
