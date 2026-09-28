package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class krz {
    public final h90 a;
    public final int b;
    public final int c;

    public krz(h90 h90Var, int i, int i2) {
        this.a = h90Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof krz) {
            krz krzVar = (krz) obj;
            if (this.a == krzVar.a && this.b == krzVar.b && this.c == krzVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return rr1.b(sb, this.c, ')');
    }
}
