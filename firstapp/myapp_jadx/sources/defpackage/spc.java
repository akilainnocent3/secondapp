package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class spc {
    public long a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spc)) {
            return false;
        }
        spc spcVar = (spc) obj;
        return this.a == spcVar.a && Float.compare(this.b, spcVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return h70.a(sb, this.b, ')');
    }
}
