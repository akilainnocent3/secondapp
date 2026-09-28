package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class l7k implements k7k {
    public final byz a;
    public final mgb0 b;

    public l7k(byz byzVar, mgb0 mgb0Var) {
        byzVar.getClass();
        mgb0Var.getClass();
        this.a = byzVar;
        this.b = mgb0Var;
    }

    @Override // defpackage.k7k
    public final Object a(em80 em80Var) {
        return this.b.isLogin() ? this.a.d(em80Var) : Boolean.FALSE;
    }
}
