package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class uvy {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public uvy(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvy)) {
            return false;
        }
        uvy uvyVar = (uvy) obj;
        return this.a == uvyVar.a && this.b == uvyVar.b && this.c == uvyVar.c && this.d == uvyVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return lng.a(", twoUpDisplayEnabled=", ")", cwz.a("OneXTwoUpConfigModel(oneUpSettleEnabled=", ", oneUpDisplayEnabled=", ", twoUpSettleEnabled=", this.a, this.b), this.c, this.d);
    }
}
