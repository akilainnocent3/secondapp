package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class cz00 {
    public final int a;
    public final int b;
    public final int c;

    public cz00(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz00)) {
            return false;
        }
        cz00 cz00Var = (cz00) obj;
        return this.a == cz00Var.a && this.b == cz00Var.b && this.c == cz00Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zk1.a(this.c, ")", dy5.a("PillLayoutItemInfo(index=", this.a, this.b, ", offsetPx=", ", widthPx="));
    }
}
