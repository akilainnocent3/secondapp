package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b090 implements pdd0 {
    public final boolean a;
    public final boolean b;
    public final String c;

    public b090(boolean z, boolean z2, String str) {
        str.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.EVENT_PARAM_WITH_USERNAMES, Boolean.valueOf(this.a)), new Pair(AnalyticsParam.EVENT_PARAM_WITH_NOTE, Boolean.valueOf(this.b)), new Pair("source", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b090)) {
            return false;
        }
        b090 b090Var = (b090) obj;
        return this.a == b090Var.a && this.b == b090Var.b && Intrinsics.g(this.c, b090Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return AnalyticsEvent.SOCIAL_PUBLISH_TO_SPORTY_SOCIAL_CLICK;
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(cwz.a("PublishToSportySocialClick(isDisplayUserNameEnabled=", ", isUserNoteEnabled=", ", source=", this.a, this.b), this.c, ")");
    }
}
