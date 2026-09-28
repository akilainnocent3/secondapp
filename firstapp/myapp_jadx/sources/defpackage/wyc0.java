package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class wyc0 {
    public final ArrayList a;
    public final BigDecimal b;
    public final BigDecimal c;

    public wyc0(ArrayList arrayList, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.a = arrayList;
        this.b = bigDecimal;
        this.c = bigDecimal2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyc0)) {
            return false;
        }
        wyc0 wyc0Var = (wyc0) obj;
        return this.a.equals(wyc0Var.a) && this.b.equals(wyc0Var.b) && this.c.equals(wyc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dd3.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyPenaltyOddsFilter(regularMaxOddsList=");
        sb.append(this.a);
        sb.append(", riskyMinOdds=");
        sb.append(this.b);
        sb.append(", simpleMaxOdds=");
        return mh2.a(")", sb, this.c);
    }
}
