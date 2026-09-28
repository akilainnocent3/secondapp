package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class nt3 implements pdd0 {
    public final String a = "betslip__remove_selection__click";
    public final String b;

    public nt3(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.EVENT_PARAM_JOINTED_ID, this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt3)) {
            return false;
        }
        nt3 nt3Var = (nt3) obj;
        return this.a.equals(nt3Var.a) && this.b.equals(nt3Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("BetslipRemoveSelectionEvent(name=", this.a, ", jointedId=", this.b, ")");
    }
}
