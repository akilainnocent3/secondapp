package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class myy implements pdd0 {
    public final String a;

    public myy(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.DATA_BET_TYPE, this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof myy) && Intrinsics.g(this.a, ((myy) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "open_bets__edit_bet__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OpenBetsEditBetClickClickEvent(betType=", this.a, ")");
    }
}
