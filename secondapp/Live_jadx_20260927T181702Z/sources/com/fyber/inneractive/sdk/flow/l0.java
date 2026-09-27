package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f44763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p0 f44764b;

    public l0(p0 p0Var, long j10) {
        this.f44764b = p0Var;
        this.f44763a = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f44764b.K()) {
            p0 p0Var = this.f44764b;
            p0Var.f44854n = new k0(this);
            long jA = p0Var.a(this.f44763a);
            p0 p0Var2 = this.f44764b;
            p0Var2.getClass();
            v1 v1Var = new v1(TimeUnit.MILLISECONDS, jA);
            p0Var2.f44855o = v1Var;
            v1Var.f47916e = new o0(p0Var2);
            t1 t1Var = new t1(v1Var);
            v1Var.f47914c = t1Var;
            v1Var.f47915d = false;
            t1Var.sendEmptyMessage(1932593528);
            p0 p0Var3 = this.f44764b;
            p0Var3.getClass();
            IAlog.a("%sad contains custom close. Will show transparent x in %d", IAlog.a(p0Var3), Long.valueOf(jA));
            this.f44764b.f44852l = null;
        } else {
            p0 p0Var4 = this.f44764b;
            p0Var4.getClass();
            IAlog.a("%sad does not contain custom close. Showing close button", IAlog.a(p0Var4));
            this.f44764b.d(false);
        }
        Runnable runnable = this.f44764b.f44852l;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f47892b.removeCallbacks(runnable);
            this.f44764b.f44852l = null;
        }
    }
}
