package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class qpc0 implements pdd0 {
    public final String a = "legends__stats__view";
    public final String b;

    public qpc0(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.EVENT_STATUS, this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpc0)) {
            return false;
        }
        qpc0 qpc0Var = (qpc0) obj;
        return this.a.equals(qpc0Var.a) && this.b.equals(qpc0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("StatsViewTrackingEvent(name=", this.a, ", status=", this.b, ")");
    }
}
