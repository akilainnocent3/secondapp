package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface fnj {

    public static final class a implements fnj {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1499230700;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class b implements fnj {
        public final long a;
        public final float b;
        public final long c;

        public b(float f) {
            this(f, j58.b, (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            long j = bVar.a;
            int i = j58.n;
            return nbh0.a(this.a, j) && g7f.b(this.b, bVar.b) && j7f.b(this.c, bVar.c);
        }

        public final int hashCode() {
            int i = j58.n;
            nbh0.a aVar = nbh0.b;
            return Long.hashCode(this.c) + tvh.a(this.b, Long.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Shadow(color=");
            ofz.a(this.a, ", blurRadius=", sb);
            k35.a(this.b, ", offset=", sb);
            sb.append((Object) j7f.e(this.c));
            sb.append(')');
            return sb.toString();
        }

        public b(float f, long j, long j2) {
            this.a = j;
            this.b = f;
            this.c = j2;
        }
    }
}
