package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d08 {

    public static final class a extends d08 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1638657600;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b extends d08 {
        public final char a;

        public b(char c) {
            this.a = c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Character.hashCode(this.a);
        }

        public final String toString() {
            return "Value(char=" + this.a + ")";
        }
    }
}
