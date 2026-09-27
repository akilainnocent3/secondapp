package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4245de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4450p2 f61563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC4263ee f61564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f61565c = null;

    /* JADX INFO: renamed from: com.ironsource.de$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4245de.this.f61564b.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.de$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4245de.this.f61564b.b();
        }
    }

    public C4245de(C4450p2 c4450p2, InterfaceC4263ee interfaceC4263ee) {
        this.f61563a = c4450p2;
        this.f61564b = interfaceC4263ee;
    }

    private void d() {
        Timer timer = this.f61565c;
        if (timer != null) {
            timer.cancel();
            this.f61565c = null;
        }
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f61564b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f61565c = timer;
        timer.schedule(new a(), this.f61563a.j());
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f61565c = timer;
        timer.schedule(new b(), this.f61563a.b());
    }
}
