package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class pyy implements pdd0 {
    public static final pyy a = new pyy();
    public static final String b = "open_bets__add_selection__click";

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", "open_bets__rebet"));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof pyy);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 943452432;
    }

    public final String toString() {
        return "RebetAddSelectionClick";
    }
}
