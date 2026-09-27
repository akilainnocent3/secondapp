package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f70401a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f70405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f70406f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f70407g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f70408h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f70402b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f70403c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f70404d = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f70409i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f70410j = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f70404d, u.this.f70407g, u.this.f70406f, u.this.f70408h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(t<?> tVar, int i10);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f70405e = i10;
        this.f70406f = bVar;
        this.f70407g = mVar;
        this.f70408h = wVar;
    }

    private void a(int i10) {
        if (this.f70401a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f70401a = null;
            }
        }
    }

    public void b() {
        if (!this.f70410j || this.f70401a == null) {
            a(this.f70405e);
            this.f70410j = true;
        }
    }

    public <T> void c(t<T> tVar) {
        synchronized (this.f70403c) {
            this.f70403c.remove(tVar);
        }
        a(tVar, 5);
    }

    public <T> void d(t<T> tVar) {
        this.f70404d.add(tVar);
    }

    private void b(int i10) {
        this.f70401a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f70402b.incrementAndGet();
    }

    public <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f70403c) {
            this.f70403c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f70401a == null) {
            a(this.f70405e);
        }
        if (!this.f70401a.isShutdown()) {
            this.f70401a.execute(new b());
        }
        return tVar;
    }

    public void a(t<?> tVar, int i10) {
        synchronized (this.f70409i) {
            try {
                Iterator<c> it = this.f70409i.iterator();
                while (it.hasNext()) {
                    it.next().a(tVar, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
