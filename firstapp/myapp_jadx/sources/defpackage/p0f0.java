package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p0f0 {
    public final Double a;
    public final String b;
    public final boolean c;
    public final scn<Integer, Boolean> d;
    public final qcn<GiftItem> e;

    public p0f0(Double d, String str, boolean z, scn<Integer, Boolean> scnVar, qcn<GiftItem> qcnVar) {
        str.getClass();
        scnVar.getClass();
        qcnVar.getClass();
        this.a = d;
        this.b = str;
        this.c = z;
        this.d = scnVar;
        this.e = qcnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0f0)) {
            return false;
        }
        p0f0 p0f0Var = (p0f0) obj;
        return Intrinsics.g(this.a, p0f0Var.a) && Intrinsics.g(this.b, p0f0Var.b) && this.c == p0f0Var.c && Intrinsics.g(this.d, p0f0Var.d) && Intrinsics.g(this.e, p0f0Var.e);
    }

    public final int hashCode() {
        Double d = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + mtg0.a(gmf0.a((d == null ? 0 : d.hashCode()) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "TGUserData(balance=" + this.a + ", currency=" + this.b + ", showCollection=" + this.c + ", caveAvailabilities=" + this.d + ", gifts=" + this.e + ')';
    }

    public p0f0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p0f0(int i) {
        xf00 xf00Var = xf00.i;
        xf00Var.getClass();
        this(null, "", false, xf00Var, n1a0.c);
    }
}
