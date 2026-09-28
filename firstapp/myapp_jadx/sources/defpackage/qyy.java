package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class qyy implements pdd0 {
    public static final qyy a = new qyy();
    public static final String b = "open_bets__rebet__add_to_betslip";

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", "open_bets__rebet"));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qyy);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 1689770018;
    }

    public final String toString() {
        return "RebetAddToBetslip";
    }
}
