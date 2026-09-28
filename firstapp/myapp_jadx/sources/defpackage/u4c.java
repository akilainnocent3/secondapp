package defpackage;

import com.sportybet.android.limits.reached.Cw.rarBonoqWB;

/* JADX INFO: loaded from: classes2.dex */
public final class u4c {
    public final String a;
    public final String b;

    public u4c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4c)) {
            return false;
        }
        u4c u4cVar = (u4c) obj;
        return this.a.equals(u4cVar.a) && this.b.equals(u4cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("CurrencySymbolsCMS(currency=", this.a, rarBonoqWB.jsjlHJ, this.b, ")");
    }
}
