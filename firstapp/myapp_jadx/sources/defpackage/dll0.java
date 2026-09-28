package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class dll0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ wll0 b;

    public dll0(wll0 wll0Var, long j) {
        this.a = j;
        Objects.requireNonNull(wll0Var);
        this.b = wll0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wll0 wll0Var = this.b;
        wll0Var.g();
        wll0Var.k();
        k8l0 k8l0Var = wll0Var.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        u4l0 u4l0Var = y4l0Var.n;
        long j = this.a;
        u4l0Var.b(Long.valueOf(j), "Activity paused, time");
        jll0 jll0Var = wll0Var.g;
        wll0 wll0Var2 = jll0Var.b;
        wll0Var2.a.k.getClass();
        hll0 hll0Var = new hll0(jll0Var, System.currentTimeMillis(), j);
        jll0Var.a = hll0Var;
        wll0Var2.c.postDelayed(hll0Var, 2000L);
        if (k8l0Var.d.u()) {
            wll0Var.f.c.c();
        }
    }
}
