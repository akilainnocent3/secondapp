package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class nwc0 implements Serializable {
    public final m5d0 a;
    public final boolean b;

    public nwc0(m5d0 m5d0Var, boolean z) {
        this.a = m5d0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwc0)) {
            return false;
        }
        nwc0 nwc0Var = (nwc0) obj;
        return this.a == nwc0Var.a && this.b == nwc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyPenaltyKickResult(team=" + this.a + ", isScored=" + this.b + ")";
    }
}
