package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class l2f {
    public static final l2f d = new l2f(0, null, true);
    public final int a;
    public final d2f b;
    public final boolean c;

    public l2f(int i, d2f d2fVar, boolean z) {
        this.a = i;
        this.b = d2fVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2f)) {
            return false;
        }
        l2f l2fVar = (l2f) obj;
        return this.a == l2fVar.a && this.b == l2fVar.b && this.c == l2fVar.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        d2f d2fVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (d2fVar == null ? 0 : d2fVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleOrNothingKickPointsState(roundNumber=");
        sb.append(this.a);
        sb.append(", selectedKickPointType=");
        sb.append(this.b);
        sb.append(", isKickPointsEnabled=");
        return mq0.a(sb, this.c, ")");
    }
}
