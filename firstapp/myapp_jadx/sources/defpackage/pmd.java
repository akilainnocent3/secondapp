package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pmd implements mmd {
    public final float a;
    public final float b;
    public final f9i c;

    public pmd(float f, float f2, f9i f9iVar) {
        this.a = f;
        this.b = f2;
        this.c = f9iVar;
    }

    @Override // defpackage.mmd
    public final long N(float f) {
        return d2l.g(this.c.a(f), 4294967296L);
    }

    @Override // defpackage.mmd
    public final float X(long j) {
        if (pmf0.a(omf0.b(j), 4294967296L)) {
            return this.c.b(omf0.c(j));
        }
        ib5.a("Only Sp can convert to Px");
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmd)) {
            return false;
        }
        pmd pmdVar = (pmd) obj;
        return Float.compare(this.a, pmdVar.a) == 0 && Float.compare(this.b, pmdVar.b) == 0 && this.c.equals(pmdVar.c);
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + tvh.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.b;
    }
}
