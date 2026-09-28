package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gkf {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public gkf(String str, String str2, String str3, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkf)) {
            return false;
        }
        gkf gkfVar = (gkf) obj;
        return Intrinsics.g(this.a, gkfVar.a) && Intrinsics.g(this.b, gkfVar.b) && Intrinsics.g(this.c, gkfVar.c) && this.d == gkfVar.d;
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x9d.a(this.c, ", supported=", ")", ux5.a("EarlyPayoutMarketLikeImpl(sourceMarketId=", this.a, ", mappedMarketId=", this.b, ", mappedSpecifier="), this.d);
    }
}
