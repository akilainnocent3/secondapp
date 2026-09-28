package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s7l {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof s7l) {
            return this.a == ((s7l) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
