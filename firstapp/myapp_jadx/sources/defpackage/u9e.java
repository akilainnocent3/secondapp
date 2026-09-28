package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class u9e {
    public final String a;
    public final String b;

    public u9e(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9e)) {
            return false;
        }
        u9e u9eVar = (u9e) obj;
        return Intrinsics.g(this.a, u9eVar.a) && Intrinsics.g(this.b, u9eVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return tx5.a("DepositWebViewParam(url=", this.a, ", title=", this.b, ")");
    }
}
