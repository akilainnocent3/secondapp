package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jlf0 {
    public final ora0 a;
    public final ora0 b;
    public final ora0 c;
    public final ora0 d;

    public jlf0(ora0 ora0Var, ora0 ora0Var2, ora0 ora0Var3, ora0 ora0Var4) {
        this.a = ora0Var;
        this.b = ora0Var2;
        this.c = ora0Var3;
        this.d = ora0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jlf0)) {
            return false;
        }
        jlf0 jlf0Var = (jlf0) obj;
        return Intrinsics.g(this.a, jlf0Var.a) && Intrinsics.g(this.b, jlf0Var.b) && Intrinsics.g(this.c, jlf0Var.c) && Intrinsics.g(this.d, jlf0Var.d);
    }

    public final int hashCode() {
        ora0 ora0Var = this.a;
        int iHashCode = (ora0Var != null ? ora0Var.hashCode() : 0) * 31;
        ora0 ora0Var2 = this.b;
        int iHashCode2 = (iHashCode + (ora0Var2 != null ? ora0Var2.hashCode() : 0)) * 31;
        ora0 ora0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (ora0Var3 != null ? ora0Var3.hashCode() : 0)) * 31;
        ora0 ora0Var4 = this.d;
        return iHashCode3 + (ora0Var4 != null ? ora0Var4.hashCode() : 0);
    }

    public /* synthetic */ jlf0(ora0 ora0Var, int i) {
        this((i & 1) != 0 ? null : ora0Var, null, null, null);
    }

    public jlf0() {
        this(null, 15);
    }
}
