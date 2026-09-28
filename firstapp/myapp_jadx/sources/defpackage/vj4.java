package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vj4 {
    public final long a;
    public final wj4 b;
    public final rp4 c;
    public final Double d;
    public final float e;
    public final float f;

    public vj4(long j, wj4 wj4Var, rp4 rp4Var, Double d, float f, float f2) {
        rp4Var.getClass();
        this.a = j;
        this.b = wj4Var;
        this.c = rp4Var;
        this.d = d;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj4)) {
            return false;
        }
        vj4 vj4Var = (vj4) obj;
        return this.a == vj4Var.a && this.b == vj4Var.b && Intrinsics.g(this.c, vj4Var.c) && Intrinsics.g(this.d, vj4Var.d) && Float.compare(this.e, vj4Var.e) == 0 && Float.compare(this.f, vj4Var.f) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31;
        Double d = this.d;
        return Float.hashCode(this.f) + tvh.a(this.e, (iHashCode + (d == null ? 0 : d.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupEffect(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", amount=");
        sb.append(this.d);
        sb.append(", ageSeconds=");
        sb.append(this.e);
        sb.append(", durationSeconds=");
        return h70.a(sb, this.f, ')');
    }
}
