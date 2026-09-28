package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gzg0<T> implements mgf<T> {
    public final int a;
    public final int b;
    public final tkf c;

    public gzg0(int i, tkf tkfVar, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? xkf.a : tkfVar);
    }

    @Override // defpackage.xi0
    public final pwh0 a(f0h0 f0h0Var) {
        return new dxh0(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gzg0) {
            gzg0 gzg0Var = (gzg0) obj;
            if (gzg0Var.a == this.a && gzg0Var.b == this.b && Intrinsics.g(gzg0Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.mgf, defpackage.xi0
    public final twh0 a(f0h0 f0h0Var) {
        return new dxh0(this.a, this.b, this.c);
    }

    public gzg0() {
        this(0, (tkf) null, 7);
    }

    public gzg0(int i, int i2, tkf tkfVar) {
        this.a = i;
        this.b = i2;
        this.c = tkfVar;
    }
}
