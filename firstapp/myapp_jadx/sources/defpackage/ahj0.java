package defpackage;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ahj0 implements pdd0 {
    public final String a = "withdrawal_page__tabs__click";
    public final String b;

    public ahj0(String str) {
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
        if (!(obj instanceof ahj0)) {
            return false;
        }
        ahj0 ahj0Var = (ahj0) obj;
        return this.a.equals(ahj0Var.a) && Intrinsics.g(this.b, ahj0Var.b);
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
        return tx5.a("WithdrawalPageTabsClickEvent(name=", this.a, ", tab=", this.b, ")");
    }
}
