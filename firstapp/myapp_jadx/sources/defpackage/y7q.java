package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class y7q {
    public final long a;
    public final boolean b;

    public y7q(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7q)) {
            return false;
        }
        y7q y7qVar = (y7q) obj;
        return this.a == y7qVar.a && this.b == y7qVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LNFeatureMatchCardSlot(generation=" + this.a + ", isLoading=" + this.b + ")";
    }
}
