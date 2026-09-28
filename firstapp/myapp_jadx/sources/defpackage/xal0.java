package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xal0 extends val0 {
    public boolean b;

    public xal0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.a.A++;
    }

    public abstract boolean h();

    public final void i() {
        if (this.b) {
            return;
        }
        ib5.a("Not initialized");
    }

    public final void j() {
        if (this.b) {
            ib5.a("Can't initialize twice");
        } else {
            if (h()) {
                return;
            }
            this.a.C.incrementAndGet();
            this.b = true;
        }
    }
}
