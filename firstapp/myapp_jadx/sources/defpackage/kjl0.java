package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kjl0 extends dal0 {
    public final /* synthetic */ esl0 b;

    public kjl0(esl0 esl0Var) {
        this.b = esl0Var;
    }

    @Override // defpackage.dal0
    public final void a() {
        synchronized (this.b.f) {
            try {
                if (this.b.k.get() > 0 && this.b.k.decrementAndGet() > 0) {
                    this.b.b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                    return;
                }
                esl0 esl0Var = this.b;
                if (esl0Var.m != null) {
                    esl0Var.b.a("Unbind from service.", new Object[0]);
                    esl0 esl0Var2 = this.b;
                    esl0Var2.a.unbindService(esl0Var2.l);
                    esl0Var = this.b;
                    esl0Var.g = false;
                    esl0Var.m = null;
                    esl0Var.l = null;
                }
                esl0Var.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
