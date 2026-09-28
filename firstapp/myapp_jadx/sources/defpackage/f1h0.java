package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f1h0 {
    public final q8h0 a;
    public final String b;

    public f1h0(q8h0 q8h0Var, String str) {
        q8h0Var.getClass();
        str.getClass();
        this.a = q8h0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1h0)) {
            return false;
        }
        f1h0 f1h0Var = (f1h0) obj;
        return Intrinsics.g(this.a, f1h0Var.a) && Intrinsics.g(this.b, f1h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TxDetailNavInfo(txType=" + this.a + ", navTicketId=" + this.b + ")";
    }

    public f1h0() {
        this(0);
    }

    public /* synthetic */ f1h0(int i) {
        this(q8h0.a.a, "");
    }
}
