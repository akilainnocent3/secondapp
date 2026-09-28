package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class rsf0 extends wld0 {
    public final psf0 a;
    public final Double b;

    public rsf0(psf0 psf0Var, Double d) {
        psf0Var.getClass();
        this.a = psf0Var;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsf0)) {
            return false;
        }
        rsf0 rsf0Var = (rsf0) obj;
        return Intrinsics.g(this.a, rsf0Var.a) && Intrinsics.g(this.b, rsf0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TierNotReachedDialog(data=");
        sb.append(this.a);
        sb.append(", maxReward=");
        return itu.a(sb, this.b, ')');
    }
}
