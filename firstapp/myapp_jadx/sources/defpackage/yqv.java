package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yqv {

    /* JADX INFO: loaded from: classes5.dex */
    public static final class a extends yqv {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "CancelCooldownExpired(missionId=", ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b extends yqv {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "CancelMission(missionId=", ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class c extends yqv {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "ConfirmCancelMission(missionId=", ")");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class d extends yqv {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1114936099;
        }

        public final String toString() {
            return "DismissCancelConfirmation";
        }
    }

    public static final class e extends yqv {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "ParticipateMission(missionId=", ")");
        }
    }

    public static final class f extends yqv {
    }

    public static final class g extends yqv {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "ToggleRules(missionId=", ")");
        }
    }
}
