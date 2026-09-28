package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a9x extends Throwable {

    public static final class a extends a9x {
        public static final a a = new a("Game Unavailable");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1762158993;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GameUnavailableException";
        }
    }
}
