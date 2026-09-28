package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dmc0 implements dt90 {
    public final kjc0 a;
    public final String b;

    public dmc0(kjc0 kjc0Var, String str) {
        kjc0Var.getClass();
        str.getClass();
        this.a = kjc0Var;
        this.b = str;
    }

    public static dmc0 c(dmc0 dmc0Var, String str) {
        kjc0 kjc0Var = dmc0Var.a;
        dmc0Var.getClass();
        kjc0Var.getClass();
        str.getClass();
        return new dmc0(kjc0Var, str);
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
        if (!(obj instanceof dmc0)) {
            return false;
        }
        dmc0 dmc0Var = (dmc0) obj;
        return Intrinsics.g(this.a, dmc0Var.a) && Intrinsics.g(this.b, dmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyLegendsSingleBet(selection=" + this.a + ", stakeString=" + this.b + ")";
    }
}
