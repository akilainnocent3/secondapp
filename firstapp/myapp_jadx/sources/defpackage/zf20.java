package defpackage;

import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zf20 {
    public RegularMarketRule a;
    public final jpc b;

    public zf20(RegularMarketRule regularMarketRule, jpc jpcVar) {
        regularMarketRule.getClass();
        this.a = regularMarketRule;
        this.b = jpcVar;
    }

    public static zf20 a(zf20 zf20Var) {
        RegularMarketRule regularMarketRule = zf20Var.a;
        jpc jpcVar = zf20Var.b;
        zf20Var.getClass();
        regularMarketRule.getClass();
        return new zf20(regularMarketRule, jpcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf20)) {
            return false;
        }
        zf20 zf20Var = (zf20) obj;
        return Intrinsics.g(this.a, zf20Var.a) && this.b.equals(zf20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreMatchItem(marketRule=" + this.a + ", dataItem=" + this.b + ")";
    }
}
