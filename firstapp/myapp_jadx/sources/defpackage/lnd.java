package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lnd implements pdd0 {
    public final String a;
    public final String b;

    public lnd(String str) {
        str.getClass();
        this.a = "deposit__leave_btn__click";
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnd)) {
            return false;
        }
        lnd lndVar = (lnd) obj;
        return this.a.equals(lndVar.a) && Intrinsics.g(this.b, lndVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("DepositLeaveBtnClickEvent(name=", this.a, ", source=", this.b, ")");
    }
}
