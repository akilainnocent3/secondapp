package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tlr {
    public final cx90 a;
    public final cx90 b;

    public tlr(cx90 cx90Var, cx90 cx90Var2) {
        this.a = cx90Var;
        this.b = cx90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlr)) {
            return false;
        }
        tlr tlrVar = (tlr) obj;
        return this.a.equals(tlrVar.a) && this.b.equals(tlrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LandscapePortraitSizes(landscape=" + this.a + ", portrait=" + this.b + ')';
    }
}
