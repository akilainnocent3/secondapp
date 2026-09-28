package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hg60 {
    public final BigDecimal a;
    public final String b;
    public final uf00<GiftItem> c;

    public hg60(BigDecimal bigDecimal, String str, uf00<GiftItem> uf00Var) {
        bigDecimal.getClass();
        str.getClass();
        uf00Var.getClass();
        this.a = bigDecimal;
        this.b = str;
        this.c = uf00Var;
        uf00Var.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg60)) {
            return false;
        }
        hg60 hg60Var = (hg60) obj;
        BigDecimal bigDecimal = hg60Var.a;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.a, bigDecimal) && Intrinsics.g(this.b, hg60Var.b) && Intrinsics.g(this.c, hg60Var.c);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = skd0.b;
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SBWalletGift(balance=");
        r03.a(", currency=", sb, this.a);
        sb.append(this.b);
        sb.append(", gifts=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    public hg60() {
        this(skd0.b, "", n1a0.c);
    }
}
