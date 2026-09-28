package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tfc0 {
    public final String a;
    public final yec0 b;
    public final nec0 c;

    public tfc0(String str, yec0 yec0Var, nec0 nec0Var) {
        str.getClass();
        this.a = str;
        this.b = yec0Var;
        this.c = nec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tfc0) {
            tfc0 tfc0Var = (tfc0) obj;
            if (Intrinsics.g(this.a, tfc0Var.a) && this.b == tfc0Var.b && this.c.equals(tfc0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SportyLegendsMarketState(marketType=" + this.a + ", headerState=" + this.b + ", contentState=" + this.c + ")";
    }
}
