package defpackage;

import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class s7d0 implements pdd0 {
    public final String a;
    public final String b;

    public s7d0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("league_name", this.a), new Pair("market_id", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7d0)) {
            return false;
        }
        s7d0 s7d0Var = (s7d0) obj;
        return this.a.equals(s7d0Var.a) && this.b.equals(s7d0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "sportypicks__outcome__add_to_betslip";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("OutcomeAddToBetslipEvent(leagueName=", this.a, ", marketId=", this.b, lTGEJfVytU.SOddn);
    }
}
