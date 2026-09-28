package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ww70 implements pdd0 {
    public final String a;
    public final boolean b;
    public final String c;

    public ww70(String str, boolean z, String str2) {
        str2.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        brg brgVar = brg.FEATURED_MATCH;
        return kpu.d(new Pair("source", AnalyticsParam.SEARCH_KEYWORD), new Pair("contain_flash_boost", this.b ? "yes" : "no"), new Pair(AnalyticsParam.EVENT_PARAM_JOINTED_ID, this.a), new Pair("search_id", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww70)) {
            return false;
        }
        ww70 ww70Var = (ww70) obj;
        return this.a.equals(ww70Var.a) && this.b == ww70Var.b && Intrinsics.g(this.c, ww70Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "add_outcome_betslip__click";
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(z620.a("SearchOutcomeAddToBetslipClick(jointedId=", this.a, ", hasFlashBoost=", ", searchId=", this.b), this.c, ")");
    }
}
