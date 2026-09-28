package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class gdl0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ nfl0 b;

    public gdl0(nfl0 nfl0Var, long j) {
        this.a = j;
        Objects.requireNonNull(nfl0Var);
        this.b = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nfl0 nfl0Var = this.b;
        nfl0Var.g();
        nfl0Var.h();
        k8l0 k8l0Var = nfl0Var.a;
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.m.a("Resetting analytics data (FE)");
        wll0 wll0Var = k8l0Var.h;
        k8l0.l(wll0Var);
        wll0Var.g();
        sll0 sll0Var = wll0Var.f;
        sll0Var.c.c();
        sll0Var.d.a.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        sll0Var.a = jElapsedRealtime;
        sll0Var.b = jElapsedRealtime;
        k8l0Var.q().l();
        boolean z = !k8l0Var.f();
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        j6l0Var.f.b(this.a);
        k8l0 k8l0Var2 = j6l0Var.a;
        j6l0 j6l0Var2 = k8l0Var2.e;
        k8l0.k(j6l0Var2);
        if (!TextUtils.isEmpty(j6l0Var2.v.a())) {
            j6l0Var.v.b(null);
        }
        j6l0Var.p.b(0L);
        j6l0Var.q.b(0L);
        if (!k8l0Var2.d.t()) {
            j6l0Var.p(z);
        }
        j6l0Var.w.b(null);
        j6l0Var.x.b(0L);
        j6l0Var.y.b(null);
        ikl0 ikl0VarO = k8l0Var.o();
        ikl0VarO.g();
        ikl0VarO.h();
        zzr zzrVarW = ikl0VarO.w(false);
        ikl0VarO.s();
        ikl0VarO.a.n().k();
        ikl0VarO.u(new whl0(ikl0VarO, zzrVarW));
        k8l0.l(wll0Var);
        wll0Var.e.a();
        nfl0Var.s = z;
        k8l0Var.o().k(new AtomicReference());
    }
}
