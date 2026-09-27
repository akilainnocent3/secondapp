package com.bytedance.sdk.component.hv.hww;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww implements ThreadFactory {
    private final ThreadGroup hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final AtomicInteger f34661tq = new AtomicInteger(1);

    public hww(String str) {
        this.hww = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.hww, runnable, "tt_img_" + this.f34661tq.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
