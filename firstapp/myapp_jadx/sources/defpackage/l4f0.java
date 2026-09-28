package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l4f0 implements cbj<Void> {
    public final /* synthetic */ i36 a;
    public final /* synthetic */ m4f0 b;

    public l4f0(m4f0 m4f0Var, i36 i36Var) {
        this.b = m4f0Var;
        this.a = i36Var;
    }

    @Override // defpackage.cbj
    public final void onFailure(Throwable th) {
        i36 i36Var = this.a;
        if (i36Var.b.g) {
            return;
        }
        int iB = ((ue6) i36Var.a.get(0)).b();
        boolean z = th instanceof k8n;
        m4f0 m4f0Var = this.b;
        aan aanVar = m4f0Var.c;
        if (z) {
            il1 il1Var = new il1(iB, (k8n) th);
            aanVar.getClass();
            kpf0.a();
            aanVar.d.m.accept(il1Var);
        } else {
            il1 il1Var2 = new il1(iB, new k8n("Failed to submit capture request", th));
            aanVar.getClass();
            kpf0.a();
            aanVar.d.m.accept(il1Var2);
        }
        ((h8n.a) m4f0Var.b).a();
    }

    @Override // defpackage.cbj
    public final void onSuccess(Void r1) {
        ((h8n.a) this.b.b).a();
    }
}
