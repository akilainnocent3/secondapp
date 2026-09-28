package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class t04 {
    public final int a;
    public final int b;
    public final t6e0 c;
    public final ArrayList d;

    public t04(int i, int i2, t6e0 t6e0Var, ArrayList arrayList) {
        this.a = i;
        this.b = i2;
        this.c = t6e0Var;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t04)) {
            return false;
        }
        t04 t04Var = (t04) obj;
        return this.a == t04Var.a && this.b == t04Var.b && this.c == t04Var.c && this.d.equals(t04Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a("BettingStreakHistory(longestStreakDays=", this.a, this.b, ", currentStreakDays=", ", currentStreakLevel=");
        sbA.append(this.c);
        sbA.append(", records=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
