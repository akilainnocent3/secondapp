package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tt40 {
    public final String a;
    public final vt40 b;

    public tt40(String str, vt40 vt40Var) {
        str.getClass();
        vt40Var.getClass();
        this.a = str;
        this.b = vt40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt40)) {
            return false;
        }
        tt40 tt40Var = (tt40) obj;
        return Intrinsics.g(this.a, tt40Var.a) && this.b == tt40Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RegisterBvnWithWithdrawTradeParam(tradeId=" + this.a + ", type=" + this.b + ")";
    }
}
