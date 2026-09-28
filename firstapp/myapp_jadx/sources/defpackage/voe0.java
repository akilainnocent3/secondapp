package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class voe0 {
    public final float a;
    public final boolean b;

    public voe0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof voe0)) {
            return false;
        }
        voe0 voe0Var = (voe0) obj;
        return Float.compare(this.a, voe0Var.a) == 0 && this.b == voe0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SymbolConfiguration(multiplier=");
        sb.append(this.a);
        sb.append(", hasBeenFound=");
        return ruw.a(sb, this.b, ')');
    }
}
