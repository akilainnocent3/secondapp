package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface wik {

    public static final class a implements wik {
        public final svk a;

        public a(svk svkVar) {
            this.a = svkVar;
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
            return "Applied(giftStatus=" + this.a + ")";
        }
    }

    public static final class b implements wik {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 902933645;
        }

        public final String toString() {
            return "NotApplied";
        }
    }
}
