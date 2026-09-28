package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class oy7 {
    public final int a;
    public final int b;

    public oy7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy7)) {
            return false;
        }
        oy7 oy7Var = (oy7) obj;
        return this.a == oy7Var.a && this.b == oy7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return n36.a("CodeHubRange(min=", this.a, this.b, ", max=", ")");
    }
}
