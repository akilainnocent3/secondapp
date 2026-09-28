package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxd0 implements nxd0 {
    public final u11 a = new u11(0);

    public final boolean M(int i) {
        return (this.a.get() & i) != 0;
    }

    public final void N(int i) {
        u11 u11Var;
        int i2;
        do {
            u11Var = this.a;
            i2 = u11Var.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!u11Var.compareAndSet(i2, i2 | i));
    }
}
