package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pjc0 {
    public final imc0 a;
    public final List<tdc0> b;
    public final hcc0 c;
    public final BetBuilderConfig d;
    public final kdc0 e;

    public pjc0(imc0 imc0Var, List<tdc0> list, hcc0 hcc0Var, BetBuilderConfig betBuilderConfig, kdc0 kdc0Var) {
        list.getClass();
        this.a = imc0Var;
        this.b = list;
        this.c = hcc0Var;
        this.d = betBuilderConfig;
        this.e = kdc0Var;
    }

    public static pjc0 a(pjc0 pjc0Var, hcc0 hcc0Var, kdc0 kdc0Var, int i) {
        imc0 imc0Var = pjc0Var.a;
        List<tdc0> list = pjc0Var.b;
        if ((i & 4) != 0) {
            hcc0Var = pjc0Var.c;
        }
        hcc0 hcc0Var2 = hcc0Var;
        BetBuilderConfig betBuilderConfig = pjc0Var.d;
        if ((i & 16) != 0) {
            kdc0Var = pjc0Var.e;
        }
        list.getClass();
        return new pjc0(imc0Var, list, hcc0Var2, betBuilderConfig, kdc0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjc0)) {
            return false;
        }
        pjc0 pjc0Var = (pjc0) obj;
        return this.a.equals(pjc0Var.a) && Intrinsics.g(this.b, pjc0Var.b) && Intrinsics.g(this.c, pjc0Var.c) && Intrinsics.g(this.d, pjc0Var.d) && Intrinsics.g(this.e, pjc0Var.e);
    }

    public final int hashCode() {
        int iA = ai50.a(this.a.hashCode() * 31, 31, this.b);
        hcc0 hcc0Var = this.c;
        int iHashCode = (iA + (hcc0Var == null ? 0 : hcc0Var.hashCode())) * 31;
        BetBuilderConfig betBuilderConfig = this.d;
        int iHashCode2 = (iHashCode + (betBuilderConfig == null ? 0 : betBuilderConfig.hashCode())) * 31;
        kdc0 kdc0Var = this.e;
        return iHashCode2 + (kdc0Var != null ? kdc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SportyLegendsSessionData(sportConfig=" + this.a + ", marketCategories=" + this.b + ", legendsDetails=" + this.c + ", betBuilderConfig=" + this.d + ", leaguesAndTeams=" + this.e + ")";
    }
}
