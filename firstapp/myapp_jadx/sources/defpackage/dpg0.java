package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dpg0 {
    public final String a;
    public final String b;

    public dpg0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpg0)) {
            return false;
        }
        dpg0 dpg0Var = (dpg0) obj;
        return Intrinsics.g(this.a, dpg0Var.a) && Intrinsics.g(this.b, dpg0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return tx5.a("TradingCommonFailureMessage(title=", this.a, ", message=", this.b, ")");
    }
}
