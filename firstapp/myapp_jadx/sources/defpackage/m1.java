package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m1 {
    public final String a;
    public final int b;
    public final String c;
    public final int d;

    public m1(String str, int i, String str2, int i2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.g(this.a, m1Var.a) && this.b == m1Var.b && Intrinsics.g(this.c, m1Var.c) && this.d == m1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return ijg0.a(this.d, this.c, ", featureCount=", ")", ml5.a(this.b, "AZPromotionUiState(promotionsUrl=", this.a, ", promotionCount=", ", featuresUrl="));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public m1() {
        String str = null;
        this(str, str, 15);
    }

    public /* synthetic */ m1(String str, String str2, int i) {
        this((i & 1) != 0 ? "" : str, 0, (i & 4) != 0 ? "" : str2, 0);
    }
}
