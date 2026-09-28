package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface yij {

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a implements yij {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -761585005;
        }

        public final String toString() {
            return "Claimable";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b implements yij {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 951161880;
        }

        public final String toString() {
            return "Claimed";
        }
    }

    public static final class c implements yij {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2142883145;
        }

        public final String toString() {
            return "Idle";
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements yij {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 434495353;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
