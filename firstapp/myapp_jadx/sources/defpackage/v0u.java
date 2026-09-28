package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public abstract class v0u {
    public final long a;
    public final long b;
    public final long c;

    public static final class a extends v0u {
        public static final a d;

        static {
            long j = cst.b;
            d = new a(j, j58.c(0.3f, j), j58.c(0.3f, j));
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1621035337;
        }

        public final String toString() {
            return "Diamond";
        }
    }

    public static final class b extends v0u {
        public static final b d;

        static {
            long j = cst.c;
            d = new b(j, j58.c(0.3f, j), cst.d);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1145426140;
        }

        public final String toString() {
            return "Normal";
        }
    }

    public v0u(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
