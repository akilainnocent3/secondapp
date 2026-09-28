package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class z4c implements wvt {
    public final ix30 a;

    public z4c(ix30 ix30Var) {
        this.a = ix30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4c) && this.a.equals(((z4c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopTier(rakebackInfo=" + this.a + ")";
    }
}
