package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class c6c0 {
    public final ynj a;
    public final gcb0 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public c6c0(ynj ynjVar, gcb0 gcb0Var) {
        this.a = ynjVar;
        this.b = gcb0Var;
        this.c = ynjVar.c;
        this.d = ynjVar.d;
        this.e = ynjVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6c0)) {
            return false;
        }
        c6c0 c6c0Var = (c6c0) obj;
        return this.a.equals(c6c0Var.a) && this.b.equals(c6c0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SportyHeroThemeData(gameThemeData=" + this.a + ", spineAsset=" + this.b + ")";
    }
}
