package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o0f0 {
    public final String a;
    public final Double b;
    public final Double c;

    public o0f0(String str, Double d, Double d2) {
        str.getClass();
        this.a = str;
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0f0)) {
            return false;
        }
        o0f0 o0f0Var = (o0f0) obj;
        return Intrinsics.g(this.a, o0f0Var.a) && Intrinsics.g(this.b, o0f0Var.b) && Intrinsics.g(this.c, o0f0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TGUserBalance(currency=");
        sb.append(this.a);
        sb.append(vZBMKENANSz.pxPFnYaV);
        sb.append(this.b);
        sb.append(", diff=");
        return itu.a(sb, this.c, ')');
    }

    public o0f0() {
        this(0);
    }

    public /* synthetic */ o0f0(int i) {
        this("", null, null);
    }
}
