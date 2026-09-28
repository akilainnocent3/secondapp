package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface rd90 {

    public static final class a implements rd90 {
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
            return pe4.b(this.a, "ScrollToIndex(index=", ")");
        }
    }
}
