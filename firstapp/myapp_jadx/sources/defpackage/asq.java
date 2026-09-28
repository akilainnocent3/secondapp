package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class asq {
    public final String a;
    public final a7r b;

    public asq(String str, a7r a7rVar) {
        str.getClass();
        a7rVar.getClass();
        this.a = str;
        this.b = a7rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asq)) {
            return false;
        }
        asq asqVar = (asq) obj;
        return Intrinsics.g(this.a, asqVar.a) && Intrinsics.g(this.b, asqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LNLotteryResultState(title=" + this.a + ", resultState=" + this.b + ")";
    }
}
