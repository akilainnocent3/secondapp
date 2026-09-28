package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class mnd implements pdd0 {
    public final String a;

    public mnd(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("depositMethod", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnd) && this.a.equals(((mnd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "deposit_method_stp__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("DepositMXStpClickEvent(depositMethod=", this.a, ")");
    }
}
