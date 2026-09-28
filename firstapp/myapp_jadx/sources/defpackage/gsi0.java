package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class gsi0 {
    public final int a;
    public final float b;
    public final long c;
    public final boolean d;

    public gsi0(float f, int i, long j, boolean z) {
        this.a = i;
        this.b = f;
        this.c = j;
        this.d = z;
    }

    public static gsi0 a(gsi0 gsi0Var, boolean z) {
        return new gsi0(gsi0Var.b, gsi0Var.a, gsi0Var.c, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsi0)) {
            return false;
        }
        gsi0 gsi0Var = (gsi0) obj;
        if (this.a != gsi0Var.a || Float.compare(this.b, gsi0Var.b) != 0) {
            return false;
        }
        long j = gsi0Var.c;
        int i = j58.n;
        return nbh0.a(this.c, j) && this.d == gsi0Var.d;
    }

    public final int hashCode() {
        int iA = tvh.a(this.b, Integer.hashCode(this.a) * 31, 31);
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Boolean.hashCode(this.d) + f87.a(iA, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WDMultiplier(id=");
        sb.append(this.a);
        sb.append(", multiplier=");
        sb.append(this.b);
        sb.append(", color=");
        ofz.a(this.c, ", isSelected=", sb);
        return ruw.a(sb, this.d, ')');
    }
}
