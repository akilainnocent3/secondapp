package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class ybd0 implements pdd0 {
    public final String a;
    public final int b;
    public final String c = AnalyticsEvent.STORY_VIEW;

    public ybd0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.STORY_ID, this.a), new Pair("position", Integer.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybd0)) {
            return false;
        }
        ybd0 ybd0Var = (ybd0) obj;
        return this.a.equals(ybd0Var.a) && this.b == ybd0Var.b && this.c.equals(ybd0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return uf80.a(ml5.a(this.b, "StoryView(storyId=", this.a, ", position=", ", name="), this.c, ")");
    }
}
