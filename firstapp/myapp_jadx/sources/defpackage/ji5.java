package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class ji5 {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public ji5(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
        this.a = str;
        this.b = bigDecimal;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji5)) {
            return false;
        }
        ji5 ji5Var = (ji5) obj;
        return this.a.equals(ji5Var.a) && this.b.equals(ji5Var.b) && this.c.equals(ji5Var.c) && this.d.equals(ji5Var.d) && this.e == ji5Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "BuildAndGoTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", marketId=", this.d, ", hit=");
        return mq0.a(sbA, this.e, rarBonoqWB.EpMmEXrjdX);
    }
}
