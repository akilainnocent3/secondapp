package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface y5i extends kse {

    public static final class a {
        public static final a b = new a("VERTICAL");
        public static final a c = new a("HORIZONTAL");
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    public static final class b {
        public static final b b = new b("FLAT");
        public static final b c = new b("HALF_OPENED");
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final String toString() {
            return this.a;
        }
    }

    a a();

    boolean b();
}
