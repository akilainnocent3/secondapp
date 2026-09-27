package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4611yb implements InterfaceC4402ma {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f64506b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f64509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f64510f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f64505a = "INTERNAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f64507c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f64508d = null;

    /* JADX INFO: renamed from: com.ironsource.yb$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4611yb.this.f64510f.run();
        }
    }

    public C4611yb(long j10, Runnable runnable, boolean z10) {
        this.f64509e = j10;
        this.f64510f = runnable;
        if (z10) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f64506b;
        if (timer != null) {
            timer.cancel();
            this.f64506b = null;
        }
    }

    private synchronized void h() {
        if (this.f64506b == null) {
            Timer timer = new Timer();
            this.f64506b = timer;
            timer.schedule(new a(), this.f64509e);
            Calendar.getInstance().setTimeInMillis(this.f64508d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void b() {
        Long l10;
        if (this.f64506b == null && (l10 = this.f64508d) != null) {
            long jLongValue = l10.longValue() - System.currentTimeMillis();
            this.f64509e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f64510f.run();
            }
        }
    }

    public void e() {
        f();
        this.f64507c = false;
        this.f64508d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f64507c) {
            return;
        }
        this.f64507c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f64508d = Long.valueOf(System.currentTimeMillis() + this.f64509e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void a() {
        if (this.f64506b != null) {
            f();
        }
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void c() {
    }

    @Override // com.ironsource.InterfaceC4402ma
    public void d() {
    }
}
