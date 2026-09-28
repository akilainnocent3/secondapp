package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class sll0 {
    public long a;
    public long b;
    public final kll0 c;
    public final /* synthetic */ wll0 d;

    public sll0(wll0 wll0Var) {
        this.d = wll0Var;
        k8l0 k8l0Var = wll0Var.a;
        this.c = new kll0(this, k8l0Var);
        k8l0Var.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.a = jElapsedRealtime;
        this.b = jElapsedRealtime;
    }

    public final boolean a(long j, boolean z, boolean z2) {
        wll0 wll0Var = this.d;
        wll0Var.g();
        wll0Var.h();
        k8l0 k8l0Var = wll0Var.a;
        boolean zF = k8l0Var.f();
        y4l0 y4l0Var = k8l0Var.f;
        if (zF) {
            j6l0 j6l0Var = k8l0Var.e;
            k8l0.k(j6l0Var);
            d6l0 d6l0Var = j6l0Var.p;
            k8l0Var.k.getClass();
            d6l0Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.a;
        if (!z && j2 < 1000) {
            k8l0.m(y4l0Var);
            y4l0Var.n.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        k8l0.m(y4l0Var);
        y4l0Var.n.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !k8l0Var.d.u();
        khl0 khl0Var = k8l0Var.l;
        k8l0.l(khl0Var);
        yol0.Y(khl0Var.m(z3), bundle, true);
        if (!z2) {
            nfl0 nfl0Var = k8l0Var.m;
            k8l0.l(nfl0Var);
            nfl0Var.n(StompClient.DEFAULT_ACK, "_e", bundle);
        }
        this.a = j;
        kll0 kll0Var = this.c;
        kll0Var.c();
        kll0Var.b(((Long) v2l0.q0.a(null)).longValue());
        return true;
    }
}
