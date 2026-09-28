package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class sn30 extends Throwable {

    public static final class a extends sn30 {
        public static final a a = new a("Game Unavailable");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -485364582;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "GameUnavailableException";
        }
    }
}
