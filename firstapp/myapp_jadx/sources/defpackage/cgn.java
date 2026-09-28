package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cgn<T> implements xi0<T> {
    public final mgf<T> a;
    public final l850 b;
    public final long c;

    public cgn(mgf<T> mgfVar, l850 l850Var, long j) {
        this.a = mgfVar;
        this.b = l850Var;
        this.c = j;
    }

    @Override // defpackage.xi0
    public final <V extends mj0> pwh0<V> a(f0h0<T, V> f0h0Var) {
        return new xwh0(this.a.a((f0h0) f0h0Var), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cgn) {
            cgn cgnVar = (cgn) obj;
            if (cgnVar.a.equals(this.a) && cgnVar.b == this.b && cgnVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
