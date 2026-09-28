package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b2d0 implements Serializable {
    public final String a;
    public final r1d0 b;

    public b2d0(String str, r1d0 r1d0Var) {
        r1d0Var.getClass();
        this.a = str;
        this.b = r1d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2d0)) {
            return false;
        }
        b2d0 b2d0Var = (b2d0) obj;
        return this.a.equals(b2d0Var.a) && Intrinsics.g(this.b, b2d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyPenaltySettlementInput(sportId=" + this.a + ", settleRound=" + this.b + ")";
    }
}
