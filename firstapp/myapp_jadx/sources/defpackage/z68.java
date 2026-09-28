package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z68 implements kjf0 {
    public final long a;

    public z68(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        xkn.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.kjf0
    public final float a() {
        return j58.d(this.a);
    }

    @Override // defpackage.kjf0
    public final long d() {
        return this.a;
    }

    @Override // defpackage.kjf0
    public final ya5 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z68)) {
            return false;
        }
        long j = ((z68) obj).a;
        int i = j58.n;
        return nbh0.a(this.a, j);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) j58.i(this.a)) + ')';
    }
}
