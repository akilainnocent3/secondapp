package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n9i {
    public final int a;

    @fae
    public /* synthetic */ n9i(int i) {
        this.a = i;
    }

    public static final /* synthetic */ n9i a() {
        return new n9i(1);
    }

    public static String b(int i) {
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n9i) {
            return this.a == ((n9i) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
