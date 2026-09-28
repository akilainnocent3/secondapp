package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class v5f implements pdd0 {
    public final String a;

    public v5f(String str) {
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
        return (obj instanceof v5f) && this.a.equals(((v5f) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "don__stake_change__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("StakeChangeClickEvent(sportId=", this.a, ")");
    }
}
