package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uqk0 implements Runnable {
    public final /* synthetic */ zal0 a;
    public final /* synthetic */ yqk0 b;

    public uqk0(yqk0 yqk0Var, zal0 zal0Var) {
        this.a = zal0Var;
        this.b = yqk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zal0 zal0Var = this.a;
        zal0Var.c();
        if (l9c.c()) {
            zal0Var.b().p(this);
            return;
        }
        yqk0 yqk0Var = this.b;
        boolean z = yqk0Var.c != 0;
        yqk0Var.c = 0L;
        if (z) {
            yqk0Var.a();
        }
    }
}
