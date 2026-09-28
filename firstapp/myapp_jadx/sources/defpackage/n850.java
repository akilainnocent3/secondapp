package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n850<T> implements goh<T> {
    public final int a;
    public final gzg0 b;
    public final l850 c;
    public final long d;

    public n850(int i, gzg0 gzg0Var, l850 l850Var, long j) {
        this.a = i;
        this.b = gzg0Var;
        this.c = l850Var;
        this.d = j;
    }

    @Override // defpackage.xi0
    public final pwh0 a(f0h0 f0h0Var) {
        return new axh0(this.a, this.b.a(f0h0Var), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n850) {
            n850 n850Var = (n850) obj;
            if (n850Var.a == this.a && n850Var.b.equals(this.b) && n850Var.c == this.c && n850Var.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }
}
