package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o9i {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof o9i) {
            return this.a == ((o9i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
