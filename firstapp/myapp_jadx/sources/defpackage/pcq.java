package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface pcq {

    public static final class a implements pcq {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1405468106;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public static final class b implements pcq {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -650476203;
        }

        public final String toString() {
            return "OpenGiftSelector";
        }
    }

    public static final class c implements pcq {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("SelectAll(isAll=", ")", this.a);
        }
    }

    public static final class d implements pcq {
        public final ijf0 a;

        public d(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdatePartial(textFieldValue=", this.a, ")");
        }
    }

    public static final class e implements pcq {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 494185291;
        }

        public final String toString() {
            return "Use";
        }
    }
}
