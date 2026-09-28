package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public abstract class tho {

    public static final class a extends tho {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "Custom(min=" + this.a + ", max=" + this.b + ")";
        }
    }

    public static final class b extends tho {
        public static final b a = new b();
    }

    public static final class c extends tho {
        public static final c a = new c();
    }

    public static final class d extends tho {
        public static final d a = new d();
    }
}
