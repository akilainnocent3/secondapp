package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class bll0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ wll0 b;

    public bll0(wll0 wll0Var, long j) {
        this.a = j;
        Objects.requireNonNull(wll0Var);
        this.b = wll0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0055  */
    @Override // java.lang.Runnable
    public final void run() {
        wll0 wll0Var = this.b;
        sll0 sll0Var = wll0Var.f;
        wll0Var.g();
        wll0Var.k();
        k8l0 k8l0Var = wll0Var.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        u4l0 u4l0Var = y4l0Var.n;
        long j = this.a;
        u4l0Var.b(Long.valueOf(j), "Activity resumed, time");
        wok0 wok0Var = k8l0Var.d;
        if (wok0Var.q(null, v2l0.U0)) {
            if (wok0Var.u() || wll0Var.d) {
                sll0Var.d.g();
                sll0Var.c.c();
                sll0Var.a = j;
                sll0Var.b = j;
            }
        } else if (wok0Var.u()) {
            sll0Var.d.g();
            sll0Var.c.c();
            sll0Var.a = j;
            sll0Var.b = j;
        } else {
            j6l0 j6l0Var = k8l0Var.e;
            k8l0.k(j6l0Var);
            if (j6l0Var.s.a()) {
                sll0Var.d.g();
                sll0Var.c.c();
                sll0Var.a = j;
                sll0Var.b = j;
            }
        }
        jll0 jll0Var = wll0Var.g;
        wll0 wll0Var2 = jll0Var.b;
        wll0Var2.g();
        k8l0 k8l0Var2 = wll0Var2.a;
        hll0 hll0Var = jll0Var.a;
        if (hll0Var != null) {
            wll0Var2.c.removeCallbacks(hll0Var);
        }
        j6l0 j6l0Var2 = k8l0Var2.e;
        nfl0 nfl0Var = k8l0Var2.m;
        k8l0.k(j6l0Var2);
        j6l0Var2.s.b(false);
        wll0Var2.g();
        wll0Var2.d = false;
        if (k8l0Var2.d.q(null, v2l0.T0)) {
            k8l0.l(nfl0Var);
            if (nfl0Var.n) {
                y4l0 y4l0Var2 = k8l0Var2.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.n.a("Retrying trigger URI registration in foreground");
                k8l0.l(nfl0Var);
                nfl0Var.F();
            }
        }
        ull0 ull0Var = wll0Var.e;
        wll0 wll0Var3 = ull0Var.a;
        wll0Var3.g();
        k8l0 k8l0Var3 = wll0Var3.a;
        if (k8l0Var3.f()) {
            k8l0Var3.k.getClass();
            ull0Var.b(System.currentTimeMillis());
        }
    }
}
