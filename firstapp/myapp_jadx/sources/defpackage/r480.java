package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r480 {
    public static final r480 c = new r480(0, 0);
    public final long a;
    public final long b;

    public r480(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r480.class == obj.getClass()) {
            r480 r480Var = (r480) obj;
            if (this.a == r480Var.a && this.b == r480Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return nrz.a(this.b, "]", sb);
    }
}
