package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d4j {
    public final boolean a;
    public final double b;
    public final qcn<mk2> c;
    public final double d;
    public final double e;
    public final String f;

    public d4j(boolean z, double d, qcn<mk2> qcnVar, double d2, double d3, String str) {
        qcnVar.getClass();
        this.a = z;
        this.b = d;
        this.c = qcnVar;
        this.d = d2;
        this.e = d3;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4j)) {
            return false;
        }
        d4j d4jVar = (d4j) obj;
        return this.a == d4jVar.a && Double.compare(this.b, d4jVar.b) == 0 && Intrinsics.g(this.c, d4jVar.c) && Double.compare(this.d, d4jVar.d) == 0 && Double.compare(this.e, d4jVar.e) == 0 && Intrinsics.g(this.f, d4jVar.f);
    }

    public final int hashCode() {
        int iA = nrg0.a(nrg0.a(shu.a(this.c, nrg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        String str = this.f;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FruitHuntChipState(enabled=");
        sb.append(this.a);
        sb.append(", selectedAmount=");
        sb.append(this.b);
        sb.append(", chipList=");
        sb.append(this.c);
        sb.append(", minBetAmount=");
        sb.append(this.d);
        hib0.b(this.e, ", maxBetAmount=", ", title=", sb);
        return uf80.a(sb, this.f, ")");
    }

    public d4j() {
        this(0);
    }

    public d4j(int i) {
        this(true, 0.0d, n1a0.c, 0.0d, 0.0d, null);
    }
}
