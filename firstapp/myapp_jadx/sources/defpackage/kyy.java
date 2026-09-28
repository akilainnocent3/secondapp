package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kyy implements pdd0 {
    public final String a;
    public final String b;

    public kyy(String str, String str2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.DATA_BET_TYPE, this.a), new Pair("bet_id", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyy)) {
            return false;
        }
        kyy kyyVar = (kyy) obj;
        return this.a.equals(kyyVar.a) && Intrinsics.g(this.b, kyyVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "open_bets__cashout_confirm__view";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("OpenBetsCashOutConfirmViewEvent(type=", this.a, ", betId=", this.b, ")");
    }
}
