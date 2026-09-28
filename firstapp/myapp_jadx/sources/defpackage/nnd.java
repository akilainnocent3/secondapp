package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nnd implements pdd0 {
    public final String a;
    public final String b;

    public nnd(String str) {
        str.getClass();
        this.a = "deposit__method_page__view";
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("depositMethod", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnd)) {
            return false;
        }
        nnd nndVar = (nnd) obj;
        return this.a.equals(nndVar.a) && Intrinsics.g(this.b, nndVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("DepositMethodPageViewEvent(name=", this.a, ", depositMethod=", this.b, ")");
    }
}
