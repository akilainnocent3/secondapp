package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class gbx {
    public final double a;
    public final String b;
    public final uf00<GiftItem> c;
    public final boolean d;

    public gbx(double d, String str, uf00<GiftItem> uf00Var) {
        str.getClass();
        uf00Var.getClass();
        this.a = d;
        this.b = str;
        this.c = uf00Var;
        this.d = !uf00Var.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbx)) {
            return false;
        }
        gbx gbxVar = (gbx) obj;
        return Double.compare(this.a, gbxVar.a) == 0 && Intrinsics.g(this.b, gbxVar.b) && Intrinsics.g(this.c, gbxVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gmf0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "NNDUserWalletGift(balance=" + this.a + ", currency=" + this.b + ", gifts=" + this.c + ')';
    }

    public gbx() {
        this(0);
    }

    public gbx(int i) {
        this(0.0d, "", n1a0.c);
    }
}
