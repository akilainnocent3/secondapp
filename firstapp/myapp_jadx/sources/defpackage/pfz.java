package defpackage;

import androidx.compose.foundation.layout.h;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class pfz {
    public final long a;
    public final umz b;

    public pfz() {
        long jD = r58.d(4284900966L);
        umz umzVarA = h.a(3, 0.0f, 0.0f);
        this.a = jD;
        this.b = umzVarA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pfz.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pfz pfzVar = (pfz) obj;
        long j = pfzVar.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && this.b.equals(pfzVar.b);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverscrollConfiguration(glowColor=");
        ofz.a(this.a, ", drawPadding=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
