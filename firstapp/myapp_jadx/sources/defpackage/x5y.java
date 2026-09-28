package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface x5y {

    public static final class a implements x5y {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 931366775;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public static final class b implements x5y {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && Float.compare(this.b, bVar.b) == 0 && Float.compare(this.c, bVar.c) == 0 && Float.compare(this.d, bVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(x=");
            sb.append(this.a);
            sb.append(", y=");
            sb.append(this.b);
            sb.append(", scaleX=");
            sb.append(this.c);
            sb.append(", scaleY=");
            return h70.a(sb, this.d, ')');
        }
    }
}
