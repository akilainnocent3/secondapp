package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface mxa0 {

    public static final class a implements mxa0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 992152533;
        }

        public final String toString() {
            return "FailedExceedBetCount";
        }
    }

    public static final class b implements mxa0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1186174273;
        }

        public final String toString() {
            return "FailedExceedCoverage";
        }
    }

    public static final class c implements mxa0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1324260643;
        }

        public final String toString() {
            return "Success";
        }
    }
}
