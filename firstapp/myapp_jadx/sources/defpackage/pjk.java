package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class pjk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pjk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pjk)) {
            return false;
        }
        pjk pjkVar = (pjk) obj;
        return this.a == pjkVar.a && this.b == pjkVar.b && this.c == pjkVar.c && this.d == pjkVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return b7f.a(dy5.a("GiftColors(primary=", this.a, this.b, ", secondary=", ", buttonBackground="), this.c, ", buttonText=", this.d, ")");
    }
}
