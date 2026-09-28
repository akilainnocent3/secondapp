package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class b7w {
    public final float a;
    public final int b;
    public final int c;
    public final int d;

    public b7w(float f, int i, int i2, int i3) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7w)) {
            return false;
        }
        b7w b7wVar = (b7w) obj;
        return Float.compare(this.a, b7wVar.a) == 0 && this.b == b7wVar.b && this.c == b7wVar.c && this.d == b7wVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveDistance(totalDistance=");
        sb.append(this.a);
        sb.append(", selectedIndex=");
        sb.append(this.b);
        sb.append(", firstIndex=");
        return b7f.a(sb, this.c, ", firstOffset=", this.d, ")");
    }
}
