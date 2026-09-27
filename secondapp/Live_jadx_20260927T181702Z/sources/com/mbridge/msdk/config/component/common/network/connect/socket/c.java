package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f65229d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f65230a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f65231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f65232c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f65233a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f65233a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f65231b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f65232c = new AtomicBoolean(false);
    }

    private boolean b() {
        int iV;
        try {
            int iH = m0.h();
            return iH > 0 && (iV = m0.v()) > 0 && (((double) iH) / ((double) iV)) * 100.0d <= 5.0d;
        } catch (Exception e10) {
            q0.b("SocketThreadPoolManager", "Memory check failed: " + e10.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f65230a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f65230a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th2) {
                this.f65232c.set(false);
                if (!this.f65230a.isEmpty()) {
                    d();
                }
                throw th2;
            }
        }
        this.f65232c.set(false);
        if (this.f65230a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f65232c.compareAndSet(false, true)) {
            this.f65231b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65235b.c();
                }
            });
        }
    }

    public static c a() {
        if (f65229d == null) {
            synchronized (c.class) {
                try {
                    if (f65229d == null) {
                        f65229d = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f65229d;
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f65230a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f65231b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f65231b.getActiveCount(), this.f65231b.getQueue().size());
    }
}
