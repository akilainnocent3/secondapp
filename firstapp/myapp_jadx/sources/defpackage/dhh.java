package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface dhh {

    public static final class a implements dhh {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1001718827;
        }

        public final String toString() {
            return "CloseDialog";
        }
    }

    public static final class b implements dhh {
        public final chh a;

        public b(chh chhVar) {
            chhVar.getClass();
            this.a = chhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Leave(action=" + this.a + ")";
        }
    }

    public static final class c implements dhh {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1898016636;
        }

        public final String toString() {
            return "ReportBugClicked";
        }
    }

    public static final class d implements dhh {
        public final bhh a;

        public d(bhh bhhVar) {
            bhhVar.getClass();
            this.a = bhhVar;
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
            return "SelectCategory(category=" + this.a + ")";
        }
    }

    public static final class e implements dhh {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1015371373;
        }

        public final String toString() {
            return "Submit";
        }
    }

    public static final class f implements dhh {
        public final chh a;

        public f(chh chhVar) {
            chhVar.getClass();
            this.a = chhVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TryLeave(action=" + this.a + ")";
        }
    }

    public static final class g implements dhh {
        public final ijf0 a;

        public g(ijf0 ijf0Var) {
            this.a = ijf0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a.equals(((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return vwz.a("UpdateFeedbackField(feedback=", this.a, ")");
        }
    }
}
