package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nmd implements mmd {
    public final float a;
    public final float b;

    public nmd(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd)) {
            return false;
        }
        nmd nmdVar = (nmd) obj;
        return Float.compare(this.a, nmdVar.a) == 0 && Float.compare(this.b, nmdVar.b) == 0;
    }

    @Override // defpackage.mmd
    public final float getDensity() {
        return this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.a);
        sb.append(", fontScale=");
        return h70.a(sb, this.b, ')');
    }

    @Override // defpackage.mmd
    public final float y1() {
        return this.b;
    }
}
