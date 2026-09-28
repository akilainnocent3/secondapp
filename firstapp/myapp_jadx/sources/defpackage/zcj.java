package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface zcj {

    public static final class a implements zcj {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -873717159;
        }

        public final String toString() {
            return "Back";
        }
    }

    public static final class b implements zcj {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1314165050;
        }

        public final String toString() {
            return "Close";
        }
    }

    public static final class c implements zcj {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -746727393;
        }

        public final String toString() {
            return "ConditionClick";
        }
    }

    public static final class d implements zcj {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1618425590;
        }

        public final String toString() {
            return "Submit";
        }
    }

    public static final class e implements zcj {
        public final ijf0 a;

        public e(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdatePassword(password=", this.a, ")");
        }
    }
}
