package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j3l0 extends m1l0 {
    public boolean b;

    public j3l0(k8l0 k8l0Var) {
        super(k8l0Var);
        this.a.A++;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        ib5.a("Not initialized");
    }

    public final void i() {
        if (this.b) {
            ib5.a("Can't initialize twice");
        } else {
            if (j()) {
                return;
            }
            this.a.C.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean j();
}
