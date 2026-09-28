package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class pve0 {
    public final gre0 a;
    public final tre0 b;

    public pve0(gre0 gre0Var) {
        tre0 tre0Var = tre0.a;
        gre0Var.getClass();
        this.a = gre0Var;
        this.b = tre0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pve0)) {
            return false;
        }
        pve0 pve0Var = (pve0) obj;
        return Intrinsics.g(this.a, pve0Var.a) && this.b == pve0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TGEndCondition(animation=" + this.a + ", endType=" + this.b + ')';
    }
}
