package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface i7r {

    public static final class a implements i7r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1728688523;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements i7r {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1600394609;
        }

        public final String toString() {
            return "OpenHowToPlay";
        }
    }

    public static final class c implements i7r {
        public final a8r a;

        public c(a8r a8rVar) {
            a8rVar.getClass();
            this.a = a8rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SelectTab(tab=" + this.a + ")";
        }
    }
}
