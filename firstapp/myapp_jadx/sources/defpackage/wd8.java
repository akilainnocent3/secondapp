package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class wd8 implements wvt {
    public final m3f0 a;
    public final boolean b;

    public wd8(m3f0 m3f0Var, boolean z) {
        this.a = m3f0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd8)) {
            return false;
        }
        wd8 wd8Var = (wd8) obj;
        return this.a.equals(wd8Var.a) && this.b == wd8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Tab(tabState=" + this.a + ", isDiamond=" + this.b + ")";
    }
}
