package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class nzn {
    public final boolean a;

    public nzn(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nzn) && this.a == ((nzn) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("InstantRacingOverallConfig(active=", ")", this.a);
    }
}
