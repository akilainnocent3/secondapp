package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jyy implements pdd0 {
    public final String a;
    public final String b;
    public final String c;

    public jyy(String str, String str2, String str3) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.DATA_BET_TYPE, this.a), new Pair("bet_id", this.b), new Pair("cashout_amount_snapshot_base64", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyy)) {
            return false;
        }
        jyy jyyVar = (jyy) obj;
        return this.a.equals(jyyVar.a) && Intrinsics.g(this.b, jyyVar.b) && Intrinsics.g(this.c, jyyVar.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "open_bets__cashout_confirm__click";
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return uf80.a(ux5.a("OpenBetsCashOutConfirmClickEvent(type=", this.a, ", betId=", this.b, ", amountSnapshotBase64="), this.c, ")");
    }
}
