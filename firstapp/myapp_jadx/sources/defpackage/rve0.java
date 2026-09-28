package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class rve0 extends Throwable {

    public static final class a extends rve0 {
        public static final a a = new a("Game Unavailable");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1748204955;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GameUnavailableException";
        }
    }

    public static final class b extends rve0 {
        public static final b a = new b("User unavailable");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2143365009;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UserUnavailable";
        }
    }
}
