package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wxf0 implements fo50 {
    public final long b;
    public final fo50 c;

    public wxf0(long j, fo50 fo50Var) {
        km20.a("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = fo50Var;
    }

    @Override // defpackage.fo50
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fo50
    public final fo50.a b(e36 e36Var) {
        fo50.a aVarB = this.c.b(e36Var);
        long j = this.b;
        return (j <= 0 || e36Var.b < j - aVarB.a) ? aVarB : fo50.a.d;
    }
}
