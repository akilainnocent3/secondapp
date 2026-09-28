package defpackage;

import com.appsflyer.internal.x;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rdl implements pdd0 {
    public final String a;
    public final long b;
    public final String c;

    public rdl(long j, String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("session_id", this.a), new Pair(AnalyticsParam.STORY_DURATION, Long.valueOf(this.b)), new Pair("stack_trace", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdl)) {
            return false;
        }
        rdl rdlVar = (rdl) obj;
        return Intrinsics.g(this.a, rdlVar.a) && this.b == rdlVar.b && this.c.equals(rdlVar.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "android_main_thread_hang";
    }

    public final int hashCode() {
        return this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return pr0.a(x.a(this.b, "HangDetected(sessionId=", this.a, ", durationMs="), ", stackTrace=", this.c, ")");
    }
}
