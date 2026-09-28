package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gd50 implements pdd0 {
    public final String a;
    public final String b;

    public gd50(String str) {
        str.getClass();
        this.a = AnalyticsEvent.FINISH_RESET_PASSWORD;
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("data", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd50)) {
            return false;
        }
        gd50 gd50Var = (gd50) obj;
        return this.a.equals(gd50Var.a) && Intrinsics.g(this.b, gd50Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("FinishResetPassword(name=", this.a, ", event=", this.b, ")");
    }
}
