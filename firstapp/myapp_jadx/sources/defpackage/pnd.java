package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pnd implements pdd0 {
    public final String a = "deposit_page__tabs__click";
    public final String b;

    public pnd(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("tab", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnd)) {
            return false;
        }
        pnd pndVar = (pnd) obj;
        return this.a.equals(pndVar.a) && Intrinsics.g(this.b, pndVar.b);
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
        return tx5.a("DepositPageTabsClickEvent(name=", this.a, ", tab=", this.b, ")");
    }
}
