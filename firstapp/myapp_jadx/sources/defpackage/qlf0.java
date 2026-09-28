package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qlf0 {
    public static final qlf0 c = new qlf0(2, false);
    public static final qlf0 d = new qlf0(1, true);
    public final int a;
    public final boolean b;

    public static final class a {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a == ((a) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            int i = this.a;
            if (i == 1) {
                return "Linearity.Linear";
            }
            if (i == 2) {
                return "Linearity.FontHinting";
            }
            return i == 3 ? "Linearity.None" : "Invalid";
        }
    }

    public qlf0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlf0)) {
            return false;
        }
        qlf0 qlf0Var = (qlf0) obj;
        return this.a == qlf0Var.a && this.b == qlf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        return equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}
