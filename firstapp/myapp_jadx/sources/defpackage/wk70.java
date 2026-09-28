package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class wk70 {
    public final String a;
    public final BigDecimal b;
    public final String c;
    public final String d;
    public final boolean e;

    public wk70(String str, BigDecimal bigDecimal, String str2, String str3, boolean z) {
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
        if (!(obj instanceof wk70)) {
            return false;
        }
        wk70 wk70Var = (wk70) obj;
        return this.a.equals(wk70Var.a) && this.b.equals(wk70Var.b) && this.c.equals(wk70Var.c) && this.d.equals(wk70Var.d) && this.e == wk70Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + gmf0.a(gmf0.a(dd3.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = yz80.a(this.b, "ScheduledFootballTicketOutcome(id=", this.a, ", odds=", ", description=");
        hxa.c(sbA, this.c, ", marketId=", this.d, ", hit=");
        return mq0.a(sbA, this.e, ")");
    }
}
