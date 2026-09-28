package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fp4 {
    public final int a;
    public final ek4 b;
    public final int c;
    public final float d;
    public final float e;
    public final Double f;
    public final boolean g;

    public fp4(int i, ek4 ek4Var, int i2, float f, float f2, Double d, boolean z) {
        this.a = i;
        this.b = ek4Var;
        this.c = i2;
        this.d = f;
        this.e = f2;
        this.f = d;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp4)) {
            return false;
        }
        fp4 fp4Var = (fp4) obj;
        return this.a == fp4Var.a && this.b == fp4Var.b && this.c == fp4Var.c && Float.compare(this.d, fp4Var.d) == 0 && Float.compare(this.e, fp4Var.e) == 0 && Intrinsics.g(this.f, fp4Var.f) && this.g == fp4Var.g;
    }

    public final int hashCode() {
        int iA = tvh.a(this.e, tvh.a(this.d, gpp.a(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31), 31), 31);
        Double d = this.f;
        return Boolean.hashCode(this.g) + ((iA + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupSpawnObject(objectId=");
        sb.append(this.a);
        sb.append(", objectType=");
        sb.append(this.b);
        sb.append(", columnNumber=");
        sb.append(this.c);
        sb.append(", angle=");
        sb.append(this.d);
        sb.append(", velocityMultiplier=");
        sb.append(this.e);
        sb.append(", rewardValue=");
        sb.append(this.f);
        sb.append(", isGoldenBallAllowed=");
        return ruw.a(sb, this.g, ')');
    }
}
