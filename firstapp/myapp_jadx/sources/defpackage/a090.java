package defpackage;

import com.appsflyer.internal.l;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a090 implements pdd0 {
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;

    public a090(int i, long j, long j2, String str, String str2, String str3) {
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.SOCIAL_SHARE_TYPE, Integer.valueOf(this.a)), new Pair(AnalyticsParam.EVENT_PARAM_BOOKING_CODE, this.b), new Pair("from", this.c), new Pair(AnalyticsParam.SOCIAL_START_TIMESTAMP, Long.valueOf(this.d)), new Pair(AnalyticsParam.SOCIAL_END_TIMESTAMP, Long.valueOf(this.e)), new Pair(AnalyticsParam.SOCIAL_ORDER_ID, this.f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a090)) {
            return false;
        }
        a090 a090Var = (a090) obj;
        return this.a == a090Var.a && Intrinsics.g(this.b, a090Var.b) && Intrinsics.g(this.c, a090Var.c) && this.d == a090Var.d && this.e == a090Var.e && this.f.equals(a090Var.f);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return AnalyticsEvent.SOCIAL_GENERAL_SHARE_BET_CLICK;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.f.hashCode() + f87.a(f87.a(gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "GeneralShareBetClick(shareType=", ", bookingCode=", this.b, ", source=");
        l.a(this.d, this.c, ", startTimestamp=", sbA);
        g41.a(this.e, ", endTimestamp=", ", orderId=", sbA);
        return uf80.a(sbA, this.f, ")");
    }
}
