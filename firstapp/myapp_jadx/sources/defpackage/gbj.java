package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class gbj implements wvt {
    public final ix30 a;

    public gbj(ix30 ix30Var) {
        this.a = ix30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gbj) && this.a.equals(((gbj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LockedRakebackInfo(rakebackInfo=" + this.a + ")";
    }
}
