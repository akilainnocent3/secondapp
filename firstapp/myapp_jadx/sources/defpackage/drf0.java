package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class drf0 {
    public final wsf0 a;

    public drf0(wsf0 wsf0Var) {
        this.a = wsf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drf0) && this.a.equals(((drf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TierStatusHint(state=" + this.a + ")";
    }
}
