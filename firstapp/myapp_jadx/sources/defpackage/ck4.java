package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class ck4 {
    public final long a;
    public final ek4 b;
    public final rp4 c;
    public final rp4 d;
    public final float e;
    public final float f;
    public final float g;
    public final dk4 h;
    public final float i;
    public final boolean j;

    public ck4(long j, ek4 ek4Var, rp4 rp4Var, rp4 rp4Var2, float f, float f2, float f3, dk4 dk4Var, float f4, boolean z) {
        this.a = j;
        this.b = ek4Var;
        this.c = rp4Var;
        this.d = rp4Var2;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = dk4Var;
        this.i = f4;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck4)) {
            return false;
        }
        ck4 ck4Var = (ck4) obj;
        return this.a == ck4Var.a && this.b == ck4Var.b && this.c.equals(ck4Var.c) && this.d.equals(ck4Var.d) && Float.compare(this.e, ck4Var.e) == 0 && Float.compare(this.f, ck4Var.f) == 0 && Float.compare(this.g, ck4Var.g) == 0 && this.h == ck4Var.h && Float.compare(this.i, ck4Var.i) == 0 && this.j == ck4Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + tvh.a(this.i, (this.h.hashCode() + tvh.a(this.g, tvh.a(this.f, tvh.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupFallingObject(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", center=");
        sb.append(this.c);
        sb.append(", velocity=");
        sb.append(this.d);
        sb.append(", radius=");
        sb.append(this.e);
        sb.append(", halfWidth=");
        sb.append(this.f);
        sb.append(", halfHeight=");
        sb.append(this.g);
        sb.append(", state=");
        sb.append(this.h);
        sb.append(", collisionCooldownSeconds=");
        sb.append(this.i);
        sb.append(", hasBouncedOffCupEdge=");
        return ruw.a(sb, this.j, ')');
    }
}
