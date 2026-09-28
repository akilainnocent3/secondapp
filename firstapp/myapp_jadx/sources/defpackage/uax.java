package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public interface uax {

    public static final class b implements uax {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1025987717;
        }

        public final String toString() {
            return "None";
        }
    }

    public static final class a implements uax {
        public final float a;
        public final boolean b;

        public a(float f, boolean z) {
            this.a = f;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Display(rotationAngle=");
            sb.append(this.a);
            sb.append(", animation=");
            return ruw.a(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this(0.0f, false);
        }
    }
}
