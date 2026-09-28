package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qfd0 implements pdd0 {
    public final String a;
    public final int b;
    public final String c;

    public qfd0(String str, int i, String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        Pair pair = new Pair(AnalyticsParam.EVENT_PARAM_WATCH_TIME, Integer.valueOf(this.b));
        Pair pair2 = new Pair(AnalyticsParam.EVENT_PARAM_EVENT_ID, this.a);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        return kpu.d(pair, pair2, new Pair(AnalyticsParam.EVENT_STREAM_PROVIDER, str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfd0)) {
            return false;
        }
        qfd0 qfd0Var = (qfd0) obj;
        return Intrinsics.g(this.a, qfd0Var.a) && this.b == qfd0Var.b && Intrinsics.g(this.c, qfd0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return AnalyticsEvent.EVENT_SPORTY_TV_WATCH_TIME;
    }

    public final int hashCode() {
        int iA = gpp.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return uf80.a(ml5.a(this.b, "SportyTvWatchTimeEvent(eventId=", this.a, ", watchTimeSec=", ", provider="), this.c, ")");
    }
}
