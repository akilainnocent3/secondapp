package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface r0f {

    public static final class a implements b {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1168645185;
        }

        public final String toString() {
            return "ChallengeExpired";
        }
    }

    public interface b extends r0f {
    }

    public static final class c implements b {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1101674153;
        }

        public final String toString() {
            return "InvalidChallenge";
        }
    }

    public static final class d implements b {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2089656472;
        }

        public final String toString() {
            return "InvalidChallengeState";
        }
    }

    public static final class e implements r0f {
        public final s0f a;

        public e(s0f s0fVar) {
            this.a = s0fVar;
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
            return "Success(result=" + this.a + ")";
        }
    }

    public static final class f implements b {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 958945181;
        }

        public final String toString() {
            return "UnknownFailure";
        }
    }
}
