package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gqt implements pdd0 {
    public final boolean a;
    public final Integer b;
    public final String c;
    public final String d;

    public gqt(boolean z, Integer num, String str, int i) {
        num = (i & 2) != 0 ? null : num;
        str = (i & 4) != 0 ? null : str;
        this.a = z;
        this.b = num;
        this.c = str;
        this.d = "loyalty__reward_show_off_upload";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqt)) {
            return false;
        }
        gqt gqtVar = (gqt) obj;
        return this.a == gqtVar.a && Intrinsics.g(this.b, gqtVar.b) && Intrinsics.g(this.c, gqtVar.c) && this.d.equals(gqtVar.d);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyRewardShowOffUploadEvent(isSuccess=");
        sb.append(this.a);
        sb.append(", errorCode=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        return kwi.a(sb, this.c, ", name=", this.d, ")");
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.EVENT_PARAM_SUCCESS, Boolean.valueOf(this.a)), new Pair(QQWMbKFOuTf.eyOXrdEIqqVz, this.b), new Pair("error_msg", this.c));
    }
}
