package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a3h0 {
    public final String a;

    public a3h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3h0) && Intrinsics.g(this.a, ((a3h0) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(0) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return tug.a("TxDetailsParam(tradeId=", this.a, ", isHistory=0)");
    }
}
