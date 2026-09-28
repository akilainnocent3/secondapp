package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class wg implements pdd0 {
    public final long a;

    public wg(long j) {
        this.a = j;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.KEY_BI_DURATION, Long.valueOf(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wg) && this.a == ((wg) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "add_email_prompt__email_verified";
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d020.a(this.a, "EmailVerified(durationMillis=", ")");
    }
}
