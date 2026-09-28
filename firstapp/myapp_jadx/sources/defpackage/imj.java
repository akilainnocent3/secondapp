package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class imj extends wld0 {
    public final double a;
    public final String b;

    public imj(double d, String str) {
        str.getClass();
        this.a = d;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imj)) {
            return false;
        }
        imj imjVar = (imj) obj;
        return Double.compare(this.a, imjVar.a) == 0 && Intrinsics.g(this.b, imjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameOverWithRewardsDialog(rewardValue=");
        sb.append(this.a);
        sb.append(", currency=");
        return j26.a(sb, this.b, ')');
    }
}
