package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface xy3 {

    public static final class a implements xy3 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return d020.a(this.a, "Apply(themeId=", ")");
        }
    }

    public static final class b implements xy3 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1630029075;
        }

        public final String toString() {
            return "BackClick";
        }
    }

    public static final class c implements xy3 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1013876718;
        }

        public final String toString() {
            return "DismissError";
        }
    }

    public static final class d implements xy3 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -846985739;
        }

        public final String toString() {
            return "HomeClick";
        }
    }
}
