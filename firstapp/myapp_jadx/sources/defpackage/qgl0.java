package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class qgl0 implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ khl0 b;

    public qgl0(khl0 khl0Var, long j) {
        this.a = j;
        Objects.requireNonNull(khl0Var);
        this.b = khl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        khl0 khl0Var = this.b;
        hwk0 hwk0Var = khl0Var.a.n;
        k8l0.j(hwk0Var);
        hwk0Var.j(this.a);
        khl0Var.e = null;
    }
}
