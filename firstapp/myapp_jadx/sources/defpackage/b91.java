package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b91 implements pdd0 {
    public final String a;

    public b91(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.EVENT_STATUS, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b91) && Intrinsics.g(this.a, ((b91) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "autobet__autobet_toast__view";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("AutoBetToastViewEvent(status=", this.a, ")");
    }
}
