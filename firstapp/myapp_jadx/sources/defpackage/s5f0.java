package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public interface s5f0 {

    public static final class a implements s5f0 {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return b6c.a("OngoingCheckList(isDone=", ")", this.a);
        }
    }

    public static final class b implements s5f0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1923715432;
        }

        public final String toString() {
            return "Pending";
        }
    }

    public static final class c implements s5f0 {
        public final dtv a;

        public c(dtv dtvVar) {
            this.a = dtvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ProgressBarOngoing(progressUiData=" + this.a + ")";
        }
    }
}
