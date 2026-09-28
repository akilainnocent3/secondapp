package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class jmd {
    public int a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmd) && this.a == ((jmd) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return rr1.b(new StringBuilder("DeltaCounter(count="), this.a, ')');
    }
}
