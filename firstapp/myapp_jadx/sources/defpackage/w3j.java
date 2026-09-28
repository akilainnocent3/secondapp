package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class w3j {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final int e;

    public w3j(int i, String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3j)) {
            return false;
        }
        w3j w3jVar = (w3j) obj;
        return this.a == w3jVar.a && this.b == w3jVar.b && this.c == w3jVar.c && this.d.equals(w3jVar.d) && this.e == w3jVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + gmf0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("FruitHuntChipItemState(enabled=", ", selected=", ", hasOutLine=", this.a, this.b);
        mng.a(", amount=", this.d, ", imgResId=", sbA, this.c);
        return zk1.a(this.e, ")", sbA);
    }
}
