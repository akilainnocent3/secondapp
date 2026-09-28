package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class gmj extends kmd0 {
    public final String a;
    public final double b;
    public final String c;

    public gmj(double d, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = d;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmj)) {
            return false;
        }
        gmj gmjVar = (gmj) obj;
        return Intrinsics.g(this.a, gmjVar.a) && Double.compare(this.b, gmjVar.b) == 0 && Intrinsics.g(this.c, gmjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nrg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameOverWithRewards(gameName=");
        sb.append(this.a);
        sb.append(", rewardValue=");
        sb.append(this.b);
        sb.append(", currency=");
        return j26.a(sb, this.c, ')');
    }
}
