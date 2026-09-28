package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class arl0 extends jjl0 {
    public final /* synthetic */ vtl0 b;

    public arl0(vtl0 vtl0Var) {
        this.b = vtl0Var;
    }

    @Override // defpackage.jjl0
    public final void a() {
        synchronized (this.b.f) {
            try {
                if (this.b.k.get() > 0 && this.b.k.decrementAndGet() > 0) {
                    this.b.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                vtl0 vtl0Var = this.b;
                if (vtl0Var.m != null) {
                    vtl0Var.b.a("Unbind from service.", new Object[0]);
                    vtl0 vtl0Var2 = this.b;
                    vtl0Var2.a.unbindService(vtl0Var2.l);
                    vtl0Var = this.b;
                    vtl0Var.g = false;
                    vtl0Var.m = null;
                    vtl0Var.l = null;
                }
                vtl0Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
