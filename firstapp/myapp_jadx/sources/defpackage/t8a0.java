package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class t8a0 {
    public final boolean a;

    public t8a0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8a0) && this.a == ((t8a0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("BetSlip(show=", ")", this.a);
    }
}
