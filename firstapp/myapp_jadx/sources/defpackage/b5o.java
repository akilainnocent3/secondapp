package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b5o implements pdd0 {
    public final String a = "bng__match_running__view";
    public final String b;

    public b5o(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("duration_timestamp", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5o)) {
            return false;
        }
        b5o b5oVar = (b5o) obj;
        return this.a.equals(b5oVar.a) && Intrinsics.g(this.b, b5oVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tx5.a("BngMatchRunningViewEvent(name=", this.a, ", durationTimestamp=", this.b, ")");
    }
}
