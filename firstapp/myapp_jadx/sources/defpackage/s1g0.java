package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s1g0 {
    public final krf0 a;
    public final r720 b;

    public s1g0(krf0 krf0Var, r720 r720Var) {
        krf0Var.getClass();
        this.a = krf0Var;
        this.b = r720Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1g0)) {
            return false;
        }
        s1g0 s1g0Var = (s1g0) obj;
        return this.a == s1g0Var.a && Intrinsics.g(this.b, s1g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopInfo(tier=" + this.a + ", potentialReward=" + this.b + ")";
    }

    public s1g0() {
        this(0);
    }

    public /* synthetic */ s1g0(int i) {
        this(krf0.TIER_0, r720.a.a);
    }
}
