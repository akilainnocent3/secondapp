package defpackage;

import com.sportygames.common.ui.model.GiftItem;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uq30 {
    public final BigDecimal a;
    public final String b;
    public final uf00<GiftItem> c;
    public final boolean d;

    public uq30(BigDecimal bigDecimal, String str, uf00<GiftItem> uf00Var) {
        bigDecimal.getClass();
        str.getClass();
        uf00Var.getClass();
        this.a = bigDecimal;
        this.b = str;
        this.c = uf00Var;
        this.d = !uf00Var.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq30)) {
            return false;
        }
        uq30 uq30Var = (uq30) obj;
        BigDecimal bigDecimal = uq30Var.a;
        BigDecimal bigDecimal2 = skd0.b;
        return Intrinsics.g(this.a, bigDecimal) && Intrinsics.g(this.b, uq30Var.b) && Intrinsics.g(this.c, uq30Var.c);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = skd0.b;
        return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RCUserWalletGift(balance=");
        r03.a(", currency=", sb, this.a);
        sb.append(this.b);
        sb.append(", gifts=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    public uq30() {
        this(skd0.b, "", n1a0.c);
    }
}
