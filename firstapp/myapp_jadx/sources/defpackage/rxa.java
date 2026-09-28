package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class rxa {

    public static final class a extends rxa {
        public static final a a = new a();
    }

    public static final class b extends rxa {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return rr1.b(new StringBuilder("ConstraintsNotMet(reason="), this.a, ')');
        }
    }
}
