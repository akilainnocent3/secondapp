package com.bytedance.sdk.component.ok;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends hv {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f34910hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f34911hv;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static sd f34913tq;
    private static volatile ScheduledExecutorService vgm;
    public static final int hww = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static int f34912sd = 120;
    public static boolean vy = true;

    public static RejectedExecutionHandler hu() {
        return new RejectedExecutionHandler() { // from class: com.bytedance.sdk.component.ok.hu.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static boolean hv() {
        return vy;
    }

    public static void hww(ok okVar) {
        if (f34911hv == null) {
            tq();
        }
        if (okVar == null || f34911hv == null) {
            return;
        }
        f34911hv.execute(okVar);
    }

    public static ExecutorService sd() {
        return hww(10);
    }

    public static ExecutorService tq() {
        if (f34911hv == null) {
            synchronized (hu.class) {
                try {
                    if (f34911hv == null) {
                        f34911hv = new hww.C0327hww().hww("init").hww(0).tq(10).hww(5L).hww(TimeUnit.SECONDS).hww(new SynchronousQueue()).hww(hu()).hww(hv.hww().hww(10, "init")).hww();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34911hv;
    }

    public static sd vgm() {
        return f34913tq;
    }

    public static ScheduledExecutorService vy() {
        if (vgm == null) {
            synchronized (hu.class) {
                try {
                    if (vgm == null) {
                        vgm = Executors.newSingleThreadScheduledExecutor(hv.hww().hww(5, "scheduled"));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return vgm;
    }

    public static ExecutorService hww(int i10) {
        if (f34910hu == null) {
            synchronized (hu.class) {
                try {
                    if (f34910hu == null) {
                        hww hwwVarHww = new hww.C0327hww().hww("io").hww(2).tq(i10).hww(20L).hww(TimeUnit.SECONDS).hww(new LinkedBlockingQueue()).hww(hu()).hww(hv.hww().hww(i10, "io")).hww();
                        f34910hu = hwwVarHww;
                        hwwVarHww.allowCoreThreadTimeOut(true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f34910hu;
    }

    public static void tq(ok okVar) {
        if (f34910hu == null) {
            sd();
        }
        if (f34910hu != null) {
            f34910hu.execute(okVar);
        }
    }

    public static void tq(int i10) {
        f34912sd = i10;
    }

    public static void hww(ok okVar, int i10) {
        tq(okVar);
    }

    public static void hww(boolean z10) {
        vy = z10;
    }

    public static void hww(sd sdVar) {
        f34913tq = sdVar;
    }
}
