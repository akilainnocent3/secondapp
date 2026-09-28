package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface o4q {

    public static final class a implements o4q {
        public final boolean a;
        public final String b;

        public a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "CountDown(isSoon=" + this.a + ", time=" + this.b + ")";
        }
    }

    public static final class b implements o4q {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 885403484;
        }

        public final String toString() {
            return "Upcoming";
        }
    }
}
