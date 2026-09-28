package defpackage;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class hll0 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ jll0 c;

    public hll0(jll0 jll0Var, long j, long j2) {
        Objects.requireNonNull(jll0Var);
        this.c = jll0Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p7l0 p7l0Var = this.c.b.a.g;
        k8l0.m(p7l0Var);
        p7l0Var.p(new Runnable() { // from class: fll0
            /* JADX WARN: Code duplicated, block: B:10:0x007c  */
            @Override // java.lang.Runnable
            public final void run() {
                hll0 hll0Var = this.a;
                wll0 wll0Var = hll0Var.c.b;
                wll0Var.g();
                k8l0 k8l0Var = wll0Var.a;
                y4l0 y4l0Var = k8l0Var.f;
                Context context = k8l0Var.a;
                k8l0.m(y4l0Var);
                y4l0Var.m.a("Application going to the background");
                j6l0 j6l0Var = k8l0Var.e;
                k8l0.k(j6l0Var);
                j6l0Var.s.b(true);
                wll0Var.g();
                wll0Var.d = true;
                wok0 wok0Var = k8l0Var.d;
                if (!wok0Var.u()) {
                    long j = hll0Var.b;
                    sll0 sll0Var = wll0Var.f;
                    sll0Var.a(j, false, false);
                    sll0Var.c.c();
                }
                long j2 = hll0Var.a;
                k8l0.m(y4l0Var);
                y4l0Var.l.b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                nfl0 nfl0Var = k8l0Var.m;
                k8l0.l(nfl0Var);
                nfl0Var.g();
                k8l0 k8l0Var2 = nfl0Var.a;
                nfl0Var.h();
                ikl0 ikl0VarO = k8l0Var2.o();
                ikl0VarO.g();
                ikl0VarO.h();
                if (ikl0VarO.n()) {
                    yol0 yol0Var = ikl0VarO.a.i;
                    k8l0.k(yol0Var);
                    if (yol0Var.N() >= 242600) {
                        ikl0 ikl0VarO2 = k8l0Var2.o();
                        ikl0VarO2.g();
                        ikl0VarO2.h();
                        ikl0VarO2.u(new cil0(ikl0VarO2, ikl0VarO2.w(true)));
                    }
                } else {
                    ikl0 ikl0VarO3 = k8l0Var2.o();
                    ikl0VarO3.g();
                    ikl0VarO3.h();
                    ikl0VarO3.u(new cil0(ikl0VarO3, ikl0VarO3.w(true)));
                }
                if (wok0Var.q(null, v2l0.N0)) {
                    yol0 yol0Var2 = k8l0Var.i;
                    k8l0.k(yol0Var2);
                    long jN = yol0Var2.H(context.getPackageName(), wok0Var.c) ? 1000L : wok0Var.n(context.getPackageName(), v2l0.E);
                    k8l0.m(y4l0Var);
                    y4l0Var.n.b(Long.valueOf(jN), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    k8l0.j(k8l0Var.u);
                    k8l0Var.u.k(jN);
                }
            }
        });
    }
}
