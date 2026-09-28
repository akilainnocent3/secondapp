package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class o2p {
    public final int a;
    public final int b;

    public o2p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2p)) {
            return false;
        }
        o2p o2pVar = (o2p) obj;
        return this.a == o2pVar.a && this.b == o2pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return n36.a("ItemDimension(collapsedHeight=", this.a, this.b, ", expandedHeight=", ")");
    }
}
