package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class fcl0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nfl0 b;

    public fcl0(nfl0 nfl0Var, boolean z) {
        this.a = z;
        Objects.requireNonNull(nfl0Var);
        this.b = nfl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    @Override // java.lang.Runnable
    public final void run() {
        nfl0 nfl0Var = this.b;
        k8l0 k8l0Var = nfl0Var.a;
        boolean zF = k8l0Var.f();
        boolean z = false;
        boolean z2 = k8l0Var.y != null && k8l0Var.y.booleanValue();
        boolean z3 = this.a;
        k8l0Var.y = Boolean.valueOf(z3);
        if (z2 == z3) {
            y4l0 y4l0Var = k8l0Var.f;
            k8l0.m(y4l0Var);
            y4l0Var.n.b(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (k8l0Var.f() != zF) {
            boolean zF2 = k8l0Var.f();
            if (k8l0Var.y != null && k8l0Var.y.booleanValue()) {
                z = true;
            }
            if (zF2 != z) {
                y4l0 y4l0Var2 = k8l0Var.f;
                k8l0.m(y4l0Var2);
                y4l0Var2.k.c(Boolean.valueOf(z3), "Default data collection is different than actual status", Boolean.valueOf(zF));
            }
        } else {
            y4l0 y4l0Var3 = k8l0Var.f;
            k8l0.m(y4l0Var3);
            y4l0Var3.k.c(Boolean.valueOf(z3), "Default data collection is different than actual status", Boolean.valueOf(zF));
        }
        nfl0Var.y();
    }
}
