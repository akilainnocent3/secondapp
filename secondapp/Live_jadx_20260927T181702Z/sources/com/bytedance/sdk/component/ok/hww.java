package com.bytedance.sdk.component.ok;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
class hww extends ThreadPoolExecutor implements AutoCloseable {
    private String hww;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ok.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0327hww {

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private RejectedExecutionHandler f34917ok;
        private String hww = "io";

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private int f34920tq = 1;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private long f34919sd = 30;
        private TimeUnit vy = TimeUnit.SECONDS;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private int f34916hv = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private BlockingQueue<Runnable> f34915hu = null;
        private ThreadFactory vgm = null;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private int f34918rs = 5;

        public C0327hww hww(String str) {
            this.hww = str;
            return this;
        }

        public C0327hww tq(int i10) {
            this.f34918rs = i10;
            return this;
        }

        public C0327hww hww(int i10) {
            this.f34920tq = i10;
            return this;
        }

        public C0327hww hww(long j10) {
            this.f34919sd = j10;
            return this;
        }

        public C0327hww hww(TimeUnit timeUnit) {
            this.vy = timeUnit;
            return this;
        }

        public C0327hww hww(BlockingQueue<Runnable> blockingQueue) {
            this.f34915hu = blockingQueue;
            return this;
        }

        public C0327hww hww(ThreadFactory threadFactory) {
            this.vgm = threadFactory;
            return this;
        }

        public C0327hww hww(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f34917ok = rejectedExecutionHandler;
            return this;
        }

        public hww hww() {
            if (this.vgm == null) {
                this.vgm = hv.hww().hww(this.f34918rs, this.hww);
            }
            if (this.f34917ok == null) {
                this.f34917ok = hu.hu();
            }
            if (this.f34915hu == null) {
                this.f34915hu = new LinkedBlockingQueue();
            }
            return new hww(this.hww, this.f34920tq, this.f34916hv, this.f34919sd, this.vy, this.f34915hu, this.vgm, this.f34917ok);
        }
    }

    public hww(String str, int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i10, i11, j10, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.hww = str;
    }

    private void hww(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e10) {
            hww(runnable, e10);
        } catch (Throwable th2) {
            hww(runnable, th2);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th2);
        if (!hu.hv() || TextUtils.isEmpty(this.hww) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.hww;
        str.getClass();
        switch (str) {
            case "io":
                hww(queue, 2);
                break;
            case "log":
                hww(queue, 4);
                break;
            case "aidl":
                hww(queue, 2);
                break;
        }
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof ok) {
            hww(new tq((ok) runnable, this));
        } else {
            hww(new tq(new ok("unknown") { // from class: com.bytedance.sdk.component.ok.hww.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!hu.hv() || TextUtils.isEmpty(this.hww) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.hww;
        str.getClass();
        switch (str) {
            case "io":
                hww(queue, hu.hww + 2, getCorePoolSize() * 2);
                break;
            case "log":
                hww(queue, 8, 8);
                break;
            case "aidl":
                hww(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.hww) || "aidl".equals(this.hww)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.hww) || "aidl".equals(this.hww)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void hww(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        hww(runnable, (Throwable) outOfMemoryError);
    }

    private void hww(Runnable runnable, Throwable th2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    private void hww(BlockingQueue<Runnable> blockingQueue, int i10) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void hww(BlockingQueue<Runnable> blockingQueue, int i10, int i11) {
        if (getCorePoolSize() == i10 || blockingQueue == null || blockingQueue.size() < i11) {
            return;
        }
        try {
            setCorePoolSize(i10);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    public String hww() {
        return this.hww;
    }
}
