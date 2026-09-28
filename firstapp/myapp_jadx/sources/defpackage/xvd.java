package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class xvd {
    public final long a = 4288454827L;

    public xvd(int i) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvd) && this.a == ((xvd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d020.a(this.a, "DepositDedicatedAccountColors(borderColor=", ")");
    }
}
