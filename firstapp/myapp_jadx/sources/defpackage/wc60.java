package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wc60 extends Throwable {

    public static final class a extends wc60 {
        public static final a a = new a("Game Unavailable");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2067722791;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GameUnavailableException";
        }
    }

    public static final class b extends wc60 {
        public static final b a = new b("User Blocked");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -22024554;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UserBlockedException";
        }
    }
}
