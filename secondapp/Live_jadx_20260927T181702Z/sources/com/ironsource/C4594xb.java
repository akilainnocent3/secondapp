package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4594xb {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64440g = "xb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f64441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f64442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vf f64443c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f64445e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f64444d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC4402ma f64446f = new a();

    /* JADX INFO: renamed from: com.ironsource.xb$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4594xb c4594xb = C4594xb.this;
            c4594xb.f64441a.b(c4594xb.f64446f);
            C4594xb.this.f64443c.b();
            C4594xb.this.f64442b.run();
        }
    }

    public C4594xb(Runnable runnable, com.ironsource.lifecycle.b bVar, Vf vf2) {
        this.f64442b = runnable;
        this.f64441a = bVar;
        this.f64443c = vf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f64444d) {
            try {
                Timer timer = this.f64445e;
                if (timer != null) {
                    timer.cancel();
                    this.f64445e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f64441a.b(this.f64446f);
        this.f64443c.b();
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f64440g, "cannot start timer with delay < 0");
            return;
        }
        this.f64441a.a(this.f64446f);
        this.f64443c.a(j10);
        if (this.f64441a.e()) {
            this.f64443c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f64444d) {
            c();
            Timer timer = new Timer();
            this.f64445e = timer;
            timer.schedule(new b(), j10);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xb$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements InterfaceC4402ma {
        public a() {
        }

        @Override // com.ironsource.InterfaceC4402ma
        public void a() {
            C4594xb.this.f64443c.c(System.currentTimeMillis());
            C4594xb.this.c();
        }

        @Override // com.ironsource.InterfaceC4402ma
        public void b() {
            C4594xb.this.f64443c.b(System.currentTimeMillis());
            C4594xb c4594xb = C4594xb.this;
            c4594xb.b(c4594xb.f64443c.a());
        }

        @Override // com.ironsource.InterfaceC4402ma
        public void c() {
        }

        @Override // com.ironsource.InterfaceC4402ma
        public void d() {
        }
    }
}
