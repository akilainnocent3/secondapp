package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class iyy implements pdd0 {
    public final String a;

    public iyy(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("type", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iyy) && this.a.equals(((iyy) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "open_bets__cashout__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("OpenBetsCashOutClickEvent(type=", this.a, ")");
    }
}
