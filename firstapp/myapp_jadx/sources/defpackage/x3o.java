package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x3o implements dt90 {
    public final h3o a;
    public final String b;

    public x3o(h3o h3oVar, String str) {
        h3oVar.getClass();
        str.getClass();
        this.a = h3oVar;
        this.b = str;
    }

    public static x3o c(x3o x3oVar, String str) {
        h3o h3oVar = x3oVar.a;
        x3oVar.getClass();
        h3oVar.getClass();
        str.getClass();
        return new x3o(h3oVar, str);
    }

    @Override // defpackage.dt90
    public final BigDecimal a() {
        return this.a.c.b;
    }

    @Override // defpackage.dt90
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3o)) {
            return false;
        }
        x3o x3oVar = (x3o) obj;
        return Intrinsics.g(this.a, x3oVar.a) && Intrinsics.g(this.b, x3oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InstantRacingSingleBet(selection=" + this.a + ", stakeString=" + this.b + ")";
    }
}
