package com.bytedance.sdk.openadsdk.hnv;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private hww f37322hv;
    private ScheduledExecutorService hww = null;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private long f37323sd = 0;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ok f37324tq;
    private int vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
    }

    public tq(ok okVar, int i10) {
        this.f37324tq = okVar;
        this.vy = i10;
    }

    public void hww(long j10) {
        this.f37323sd = j10;
    }

    public boolean tq() {
        ScheduledExecutorService scheduledExecutorService = this.hww;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void hww(int i10) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.hww = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.hnv.tq.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = tq.this.f37323sd;
                if (System.currentTimeMillis() - tq.this.f37323sd > tq.this.vy) {
                    tq.this.hww.shutdown();
                    if (tq.this.f37324tq != null) {
                        tq.this.f37324tq.tq(0, "Automatic detection of stuck");
                    }
                    if (tq.this.f37322hv != null) {
                        hww unused2 = tq.this.f37322hv;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void hww() {
        ScheduledExecutorService scheduledExecutorService = this.hww;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
