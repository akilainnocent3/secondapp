package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class mxs extends f8i {
    public final sc0 f;

    public mxs(sc0 sc0Var) {
        this.f = sc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mxs) {
            return this.f == ((mxs) obj).f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f + ')';
    }
}
