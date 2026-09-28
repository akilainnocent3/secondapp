package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w0h0 {
    public final aqg0 a;
    public final boolean b;

    public w0h0(aqg0 aqg0Var, boolean z) {
        aqg0Var.getClass();
        this.a = aqg0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0h0)) {
            return false;
        }
        w0h0 w0h0Var = (w0h0) obj;
        return Intrinsics.g(this.a, w0h0Var.a) && this.b == w0h0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TxCategoryState(txCategory=" + this.a + ", isDefault=" + this.b + ")";
    }
}
