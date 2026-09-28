package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface b9w {

    public static final class a implements b9w {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1281542096;
        }

        public final String toString() {
            return "BiometricAuthSectionClicked";
        }
    }

    public static final class b implements b9w {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1159414292;
        }

        public final String toString() {
            return "EmailSectionClicked";
        }
    }

    public static final class c implements b9w {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1306443018;
        }

        public final String toString() {
            return "EmailTwoFAClicked";
        }
    }
}
