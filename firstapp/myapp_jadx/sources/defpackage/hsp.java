package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class hsp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public hsp(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsp)) {
            return false;
        }
        hsp hspVar = (hsp) obj;
        return this.a == hspVar.a && this.b == hspVar.b && this.c == hspVar.c && this.d == hspVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + gpp.a(this.c, gpp.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return b7f.a(dy5.a("KycDialogContent(imageRes=", this.a, this.b, ", titleRes=", ", descriptionRes="), this.c, ", confirmRes=", this.d, ")");
    }
}
