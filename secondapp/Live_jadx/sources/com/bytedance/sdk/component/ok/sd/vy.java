package com.bytedance.sdk.component.ok.sd;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import lk.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy implements ThreadFactory {

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public static volatile boolean f34947sd;
    protected final ThreadGroup hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected final String f34948tq;
    private final AtomicInteger vy = new AtomicInteger(1);

    public vy(String str) {
        this.hww = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.f34948tq = hww(str);
    }

    public Thread hww(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (f34947sd) {
            return null;
        }
        Thread threadHww = hww(this.hww, runnable, this.f34948tq + e.f104695m + this.vy.getAndIncrement());
        if (threadHww.isDaemon()) {
            threadHww.setDaemon(false);
        }
        return threadHww;
    }

    public static String hww(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
