package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u190 implements pdd0 {
    public final Integer a;
    public final String b;

    public u190(int i, Integer num) {
        this.a = (i & 1) != 0 ? null : num;
        this.b = "bet_history__show_off_option__click";
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.SOCIAL_SHARE_TYPE, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u190)) {
            return false;
        }
        u190 u190Var = (u190) obj;
        return Intrinsics.g(this.a, u190Var.a) && Intrinsics.g(this.b, u190Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ShareViewShowOffOptionClick(shareType=" + this.a + ", name=" + this.b + ")";
    }
}
