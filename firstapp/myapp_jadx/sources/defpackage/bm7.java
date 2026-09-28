package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class bm7 {
    public final boolean a;
    public final boolean b;
    public final qcn<skd0> c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    public bm7(boolean z, boolean z2, qcn<skd0> qcnVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        qcnVar.getClass();
        bigDecimal.getClass();
        bigDecimal2.getClass();
        bigDecimal3.getClass();
        this.a = z;
        this.b = z2;
        this.c = qcnVar;
        this.d = bigDecimal;
        this.e = bigDecimal2;
        this.f = bigDecimal3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm7)) {
            return false;
        }
        bm7 bm7Var = (bm7) obj;
        if (this.a != bm7Var.a || this.b != bm7Var.b || !Intrinsics.g(this.c, bm7Var.c)) {
            return false;
        }
        BigDecimal bigDecimal = bm7Var.d;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.d, bigDecimal) && Intrinsics.g(this.e, bm7Var.e) && Intrinsics.g(this.f, bm7Var.f);
    }

    public final int hashCode() {
        int iA = shu.a(this.c, mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31);
        BigDecimal bigDecimal = skd0.b;
        return this.f.hashCode() + dd3.a(this.e, dd3.a(this.d, iA, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChipsSelectorState(enable=");
        sb.append(this.a);
        sb.append(", hasGift=");
        sb.append(this.b);
        sb.append(", chipsList=");
        sb.append(this.c);
        sb.append(", min=");
        r03.a(", max=", sb, this.d);
        r03.a(", value=", sb, this.e);
        sb.append((Object) skd0.a(this.f));
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bm7() {
        n1a0 n1a0Var = n1a0.c;
        BigDecimal bigDecimal = skd0.b;
        this(true, false, n1a0Var, bigDecimal, bigDecimal, bigDecimal);
    }
}
