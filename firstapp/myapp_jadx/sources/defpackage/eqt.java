package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class eqt implements pdd0 {
    public final boolean a;
    public final vbp b;
    public final String c = "loyalty__js_response";

    public eqt(boolean z, vbp vbpVar) {
        this.a = z;
        this.b = vbpVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        Pair pair = new Pair(AnalyticsParam.EVENT_PARAM_SUCCESS, Boolean.valueOf(this.a));
        vbp vbpVar = this.b;
        return kpu.d(pair, new Pair("fail", vbpVar != null ? vbpVar.name() : null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqt)) {
            return false;
        }
        eqt eqtVar = (eqt) obj;
        return this.a == eqtVar.a && this.b == eqtVar.b && this.c.equals(eqtVar.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        vbp vbpVar = this.b;
        return this.c.hashCode() + ((iHashCode + (vbpVar == null ? 0 : vbpVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyGenerateShareImgJsResponseEvent(isSuccess=");
        sb.append(this.a);
        sb.append(", failReason=");
        sb.append(this.b);
        sb.append(", name=");
        return uf80.a(sb, this.c, ")");
    }
}
