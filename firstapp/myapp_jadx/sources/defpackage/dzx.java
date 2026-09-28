package defpackage;

import com.appsflyer.internal.h;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class dzx implements pdd0 {
    public final int a;
    public final String b = AnalyticsEvent.NOTE_CHARACTER_REACH;

    public dzx(int i) {
        this.a = i;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.CONTENT_LENGTH, Integer.valueOf(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzx)) {
            return false;
        }
        dzx dzxVar = (dzx) obj;
        return this.a == dzxVar.a && this.b.equals(dzxVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return h.a(this.a, "CharacterLimitReach(contentLength=", ", name=", this.b, ")");
    }
}
