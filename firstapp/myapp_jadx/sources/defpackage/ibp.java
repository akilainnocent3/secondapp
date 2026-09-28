package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ibp implements pdd0 {
    public final String a = "event_page__joker_toggle__is_visible";
    public final boolean b;

    public ibp(boolean z) {
        this.b = z;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("toggle_status", this.b ? AnalyticsParam.EVENT_STATUS_ON : AnalyticsParam.EVENT_STATUS_OFF));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibp)) {
            return false;
        }
        ibp ibpVar = (ibp) obj;
        return this.a.equals(ibpVar.a) && this.b == ibpVar.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tzx.a("JokerToggleView(name=", this.a, ", toggled=", ")", this.b);
    }
}
