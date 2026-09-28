package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface cln {

    public static final class a implements cln {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1486883260;
        }

        public final String toString() {
            return "CopyLink";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements cln {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1465430773;
        }

        public final String toString() {
            return "MoreShare";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements cln {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -172941495;
        }

        public final String toString() {
            return "SaveImage";
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d implements cln {
        public final aga0 a;

        public d(aga0 aga0Var) {
            this.a = aga0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShareToPlatform(platform=" + this.a + ")";
        }
    }
}
