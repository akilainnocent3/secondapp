package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lsk0 implements ssk0 {
    public final g3l0 a;
    public final String b;

    public lsk0(g3l0 g3l0Var, String str) {
        this.a = g3l0Var;
        this.b = str;
    }

    @Override // defpackage.ssk0
    public final g3l0 a(ipk0 ipk0Var) {
        g3l0 g3l0VarC = this.a.c();
        String str = this.b;
        g3l0VarC.f(str, ipk0Var);
        g3l0VarC.d.put(str, Boolean.TRUE);
        return g3l0VarC;
    }
}
