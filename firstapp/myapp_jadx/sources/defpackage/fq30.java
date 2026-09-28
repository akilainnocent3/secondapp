package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface fq30 {

    public static final class a implements fq30 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Gift(payoutAmount=");
            sb.append(this.a);
            sb.append(", giftAmount=");
            return j26.a(sb, this.b, ')');
        }
    }

    public static final class b implements fq30 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -663715003;
        }

        public final String toString() {
            return "None";
        }
    }
}
