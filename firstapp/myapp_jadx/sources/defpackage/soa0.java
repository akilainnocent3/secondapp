package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class soa0 extends ya5 {
    public final long b;

    public soa0(long j) {
        this.b = j;
    }

    @Override // defpackage.ya5
    public final void a(float f, long j, zqz zqzVar) {
        zqzVar.b(1.0f);
        long jC = this.b;
        if (f != 1.0f) {
            jC = j58.c(j58.d(jC) * f, jC);
        }
        zqzVar.m(jC);
        if (zqzVar.g() != null) {
            zqzVar.f(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soa0)) {
            return false;
        }
        long j = ((soa0) obj).b;
        int i = j58.n;
        return nbh0.a(this.b, j);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) j58.i(this.b)) + ')';
    }
}
