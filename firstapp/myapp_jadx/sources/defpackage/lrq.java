package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface lrq {

    public static final class a implements lrq {
        public final nvp a;

        public a(nvp nvpVar) {
            this.a = nvpVar;
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
            return "DoRootAction(rootAction=" + this.a + ")";
        }
    }

    public static final class b implements lrq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -374218947;
        }

        public final String toString() {
            return "ScrollToTop";
        }
    }
}
