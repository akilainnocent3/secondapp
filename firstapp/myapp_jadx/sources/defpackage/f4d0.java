package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f4d0 implements dt90 {
    public final e1d0 a;
    public final String b;

    public f4d0(e1d0 e1d0Var, String str) {
        e1d0Var.getClass();
        str.getClass();
        this.a = e1d0Var;
        this.b = str;
    }

    public static f4d0 c(f4d0 f4d0Var, String str) {
        e1d0 e1d0Var = f4d0Var.a;
        f4d0Var.getClass();
        e1d0Var.getClass();
        str.getClass();
        return new f4d0(e1d0Var, str);
    }

    @Override // defpackage.dt90
    public final BigDecimal a() {
        return this.a.c.b;
    }

    @Override // defpackage.dt90
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4d0)) {
            return false;
        }
        f4d0 f4d0Var = (f4d0) obj;
        return Intrinsics.g(this.a, f4d0Var.a) && Intrinsics.g(this.b, f4d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyPenaltySingleBet(selection=" + this.a + ", stakeString=" + this.b + ")";
    }
}
