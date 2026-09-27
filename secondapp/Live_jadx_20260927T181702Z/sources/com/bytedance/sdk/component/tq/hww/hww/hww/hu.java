package com.bytedance.sdk.component.tq.hww.hww.hww;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu extends com.bytedance.sdk.component.tq.hww.vy {
    private ExecutorService hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private List<com.bytedance.sdk.component.tq.hww.tq> f35025tq = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private List<com.bytedance.sdk.component.tq.hww.tq> f35024sd = new CopyOnWriteArrayList();
    private AtomicInteger vy = new AtomicInteger(64);

    public hu() {
        if (this.hww == null) {
            this.hww = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.tq.hww.hww.hww.hu.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public void hww(int i10) {
        this.vy.set(i10);
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public List<com.bytedance.sdk.component.tq.hww.tq> sd() {
        return this.f35025tq;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public ExecutorService tq() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public List<com.bytedance.sdk.component.tq.hww.tq> vy() {
        return this.f35024sd;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public int hww() {
        return this.vy.get();
    }
}
