package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i41 {

    public static final class a extends i41 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -410289510;
        }

        public final String toString() {
            return "Blocked";
        }
    }

    public static final class b extends i41 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -789206679;
        }

        public final String toString() {
            return "BlockedByFailedVerification";
        }
    }

    public static final class c extends i41 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1488812289;
        }

        public final String toString() {
            return "BlockedByPendingVerification";
        }
    }

    public static final class d extends i41 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1052289415;
        }

        public final String toString() {
            return "Normal";
        }
    }

    public static final class e extends i41 {
    }
}
