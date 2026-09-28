package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class lyy implements pdd0 {
    public static final lyy a = new lyy();
    public static final String b = "open_bets__cashout_success_popup_rebet__add_to_betslip";

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", "open_bets__cashout_rebet"));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lyy);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 2046542284;
    }

    public final String toString() {
        return "OpenBetsCashoutSuccessPopupReBetAddToBetSlip";
    }
}
