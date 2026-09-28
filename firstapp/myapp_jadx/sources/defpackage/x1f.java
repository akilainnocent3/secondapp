package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface x1f {

    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 535654134;
        }

        public final String toString() {
            return "ChallengeExpired";
        }
    }

    public interface b extends x1f {
    }

    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -399971490;
        }

        public final String toString() {
            return "FeatureDisabled";
        }
    }

    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1488993824;
        }

        public final String toString() {
            return "InvalidChallenge";
        }
    }

    public static final class e implements b {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -495567215;
        }

        public final String toString() {
            return "InvalidChallengeState";
        }
    }

    public static final class f implements x1f {
        public final w1f a;

        public f(w1f w1fVar) {
            this.a = w1fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(info=" + this.a + ")";
        }
    }

    public static final class g implements b {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1917142164;
        }

        public final String toString() {
            return "UnknownFailure";
        }
    }
}
