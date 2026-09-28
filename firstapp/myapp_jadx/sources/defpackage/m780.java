package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m780 {
    public final String a;
    public final GiftDetails b;

    public m780(GiftDetails giftDetails, String str) {
        str.getClass();
        this.a = str;
        this.b = giftDetails;
    }

    public final long a() {
        return new BigDecimal(this.a).multiply(geo.a).longValue();
    }

    public final String b() {
        String strW = bjb0.W(this.b.getLeastOrderAmount());
        strW.getClass();
        return strW;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m780)) {
            return false;
        }
        m780 m780Var = (m780) obj;
        return Intrinsics.g(this.a, m780Var.a) && this.b.equals(m780Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedGiftInfo(giftAmountString=" + this.a + ", giftDetails=" + this.b + ")";
    }
}
