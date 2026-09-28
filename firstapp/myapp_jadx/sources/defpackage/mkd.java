package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mkd implements Runnable {
    public final /* synthetic */ owj0 a;
    public final /* synthetic */ nkd b;

    public mkd(nkd nkdVar, owj0 owj0Var) {
        this.b = nkdVar;
        this.a = owj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jgt jgtVarE = jgt.e();
        String str = nkd.d;
        StringBuilder sb = new StringBuilder("Scheduling work ");
        owj0 owj0Var = this.a;
        sb.append(owj0Var.a);
        jgtVarE.a(str, sb.toString());
        this.b.a.c(owj0Var);
    }
}
