package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O0 f59828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gb f59829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4594xb f59830c = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f59831d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q0.this.f59829b.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Q0.this.f59829b.b();
        }
    }

    public Q0(O0 o10, @oy.l Gb gb2) {
        this.f59828a = o10;
        this.f59829b = gb2;
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f59831d = timer;
        timer.schedule(new b(), j10);
    }

    private C4594xb c() {
        return new C4594xb(new a(), com.ironsource.lifecycle.b.d(), new Vf());
    }

    private synchronized void j() {
        Timer timer = this.f59831d;
        if (timer != null) {
            timer.cancel();
            this.f59831d = null;
        }
    }

    public boolean d() {
        return this.f59828a.c() > 0;
    }

    public void e() {
        if (this.f59828a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f59828a.c());
        }
    }

    public void f() {
        if (this.f59828a.a() == O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f59828a.d());
        }
    }

    public void g() {
        if (this.f59828a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f59828a.a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f59828a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f59828a.d());
    }

    public void i() {
        C4594xb c4594xb = this.f59830c;
        if (c4594xb != null) {
            c4594xb.b();
        }
    }

    public void k() {
        if (this.f59828a.a() != O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f59828a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f59828a.b());
    }

    public void a() {
        if (this.f59828a.a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public O0 b() {
        return this.f59828a;
    }

    public void a(long j10) {
        C4594xb c4594xb = this.f59830c;
        if (c4594xb != null) {
            c4594xb.a(j10);
        }
    }
}
