package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class nsf0 extends kmd0 {
    public final String a;
    public final kni0 b;
    public final Double c;

    public nsf0(String str, kni0 kni0Var, Double d) {
        str.getClass();
        kni0Var.getClass();
        this.a = str;
        this.b = kni0Var;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsf0)) {
            return false;
        }
        nsf0 nsf0Var = (nsf0) obj;
        return Intrinsics.g(this.a, nsf0Var.a) && Intrinsics.g(this.b, nsf0Var.b) && Intrinsics.g(this.c, nsf0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Double d = this.c;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TierNotReached(gameName=");
        sb.append(this.a);
        sb.append(", data=");
        sb.append(this.b);
        sb.append(", maxReward=");
        return itu.a(sb, this.c, ')');
    }
}
