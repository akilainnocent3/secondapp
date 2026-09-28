package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface w0f {

    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 305245684;
        }

        public final String toString() {
            return "ChallengeExpired";
        }
    }

    public interface b extends w0f {
    }

    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 285332640;
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
            return -1719402274;
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
            return 949464659;
        }

        public final String toString() {
            return "InvalidChallengeState";
        }
    }

    public static final class f implements b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -224506323;
        }

        public final String toString() {
            return "InvalidStakeAmount";
        }
    }

    public static final class g implements w0f {
        public final x0f a;

        public g(x0f x0fVar) {
            this.a = x0fVar;
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
            return "Success(result=" + this.a + ")";
        }
    }

    public static final class h implements b {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1108792558;
        }

        public final String toString() {
            return "UnknownFailure";
        }
    }
}
