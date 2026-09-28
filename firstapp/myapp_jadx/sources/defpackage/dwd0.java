package defpackage;

import defpackage.mj0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dwd0<V extends mj0> implements pwh0<V> {
    public final pwh0<V> a;
    public final long b;

    public dwd0(pwh0<V> pwh0Var, long j) {
        this.a = pwh0Var;
        this.b = j;
    }

    @Override // defpackage.pwh0
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.pwh0
    public final long c(V v, V v2, V v3) {
        return this.a.c(v, v2, v3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dwd0)) {
            return false;
        }
        dwd0 dwd0Var = (dwd0) obj;
        return dwd0Var.b == this.b && Intrinsics.g(dwd0Var.a, this.a);
    }

    @Override // defpackage.pwh0
    public final V f(long j, V v, V v2, V v3) {
        long j2 = this.b;
        return j < j2 ? v3 : (V) this.a.f(j - j2, v, v2, v3);
    }

    @Override // defpackage.pwh0
    public final V g(long j, V v, V v2, V v3) {
        long j2 = this.b;
        return j < j2 ? v : (V) this.a.g(j - j2, v, v2, v3);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
