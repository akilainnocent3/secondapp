package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f26283a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f26286d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f26284b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f26285c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f26287e = new Object();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f26285c.isEmpty()) {
                if (p.this.f26286d != null) {
                    try {
                        p.this.f26286d.sendMessageAtFrontOfQueue((Message) p.this.f26285c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f26284b.isEmpty()) {
                c cVar = (c) p.this.f26284b.poll();
                if (p.this.f26286d != null) {
                    try {
                        p.this.f26286d.sendMessageAtTime(cVar.f26292a, cVar.f26293b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f26289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f26290b;

        public b(String str) {
            super(str);
            this.f26289a = 0;
            this.f26290b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f26287e) {
                try {
                    p.this.f26286d = new Handler();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p.this.f26286d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th3) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f26289a < 5) {
                            com.apm.insight.c.a();
                            j.a(th3, "NPTH_CATCH");
                        } else if (!this.f26290b) {
                            this.f26290b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f26289a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f26292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f26293b;

        public c(Message message, long j10) {
            this.f26292a = message;
            this.f26293b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f26283a = new b(str);
    }

    public final void b() {
        this.f26283a.start();
    }

    public final HandlerThread c() {
        return this.f26283a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f26286d, runnable);
    }

    @Nullable
    public final Handler a() {
        return this.f26286d;
    }

    private boolean b(Message message, long j10) {
        if (this.f26286d == null) {
            synchronized (this.f26287e) {
                try {
                    if (this.f26286d == null) {
                        this.f26284b.add(new c(message, j10));
                        return true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        try {
            return this.f26286d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
