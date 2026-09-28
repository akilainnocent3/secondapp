package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class qd0 {
    public final long a;
    public final float b;
    public final float c;

    public qd0(float f, float f2, long j) {
        this.a = j;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        long j = qd0Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && Float.compare(this.b, qd0Var.b) == 0 && Float.compare(this.c, qd0Var.c) == 0;
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Float.hashCode(this.c) + tvh.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AngleData(color=");
        ofz.a(this.a, ", startAngle=", sb);
        sb.append(this.b);
        sb.append(", stakedAngle=");
        return h70.a(sb, this.c, ')');
    }
}
