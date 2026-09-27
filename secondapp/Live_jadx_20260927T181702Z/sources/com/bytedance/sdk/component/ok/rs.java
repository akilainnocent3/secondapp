package com.bytedance.sdk.component.ok;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs implements ThreadFactory {
    public static volatile boolean vy;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private final AtomicInteger f34928hv = new AtomicInteger(1);
    protected final ThreadGroup hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected int f34929sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected final String f34930tq;

    public rs(int i10, String str) {
        this.f34929sd = i10;
        this.hww = new ThreadGroup("csj_g_".concat(String.valueOf(str)));
        this.f34930tq = "csj_".concat(String.valueOf(str));
    }

    public Thread hww(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (vy) {
            return null;
        }
        Thread threadHww = hww(this.hww, runnable, this.f34930tq + this.f34928hv.getAndIncrement());
        if (threadHww.isDaemon()) {
            threadHww.setDaemon(false);
        }
        int i10 = this.f34929sd;
        if (i10 > 10 || i10 <= 0) {
            this.f34929sd = 5;
        }
        threadHww.setPriority(this.f34929sd);
        return threadHww;
    }
}
