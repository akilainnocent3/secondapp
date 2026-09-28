package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jze0 {
    public final String a;
    public final lze0 b;

    public jze0(String str, lze0 lze0Var) {
        lze0Var.getClass();
        this.a = str;
        this.b = lze0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jze0)) {
            return false;
        }
        jze0 jze0Var = (jze0) obj;
        return Intrinsics.g(this.a, jze0Var.a) && Intrinsics.g(this.b, jze0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TGResultAmount(amount=" + this.a + ", giftAmount=" + this.b + ')';
    }

    public jze0() {
        this(0);
    }

    public /* synthetic */ jze0(int i) {
        this("", lze0.b.a);
    }
}
