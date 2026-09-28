package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gm4 {
    public final String a;
    public final double b;

    public gm4(String str, double d) {
        str.getClass();
        this.a = str;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm4)) {
            return false;
        }
        gm4 gm4Var = (gm4) obj;
        return Intrinsics.g(this.a, gm4Var.a) && Double.compare(this.b, gm4Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupGift(giftId=");
        sb.append(this.a);
        sb.append(", giftValue=");
        return org0.a(sb, this.b, ')');
    }
}
