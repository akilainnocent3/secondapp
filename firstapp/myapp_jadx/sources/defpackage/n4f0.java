package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n4f0 implements Runnable {
    public final /* synthetic */ s4f0 a;
    public final /* synthetic */ k8n b;

    public /* synthetic */ n4f0(s4f0 s4f0Var, k8n k8nVar) {
        this.a = s4f0Var;
        this.b = k8nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s4f0 s4f0Var = this.a;
        s4f0Var.d();
        if (!(s4f0Var.f() != null)) {
            ib5.a("One and only one callback is allowed.");
            return;
        }
        h8n.f fVarF = s4f0Var.f();
        Objects.requireNonNull(fVarF);
        fVarF.a(this.b);
    }
}
