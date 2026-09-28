package defpackage;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ubd0 implements pdd0 {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final String e = AnalyticsEvent.STORY_CTA_BTN_CLICK;

    public ubd0(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.STORY_ID, this.a), new Pair(AnalyticsParam.STORY_ELAPSED_TIME, Long.valueOf(this.b)), new Pair(AnalyticsParam.STORY_PAUSE_DURATION, Long.valueOf(this.c)), new Pair(AnalyticsParam.STORY_CTA_TARGET, this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubd0)) {
            return false;
        }
        ubd0 ubd0Var = (ubd0) obj;
        return this.a.equals(ubd0Var.a) && this.b == ubd0Var.b && this.c == ubd0Var.c && this.d.equals(ubd0Var.d) && this.e.equals(ubd0Var.e);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + gmf0.a(f87.a(f87.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = x.a(this.b, "StoryActionCLick(storyId=", this.a, ", elapsedTime=");
        g41.a(this.c, ", pauseDuration=", ", action=", sbA);
        return kwi.a(sbA, this.d, ", name=", this.e, ")");
    }
}
