package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class r5f implements pdd0 {
    public final String a;

    public r5f(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("sportId", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5f) && this.a.equals(((r5f) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "don__cashout__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("CashoutClickEvent(sportId=", this.a, ")");
    }
}
