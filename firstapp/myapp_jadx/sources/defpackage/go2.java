package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class go2 implements pdd0 {
    public static final go2 a = new go2();
    public static final String b = "open_bets__add_selection__click";

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", "bet_history__rebet"));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof go2);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    public final int hashCode() {
        return 936401360;
    }

    public final String toString() {
        return "OpenBetsAddSelectionClick";
    }
}
