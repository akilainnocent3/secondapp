package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w1w {
    public final l380 a = l380.a;
    public final boolean b = true;
    public final boolean c = true;

    public w1w() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1w)) {
            return false;
        }
        w1w w1wVar = (w1w) obj;
        return this.a == w1wVar.a && this.c == w1wVar.c && this.b == w1wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 29791, this.b);
    }

    public w1w(int i) {
    }
}
