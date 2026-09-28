package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface xce0 {

    public static final class a implements xce0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Error(message=", this.a, ")");
        }
    }

    public static final class b implements xce0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1888886348;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements xce0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -479300772;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements xce0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1611846179;
        }

        public final String toString() {
            return "Success";
        }
    }
}
