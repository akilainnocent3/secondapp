package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class cwd0<T> implements xi0<T> {
    public final xi0<T> a;
    public final long b;

    public cwd0(goh gohVar, long j) {
        this.a = gohVar;
        this.b = j;
    }

    @Override // defpackage.xi0
    public final <V extends mj0> pwh0<V> a(f0h0<T, V> f0h0Var) {
        return new dwd0(this.a.a(f0h0Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cwd0)) {
            return false;
        }
        cwd0 cwd0Var = (cwd0) obj;
        return cwd0Var.b == this.b && Intrinsics.g(cwd0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
