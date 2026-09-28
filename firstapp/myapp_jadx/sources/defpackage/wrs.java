package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wrs {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof wrs) {
            return this.a == ((wrs) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Polite";
        }
        return i == 1 ? "Assertive" : "Unknown";
    }
}
