package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class i140 implements id90 {

    public static final class a extends i140 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 729529269;
        }

        public final String toString() {
            return "DismissDialog";
        }
    }

    public static final class b extends i140 {
        public final rcs a;

        public b(rcs rcsVar) {
            this.a = rcsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            rcs rcsVar = this.a;
            if (rcsVar == null) {
                return 0;
            }
            return rcsVar.hashCode();
        }

        public final String toString() {
            return "NavigateToAdjustSettings(limitType=" + this.a + ")";
        }
    }
}
