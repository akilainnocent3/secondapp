package defpackage;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class xbd0 implements pdd0 {
    public final String a;
    public final long b;
    public final long c;
    public final String d = AnalyticsEvent.STORY_SKIP;

    public xbd0(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("reason", this.a), new Pair(AnalyticsParam.STORY_ELAPSED_TIME, Long.valueOf(this.b)), new Pair(AnalyticsParam.STORY_PAUSE_DURATION, Long.valueOf(this.c)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbd0)) {
            return false;
        }
        xbd0 xbd0Var = (xbd0) obj;
        return this.a.equals(xbd0Var.a) && this.b == xbd0Var.b && this.c == xbd0Var.c && this.d.equals(xbd0Var.d);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + f87.a(f87.a(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "StorySkip(reason=", this.a, ", elapsedTime=");
        g41.a(this.c, ", pauseDuration=", ", name=", sbA);
        return uf80.a(sbA, this.d, ")");
    }
}
