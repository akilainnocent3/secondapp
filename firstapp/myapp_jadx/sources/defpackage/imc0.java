package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.OddsFilterData;
import com.sportybet.android.instantwin.newtork.model.response.SportsAnimationMode;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class imc0 {
    public final boolean a;
    public final String b;
    public final vac0 c;
    public final long d;
    public final boolean e;
    public final OddsFilterData f;
    public final List<tdc0> g;
    public final boolean h;
    public final SportsAnimationMode i;

    static {
        int i = OddsFilterData.$stable;
    }

    public imc0(boolean z, String str, vac0 vac0Var, long j, boolean z2, OddsFilterData oddsFilterData, List<tdc0> list, boolean z3, SportsAnimationMode sportsAnimationMode) {
        list.getClass();
        this.a = z;
        this.b = str;
        this.c = vac0Var;
        this.d = j;
        this.e = z2;
        this.f = oddsFilterData;
        this.g = list;
        this.h = z3;
        this.i = sportsAnimationMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imc0)) {
            return false;
        }
        imc0 imc0Var = (imc0) obj;
        return this.a == imc0Var.a && this.b.equals(imc0Var.b) && this.c.equals(imc0Var.c) && this.d == imc0Var.d && this.e == imc0Var.e && Intrinsics.g(this.f, imc0Var.f) && Intrinsics.g(this.g, imc0Var.g) && this.h == imc0Var.h && this.i == imc0Var.i;
    }

    public final int hashCode() {
        int iA = mtg0.a(f87.a((this.c.hashCode() + gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, this.d, 31), 31, this.e);
        OddsFilterData oddsFilterData = this.f;
        int iA2 = mtg0.a(ai50.a((iA + (oddsFilterData == null ? 0 : oddsFilterData.hashCode())) * 31, 31, this.g), 31, this.h);
        SportsAnimationMode sportsAnimationMode = this.i;
        return iA2 + (sportsAnimationMode != null ? sportsAnimationMode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("SportyLegendsSportConfig(active=", ", sportId=", this.b, ", betLimitInfo=", this.a);
        sbA.append(this.c);
        sbA.append(", keepBetLimit=");
        sbA.append(this.d);
        sbA.append(", giftEnabled=");
        sbA.append(this.e);
        sbA.append(", oddsFilter=");
        sbA.append(this.f);
        sbA.append(", marketCategories=");
        sbA.append(this.g);
        sbA.append(", statsEnable=");
        sbA.append(this.h);
        sbA.append(", animationMode=");
        sbA.append(this.i);
        sbA.append(")");
        return sbA.toString();
    }
}
