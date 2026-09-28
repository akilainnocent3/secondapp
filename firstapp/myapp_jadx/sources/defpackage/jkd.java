package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jkd implements Runnable {
    public final /* synthetic */ kkd a;

    @Override // java.lang.Runnable
    public final void run() {
        kkd kkdVar = this.a;
        if (kkdVar.i != 0) {
            jgt.e().a(kkd.D, "Already started work for " + kkdVar.c);
            return;
        }
        kkdVar.i = 1;
        jgt.e().a(kkd.D, "onAllConstraintsMet for " + kkdVar.c);
        if (!kkdVar.d.d.g(kkdVar.A, null)) {
            kkdVar.b();
            return;
        }
        pxj0 pxj0Var = kkdVar.d.c;
        ivj0 ivj0Var = kkdVar.c;
        synchronized (pxj0Var.d) {
            jgt.e().a(pxj0.e, "Starting timer for " + ivj0Var);
            pxj0Var.a(ivj0Var);
            pxj0.b bVar = new pxj0.b(pxj0Var, ivj0Var);
            pxj0Var.b.put(ivj0Var, bVar);
            pxj0Var.c.put(ivj0Var, kkdVar);
            pxj0Var.a.b(600000L, bVar);
        }
    }
}
