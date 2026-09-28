package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface lze0 {

    public static final class a implements lze0 {
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
            return j26.a(new StringBuilder("Gift(amount="), this.a, ')');
        }
    }

    public static final class b implements lze0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1396664737;
        }

        public final String toString() {
            return "None";
        }
    }
}
