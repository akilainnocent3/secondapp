package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class jv1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public jv1(String str, String str2, String str3, boolean z) {
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
        if (!(obj instanceof jv1)) {
            return false;
        }
        jv1 jv1Var = (jv1) obj;
        return Intrinsics.g(this.a, jv1Var.a) && Intrinsics.g(this.b, jv1Var.b) && Intrinsics.g(this.c, jv1Var.c) && this.d == jv1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BalanceUIState(currency=");
        sb.append(this.a);
        sb.append(", balance=");
        sb.append(this.b);
        sb.append(", diffBalance=");
        sb.append(this.c);
        sb.append(", isIncreased=");
        return ruw.a(sb, this.d, ')');
    }

    public /* synthetic */ jv1(int i) {
        this("", "", "", true);
    }

    public jv1() {
        this(0);
    }
}
