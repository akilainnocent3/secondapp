package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface j9r {

    public static final class a implements j9r {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2042405083;
        }

        public final String toString() {
            return "ClearFocus";
        }
    }

    public static final class b implements j9r {
        public final nvp a;

        public b(nvp nvpVar) {
            this.a = nvpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DoRootAction(rootAction=" + this.a + ")";
        }
    }

    public static final class c implements j9r {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1387067971;
        }

        public final String toString() {
            return "ScrollToTop";
        }
    }
}
