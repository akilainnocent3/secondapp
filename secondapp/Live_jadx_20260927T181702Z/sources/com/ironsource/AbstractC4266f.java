package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC4266f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f61730a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f61731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f61732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected T f61733d;

    /* JADX INFO: renamed from: com.ironsource.f$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC4266f.this.b();
        }
    }

    public AbstractC4266f() {
    }

    public boolean a() {
        return this.f61732c <= 0;
    }

    public abstract void b();

    public void c() {
        synchronized (this.f61730a) {
            try {
                Timer timer = this.f61731b;
                if (timer != null) {
                    timer.cancel();
                    this.f61731b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        this.f61733d = null;
    }

    public void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f61733d = t10;
        c();
        synchronized (this.f61730a) {
            Timer timer = new Timer();
            this.f61731b = timer;
            timer.schedule(new a(), this.f61732c);
        }
    }

    public AbstractC4266f(long j10) {
        this.f61732c = j10;
    }
}
