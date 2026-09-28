package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class s7c0 {
    public final float a;
    public final float b;
    public final int c;

    public s7c0(int i, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7c0)) {
            return false;
        }
        s7c0 s7c0Var = (s7c0) obj;
        return Float.compare(this.a, s7c0Var.a) == 0 && Float.compare(this.b, s7c0Var.b) == 0 && Float.compare(100.0f, 100.0f) == 0 && this.c == s7c0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(2700) + gpp.a(this.c, tvh.a(100.0f, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comet(initialX=");
        sb.append(this.a);
        sb.append(", initialY=");
        sb.append(this.b);
        sb.append(", length=100.0, delay=");
        return zk1.a(this.c, ", duration=2700)", sb);
    }
}
