package com.bytedance.sdk.component.ok.sd;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v1.h;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private boolean f34931hv;
    private final String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private int f34932sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f34933tq;
    private int vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {
        private String hww = "cache";

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private int f34940tq = 4;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private int f34939sd = 100;
        private int vy = 0;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private long f34936hv = 30000;

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private boolean f34935hu = false;
        private TimeUnit vgm = TimeUnit.MILLISECONDS;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private boolean f34937ok = false;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private BlockingQueue<Runnable> f34938rs = new PriorityBlockingQueue();
        private ThreadFactory nod = null;

        public hww hv(int i10) {
            return this;
        }

        public hww vy(int i10) {
            return this;
        }

        public hww hww(String str) {
            this.hww = str;
            return this;
        }

        public hww sd(int i10) {
            this.vy = i10;
            return this;
        }

        public hww tq(int i10) {
            this.f34939sd = i10;
            return this;
        }

        public hww hww(int i10) {
            this.f34940tq = i10;
            return this;
        }

        public hww tq(boolean z10) {
            this.f34937ok = z10;
            return this;
        }

        public hww hww(long j10) {
            this.f34936hv = j10;
            return this;
        }

        public hww hww(boolean z10) {
            this.f34935hu = z10;
            return this;
        }

        public hu hww() {
            if (this.nod == null) {
                this.nod = new vy(this.hww);
            }
            if (this.f34940tq < 0) {
                this.f34940tq = 8;
            }
            if (this.f34940tq == 0) {
                this.f34938rs = new SynchronousQueue();
            }
            if (this.f34938rs == null) {
                this.f34938rs = new LinkedBlockingQueue();
            }
            if (this.f34939sd > 100) {
                this.f34939sd = 100;
            }
            int i10 = this.f34939sd;
            int i11 = this.f34940tq;
            if (i10 < i11) {
                this.f34939sd = i11;
            }
            return new hu(this);
        }
    }

    private void sd() {
        try {
            if (this.f34933tq != 0 && getCorePoolSize() > this.f34933tq && getQueue().size() == 0) {
                setCorePoolSize(this.f34933tq);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void tq() {
        try {
            if (this.f34933tq != 0 && getCorePoolSize() < this.f34932sd) {
                int size = getQueue().size();
                if (getActiveCount() < this.f34933tq || size < this.vy) {
                    return;
                }
                setCorePoolSize(this.f34932sd);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        boolean z10 = runnable instanceof tq;
        if (z10) {
            ((tq) runnable).sd(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th2);
        if (z10) {
            tq tqVar = (tq) runnable;
            tqVar.tq();
            tqVar.hww();
            tqVar.sd();
            tqVar.vy();
            tqVar.hv();
        }
        sd();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof tq) {
            ((tq) runnable).tq(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        h.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.ok.sd.hww hwwVarHww;
        if (!(runnable instanceof tq)) {
            runnable = new tq("unknown", runnable) { // from class: com.bytedance.sdk.component.ok.sd.hu.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableHu = hu();
                    if (runnableHu != null) {
                        runnableHu.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.hww)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(vy.hww(this.hww)) && (hwwVarHww = sd.hww()) != null) {
                hwwVarHww.hww(this, (tq) runnable);
            }
        }
        ((tq) runnable).hww(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            tq();
        } catch (Throwable th2) {
            hww(runnable, th2);
        }
    }

    public void hww(hww hwwVar) {
        try {
            if (hwwVar.f34940tq >= 0 && this.f34933tq != hwwVar.f34940tq) {
                int i10 = hwwVar.f34940tq;
                this.f34933tq = i10;
                setCorePoolSize(i10);
            }
            this.f34932sd = hwwVar.f34939sd;
            this.vy = hwwVar.vy;
            allowCoreThreadTimeOut(hwwVar.f34935hu);
            this.f34931hv = hwwVar.f34937ok;
        } catch (Throwable th2) {
            th2.getMessage();
        }
        String unused = hwwVar.hww;
        int unused2 = hwwVar.f34940tq;
        int unused3 = hwwVar.f34939sd;
        long unused4 = hwwVar.f34936hv;
        int unused5 = hwwVar.vy;
        boolean unused6 = hwwVar.f34937ok;
        BlockingQueue unused7 = hwwVar.f34938rs;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.hww)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.hww) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iHww;
        String strTq;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof tq) {
            tq tqVar = (tq) runnable;
            iHww = tqVar.hww();
            strTq = tqVar.tq();
        } else {
            iHww = 6;
            strTq = "";
        }
        if (iHww == 0 || TextUtils.isEmpty(strTq)) {
            new RuntimeException();
        }
        execute(new tq(iHww, strTq) { // from class: com.bytedance.sdk.component.ok.sd.hu.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private hu(hww hwwVar) {
        super(hwwVar.f34940tq, Integer.MAX_VALUE, hwwVar.f34936hv, hwwVar.vgm, (BlockingQueue<Runnable>) hwwVar.f34938rs, hwwVar.nod);
        this.f34931hv = false;
        String unused = hwwVar.hww;
        int unused2 = hwwVar.f34940tq;
        int unused3 = hwwVar.f34939sd;
        long unused4 = hwwVar.f34936hv;
        int unused5 = hwwVar.vy;
        boolean unused6 = hwwVar.f34937ok;
        BlockingQueue unused7 = hwwVar.f34938rs;
        this.hww = hwwVar.hww;
        this.f34933tq = hwwVar.f34940tq;
        this.f34932sd = hwwVar.f34939sd;
        this.vy = hwwVar.vy;
        allowCoreThreadTimeOut(hwwVar.f34935hu);
        this.f34931hv = hwwVar.f34937ok;
    }

    private void hww(Runnable runnable, Throwable th2) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerTq = sd.tq();
                if (handlerTq != null) {
                    handlerTq.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean hww() {
        return this.f34931hv;
    }
}
