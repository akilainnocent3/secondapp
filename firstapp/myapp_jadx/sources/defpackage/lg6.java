package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lg6 {
    public final y5y a;
    public final w5y b;

    public lg6(y5y y5yVar, w5y w5yVar) {
        y5yVar.getClass();
        this.a = y5yVar;
        this.b = w5yVar;
    }

    public static lg6 a(lg6 lg6Var, w5y w5yVar) {
        y5y y5yVar = lg6Var.a;
        lg6Var.getClass();
        y5yVar.getClass();
        return new lg6(y5yVar, w5yVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lg6)) {
            return false;
        }
        lg6 lg6Var = (lg6) obj;
        return Intrinsics.g(this.a, lg6Var.a) && this.b == lg6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardItemState(number=" + this.a + ", state=" + this.b + ')';
    }
}
