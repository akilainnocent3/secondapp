package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ni5 {
    public static final int l = cf5.d | BetBuilderInRound.$stable;
    public final zs a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;
    public final jh10 f;
    public final BetBuilderInRound g;
    public final cf5 h;
    public final boolean i;
    public final boolean j;
    public final int k;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ni5(int i, String str, String str2, boolean z) {
        zs.a aVar = zs.a.a;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        bigDecimal.getClass();
        this(aVar, bigDecimal, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z, jh10.c.a, null, null, false, false, -1);
    }

    public static ni5 a(ni5 ni5Var, zs zsVar, BigDecimal bigDecimal, String str, String str2, boolean z, jh10 jh10Var, BetBuilderInRound betBuilderInRound, cf5 cf5Var, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            zsVar = ni5Var.a;
        }
        zs zsVar2 = zsVar;
        if ((i2 & 2) != 0) {
            bigDecimal = ni5Var.b;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i2 & 4) != 0) {
            str = ni5Var.c;
        }
        String str3 = str;
        String str4 = (i2 & 8) != 0 ? ni5Var.d : str2;
        boolean z4 = (i2 & 16) != 0 ? ni5Var.e : z;
        jh10 jh10Var2 = (i2 & 32) != 0 ? ni5Var.f : jh10Var;
        BetBuilderInRound betBuilderInRound2 = (i2 & 64) != 0 ? ni5Var.g : betBuilderInRound;
        cf5 cf5Var2 = (i2 & 128) != 0 ? ni5Var.h : cf5Var;
        boolean z5 = (i2 & 256) != 0 ? ni5Var.i : z2;
        boolean z6 = (i2 & 512) != 0 ? ni5Var.j : z3;
        int i3 = (i2 & 1024) != 0 ? ni5Var.k : i;
        ni5Var.getClass();
        zsVar2.getClass();
        bigDecimal2.getClass();
        str3.getClass();
        str4.getClass();
        jh10Var2.getClass();
        return new ni5(zsVar2, bigDecimal2, str3, str4, z4, jh10Var2, betBuilderInRound2, cf5Var2, z5, z6, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni5)) {
            return false;
        }
        ni5 ni5Var = (ni5) obj;
        return Intrinsics.g(this.a, ni5Var.a) && Intrinsics.g(this.b, ni5Var.b) && Intrinsics.g(this.c, ni5Var.c) && Intrinsics.g(this.d, ni5Var.d) && this.e == ni5Var.e && Intrinsics.g(this.f, ni5Var.f) && Intrinsics.g(this.g, ni5Var.g) && Intrinsics.g(this.h, ni5Var.h) && this.i == ni5Var.i && this.j == ni5Var.j && this.k == ni5Var.k;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + mtg0.a(gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e)) * 31;
        BetBuilderInRound betBuilderInRound = this.g;
        int iHashCode2 = (iHashCode + (betBuilderInRound == null ? 0 : betBuilderInRound.hashCode())) * 31;
        cf5 cf5Var = this.h;
        return Integer.hashCode(this.k) + mtg0.a(mtg0.a((iHashCode2 + (cf5Var != null ? cf5Var.hashCode() : 0)) * 31, 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildAndGoUiState(alertDialogState=");
        sb.append(this.a);
        sb.append(", balanceAmount=");
        sb.append(this.b);
        sb.append(", currency=");
        hxa.c(sb, this.c, ", defaultStake=", this.d, ", isLogin=");
        sb.append(this.e);
        sb.append(", placeBetState=");
        sb.append(this.f);
        sb.append(", selectedCombo=");
        sb.append(this.g);
        sb.append(", selectedItem=");
        sb.append(this.h);
        sb.append(", showHowToPlay=");
        nng.a(", showTooltip=", ", tooltipStep=", sb, this.i, this.j);
        return zk1.a(this.k, ")", sb);
    }

    public ni5(zs zsVar, BigDecimal bigDecimal, String str, String str2, boolean z, jh10 jh10Var, BetBuilderInRound betBuilderInRound, cf5 cf5Var, boolean z2, boolean z3, int i) {
        zsVar.getClass();
        bigDecimal.getClass();
        str.getClass();
        str2.getClass();
        jh10Var.getClass();
        this.a = zsVar;
        this.b = bigDecimal;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = jh10Var;
        this.g = betBuilderInRound;
        this.h = cf5Var;
        this.i = z2;
        this.j = z3;
        this.k = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ni5() {
        String str = null;
        this(2047, str, str, false);
    }
}
