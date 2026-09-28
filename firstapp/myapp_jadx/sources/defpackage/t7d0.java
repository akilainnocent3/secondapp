package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class t7d0 implements pdd0 {
    public final boolean a;

    public t7d0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("expand", this.a ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7d0) && this.a == ((t7d0) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "sportypicks__outcome_list__click";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("OutcomeListClickEvent(expanded=", ")", this.a);
    }
}
