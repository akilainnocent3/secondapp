package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class hlc {
    public final long a;
    public final long b;
    public final float c;

    public hlc(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlc)) {
            return false;
        }
        hlc hlcVar = (hlc) obj;
        return gly.c(this.a, hlcVar.a) && yw90.a(this.b, hlcVar.b) && g7f.b(this.c, hlcVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + f87.a(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        String strH = gly.h(this.a);
        String strF = yw90.f(this.b);
        return uf80.a(ux5.a("CutoutData(offset=", strH, ", size=", strF, ", cornerRadius="), g7f.c(this.c), ")");
    }
}
