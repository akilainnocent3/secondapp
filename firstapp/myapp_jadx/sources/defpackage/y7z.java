package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class y7z implements pdd0 {
    public final String a = "add_outcome_betslip__click";
    public final brg b;
    public final String c;
    public final boolean d;

    public y7z(brg brgVar, String str, boolean z) {
        this.b = brgVar;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", this.b.a), new Pair(AnalyticsParam.EVENT_PARAM_JOINTED_ID, this.c), new Pair("contain_flash_boost", this.d ? "yes" : "no"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7z)) {
            return false;
        }
        y7z y7zVar = (y7z) obj;
        return this.a.equals(y7zVar.a) && this.b == y7zVar.b && this.c.equals(y7zVar.c) && this.d == y7zVar.d;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutcomeAddToBetslipEvent(name=");
        sb.append(this.a);
        sb.append(", sourceScreen=");
        sb.append(this.b);
        sb.append(", jointedId=");
        return x9d.a(this.c, ", hasFlashBoost=", ")", sb, this.d);
    }
}
