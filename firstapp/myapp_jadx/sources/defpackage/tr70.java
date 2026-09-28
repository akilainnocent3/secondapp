package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tr70 implements olx {
    public final /* synthetic */ wr70 a;

    public tr70(wr70 wr70Var) {
        this.a = wr70Var;
    }

    @Override // defpackage.olx
    public final long a(long j) {
        wr70 wr70Var = this.a;
        return wr70Var.c(wr70Var.k, j, 1);
    }

    @Override // defpackage.olx
    public final long b(int i, long j) {
        wr70 wr70Var = this.a;
        wr70Var.j = i;
        sfz sfzVar = wr70Var.b;
        return (sfzVar == null || !(wr70Var.a.e() || wr70Var.a.d())) ? wr70Var.c(wr70Var.k, j, i) : sfzVar.c(j, wr70Var.j, wr70Var.m);
    }
}
