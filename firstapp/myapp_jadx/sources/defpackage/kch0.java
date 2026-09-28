package defpackage;

import com.appsflyer.internal.b0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class kch0 implements pdd0 {
    public final long a;
    public final String b;
    public final String c;

    public kch0(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("stall_duration_ms", Long.valueOf(this.a)), new Pair("interaction_type", AnalyticsParam.STORY_SKIP_REASON_TAP), new Pair("activity", this.b), new Pair("view_id", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kch0)) {
            return false;
        }
        kch0 kch0Var = (kch0) obj;
        return this.a == kch0Var.a && this.b.equals(kch0Var.b) && this.c.equals(kch0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "android_ui_stall";
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return pr0.a(b0.a(this.a, "UiInteractionStallEvent(stallDurationMs=", ", activity=", this.b), ", viewId=", this.c, ")");
    }
}
