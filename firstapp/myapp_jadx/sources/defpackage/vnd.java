package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vnd implements pdd0 {
    public final String a;

    public vnd(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("country", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vnd) && Intrinsics.g(this.a, ((vnd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "deposit__success__view";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("DepositSuccessViewEvent(country=", this.a, ")");
    }
}
