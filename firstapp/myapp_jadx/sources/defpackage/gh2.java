package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gh2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public gh2(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh2)) {
            return false;
        }
        gh2 gh2Var = (gh2) obj;
        return Intrinsics.g(this.a, gh2Var.a) && this.b.equals(gh2Var.b) && this.c.equals(gh2Var.c) && this.d.equals(gh2Var.d) && Intrinsics.g(this.e, gh2Var.e) && this.f == gh2Var.f && this.g == gh2Var.g && this.h == gh2Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("BetBuilderMarketOutcomeState(marketId=", this.a, ", outcomeId=", this.b, ACKxwYRsuWyGz.xBftr);
        hxa.c(sbA, this.c, ", description=", this.d, ", odds=");
        uts.b(this.e, ", isEnabled=", ", isSelected=", sbA, this.f);
        return lng.a(", isDisabledByMutex=", ")", sbA, this.g, this.h);
    }
}
