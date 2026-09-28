package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface gqn {

    public static final class a implements gqn {
        public final aqn a;

        public a(aqn aqnVar) {
            this.a = aqnVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Applied(kickOffButtonPosition=" + this.a + ")";
        }
    }

    public static final class b implements gqn {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -459976306;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements gqn {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -348213096;
        }

        public final String toString() {
            return "NotApplied";
        }
    }
}
