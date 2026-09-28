package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kmd {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kmd) && this.a == ((kmd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return rr1.b(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
