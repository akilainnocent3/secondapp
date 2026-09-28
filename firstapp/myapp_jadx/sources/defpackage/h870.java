package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h870 {
    public final boolean a;
    public final int b;
    public final String c;
    public final v870 d;
    public final boolean e;

    public h870(boolean z, int i, String str, v870 v870Var, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = v870Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h870)) {
            return false;
        }
        h870 h870Var = (h870) obj;
        return this.a == h870Var.a && this.b == h870Var.b && this.c.equals(h870Var.c) && Intrinsics.g(this.d, h870Var.d) && this.e == h870Var.e;
    }

    public final int hashCode() {
        int iA = gmf0.a(gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
        v870 v870Var = this.d;
        return Boolean.hashCode(this.e) + ((iA + (v870Var == null ? 0 : v870Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = zug0.a("ScheduledFootballMarketAttributes(hasSpanner=", ", spannerIndex=", ", defaultMarketPoolId=", this.b, this.a);
        sbA.append(this.c);
        sbA.append(", layout=");
        sbA.append(this.d);
        sbA.append(", combo=");
        return mq0.a(sbA, this.e, ")");
    }
}
