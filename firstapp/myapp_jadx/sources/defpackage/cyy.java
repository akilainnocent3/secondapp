package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class cyy implements pdd0 {
    public static final cyy a = new cyy();
    public static final String b = "open_bets__add_selection__click";

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", "winning_popup__remix"));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof cyy);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return -1722268085;
    }

    public final String toString() {
        return "OpenBetAddSelectionClickSourceWinningPopupRemix";
    }
}
