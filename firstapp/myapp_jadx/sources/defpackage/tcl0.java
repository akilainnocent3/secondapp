package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class tcl0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ nfl0 b;

    public tcl0(nfl0 nfl0Var, long j) {
        this.a = j;
        Objects.requireNonNull(nfl0Var);
        this.b = nfl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k8l0 k8l0Var = this.b.a;
        j6l0 j6l0Var = k8l0Var.e;
        k8l0.k(j6l0Var);
        d6l0 d6l0Var = j6l0Var.k;
        long j = this.a;
        d6l0Var.b(j);
        y4l0 y4l0Var = k8l0Var.f;
        k8l0.m(y4l0Var);
        y4l0Var.m.b(Long.valueOf(j), "Session timeout duration set");
    }
}
