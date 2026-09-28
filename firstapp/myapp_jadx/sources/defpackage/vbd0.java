package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class vbd0 implements pdd0 {
    public final String a;
    public final int b;
    public final String c = AnalyticsEvent.STORY_CARD_CLICK;

    public vbd0(String str, int i) {
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
        if (!(obj instanceof vbd0)) {
            return false;
        }
        vbd0 vbd0Var = (vbd0) obj;
        return this.a.equals(vbd0Var.a) && this.b == vbd0Var.b && this.c.equals(vbd0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return uf80.a(ml5.a(this.b, "StoryCardClick(storyId=", this.a, ", position=", ", name="), this.c, ")");
    }
}
