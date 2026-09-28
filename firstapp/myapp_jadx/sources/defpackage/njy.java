package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class njy {
    public final ljy a;
    public final boolean b;

    public njy(ljy ljyVar, boolean z) {
        ljyVar.getClass();
        this.a = ljyVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njy)) {
            return false;
        }
        njy njyVar = (njy) obj;
        return this.a == njyVar.a && this.b == njyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OddsFormatItem(oddsFormat=" + this.a + ", isSelected=" + this.b + ")";
    }
}
