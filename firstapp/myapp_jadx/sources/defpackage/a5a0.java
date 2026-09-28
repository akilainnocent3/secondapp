package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a5a0<T> implements mgf<T> {
    public final int a;

    public a5a0(int i) {
        this.a = i;
    }

    @Override // defpackage.xi0
    public final <V extends mj0> twh0<V> a(f0h0<T, V> f0h0Var) {
        return new bxh0(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a5a0) && ((a5a0) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }
}
