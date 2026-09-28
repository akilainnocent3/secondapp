package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public interface rrf0 {

    public static final class a implements rrf0 {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.a, ((a) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return "Activated(progress=" + this.a + ")";
        }
    }

    public static final class b implements rrf0 {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return "Lock(progress=" + this.a + ")";
        }
    }

    public static final class c implements rrf0 {
        public static final c a = new c();
    }
}
