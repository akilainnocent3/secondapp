package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface h430 {

    public static final class a implements h430 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 876275420;
        }

        public final String toString() {
            return "NoProgress";
        }
    }

    public static final class b implements h430 {
        public final float a;
        public final boolean b;

        public b(float f, boolean z) {
            this.a = f;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Float.compare(this.a, bVar.a) == 0 && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Progress(percent=" + this.a + ", isUpgrade=" + this.b + ")";
        }
    }
}
