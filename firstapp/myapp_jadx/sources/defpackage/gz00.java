package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gz00 {

    public static final class a extends gz00 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 855174967;
        }

        public final String toString() {
            return "NoRequest";
        }
    }

    public static final class b extends gz00 {
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
            return pe4.b(this.a, "Request(index=", ")");
        }
    }
}
