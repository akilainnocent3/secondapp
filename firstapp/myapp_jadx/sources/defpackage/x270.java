package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x270 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final g070 d;
    public final wr4 e;
    public final boolean f;
    public final Map<String, String> g;
    public final boolean h;

    public x270(boolean z, boolean z2, String str, g070 g070Var, wr4 wr4Var, boolean z3, Map<String, String> map, boolean z4) {
        wr4Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = g070Var;
        this.e = wr4Var;
        this.f = z3;
        this.g = map;
        this.h = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x270)) {
            return false;
        }
        x270 x270Var = (x270) obj;
        return this.a == x270Var.a && this.b == x270Var.b && this.c.equals(x270Var.c) && this.d.equals(x270Var.d) && Intrinsics.g(this.e, x270Var.e) && this.f == x270Var.f && Intrinsics.g(this.g, x270Var.g) && this.h == x270Var.h;
    }

    public final int hashCode() {
        int iA = mtg0.a((this.e.hashCode() + ((this.d.hashCode() + gmf0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f);
        Map<String, String> map = this.g;
        return Boolean.hashCode(this.h) + ((iA + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("ScheduledFootballConfig(overallActive=", ", active=", ", sportId=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", betLimitInfo=");
        sbA.append(this.d);
        sbA.append(", bonusType=");
        sbA.append(this.e);
        sbA.append(", giftEnabled=");
        sbA.append(this.f);
        sbA.append(", defaultUniversalSpecifierTypeByMarketType=");
        sbA.append(this.g);
        sbA.append(", statsEnabled=");
        sbA.append(this.h);
        sbA.append(")");
        return sbA.toString();
    }
}
